/**********************************************/
/*** CPRE 185 – Homework 8 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 3/24/18 ****/


#include <stdio.h>
#include <string.h>
//read 3 strings into 2d char array

void read_3_strings(char myArray[3][5], int r)
{
	
	int i, w, p, u;
	
	for(i = 0 ; i < r; i++)
	{
		printf("Enter string %d - ", i);
		scanf("%s", myArray[i]);
	
		
	}
}



int main()
{
	int i, n, u, length;
	
	char myArray[3][5];
 
	read_3_strings(myArray, 3);
	
    // = strlen(myArray[i]);
	
	
	printf("%d",strlen(myArray[i]) + strlen(myArray[2]));
	
}


