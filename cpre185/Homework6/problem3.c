/**********************************************/
/*** CPRE 185 – Homework 6 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 2/27/18 ****/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <math.h>

#define MAX_SIZE 30

int main(void) {
	
	srand(time(NULL));
	
	int i;
	int randNum [1000];
	int j, unidig = 0;
	int count[MAX_SIZE];
	
	printf("\nRandom Number : Frequency\n");
	
	for(i = 1; i < 1001; i++)
	{
		
		randNum[i] = rand() % 20 + 1;
		
		printf("   %d  ", randNum[i]);
		
		if(randNum[i] == randNum[i])
		{
			unidig = rand() % 20 + 1;
			printf("  :         %d", unidig);
			
	}
	return 0;

	
		
	//for(i = 0; i < 31; i++)
	//{
		//count[i] == rand() % 31 + 1;
		
		//printf("%d", count[i]);
	}
		}