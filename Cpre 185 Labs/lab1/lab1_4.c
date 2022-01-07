/*-----------------------------------------------------------------------------
-					          SE 185 Lab 02
-             Developed for 185-Rursch by T.Tran and K.Wang
- Adapted to cpre 185s18 by Swamy Ponpandi
-	Name: Kent Mark
- 	Section: B
-	NetID: komark@iastate.edu
-	Date: 1/24/18
-----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
-	                            Includes
-----------------------------------------------------------------------------*/
#include <stdio.h>
#include <math.h>


/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/


/*-----------------------------------------------------------------------------
-	                            Prototypes
-----------------------------------------------------------------------------*/


/*-----------------------------------------------------------------------------
-							 Implementation
-----------------------------------------------------------------------------*/
int main()
{

    /* Put your code after this line */
int a,b,e,f,j;
double c,d,g,h,i,k,l,m,n,Area,Conversion, Temperature;
a = 6427 + 1725;
b = (6971*3925)-95;
c = 79 + 12/5; /* Decimal was rounded down. Answer should be 81.4 */
d = 3640.0/107.9; 
e = (22/3)*3; /* Number was computed as an integer. Answer should be 22 */
f = 22/(3*3); /* Number was computed as an integer. Should be 2.4 */  
g = 22/(3*3); /*Deciaml was rounded down. Answer should be 2.4*/
h = 22/3*3; /* PEMDAS was ignored, numbers were computed from left to right. Answer should be 2.4*/
i = (22.0/3)*3.0;
j = 22.0/(3*3.0); /* Number was computed as an integer. Answer should be 2.4*/
k = 22.0/3.0*3.0; /* Order of operations was ignored. Answer should be 2.4*/
l = pow(23.567,2);
m = 14;
n = 76;

Area = l/4*3.14;
Conversion = m*0.3048;
Temperature = (n-32)/1.8;

printf("%d\n",a);
printf("%d\n",b);
printf("%.2f\n",c);
printf("%.2f\n",d);
printf("%d\n",e);
printf("%d\n",f);
printf("%.2f\n",g);
printf("%.2f\n",h);
printf("%.2f\n",i);
printf("%d\n",j);
printf("%.2f\n",k);
printf("%.2f\n",Area);
printf("%.2f\n",Conversion);
printf("%.2f\n",Temperature);
    return 0;

}

