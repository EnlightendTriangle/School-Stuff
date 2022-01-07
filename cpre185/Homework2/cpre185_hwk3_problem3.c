/**********************************************/
/*** CPRE 185 – Homework ‘3’ ***/
/*** *******************************************/
/*** Author – ‘Kent Mark’ ****/
/*** Lab section – ‘B’ ****/
/*** Date started – ‘1-31-18’ ****/
/*** Comments – ‘Test for some value’ *****/
/**************************************************/

#include <stdio.h>
#include <math.h>

#define PI 3.14159265 // defined my own pi variable to save time and for better accuracy

int main()
{	
	//int x,y;
	double x, y, PyTheorem, TanFunc;     //Both double and int work fine, uncomment to test. 
	
	printf("Enter your coordinates for Polar conversion(x,y): ");  // The numbers were constantly rounded down to the next whole integer.
	scanf("%lf,%lf", &x, &y);				   // Therefore the answer given will always be 1 whole number off. 
	printf("You entered (%.2f,%.2f)\n", x, y);
	
	PyTheorem = sqrt(pow(x,2)+pow(y,2));
	
	TanFunc = atan(y/x) * 180.0 / PI; 
	
	printf("The point is (%.1f,%.2f) in Polar Coordinates.\n", PyTheorem, TanFunc);

	return 0;
}


	
	
	
	
	
                                                                                                                           