/**********************************************/
/*** CPRE 185 – Homework 3 ***/
/**********************************************/
/*** Author – Kent Mark ****/
/*** Lab section – ‘B’ ****/
/*** Date started – 2/1/18 ****/
/**************************************************/

#include <stdio.h> 
   

long int factorial(int n);            
int main()
{
	int n; 
	printf("Enter number for x: ");
	scanf("%d", &n);
	printf("Factorial of %d = %ld",n,factorial(n));
	return 0;
}

long int factorial(int n)
{
	if (n >= 1)
		return n*factorial(n-1);
	else 
		return 1;
}
	
	
	
