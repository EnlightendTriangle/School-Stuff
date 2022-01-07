/**********************************************/
/*** CPRE 185 – Homework ‘3’ ***/
/*** *******************************************/
/*** Author – ‘Kent Mark’ ****/
/*** Lab section – ‘B’ ****/
/*** Date started – ‘1-31-18’ ****/
/*** Comments – ‘Test for some value’ *****/
/**************************************************/

#include <stdio.h>


int main()
{	
	int x,a,b,c,d;
	//double a,b,c,d;     Both double and int work fine, uncomment to test. 
	
	printf("Enter a number for x: ");  // The numbers were constantly rounded down to the next whole integer.
	scanf("%d", &x);				   // Therefore the answer given will always be 1 whole number off. 
	
	a = (x*x)/2;
	b = (x*x*x)/6;
	c = (x*x*x*x)/24;
	d = (x*x*x*x*x)/120;
	
	printf("Your soulution is %d", a + b + c + d + 1 + x);
	

	
	
	
	return 0;
}

	
	
	
	
                                                                                                                           