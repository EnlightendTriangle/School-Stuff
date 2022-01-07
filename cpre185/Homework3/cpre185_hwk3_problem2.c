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
#include <string.h>

/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/

                     

/*-----------------------------------------------------------------------------
-							 Implementation
-----------------------------------------------------------------------------*/
int main(void)
{
	char str1[10];
	
	
	int l, h, w, r; 
	
	
	printf("\n Please enter a shape: ");
	
	scanf("%s", &str1);
	
	
	
	if(strcmp(str1, "Cuboid")==0){
		
		
		printf("\n Please enter a length, width, and height: ");
	
		scanf("%d, %d, %d", &l, &w, &h);
		
		printf("\n The volume of the cuboid is %d", l*w*h);
	
	} else if(strcmp(str1, "Cylinder") == 0){
			
			printf("\n Please enter a radius and height: ");
			
			scanf("%d, %d", &r, &h);
			
			printf("\n The volume of the cylinder is %f", 3.14*pow(r,2)*h);
			
	}
		else if(strcmp(str1, "Cone") == 0){
			
			printf("\n Please enter a radius and height: ");
			
			scanf("%d, %d", &r, &h);
			
			printf("\n The volume of the cone is %f", 3.14*pow(r,2)*(h/3));
		}
		
		else if(strcmp(str1, "Sphere") == 0){
			
			printf("\n Please enter a radius: ");
			
			scanf("%d",&r);
			
			printf("\n The volume of the sphere is %f", (12.56/3)*pow(r,3));
			
		}

			else {
			
			printf("I don't recognize that shape, choose from Cuboid, Sphere, Cone, or Cylinder");
		}
		
}