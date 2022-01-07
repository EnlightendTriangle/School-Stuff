package edu.iastate.cs228.hw1;

/**
 *  
 * @author Kent Mark
 *
 */

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner; 
import java.util.Random; 

/**
 * 
 * The plain is represented as a square grid of size width x width. 
 *
 */
public class Plain 
{
	private int width; // grid size: width X width 
	
	public Living[][] grid; 
	
	/**
	 *  Default constructor reads from a file 
	 */
	public Plain(String inputFileName) throws FileNotFoundException
	{		
        File f = new File(inputFileName);
        
        Scanner s = new Scanner(f);
        
        String str;
        
        String str2;
        
        char ch;
        
        int wdth = -1;
        
        int i = 0, j = 0, num;
        
        while(s.hasNextLine()) { 
        	
        	 str = s.nextLine();
        	 
        	 if(wdth < 0) {
        		 
        		 wdth = str.length()/3;
        		 
        		 grid = new Living[wdth][wdth];
        		 
        		 width = wdth;
        	 }
        	
        	 str.replace(" ", " ");
        	 
        	 str.replace('\n', ' ');
        	 
        	 str.trim();
        	 
        	 Scanner sc = new Scanner(str);
        	 
        	 sc.useDelimiter(" ");
        	 
        	 for(j = 0; sc.hasNext(); j++) {
        		 
        		 str2 = sc.next();
        		 
        		 str2.trim();
        		 
        		 str2.replace(" ", "");
        		 
        		 
        		 if(str2.length() > 0) {
        			 
        			 ch = str2.charAt(0);
        			 
        			 if(str2.length() == 1) {
        				 
        				 if(ch == 'E') {
        					 
        					 grid[i][j] = new Empty(this, i, j);
        				 }
        			 
        				 else if(ch == 'G') {
        					 
        					 grid[i][j] = new Grass(this, i, j);
        				 }
        			 }
        		 
        			 else if(str2.length() == 2) {
        				 
        				 num = Character.getNumericValue(str2.charAt(1));
        				 
        				 if(ch == 'B') {
        					 
        					 grid[i][j] = new Badger(this, i, j, num);
        				 }
        				 
        				 else if(ch == 'F') {
        					 
        					 grid[i][j] = new Fox(this, i, j, num);
        				 }
        				 
        				 else if(ch == 'R') {
        					 
        					 grid[i][j] = new Rabbit(this, i, j, num);
        				 }
        			 }
        		 }
        		 
        		 else {
        			 
        			 j--;
        			 continue;
        		 }
        	 }
        	 
        	 i++;
        	 sc.close();
        }
        
        s.close();
	}
	
	/**
	 * Constructor that builds a w x w grid without initializing it. 
	 * @param width  the grid 
	 */
	public Plain(int w)
	{
		
		grid = new Living[w][w];
		
		width = w; 
		
		
	}
	
	
	public int getWidth()
	{
		 
		return width;  
	}
	
	/**
	 * Initialize the plain by randomly assigning to every square of the grid  
	 * one of BADGER, FOX, RABBIT, GRASS, or EMPTY.  
	 * 
	 * Every animal starts at age 0.
	 */
	public void randomInit()
	{
		Random generator = new Random(); 
		 
		int i, j;
		
		
		
		for(i = 0; i < grid.length; i++) {
			
			for(j = 0; j < grid[i].length; j++) {
				
				int num = generator.nextInt(Living.NUM_LIFE_FORMS);
				
				if(num == Living.BADGER) {
					
					grid[i][j] = new Badger(this, i, j, 0);
					
				}
				
				else if(num == Living.FOX) {
					
					grid[i][j] = new Fox(this, i, j, 0);
				}
				
				else if(num == Living.RABBIT) {
					
					grid[i][j] = new Rabbit(this, i, j, 0);
				}
				
				else if(num == Living.GRASS) {
					
					grid[i][j] = new Grass(this, i, j);
				}
				
				else if(num == Living.EMPTY) {
					
					grid[i][j] = new Empty(this, i, j);
				}
			}
		}
	}
	
	
	/**
	 * Output the plain grid. For each square, output the first letter of the living form
	 * occupying the square. If the living form is an animal, then output the age of the animal 
	 * followed by a blank space; otherwise, output two blanks.  
	 */
	public String toString()
	{
		
		int i, j;
		
		String str = "";
		
		for(i = 0; i < grid.length; i++) {
			
			for(j = 0; j < grid[i].length; j++) {
				
				String animal;
				
				boolean IsItAnAnimal;
				
				  State st = grid[i][j].who();
				  
				  if(st == State.BADGER) {
					  
					  IsItAnAnimal = true;
					  
					  animal = "B";
				  }
			
				  else if(st == State.FOX) {
					  
					  IsItAnAnimal = true;
					  
					  animal = "F";
				  }
				  
				  else if(st == State.RABBIT) {
					  
					  IsItAnAnimal = true;
					  
					  animal = "R";
				  }
			
				  else if(st == State.GRASS) {
					  
					  IsItAnAnimal = false;
					  
					  animal = "G";
				  }
				  
				  else if(st == State.EMPTY) {
					  
					  IsItAnAnimal = false;
					  
					  animal = "E";
				  }
				  
				  else {
					  
					  IsItAnAnimal = false;
					  
					  animal = " ";
				  }
			
			
				  if(IsItAnAnimal) {
					  
					  str += animal + ((Animal) grid[i][j]).myAge() + " ";
				  }
				  
				  else {
					  
					  str += animal + "  ";
				  }
			
			}
		
		str += "\n";
		
		
		}
		
		return str; 
	}
	

	/**
	 * Write the plain grid to an output file.  Also useful for saving a randomly 
	 * generated plain for debugging purpose. 
	 * @throws FileNotFoundException
	 */
	public void write(String outputFileName) throws FileNotFoundException
	{
		
		
		File f = new File(outputFileName);
		
		PrintWriter pw = new PrintWriter(f);
		
		String str = this.toString();
		
		pw.write(str);
		
		pw.close();
		
		
	}			
}
