package mini2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class HipHipArray {

	private HipHipArray() {}
	
	
	public static boolean isPermutation(int[] arr) {
		
		int i, j;
		
		if(arr.length == 0) {
			
			return true;
		}
		
		for(i = 0; i < arr.length; i++) {
			if(arr.length == 0) {
				
				return true;
			}
			for(j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j] && i != j) {
					
					return false;
				}
			}
		}
		
		return true;
}

	
	public static int[] createPalindrome(int[] arr) {
		
		if(arr.length == 0) {
			
			return arr;
		}
		
		int[] newArr = new int[arr.length*2-1];
		
		for(int i = 0; i < arr.length; i++) {
		
			 newArr[i] = arr[i];
			
		}
		
		for(int i = 0; i < arr.length -1; i++) {
			
			
			newArr[arr.length + i] = arr[arr.length - 2 - i];
			
		}
		
		return newArr;
		
	}
	
	public static java.lang.String[] removeDups(java.lang.String[] arr){
		
		
		int noOfUniqueElements = arr.length;
        
        //Comparing each element with all other elements
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                 
                if(arr[i].equals(arr[j]))
                {
                    //Replace duplicate element with last unique element
                     
                    arr[j] = arr[noOfUniqueElements-1];
                     
                    //Decrementing noOfUniqueElements
                     
                    noOfUniqueElements--;
                     
                    //Decrementing j
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
        
         
        String[] arrayWithoutDuplicates = Arrays.copyOf(arr, noOfUniqueElements);
        
        return arrayWithoutDuplicates;
	}
	
	public static int[] longestRun(int[] arr) {
		
		 int maxLength = 0;
		 
		 int maxStart = 0;
		 
		 int length = 1;
		
		 int start = 0;
		    
		    
		 for (int i = 1; i < arr.length; i++) {
		       
			 if (arr[i - 1] < arr[i] + 1) {
		            length++;
		        } 
			 
			 else {
		           
		            
		            if (length > maxLength) {
		                maxLength = length;
		                maxStart = start;
		            }
		            
		            length = 1;
		            start = i;
		        }
		    }
		    
		    
		 
		   
		    if (length > maxLength) {
		        maxLength = length;
		        maxStart = start;
		    }      
		    
		    int[] ret = new int[maxLength];
		    
		    System.arraycopy(arr, maxStart, ret, 0, maxLength);
		    
		    return ret;
    }
	
	public static void rotate(int[] arr, int amount) {
		
		if(amount <= 0) {
		for (int j = 0; j < Math.abs(amount); j++) {
			
			int a = arr[0];
			
			int i;
			
			for (i = 0; i < arr.length - 1; i++)
				arr[i] = arr[i + 1];
			arr[i] = a;
		}
		}
		
		if(amount >= 1) {
		for (int j = 0; j < Math.abs(amount); j++) {
			
			int a = arr[arr.length - 1];
			
			int i;
			
			for (i = arr.length - 1; i > 0; i--)
				arr[i] = arr[i - 1];
			arr[i] = a;
		}
		}
	}
	    
	
	public static void shift(int[] arr, int amount) {
		
		if(amount <= 0) {
			for (int j = 0; j < Math.abs(amount); j++) {
				
				int a = arr[0];
				
				int i;
				
				for (i = 0; i < arr.length - 1; i++)
					arr[i] = arr[i + 1];
				arr[i] = 0;
			}
			}
			
			if(amount >= 1) {
			for (int j = 0; j < Math.abs(amount); j++) {
				
				int a = arr[arr.length - 1];
				
				int i;
				
				for (i = arr.length - 1; i > 0; i--)
					arr[i] = arr[i - 1];
				arr[i] = 0;
			}
			}
		
	}
	
	public static boolean[] makeSieve(int size,  int[] divisors) {
		
		boolean[] isPrimeNumber = new boolean[size]; 
		
		boolean g;
		
		for(int i = 0; i < size; i++) {
			
			g = false;
			
			if(i < divisors[divisors.length -1] && i !=0) {
				
				isPrimeNumber[i] = true;
			}
			
			else if(i == 0) {
				
				isPrimeNumber[i] = false;
			}
			
			else {
				
				for(int j = 0; j < divisors.length; j++) {
				
					if(i == divisors[j]) {
						
					}
					
					else if((i % divisors[j]) == 0 ) {
					
					g = true;
					isPrimeNumber[i] = false;
					
				}
			
				 if(j == divisors.length - 1 && g == false) {
					
					isPrimeNumber[i] = true;
				}
			
			
			}
			
			}
			
		}
        
        return isPrimeNumber;
	}


	public static int[] makeHistogram(double[] data, int numBins, double min, double max) {
		
		
		return null;
	}







}
	
	
	
	
	
      
	

	
	
	


	

	


	
	
	
	
	
