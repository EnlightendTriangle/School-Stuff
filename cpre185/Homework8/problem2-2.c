/**********************************************/
/*** CPRE 185 – Homework 7 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 3/17/18 ****/
/*** Comments – ‘general comments about this code’ *****/
/**************************************************/

#include <stdio.h>
#include <string.h>

int main(void)
{
	char inp_string[100]; 
	int start; 
	int end;
	
	
	printf("Enter a string: ");
	scanf("%s", &inp_string);
	
	printf("Enter a start point: ");
	scanf("%d", &start);
	
	printf("Enter an end point: ");
	scanf("%d", &end);
    
	memmove(&inp_string[start], &inp_string[start + end], strlen(inp_string) - start);

	
	printf("%s", inp_string);
	
}
   
