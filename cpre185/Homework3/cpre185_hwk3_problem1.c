/*							
-   CPRE 185 - Homework 3
-	Name:Kent Mark
- 	Section:B
-	NetID:komark@iastate.edu
-	Date:2/11/18
*/

/*-----------------------------------------------------------------------------
-	                            Includes
-----------------------------------------------------------------------------*/
#include <stdio.h>
#include <math.h>
#include <strcmp.h>

/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/

int sum(int x);	                         

/*-----------------------------------------------------------------------------
-							 Implementation
-----------------------------------------------------------------------------*/
int main(void)
{
	int n;
	
	printf("Enter a number a number(n): ");
	scanf("%d", &n);
	
	printf("The sum is %d", sum(n));
	
		return 0;
		
}

 int sum(int x) {
 	int soldat;
	soldat = ((x + 1)*(2*x+1)*x)/6;
   
    return soldat;
 }