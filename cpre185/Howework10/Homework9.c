/**********************************************/
/*** CPRE 185 – Homework 9 & 10 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B****/
/*** Date started – 4/22/18 ****/
/*** Comments – ‘general comments about this code’ *****/
/**********************************************/

#include <stdio.h>
#include <stdlib.h>

int main(void) {
   char* userVals = NULL; // No array yet
   int nchars = 0;
   int i = 0;
   
   printf("Enter size of the array: ");
   scanf("%d", &nchars);
   
   userVals = (char*)malloc(nchars * sizeof(char));
   
   printf("Enter %d characters...\n", nchars);
   for (i = 0; i < nchars; ++i) {
      scanf("%c", &(userVals[i]));
   }
   
   printf("You entered: ");
   for (i = 0; i < nchars; ++i) {
      printf("%c", userVals[i]);
   }
   printf("\n");
   
   free(userVals);
   
   return 0;
}