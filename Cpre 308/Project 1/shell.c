#include <stdio.h>
#include <stdlib.h>
#include <string.h>

# define INPUTSIZELIMIT 100

int main(int argc, char **argv) {
	/* Arrays to store the shell prompt, the user input, the current directory,
	the environment variable and the environment value
	*/
	char* shell_prompt = "308sh> ";
	char user_input[INPUTSIZELIMIT];
	char cd[INPUTSIZELIMIT];
	char envar[INPUTSIZELIMIT];
	char enval[INPUTSIZELIMIT];
	
	/*This checks to make sure there isn't to many arguments or too little. 
	If there is an error is printed to the screen
	*/
	
	if(argc != 1 && argc != 3) {
		printf("This command line argument is invalid. Exiting.\n");
		return 0;
	}
	
	/*This checks to make sure there is an 
	argument entered.
	*/
	
	if(argc == 3) {
		if((strncmp("-p", argv[1], 2) != 0 || (strlen(argv[1]) != 2))) {
			printf("This command line argument is invalid. Exiting.\n");
			return 0;
		}
		shell_prompt = argv[2];
	}
	
	int i, j, arg_count, c1, c2, file_status; //counters, variables for child processes, and the file status variable for the execvp funtion.
	char user_directory[INPUTSIZELIMIT]; //array that stores the user's directory.
	char current_working_directory[1024]; //stores current working directory.
	int is_background_process = 0; //boolean variable that determines iif a process has been set to run in the background.
	char temp[arg_count][INPUTSIZELIMIT]; //temp array used to capture individual arguments, fills arguments array.
	char* arguments[arg_count + 1];
	/* Loop that constantly polls for user input*/
	while(1) {
		
		printf(shell_prompt); //Gives user prompt, waits for user input
		fgets(user_input, INPUTSIZELIMIT, stdin); //gets user input
		if((user_input[strlen(user_input) - 1] == '\n') && (strlen(user_input) > 0)) {
			user_input[strlen(user_input) - 1] = '\0';
		}
		
		if((strncmp("exit", user_input, 4) == 0) && (strlen(user_input) == 4)) { //checks to see if user entered 'exit' command
			return 0;
		}
		
		else if((strncmp("pid", user_input, 3) == 0) && (strlen(user_input) == 3)) { //checks to see if user entered 'pid' command, returns pid
			printf("This shell's Process ID is: %d", getpid());
			printf("\n");
		}
		
		else if((strlen(user_input) == 4) && (strncmp("ppid", user_input, 4) == 0)) { //checks to see if user entered 'ppid' command, returns ppid
			printf("Parent shell's Process ID is: %d", getppid());
			printf("\n");
		}
		
		else if((strlen(user_input) == 2 || user_input[2] == ' ') && strncmp("cd", user_input, 2) == 0) { //checks to see if user entered 'cd' command, changes specified directory
			
			if(strlen(user_input) == 2) {
				chdir(getenv("HOME"));
			}
			
			else {
				
				for(i = 0; i < strlen(user_input) - 3; i++) {
					user_directory[i] = user_input[i+3];
					user_directory[i+1] = '\0';
				}
				
				if(chdir(user_directory) == -1) {
					printf("Can't find directory\n");
				}
			}
		}
		
		else if((strlen(user_input) == 3) && (strncmp("pid", user_input, 3) == 0)) { //checks to see if user entered 'pwd' command, returns current directory
			
			if(getcwd(current_working_directory, 1024) == -1) {
				printf("Unable to print current working directory");
			}
			printf("%s\n", current_working_directory);
		}
		
		else if(strncmp("set", user_input, 3) == 0 && user_input[3] == ' ') {//checks to see if user entered 'set' command, sets environment value with user given value
			j = -2;
			for(i = 4; i < strlen(user_input); i++) {
				
				if(j == -2 && user_input[i] != ' ') { //this conditional determines that there is at least one argument as long as the current character is not a space
					j = -1;
				}
				
				if(user_input[i] == ' ') { //determines the amount of arguments up to space
					
					if(j != -1 || i == strlen(user_input) - 1) { //if j is not -1 and the loop has reached a space then there is an invalid amount of arguments
						printf("Invalid number of arguments\n");
						j = -3;
					}
					
					else {
						j = 0;
					}
				}
				
				else if(j == -1) { //if j = -1 then environment variable is given data from user input array
					envar[i - 4] = user_input[i];
				}
				
				else { //if j is greater than -1 then then environment variable is given data from user input array
					enval[j] = user_input[i];
					j++;
				}
			}
			
			if(j == -2) {
				printf("Invalid number of arguments\n");
			}
			
			else if(j == -1) {
				
				if(setenv(enval, NULL, 1) == -1) {
					printf("Environment variable failed to clear\n");
				}
			}
			
			else {
				
				if(setenv(envar, envar, 1) == -1) {
					printf("Failed to set environment variable\n");
				}
			}
		}
		
		else if(strncmp("get", user_input, 3) == 0 && user_input[3] == ' ') {//checks to see if 'get' command is entered, gets environment variable.
			
			for(i = 0; i < strlen(user_input - 4); i++) {
				envar[i] = user_input[i + 4];
			}
			
			if(getenv(envar) == NULL) {
				printf("Environment variable could not be found\n");
			}
			
			else {
				printf("%s\n", getenv(envar));
			}
		}
		
		else {
			
			arg_count = 1; 
			
			for(i = 0; i < strlen(user_input); i++) { //loop is tasked with counting the amount of arguments entered
				
				if(user_input[i] == ' '){
					arg_count++;
				}
			}
			
			if(user_input[strlen(user_input) - 1] == '&') { //if last character is '&' set boolean value of is_background_process to true
				arg_count--;
				is_background_process = 1;
			}
			
			/*if the command ends with an “&” character, the child process should run in the background, 
			meaning the shell should immediately prompt the user for 
			further input without waiting for the child process to finish. */
			
			arg_count = 0;
			j = 0;
			for(i = 0; i < strlen(user_input) + 1; i++) {
				
				if(user_input[i] == ' ' || user_input[i] == '\0'){
					temp[arg_count][j] = '\0';
					arguments[arg_count] = temp[arg_count];
					arg_count++;
					j = 0;
				}
				
				else if(user_input[i] == '&' && i == strlen(user_input) - 1) {
					i = strlen(user_input) + 1;
				}
				
				else {
					temp[arg_count][j] = user_input[i];
					j++;
				}
			}
			
			arguments[arg_count] = (char*) NULL;
			
			if(is_background_process = 1){
				
				is_background_process = 0;
				c2 = fork();
				
				if(c2 == 0){
					
					c1 = fork();
					
					if(c1 == 0){
						
						printf("[%d] %s\n", getpid(), arguments[0]);
						execvp(arguments[0], arguments);
						perror("\0");
						return 0;
					}
					
					else {
						
						file_status = -1;
						waitpid(-1, &file_status, 0);
						
						if(1) {
							
							printf("\n[%d] %s Exit %d\n", c1, arguments[0], WEXITSTATUS(file_status));
							printf(shell_prompt);
						}
						else
						{
							printf("[%d] %s Exit %d\n", c1, arguments[0], WEXITSTATUS(file_status));
						}
						return 0;
					}
				}
				else
				{
					usleep(1000);
				}
			}
			
			else {
				
				usleep(1000);
				file_status = -1;
				waitpid(c1, &file_status, 0);
				printf("[%d] %s Exit %d\n", c1, arguments[0], WEXITSTATUS(file_status));
			}
		}
	}
}