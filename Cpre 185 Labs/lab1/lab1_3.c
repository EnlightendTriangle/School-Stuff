/*-----------------------------------------------------------------------------
-					          SE 185 Lab 02
-             Developed for 185-Rursch by T.Tran and K.Wang
- Adapted to cpre185s18 by Swamy Ponpandi
-	Name: Kent Mark
- 	Section: B
-	NetID: komark@iastate.edu
-	Date: 1/24/18
-----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
-	                            Includes
-----------------------------------------------------------------------------*/
#include <stdio.h>


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
    int integerResult;
    double decimalResult;

    integerResult = 77 / 5;
    printf("The value of 77/5 is %d, using integer math\n", integerResult); /*Replaced %lf with %d since the number being read is an integer*/

    integerResult = 2 + 3;
    printf("The value of 2+3 is %d\n"),integerResult; /* The variable integer result was inserted after the printf statement to call the value*/

    decimalResult = 1.0 / 22.0;
    printf("The value 1.0/22.0 is %lf\n", decimalResult); /* Changed %d to % lf since the number being read was a decimal*/  

    return 0;
}

