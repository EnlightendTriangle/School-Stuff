package mini1;

import java.util.Arrays;

public class KeepMeInTheLoop {

	
	private KeepMeInTheLoop() {}
	
	public static int findNth(java.lang.String s, char ch, int n) {
		
		for (int i = 0; i < s.length(); i++)
	    {
	        if (s.charAt(i) == ch)
	        {
	            n--; //Decrements (n) as the loop is iterated. Once the correct letter and it's specified occurrence has been located this variable should hit 0,allowing the loop to continue. If the loop finishes with (n) never reaching zero then the user entered an impossible scenario.
	            if (n == 0)
	            {
	                return i;
	            }
	        }
	    }
	    
		return -1;
	}
	
	public static boolean isIBeforeE(java.lang.String s) {
		
		for (int i = 0; i < s.length(); i++) { // For loop to iterate through string
			
			char cCharacter = s.charAt(i); // Local variable that stores the characters of the string.
            if(i + 1 == s.length()){ // Conditional that makes sure the user didn't enter one letter, if so it jumps to the end of the loop. 
                continue;
            }
            else if(cCharacter == 'e' && s.charAt(i + 1) == 'i' && (i - 1 < 0 || s.charAt(i - 1) != 'c')){ // If the rule (I before E except after C) is followed but the letter before was not C then the rule was not followed
                return false;
            }
            else if(cCharacter == 'i' && s.charAt(i + 1) == 'e' && (i - 1 < 0 || s.charAt(i - 1) == 'c')){ // If the rule not followed at all then returns false.
                return false;
            }
        }
        return true; // If the rule was followed returns true.
    }

	
	public static boolean isPermutation(java.lang.String s, java.lang.String t) {
		
		if (s.length() != t.length()) { //If statement checks the length of the two strings.
		      return false;
		}
		
		    char[] a = s.toCharArray(); // The two strings are stored in an array
		    char[] b = t.toCharArray(); // The two strings are stored in an array

		    Arrays.sort(a); // Array (a) is sorted in a numerical order 
		    Arrays.sort(b); // Array (b) is sorted in a numerical order

		    return Arrays.equals(a, b); // This method checks to see if the contents of the arrays are the same. Differs from plain (.equals) because (.equals) checks the type of the data, thus it is severely broken for arrays. 

	}
	
	
	public static java.lang.String doubleConsonants(java.lang.String s){
		
		return s.replaceAll("(?i)(([^aeiou])\\2+)|([^aeiou])", "$1$3$3");
 
}

	public static int findStoppingTime(int n) {
		
		int t = 0;
		
		if(n <= 0) 
		{ 
			return t = -1;
			
		}
		while(n != 1 && n > 0) {
		
		if(n % 2 == 0) {
			
			n/=2;
			t++;
		}
		
		else {
			
			n = (n*3) + 1;
			
			t++;
		}
		
		}
		
		
		return t;
	}
	
	
	public static boolean containsWithGaps(java.lang.String source, java.lang.String target) {
	
		int tindex = 0;
		
		for(int i = 0; i < source.length(); i++) {
			
			if (target == ""){return true; }
			
			if(source.charAt(i) == target.charAt(tindex)) {
				
				tindex = tindex + 1;
					
				if(tindex == target.length()) {
					
					return true;
				}
			}
		}
		
		return false;
}

	
	
	public static int findSecondLargest(java.lang.String nums) {
		
		String[] a = nums.split("\\s+");
		
		int LargestInt = Integer.MIN_VALUE;
		int SecondLargestInt = Integer.MIN_VALUE;
		
		for(String stringNumber: a) {
			
			int numberAsString = Integer.parseInt(stringNumber);
			
			 if (numberAsString > LargestInt) {
		            SecondLargestInt = LargestInt;
		            
		            LargestInt = numberAsString;
		        }
			 
			 else if(numberAsString > SecondLargestInt) {
				 
				 SecondLargestInt = numberAsString;
			 }
			 
		}
		
		return SecondLargestInt;
	}
	
	
	
	
	public static int howLong(double balance, double monthlyCost, double interestRate, double increase) {
		
		double interest;
		int months = 0;
		
		
		
		while(balance >= monthlyCost) {
			
			if(months != 0) {
			interest = balance * (interestRate / 12);
			balance += interest;
			monthlyCost =  monthlyCost + increase;
			
			}
			
			balance -= monthlyCost;
			
			months++;
		}
		
		return months;


	}
	
	
}
	

	
	
	
	

