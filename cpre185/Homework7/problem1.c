/**********************************************/
/*** CPRE 185 – Homework 7 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 3/17/18 ****/
/*** Comments – ‘general comments about this code’ *****/
/**************************************************/

#include <stdio.h>
#include <string.h>


void main()
{
	char inp_string[10];
	char insert_string[10];
	char c[10];
	int pos=0,r=0,i=0;
	int t=0;
	int x,g,s,n,o;
 
	puts("Enter First String:");
	gets(inp_string); 
	puts("Enter Second String:");
	gets(insert_string);
	printf("Enter the position where the item has to be inserted: ");
	scanf("%d",&pos);
	r = strlen(inp_string);
	n = strlen(insert_string);
	i = 0;
 
 // Copying the input string into another array 
	while(i <= r)
	{
		c[i]=inp_string[i];
		i++;
	}	
	s = n + r; //length of both strings combined 
	o = pos + n; // Sets new string size
 
 // Adding the sub-string
	for(i=pos;i<s;i++)
	{
		x = c[i]; //input string stored in variable 
		if(t < n)
		{
			inp_string[i] = insert_string[t];
			t = t + 1; // Spells out complete string 
		}
		inp_string[o] = x;
		o = o + 1; // Adds a space after each string 
	}
 
	printf("%s", inp_string);
}