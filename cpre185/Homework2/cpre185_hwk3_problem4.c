/**********************************************/
/*** CPRE 185 – Homework ‘3’ ***/
/*** *******************************************/
/*** Author – ‘Kent Mark’ ****/
/*** Lab section – ‘B’ ****/
/*** Date started – ‘1-31-18’ ****/
/*** Comments – ‘Test for some value’ *****/
/**************************************************/


#include <stdio.h>

// C recursive function to solve Hanoi Tower puzzle
void HanoiTower(int n, char from_rod, char to_rod, char aux_rod) // int n - number of disks, char from_rod - current peg disk is on, char to_rod - peg where disk is to be moved, char aux_rod - leftover peg
{
	if (n == 1)
	{
		printf("\n Move disk 1 from rod %c to rod %c", from_rod, to_rod); // this line moves one disc
		return;
	}
	HanoiTower(n-1, from_rod, aux_rod, to_rod);
	printf("\n Move disk %d from rod %c to rod %c", n, from_rod, to_rod); // These lines complete other sub-tasks, basically moving the discs around until they rest on top each other in order of largest to smallest, or in this case in order from 4 to 1
	HanoiTower(n-1, aux_rod, to_rod, from_rod);
}

int main()
{
	int n = 4; // Number of disks I used, 
	HanoiTower(n, 'A', 'C', 'B'); // A, B and C are names of rods
	return 0;
}


	
	
	

	
	
                                                                                                                           