/**********************************************/
/*** CPRE 185 – Homework 8 ***/
/*** *******************************************/
/*** Author – Kent Mark ****/
/*** Lab section – B ****/
/*** Date started – 3/24/18 ****/
/*** Comments – ‘Code follows logical order of Reviewer 1, 2, 3 then outputs the average of all three Reviews for a single MOVIE.’ *****/
/**************************************************/

#include <stdio.h>


double dAvg(double grid[], size_t length){
    size_t c;
    int sum = 0;

    // Calculate sum first
    for (c = 0; c < length; c++){
        sum += grid[c];
    }

    // Find average by dividing the sum by the number of numbers in a row
    return sum / (double) length;
} 

int main()
{
    double grid[100][100];
    int i,j,row,col;

    printf("Please enter your grid size: ");
    scanf("%d %d", &row, &col);


    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            printf("\nEnter a review score for Movie Table Grid[%d][%d]:", i, j);
            scanf("%lf", &grid[i][j]);
			printf("\n");
		}
        
    }
		
		
	for(i = 0; i < row; i++){
        printf("The average of Movie %d is %.3f\n", i, dAvg(grid[i], col));
    }

    return 0;
}


