/**********************************************/
/*** CPRE 185 – Homework 6 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 2/27/18 ****/
/*** Comments – ‘It would be a good idea to try for 20 interations just to be on the safe side, however it should comput after about ten or eleven times’ *****/
/**************************************************/

#include <stdio.h>
#include <math.h>

float num (float x)
{
    return pow(x,3)-3*x*x-5*x+8; //Given Polyniomial 
}
void bisection (float *center, float a, float b, int *iteration)
/* this function performs and prints the result of one iteration */
{
    *center=(a+b)/2; 
    ++(*iteration); //iteration runs each time
    printf("Iteration Number = %d     Root = %7.5f\n", *iteration, *center);
}
int main ()
{
    int itr = 0, maxmitr; //maximum interation 
    float x, a, b, x1; // 'X' is the value of the root after nth iterations. 'X1' is the value of the root after (n+1) iterations.
    printf("\nEnter the values of a, b, and maximum iterations:\n"); 
    scanf("%f %f %d", &a, &b, &maxmitr); //Scans a, b, and maximum number of iterations 
    bisection (&x, a, b, &itr); //function call 
    do 
    {
        if (num(a)*num(x) < 0) 
            b=x; //B equals center 
        else
            a=x; //A equals center 
        bisection (&x1, a, b, &itr);
        if (fabs(x1-x) < 0.0001)
        {
            printf("Root of the polynomial is %6.4f\n", x1);
            return 0;
        }
        x=x1;
    }
    while (itr < maxmitr);
    printf("Enter a higher number of iterations");
    return 1;
}
																// z7uA4KJQbjgfUpzkppeJRcx2sScTbPAJ51ATs49thj0=