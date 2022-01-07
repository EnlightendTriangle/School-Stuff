#include "Bank.h"
#include "Bank.c"
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <stdio.h>
#include <time.h>
#include <string.h>

struct transaction { //holds a transaction to be made
	int account_ID;
	double account_balance;
};

struct req { // contains a request to perform in the queue 
	struct req * next; //pointer points to next request in list
	int req_id; //request id given by the main thread process
	int acc_id; //the account id for a CHECK request
	struct transaction * transactions; // array to contain data from transactions
	int num_acc; //the amount of accounts in the transaction
	struct timeval starttime, endtime; 
};

struct q_process { //a queue to handle processes
	int amountOfJobs; //amount of jobs that are currently in the queue
	struct req * head, * tail; //head and tail of the list
};

pthread_mutex_t m_queue; //mutex for request processing 
pthread_mutex_t *m_locks; //mutex locks array
pthread_cond_t worker_cv; //conditonal that triggers worker threads 
struct q_process *list; //queue list that holds all requests
int num_threads; //the amount of worker threads to user requests
int num_accounts; //the amount of accounts the user requests
FILE *outputFile; //Pointer that writes to a file

void *worker_process(void *);

int main(int argc, char **argv){
	char user_command[1024]; //the request that the user enters 
	if(argc !=4){ //valid information was not entered
		fprintf(outputFile, "Error: %d\n", argc);
		exit(0);
	}
	//these are used to read user input
	num_threads = atoi(argv[1]);
	num_accounts = atoi(argv[2]);
	outputFile = fopen(argv[3], "w");
	
	pthread_t w_threads[num_threads]; //these are the worker threads
	//initialization
	pthread_mutex_init(&m_queue, NULL);
	pthread_cond_init(&worker_cv, NULL);
	m_locks = malloc(sizeof(pthread_mutex_t) * num_accounts);
	int i;
	for(i = 0; i<num_accounts ; i++){
		pthread_mutex_init(&m_locks[i], NULL);
	}
	
	pthread_mutex_lock(&m_queue);
	//initialization
	list = malloc(sizeof(struct q_process) * 100000);
	list->head = malloc(sizeof(struct req) * 1024);
	list->tail= malloc(sizeof(struct req) * 1024);
	//initialization
	initialize_accounts(num_accounts);
	int current_request_num = 0; //current request number
	pthread_mutex_unlock(&m_queue);
	int j;
	for(j = 0; j < num_threads; j++){ //creation and assignment of worker threads
		pthread_create(&w_threads[j], (void *)NULL, worker_process, (void *)NULL);
	}
	
	while(1){ //polling loop to capture user input
		fgets(user_command, 1024, stdin);
		
		user_command[strlen(user_command)-1] = '\0';
		char *act = strtok(user_command, " ");
		
		if(strcmp(act,"CHECK") == 0){ 
			char *temp;
			temp = strtok(NULL, " ");
			int ID = atoi(temp);
			if(ID <= num_accounts && ID > 0){ //checks to make sure the account id is valid
				
				pthread_mutex_lock(&m_queue);
				current_request_num++;
				printf("ID %d\n",current_request_num);
				if(list->amountOfJobs == 0){ //first job is added to queue
					struct req *temp_request = malloc(sizeof(struct req) * 1024); //Creation of temp request 
					temp_request->req_id = current_request_num;
					temp_request->acc_id = ID;
					temp_request->num_acc = -1;
					//request is added to the queue
					list->head = temp_request;
					list->tail = temp_request;
					list->amountOfJobs = 1;
					
					pthread_cond_broadcast(&worker_cv); //worker threads are signaled 
				}
				
				else{ //all other jobs are added to the queue
					struct req *temp_request = malloc(sizeof(struct req) * 1024);
					temp_request->req_id = current_request_num;
					temp_request->acc_id = ID;
					temp_request->num_acc = -1;
					
					list->tail->next = temp_request;
					list->tail = temp_request;
					list->amountOfJobs = list->amountOfJobs + 1;
					
					pthread_cond_broadcast(&worker_cv);
				}
				
				pthread_mutex_unlock(&m_queue);
			}
		}
		
		else if(strcmp(act,"TRANS") == 0){ 
			pthread_mutex_lock(&m_queue);
			current_request_num++;
			struct transaction *actions = malloc(sizeof(*actions) * 100); //array contain transactions to execute
			int i = 0;
			int id, amt;
			char *str = strtok(NULL, " ");
			while (str != NULL) { //this reads all the user inputted transactions and puts them in an array
				id = atoi(str);
				str = strtok(NULL, " ");
				amt = atoi(str);
				str = strtok(NULL, " ");
				struct transaction *t =  malloc(sizeof(*t) * 1024);
				t->account_ID = id;
				t->account_balance = amt;
				actions[i] = *t;
				i++;
			}
			
			struct req *temp_request = malloc(sizeof(*temp_request) * 1024);
			temp_request->req_id = current_request_num;
			temp_request->acc_id = -1;
			temp_request->num_acc = i;
			temp_request->transactions = actions;
			printf("ID %d\n",current_request_num);
			
			if(list->amountOfJobs == 0){
				list->head = temp_request;
				list->tail = temp_request;
				list->amountOfJobs = 1;
			}
			
			else{
				list->tail->next = temp_request;
				list->tail = temp_request;
				list->amountOfJobs = list->amountOfJobs + 1;
				
				pthread_cond_broadcast(&worker_cv);
			}
			
			pthread_mutex_unlock(&m_queue);
		}
		
		else if(strcmp(act,"END") == 0){
			pthread_mutex_lock(&m_queue);
			struct req *temp_request = malloc(sizeof(*temp_request) * 1024);
			temp_request->req_id = current_request_num;
			temp_request->acc_id = -1;
			temp_request->num_acc = -1;
			printf("ID %d\n",current_request_num);
			
			if(list->amountOfJobs == 0){
				list->head = temp_request;
				list->tail = temp_request;
				list->amountOfJobs = 1;
				pthread_cond_broadcast(&worker_cv);
			}
			
			else{
				list->tail->next = temp_request;
				list->tail = temp_request;
				
				list->amountOfJobs = list->amountOfJobs + 1;
				pthread_cond_broadcast(&worker_cv);
			}
			
			pthread_mutex_unlock(&m_queue);
		}
	}
}

void *worker_process(void *arg){ //this method handles the worker processes, more specifically what they should be doing at a given moment
	while(1){
		pthread_mutex_lock(&m_queue);
		
		while(list->amountOfJobs == 0){ //waits for jobs to added to list
			pthread_cond_wait(&worker_cv, &m_queue);
		}
		
		struct timeval startTime;
		struct timeval endTime;
		
		if(list->head->acc_id > 0 && list->head->acc_id <= num_accounts){ //If it is a balance checks request from the user
			gettimeofday(&startTime, NULL);
			list->head->starttime=startTime;
			char file_output[2000]; //output that will be written to a file
			
			pthread_mutex_lock(&m_locks[list->head->acc_id -1]); //reads the user rquest account and return a balance
			int balance = read_account(list->head->acc_id);
			sprintf(file_output, "%d BALANCE %d TIME %ld.%06.ld", list->head->req_id, balance, startTime.tv_sec, startTime.tv_usec );
			pthread_mutex_unlock(&m_locks[list->head->acc_id -1]); 
			
			list->amountOfJobs = list->amountOfJobs -1; //request is remove from the queue
			list->head=list->head->next;
			
			gettimeofday(&endTime, NULL); //this gets the request process's end time
			char tmp[2000];
			sprintf(tmp, " %ld.%06.ld\n", endTime.tv_sec, endTime.tv_usec);
			strcat(file_output, tmp); //add end time to output
			fprintf(outputFile, "%s", file_output); //write this information to the file
		}
		
		else if(list->head->num_acc > 0){ //if this is a transaction request
			int i;
			for(i =0 ;i <list->head->num_acc;i++){
				pthread_mutex_lock(&m_locks[list->head->transactions[i].account_ID]); //mutex lock all the account affiliated with the request being made
			}
			
			int numTransactions = list->head->num_acc; //amount of transactions in this request
			gettimeofday(&startTime, NULL);
			list->head->starttime=startTime;
			
			int areTransactionsValid = 1; //boolean value to see if transactions being made are valid
			char output[2000];
			int acc_id; //keeps track of account id should there be an invalid transcation request
			int k;
			for(k = 0;k < list->head->num_acc ; k++){ //this checks  to see if all transactions being made are valid
				acc_id = list->head->transactions[k].account_ID;
				int balance = read_account(acc_id);
				if(list->head->transactions[k].account_balance + balance < 0){
					areTransactionsValid = 1;
					break;
				}
			}
			
			if(areTransactionsValid){ //if transcation are valid then request is process and all affected accounts are updated
				int j;
				for(j=0;j<list->head->num_acc;j++){
					int accID = list->head->transactions[j].account_ID;
					int balance = read_account(accID);
					write_account(accID, list->head->transactions[j].account_balance + balance);
				}
				sprintf(output, "%d OK TIME %ld.%06.ld ", list->head->req_id, startTime.tv_sec, startTime.tv_usec);
			}
			
			else{
				sprintf(output, "%d ISF %d TIME %ld.%06.ld ", list->head->req_id, acc_id, startTime.tv_sec, startTime.tv_usec); //invaid transaction output
			}
			
			gettimeofday(&endTime, NULL);
			char temp[100];
			sprintf(temp, "%ld.%06.ld\n", endTime.tv_sec, endTime.tv_usec);
			strcat(output, temp);
			fprintf(outputFile, "%s", output);
			int d;
			for(d=0 ;d < numTransactions;d++){ //unlicks all account mutexes
				pthread_mutex_unlock(&m_locks[list->head->transactions[d].account_ID]);
			}
			
			list->amountOfJobs = list->amountOfJobs -1; //request is removed from queue
			list->head= list->head->next;
		}
		
		else{ //result has ended
			fclose(outputFile); //close file
			exit(0);
		}
		pthread_mutex_unlock(&m_queue);
	}
}