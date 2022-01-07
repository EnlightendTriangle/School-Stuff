/*******************************************************************************
 * *
 * * CprE 308 Scheduling Lab
 * *
 * * scheduling.c
 * * last updated 2020-03-01 - mlw
 * *******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NUM_PROCESSES 20
#define NUM_SCHEDULERS 4

#define SCHEDULER_NAME_LEN 30

/* Defines a simulated process */
typedef struct process {
  int arrivaltime;    /* Time process arrives and wishes to start */
  int starttime;      /* Time process actually starts */
  int runtime;        /* Time process requires to complete job */
  int remainingtime;  /* Runtime remaining before process completes */
  int endtime;        /* Time process finishes */
  
  int priority;       /* Priority of the process */

  int running;        /* Convenience - indicates if the process is currently running */
  int finished;       /* Convenience - indicates if the process has finished */
} process;

/* Defines a simulated scheduler */
typedef struct scheduler
{
  int (* func) (const process [], int); /* Function to run for the scheduler */
  char name[SCHEDULER_NAME_LEN];  /* Name of the scheduler, for pretty printing */
} scheduler;

/* Prototypes of scheduler functions */
int first_come_first_served(const process proc[], int t);
int shortest_remaining_time(const process proc[], int t);
int round_robin(const process proc[], int t);
int round_robin_priority(const process proc[], int t);

/* Main, contains most of the simulation code */
int main() {
  int i,j;
  process proc[NUM_PROCESSES],        /* List of processes */
            proc_copy[NUM_PROCESSES]; /* Backup copy of processes */
            
  /* Initialize the schedulers */
  scheduler schedulers[NUM_SCHEDULERS];
  schedulers[0].func = first_come_first_served;
  strncpy(schedulers[0].name, "First come first served", SCHEDULER_NAME_LEN);
  schedulers[1].func = shortest_remaining_time;
  strncpy(schedulers[1].name, "Shortest remaining time", SCHEDULER_NAME_LEN);
  schedulers[2].func = round_robin;
  strncpy(schedulers[2].name, "Round robin", SCHEDULER_NAME_LEN);
  schedulers[3].func = round_robin_priority;
  strncpy(schedulers[3].name, "Round robin with priority", SCHEDULER_NAME_LEN);

  /* Seed random number generator */
  //srand(time(0));    /* Use this seed to test different inputs */
  srand(0xC0FFEE);     /* Use this seed to test fixed input */

  /* Initialize process structures */
  for(i=0; i<NUM_PROCESSES; i++)
  {
    proc[i].arrivaltime = rand() % 100;
    proc[i].runtime = (rand() % 30) + 10;
    proc[i].remainingtime = proc[i].runtime;
    proc[i].priority = rand() % 3;
	
    proc[i].starttime = -1;
    proc[i].endtime = -1;
    proc[i].running = 0;
    
    proc[i].finished = 0;
  }

  /* Print process values */
  printf("Process\tarrival\truntime\tpriority\n");
  for(i = 0; i < NUM_PROCESSES; i++) {
    printf("%d\t%d\t%d\t%d\n", i, proc[i].arrivaltime, proc[i].runtime,
           proc[i].priority);
  }
  
  /* Run simulation for each scheduler */
  for(i = 0; i < NUM_SCHEDULERS; i++) {
    int num_finished = 0;
    int current_time = 0;
    int prev_pid = -1;
    int total_turnaround_time = 0;
    printf("\n\n--- %s\n", schedulers[i].name);
    
    /* Use a copy of the processes array */
    memcpy(proc_copy, proc, NUM_PROCESSES * sizeof(process));
    
    /* Run the simulation until all processes finish */
    while(num_finished < NUM_PROCESSES) {
      process * p;
      
      /* Call the scheduler */
      int next_pid = schedulers[i].func(proc_copy, current_time);
      
      /* If there's no process to run, just move time forward */
      if(next_pid < 0) {
        current_time += 1;
        continue;
      }
      
      /* Convenience - use p to reference the proc */
      p = &proc_copy[next_pid];
      
      /* If the process just started, print a message */
      if(p->starttime == -1) {
        printf("%03d: Process %d started\n", current_time, next_pid);
        p->starttime = current_time;
      }
      
      /* Update which process is running */
      if(prev_pid >= 0) {
        proc_copy[prev_pid].running = 0;
      }
      prev_pid = next_pid;
      p->running = 1;
      
      /* Move time forward */
      current_time += 1;
      
      /* Update remaining time of the process that just ran */
      p->remainingtime -= 1;
      
      /* If the process already finished, it shouldn't have been chosen */
      if(p->remainingtime < 0) {
        printf("Error: tried to run finished process %d\n", next_pid);
        continue;
      /* If the process just finished, print a message and do bookkeeping */
      } else if(p->remainingtime == 0) {
        printf("%03d: Process %d finished\n", current_time, next_pid);
        p->endtime = current_time;
        p->finished = 1;
        num_finished += 1;
        /* Keep a running total of turnaround time */
        total_turnaround_time += p->endtime - p->arrivaltime;
      }
    }
    
    /* Print average turnaround time */
    printf("Average turnaround time: %.01lf seconds\n", (double)total_turnaround_time / NUM_PROCESSES);
  }

  return 0;
}

/* ----------------------Schedulers------------------------------*/
/* Each scheduler function should return the index of the process 
   from proc[] that should run next. Parameter t is the current time 
   of the simulation. Note that proc[] contains all processes, 
   including those that have not yet arrived and those that are finished.
   You are responsible for ensuring that you schedule a "ready"
   process. If no processes are ready, return -1.
*/
   
int first_come_first_served(const process proc[], int t)
{
  int i = 0;
  int min_comp_time = 0;
  int f_c_f_s = -1;

  while(i < NUM_PROCESSES && f_c_f_s == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0){
      f_c_f_s = i;
      min_comp_time = proc[i].arrivaltime;
    }
    i++;
  }

  if(f_c_f_s == -1){
    return f_c_f_s;
  }

  for(i = f_c_f_s; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && proc[i].arrivaltime < min_comp_time){
      min_comp_time = proc[i].arrivaltime;
      f_c_f_s = i;
    }
  }
  return f_c_f_s;
}

int shortest_remaining_time(const process proc[], int t)
{
  int i = 0;
  int min_comp_time = 0;
  int s_r_time = -1;

  while(i < NUM_PROCESSES && s_r_time == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0){
      s_r_time = i;
      min_comp_time = proc[i].remainingtime;
    }
    i++;
  }

  if(s_r_time == -1){
    return s_r_time;
  }

  for(i = s_r_time; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && proc[i].remainingtime < min_comp_time){
      min_comp_time = proc[i].remainingtime;
      s_r_time = i;
    }
  }
  return s_r_time;
}

int round_robin(const process proc[], int t)
{
  int i = 0;
  int prev_process = -1;
  int r_r = -1;

  while(i < NUM_PROCESSES && r_r == -1 && prev_process == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0){
      r_r = i;
      prev_process = i;
      return i;
    }
    i++;
  }

  if(i == -1){
    return r_r;
  }

  for(i = prev_process; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i){
      prev_process = i;
      r_r = i;
      return r_r;
    }
  }

  for(i = 0; i < prev_process; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i){
      prev_process = i;
      r_r = i;
      return r_r;
    }
  }
  return prev_process;
}

int round_robin_priority(const process proc[], int t)
{
  int i = 0;
  int prev_process = -1;
  int r_r_p = -1;
  int p0_index, p1_index, p2_index;

  while(i < NUM_PROCESSES && p0_index == -1 && prev_process == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && proc[i].priority == 0){
      p0_index = i;
    }
    i++;
  }

  while(i < NUM_PROCESSES && p1_index == -1 && prev_process == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && proc[i].priority == 1){
      p1_index = i;
    }
    i++;
  }

  while(i < NUM_PROCESSES && p2_index == -1 && prev_process == -1){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && proc[i].priority == 2){
      p2_index = i;
    }
    i++;
  }

  if(!p0_index && !p1_index && !p2_index){
    return -1;
  }

  if(!prev_process){
    if(p0_index > -1){
      prev_process = p0_index;
      return prev_process;
    }

    if(p1_index > -1){
      prev_process = p1_index;
      return prev_process;
    }

    if(p2_index > -1){
      prev_process = p2_index;
      return prev_process;
    }
  }

  for(i = prev_process; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 2){
      prev_process = i;
      return prev_process;
    }
  }

  for(i = 0; i < prev_process; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 2){
      prev_process = i;
      return prev_process;
  }

  if(proc[prev_process].priority == 2 && proc[prev_process].remainingtime > 0){
    return prev_process;
  }

  for(i = prev_process; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 1){
      prev_process = i;
      return prev_process;
   }
  }

  for(i = 0; i < prev_process; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 1){
      prev_process = i;
      return prev_process;
   }
  }

  if(proc[prev_process].priority == 1 && proc[prev_process].remainingtime > 0){
    return prev_process;
  }

  for(i = prev_process; i < NUM_PROCESSES; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 0){
      prev_process = i;
      return prev_process;
   }
  }

  for(i = 0; i < prev_process; i++){
    if(proc[i].arrivaltime <= t && proc[i].remainingtime > 0 && prev_process != i && proc[i].priority == 0){
      prev_process = i;
      return prev_process;
   }
  }

  if(proc[prev_process].priority == 0 && proc[prev_process].remainingtime > 0){
    return prev_process;
  }
  return prev_process;
}
