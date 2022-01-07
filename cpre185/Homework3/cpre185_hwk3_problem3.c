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
#include <ctype.h>
/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/

                     

/*-----------------------------------------------------------------------------
-							 Implementation
-----------------------------------------------------------------------------*/
int main(void)
{
	char ch, po;
	
	printf("Enter a character: ");
	
	scanf("%c", &ch);
	
	if(ch >= 'A' && ch <= 'H'){
		
		ch = tolower(ch);
		
		printf("I've reduced this to %c", ch);
	}

	else if(ch >= 'I' && ch <= 'O'){
		
		printf("This character's ASCII value is %d", ch);
	}
	
	else if(ch >= 'P' && ch <= 'S'){
		
		po = ch + 1;
		
		printf("This character times the next character is %d", ch*po);
	}
	
	else if(ch >= 'T' && ch <= 'Z'){
		
	
		printf("This character squared is %d", ch * ch);
	}
	
	else {
		printf("This is not a valid character");
	}
}

