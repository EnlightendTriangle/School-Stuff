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



int main(void) {
	
	srand(time(NULL));
	int arr[20];
	int i, decimal, power;
	
	
	
	printf("Your binary number is: ");
	
	for (i = 1; i < 21; i++)
	{
		if(i == 20){
		arr[i] = rand()%2 + 0;
		
		printf("%d\n",arr[i]);
		}
		else{
		arr[i] = rand()%2 + 0;
		
		printf("%d",arr[i]);
		}
	}
	
	for(i = 20; i > 0; i = i -1)
	{
		if(arr[i] == 1){
			
			power = 1 * (pow(2, (20-i))); 
			
			decimal += power;
		}
	}
	printf("Your decimal number is: %d", decimal);
	
	
		

	return 0;

}
		
	
	
	
	
