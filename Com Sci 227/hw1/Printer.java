package hw1;


/**
 * A class that simulates the operation of a basic ink cartridge printer.
 * @author Kent Mark
 */
	   
public class Printer {

	
	/**
	 * * Total Ink Cartridge Capacity*/  
	public static final double INK_CAPACITY = 2.0;
	
	/**
	 * * Amount of ink, in ounces, used in printing*/
	public static final double INK_USAGE = 0.0023;
	
	/**
	 * This variable holds the amount of paper the printer can store*/
	private int printerCapacity;
	/**
	 * Variable that holds the global constant INK_CAPACITY.
	 * */
	private double inkCartridge;
	/**
	 * Variable that holds the amount of paper the user has placed into the printer bay.
	 */
	private int printerSheets;
	/**
	 * A counter variable that I used to keep track of how many single sided sheets of paper was printed.
	 */
	private int pagecnt;
	/**
	 * A counter variable that I used to keep track of how many sheets of 
	 * paper was printed when the mode of the printer was set to Double Sided Print.
	 */
	private int pageCnt;
	/**
	 * A variable that I used to help simulate the changing of a spent ink cartridge.
	 */
	private int cartridges = 1;
	/**
	 * A variable that I used to store some useful arithmetic regarding 
	 * how many pages would need to be printed before the ink ran out.
	 */
	private double ink_used;
	/**
	 * Constructs a printer that has the given capacity 
	 * (number of sheets of paper it can hold). 
	 *  Initially it contains no paper and a full ink cartridge. 
	 * @param givenCapacity the amount of paper the printer can hold
	 */
	public Printer (int givenCapacity) {
		
		printerCapacity = givenCapacity;
		
		printerSheets = 0;
		
		inkCartridge = INK_CAPACITY;
		
	}
		
	/**
	 * Constructs a printer that has the given capacity (number of sheets of paper it can hold).  
	 * Initially it contains the given number of sheets of paper and a full ink cartridge.  
	 * Note that if givenNumberOfSheets is greater than givenCapacity, then the 
	 * printer will initially contain givenCapacity sheets of paper.
	 * @param givenCapacity the maximum amount of paper the printer can withhold
	 * @param givenNumberOfSheets the amount of paper that has been placed into the printer
	 */
	public Printer (int givenCapacity, int givenNumberOfSheets) {
		
		printerCapacity = givenCapacity;
		
		printerSheets = givenNumberOfSheets;
	
		if (printerSheets > printerCapacity) {
			
			printerSheets = printerCapacity;
		}
	
	
	}
	
	/**
	 * Adds the given number of sheets of paper to this printer, 
	 * not exceeding the printer's capacity. 
	 * @param additionalSheets adds paper to the printer
	 */
	public void addPaper (int additionalSheets) {
		
		printerSheets+=additionalSheets; // Adds the value of initial sheets to user inputed sheets of paper
		
		if (printerSheets > printerCapacity) {
			
			printerSheets = printerCapacity;
		}
	}
	
	/**
	 * Returns the number of sheets of paper currently in this printer.  
	 * This value is never negative.
	 * @return printerSheets the amount of sheets in the printer
	 */
	public int getCurrentPaper() { // Returns the current amount of paper in the printer bay
		
		
		return printerSheets;
	}
	
	/**
	 * Returns the total amount of paper that has been used since the printer was constructed.
	 * @return pagecnt+pageCnt the total amount of paper used
	 */
	public int getTotalPaperUse() {
		
		return pagecnt + pageCnt;
		
	}
	
	/**
	 * Determines whether the ink has run out.  
	 * Returns true if the amount of ink left is smaller than the quantity 
	 * INK_USAGE needed to print one page.
	 * @return false if the ink has not been depleted
	 */
	public boolean isInkOut() {
		
		ink_used = (pagecnt+2*pageCnt)*0.0023; // Adds the two page count variables from SINGLE SIDED MODE and DOUBLE SIDED MODE and multiplies that by Ink Usage to determine the amount of ink used.
		
		
		
		if(ink_used > cartridges*2.0-0.0023) { // If the ink used is greater than 1.9977, or if 869 pages has been printed then the ink has run dry!
			
			return true;
		
		}
		
		return false;
	} 
	
	/**
	 * Replaces Ink Cartridge.
	 */
	public void replaceInk() {
		
		 if(isInkOut()) {
			
			 ink_used = 2.0*cartridges;
			 cartridges++; // Replaces INK Cartridges
		 }
		
		
	}
	
	/**
	 * Simulates printing pages in one-sided mode, using the appropriate number of sheets and a corresponding quantity of ink.  
	 * If there is not enough paper, the printer will use up all remaining paper and will only use the quantity of ink needed for the sheets actually printed. 
	 * If there is not enough ink, the printer will use up all the ink, and will still use up the specified 
	 * number of sheets of paper (i.e., it just prints a bunch of blank pages after the ink runs out). 
	 * @param numberOfPages the number of one sided prints needed 
	 */
	public void print(int numberOfPages) { //Prints in one-sided mode, therefore 1 whole page is used when the user calls this method
		
		
		if(numberOfPages > printerSheets) {
			
			numberOfPages = printerSheets;
		}
		
		pagecnt+=numberOfPages;
		
		printerSheets-=numberOfPages;
	
		if (printerSheets < 0) {
			
			printerSheets = 0;
		}
	}
	
	/**
	 *Simulates printing pages in two-sided mode, using the appropriate number of sheets and a corresponding quantity of ink.  If there is not enough paper, the printer will use up all remaining paper and will only use the quantity of ink needed for the sheets actually printed. 
	 *If there is not enough ink, the printer will use up all the ink, and will still use up the specified number of sheets of paper (i.e., it just prints a bunch of blank pages after the ink runs out). 
	 * @param numberofpages the number of two sided prints needed
	 */
	public void printTwoSided(int numberofpages) {
		
		int doubleprint = (numberofpages/2)+(numberofpages%2);
		
		if(printerSheets < doubleprint) {
			
			doubleprint = printerSheets;
		}
		
		pageCnt+=doubleprint;
		
		printerSheets -= doubleprint;
		
		if (printerSheets < 0) {
			
			printerSheets = 0;
		}
	}

}
