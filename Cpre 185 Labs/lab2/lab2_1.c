/*-----------------------------------------------------------------------------
-					          SE 185 Lab 02
-             Developed for 185-Rursch by T.Tran and K.Wang
- Adapted to cpre 185 - swamy ponpandi
-	Name: Kent Mark
- 	Section: B
-	NetID: komark@istate.edu
-	Date: 1/31/18
-----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
-	                            Includes
-----------------------------------------------------------------------------*/
#include <stdio.h>
#include <math.h>


/*-----------------------------------------------------------------------------
-	                            Defines
-----------------------------------------------------------------------------*/
#define TRUE 1


/*-----------------------------------------------------------------------------
-	                            Prototypes
-----------------------------------------------------------------------------*/
/* Put your function prototypes here */
double mag(double x, double y, double z);
int minutes (int min);
int seconds (int sec);
int millis (int mil);


/*-----------------------------------------------------------------------------
-							Implementation
-----------------------------------------------------------------------------*/
int main(void) {
    /* DO NOT MODIFY THESE VARIABLE DECLARATIONS */
    int t;
    double  ax, ay, az;


    while (TRUE) {
        scanf("%d,%lf,%lf,%lf", &t, &ax, &ay, &az);

/* CODE SECTION 0 */
        printf("Echoing output: %8.3lf, %7.4lf, %7.4lf, %7.4lf\n", t/1000.0, ax, ay, az);

/* 	CODE SECTION 1 */
        printf("At %d s, the acceleration's magnitude was: %lf\n", t, mag(ax,ay,az));

/* 	CODE SECTION 2 */
        
    printf("At %d minutes, %d seconds, and %d milliseconds it was: %lf\n",
        minutes(t), seconds(t), millis(t), mag(ax,ay,az));
    

    }

  return 0;
}

/* Put your functions here */
double mag(double x, double y, double z) {
 	double acclMag;
	acclMag = pow(x,2)+pow(y,2)+pow(z,2);
    //Step 8, uncomment and modify the next line
    return sqrt(acclMag);
}
int minutes (int min){
	int minute;
	minute = min/6000;
	return minute;
}
int seconds (int sec){
	int seconds;
	seconds = (sec%6000)/1000;
	return seconds;
}
int millis (int mil){
	int millisecond;
	mil = (mil%60000)%1000;
	return millisecond;
}


