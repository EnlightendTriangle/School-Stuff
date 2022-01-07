package edu.iastate.cs228.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSort {
	
	 public static void main(String[] args) throws FileNotFoundException {
	    
	        String text = ""; 
	        
	        String wordPattern = ""; 
	        
	        File file = new File("D:/VideoList2.txt"); // A test file I used 
	      
	        Scanner sc = new Scanner(file); 
	        
	        while (sc.hasNextLine()) {
	        	
	        	text = sc.nextLine();
	        	
	        	wordPattern = "Taxi";
	        	BruteForce(text, wordPattern); 
	        	
	        	System.out.println("Search Method: Brute Force");
            	System.out.println("Index          Search String");
            	System.out.println("----------------------------");
            	
	  	        
	        }
	        
	      
	    } 
	 
	 public static void BruteForce(String text, String wordPattern) 
	    { 
		 int wp  = wordPattern.length(); 
	        
	        int tx = text.length(); 
	        
	        int j; 
	  
	        /* For loop goes through string one by one */
	        for (int i = 0; i <= tx - wp; i++) { 
	 
	            /* For current index i, check for pattern  
	              match */
	            for (j = 0; j < wp; j++) 
	                if (text.charAt(i + j) != wordPattern.charAt(j)) 
	                    break; 
	  
	            if (j == wp) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	            	
	                System.out.println(i + "              " + wordPattern); 
	        } 
	    } 
	 

}
