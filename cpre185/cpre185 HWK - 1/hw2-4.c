#include <stdio.h>

int main(void)
{

 int xCoord, yCoord;
 
 printf("Enter the x-coordinate : ");
 
	scanf("%d", &xCoord);

 printf("Enter the y-coordinate : ");
	                                     
	scanf("%d", &yCoord);
	
	//printf statement number 1
 printf("Point is (%d, %d) \n", xCoord, yCoord);
 
	xCoord = xCoord * xCoord + yCoord * yCoord;
 //printf statement number 2
 printf("Point is (%d, %d) \n", xCoord, yCoord);
 
	yCoord = xCoord - yCoord * yCoord;
 //printf statement number 3
 printf("Point is (%d, %d) \n", xCoord, yCoord);
 
 	yCoord = xCoord / (yCoord - 9);
 //printf statement number 4
 printf("Point is (%d, %d) \n", xCoord, yCoord);
}