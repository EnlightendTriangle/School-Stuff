/**********************************************/
/*** CPRE 185 – Homework ‘Put homework number HERE’ ***/
/*** *******************************************/
/*** Author – ‘Kent Mark’ ****/
/*** Lab section – ‘B’ ****/
/*** Date started – ‘4/13/18’ ****/
/*** Comments – ‘general comments about this code’ *****/
/**************************************************/

#include <stdio.h>
#include <string.h>

struct Points{
	
	float x;
	float y;
	
}point1, point2, point3;

int main(){
	
	struct Points point1, point2, point3;
	float xdir, ydir, peri;
	
	printf("Enter three coordinates to produce triangle (x,y): ");
	
	scanf("%f%f%f%f%f%f", &point1.x, &point1.y, &point2.x, &point2.y, &point3.x, &point3.y);
	
	printf("The Triangle's coordinates are as follows:");
	
	printf("\n(%.2f, %.2f)", point1.x, point1.y);
	
	printf("\n(%.2f, %.2f)", point2.x, point2.y);
	
	printf("\n(%.2f, %.2f)", point3.x, point3.y);
	
	printf("\nEnter amount of units to tanslate Triangle for x and y coordinates: ");
	
	scanf("%f%f", &xdir, &ydir);
	
	printf("\nYou have translated this triangle %.2f places right/left and %.2f places up/down", xdir, ydir);
	
	printf("\n(%.2f, %.2f)", point1.x + xdir, point1.y + ydir);
	
	printf("\n(%.2f, %.2f)", point2.x + xdir, point2.y + ydir);
	
	printf("\n(%.2f, %.2f)", point3.x + xdir, point3.y + ydir);
	
	
	
	return 0;
}











