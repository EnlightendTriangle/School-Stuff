/**********************************************/
/*** CPRE 185 – Homework 4 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 2/27/18 ****/
/*** Comments – ‘general comments about this code’ *****/
/**************************************************/

#include <stdio.h>
#include <math.h>

float num (float x){
	
	return pow(x,3)-3*x*x-5*x+8; //Polynomial that was given 
}

void bisection (float center, float a, float b, int iteration) //this function prints the result of one iteration 
{
    center=(a+b)/2; // Computes intermediate root
    ++(iteration); // iterations; added 1 each round
    printf("Iteration Number = %d Root = %7.5f\n", iteration, center);
}

int main ()
{
    int iteration = 0, maxitr;
    
	float x, a, b, root;
    
	printf("\nEnter the values of a, b, and maximum iterations:\n");
    
	scanf("%f %f %d", &a, &b, &maxitr);
    
	bisection (&x, a, b, &iteration);
	do
	{
		if(num(a)*num(x) < 0)
			b = center;
		else 
			a = center;
		bisection(&root, a, b, itr);
		 if (fabs(root-x) < 0.0001)
        {
            printf("Root of the polynomial is %6.4f\n", root);
            return 0;
        }
        x=root;
    }
    while (itr < maxitr);
    printf("The solution does not converge or iterations are not sufficient");
    return 1;
}
		