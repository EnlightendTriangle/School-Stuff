/*-----------------------------------------------------------------------------
-					            cpre 185 Lab 01
-             Developed for 185-Rursch by T.Tran and K.Wang
			  Adapted for cpre 185 by Swamy D. Ponpandi
-	Name:
- 	Section:
-	NetID:
-	Date:
-----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
-								Includes
-----------------------------------------------------------------------------*/
#include <stdio.h>
#include <stdlib.h>


/*-----------------------------------------------------------------------------
-								Implementation
-----------------------------------------------------------------------------*/
int main()
{
    /* DO NOT EDIT THIS FILE */
    char id [1000];

    int num = 0;

    printf("Value before input: %d\n", num);

    printf("Type a number: ");
    scanf("%d", &num);
    printf("\n");

    printf("Type your netID: ");
    scanf("%s", id);
    printf("\n");

    printf("Your input was %d ", num);
    printf("and your ISU email is %s@iastate.edu\n", id);

    return 0;

}


