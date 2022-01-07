/**********************************************/
/*** CPRE 185 – Homework 3 ***/
/**********************************************/
/*** Author – Kent Mark ****/
/*** Lab section – ‘B’ ****/
/*** Date started – 2/1/18 ****/
/**************************************************/

#include <stdio.h> 
   

int factorial(int n)            
{
	if(n==1)
		return 1;
	return n*factorial(n-1);
	
}
