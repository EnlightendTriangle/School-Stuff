package edu.iastate.cs228.hw5;


import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *  
 * @author Kent Mark 
 *
 */

/**
 * 
 * The Transactions class simulates video transactions at a video store. 
 *
 */
public class Transactions 
{
	
	/**
	 * The main method generates a simulation of rental and return activities.  
	 *  
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, AllCopiesRentedOutException, FilmNotInInventoryException, IllegalArgumentException
	{	
		
		VideoStore vidStre  = new VideoStore("C:/videoList1.txt ");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Transactions at a Video Store");
		
		System.out.println("keys: 1 (rent)      2 (bulk rent)");
		
		System.out.println("      3 (return)    4 (bulk return)");
		
		System.out.println("      5 (summary)   6 (exit)");
		
		System.out.println();
		
		System.out.print("Transaction: ");
		
		String str = s.next();
		
		while (true) {
			
			if (str.equals("1")) {
				
				System.out.print("Film to rent: ");
				
				s.nextLine();
				
				String film = s.nextLine();
				
				vidStre.videoRent(vidStre.parseFilmName(film), vidStre.parseNumCopies(film));

			} else if (str.equals("2")) {
				
				System.out.print("Video file (rent): ");
				
				String file = s.next();
				
				vidStre.bulkRent(file);

			} else if (str.equals("3")) {
				
				System.out.print("Film to return: ");
				
				s.nextLine();
				
				String film = s.nextLine();
				
				vidStre.videoReturn(vidStre.parseFilmName(film), vidStre.parseNumCopies(film));

			} else if (str.equals("4")) {
				
				System.out.print("Video file (return): ");
				
				String file = s.next();
				
				vidStre.bulkReturn(file);
				
			} else if (str.equals("5")) 
			
			{
				System.out.println(vidStre.transactionsSummary());
				
			} 
			else {
				
				break;
			}
			
			System.out.println();
			
			System.out.print("Transaction: ");
			
			str = s.next();
		}
		
		s.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	