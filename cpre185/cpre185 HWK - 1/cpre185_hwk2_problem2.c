	/*Name:Kent Mark
- 	Section:B
-	NetID:komark@iastate.edu
-	Date:1/24/18*/

#include <stdio.h>
#include <math.h>

int main()
{
	int x,q,w,v,b;
	double e;
	
	e = 2.718; 
	
	q = 2*1;
					/* Equation is an equality that performs the same computation on both sides of the equal sign. By that logic it was just a matter of plugging in the functions. */ 
	w = 3*2*1;
	
	v = 4*3*2*1;
	
	b = 5*4*3*2*1;
	

	
	printf("Enter a value: "); 
	scanf("%d",&x);
	
	printf("You're answer is %.2f = %.2f", pow(e,x),1+x+(pow(x,2)/q)+(pow(x,2)/w)+(pow(x,2)/v)+(pow(x,2)/b));
	
		return 0;
		
}

	
	
	
	
