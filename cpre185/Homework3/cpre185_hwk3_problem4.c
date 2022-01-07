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
#include <stdlib.h>
/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/

                     

/*-----------------------------------------------------------------------------
-							 Implementation
-----------------------------------------------------------------------------*/
int main(void)
{
	int t;
	float a, b, c, root1, root2, discriminant ;

	printf("Enter values for a, b, and c: ");
	scanf("%f, %f, %f", &a, &b, &c);
	
	discriminant = pow(b,2)-(4*a*c);
	
	if(discriminant == 0){
		printf("Error, numerator is 0");
	}

	printf("\nEnter 0 for both roots, 1 for the first root, or 2 for the second root: ");
	scanf("%d", &t);
	
	switch(t)
	{
		case 0:
			
			root1 = abs(-b + sqrt(discriminant)) / (2 * a);
            root2 = abs(-b - sqrt(discriminant)) / (2 * a);
			
			printf("Two roots exists: %.2f and %.2f", root1, root2);
			
			break;
			
		case 1:
			
			root1 = abs(-b + sqrt(discriminant)) / (2 * a);
			
			printf("Root 1 is: %.2f", root1);
			
			break;
			
		case 2: 
		
			  root2 = abs(-b - sqrt(discriminant)) / (2 * a);
			  
			  printf("Root 2 is: %.2f", root2);
			  
			  break;
		
	}
	
	
}


		
