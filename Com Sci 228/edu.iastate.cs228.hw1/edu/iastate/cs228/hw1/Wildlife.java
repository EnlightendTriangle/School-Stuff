package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *  
 * @author Kent Mark 
 *
 */

/**
 * 
 * The Wildlife class performs a simulation of a grid plain with
 * squares inhabited by badgers, foxes, rabbits, grass, or none. 
 *
 */
public class Wildlife 
{
	/**
	 * Update the new plain from the old plain in one cycle. 
	 * @param pOld  old plain
	 * @param pNew  new plain 
	 */
	public static void updatePlain(Plain pOld, Plain pNew)
	{
		int i, j;
		
		for(i = 0; i < pOld.getWidth(); i++) {
			
			for(j = 0; j < pOld.getWidth(); j++) {
				
				pNew.grid[i][j] = pOld.grid[i][j].next(pNew);
			}
		}
	}
	
	/**
	 * Repeatedly generates plains either randomly or from reading files. 
	 * Over each plain, carries out an input number of cycles of evolution. 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{	
		
		
		Plain even;   				 // the plain after an even number of cycles 
		Plain odd;                   // the plain after an odd number of cycles
		
		even = null;
		
		odd = null;
		
		int version = 1;
		
		int m = -1;
		
		int width, iterations, itr = 0;
		
		String input;
		
		boolean end;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Simulation of Wildlife of the Plain");
		
		System.out.println("keys: 1 (random plain) 2 (file input) 3 (exit)");
		
		while(m != 3) {
			
			end = false;
			
			System.out.printf("Trial %d: ", version);
			
			m = s.nextInt();
			
			switch(m) {
			
			case 1: 
				
				System.out.println("Random Plain");
				
				System.out.printf("Enter the grid width: ");
				
				width = s.nextInt();
				
				even = new Plain(width);
				
				odd = new Plain(width);
				
				even.randomInit();
				
				break;
				
				
				
			 case 2:
				 
				 System.out.println("Plain input from a file");
				 
				 System.out.printf("File name: ");
				 
				 input = s.next();
				 
				 try {
					 
					 even = new Plain(input);
					 
					 odd = new Plain(even.getWidth());
				 }
				 
				 catch(FileNotFoundException ex) {
					 
					 System.out.println("Unable to process file!");
					 
					 ex.printStackTrace();
					 
				 }
				 
				 break;
				 
			default:
				
				end = true;
				
				break;
			}
			
			if(end) {
				
				break;
			}
			
			boolean EnDedEvEn = false;
			
			String InitialPlain = even.toString();
			
			String FinalPlain = null;
			
			System.out.println("Enter the number of cycles: ");
			
			iterations = s.nextInt();
			
			version++;
			
			for(itr = 0; itr < iterations; itr++) {
				
				if(itr % 2 == 0) {
					
					updatePlain(even,odd);
					
					EnDedEvEn = true;
				}
				
				else {
					
					updatePlain(odd,even);
					
					EnDedEvEn = false;
				}
				
				if(EnDedEvEn == true) {
					
					FinalPlain = odd.toString();
				}
				
				else {
					
					FinalPlain = even.toString();
				}
				
			}
			
			System.out.printf("\nInitial plain: \n\n%s\n", InitialPlain);
			System.out.printf("Final plain: \n\n%s\n", FinalPlain);
		}
	}
}
