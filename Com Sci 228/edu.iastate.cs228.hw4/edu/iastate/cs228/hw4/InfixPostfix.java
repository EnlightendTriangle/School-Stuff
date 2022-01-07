package edu.iastate.cs228.hw4;

/**
 *  
 * @author Kent Mark
 *
 */

/**
 * 
 * This class evaluates input infix and postfix expressions. 
 *
 */

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class InfixPostfix 
{

	/**
	 * Repeatedly evaluates input infix and postfix expressions.  See the project description
	 * for the input description. It constructs a HashMap object for each expression and passes it 
	 * to the created InfixExpression or PostfixExpression object. 
	 *  
	 * @param args
	 **/
	public static void main(String[] args) throws FileNotFoundException, ExpressionFormatException, UnassignedVariableException
	{
		
		System.out.println("Evaluation of Infix and Postfix Expressions");
		
		System.out.println("keys: 1 (standard input)  2 (file input)  3 (exit)");
		
		System.out.println("(Enter \"I\" Before an infix expression, \"P\" before a postfix expression)");
		
		int trial = 1;
		
		HashMap<Character, Integer> setHash = new HashMap<>();
		
 		String equation;
 		
		char flag;
		
		while (true)
		{
			System.out.print("Trial " + trial + ": ");
			
			Scanner input = new Scanner(System.in);
			
			int userInput = Integer.parseInt(input.nextLine());
			
			if (userInput == 1)
			{
				System.out.print("Expression: ");
				
				equation = input.nextLine();
				
				flag = equation.charAt(0);
				
				equation = equation.substring(2);
				
				if (flag == 'P')
				{
					ArrayList<Character> var = new ArrayList<Character>();
					
 					PostfixExpression post = new PostfixExpression(equation);
 					
					System.out.println("Postfix form: " + post.toString());
					
					System.out.println("where");
					
					for (int i = 0; i < equation.length(); i++)
					{
						char varPossible = equation.charAt(i);
						
						if (varPossible <= 'z' && varPossible >= 'a' && Character.isLowerCase(varPossible) && !var.contains(varPossible))
						{
							var.add(varPossible);
						}
					}
					
					if (!var.isEmpty())
					{
						System.out.println("where");
						
						for (int i = 0; i < var.size(); i ++)
						{
							char temp = var.get(i);
							
							System.out.println(temp + " = ");
							
							int varValue = Integer.parseInt(input.nextLine());
							
							setHash.put(temp, varValue);
						}
						
						post.setVarTable(setHash);
						
					}
					
					post.setVarTable(setHash);
					
					System.out.println("Expression value: " + post.evaluate());
				}
				else if (flag == 'I')
				{
					ArrayList<Character> variables = new ArrayList<Character>();
					
					InfixExpression inf = new InfixExpression(equation);
					
					System.out.println("Infix form: " + inf.toString());
					
					System.out.println("Postfix form: " + inf.postfixString());
					
					for (int i = 0; i < equation.length(); i++)
					{
						char varPossible = equation.charAt(i);
						
						if (varPossible <= 'z' && varPossible >= 'a' && Character.isLowerCase(varPossible) && !variables.contains(varPossible))
						{
							variables.add(varPossible);
						}
					}
					if (!variables.isEmpty())
					{
						System.out.println("where");
						
						for (int i = 0; i < variables.size(); i ++)
						{
							char temp = variables.get(i);
							
							System.out.println(temp + " = ");
							
							int varValue = Integer.parseInt(input.nextLine());
							
							setHash.put(temp, varValue);
						}
						
						inf.setVarTable(setHash);
					}
					
					System.out.println("Expression value: " + inf.evaluate());
					
				}
			}
			
			else if (userInput == 2)
			{
				System.out.println("Input from a file");
				
				System.out.print("Enter file name: ");
				
				String fileName = input.next();
				
				File f = new File(fileName);
				
				Scanner fileScan = new Scanner(f); 
				
				while (fileScan.hasNextLine())
				{
					equation = fileScan.nextLine();
					
					if (equation.charAt(0) == 'P' || equation.charAt(0) == 'I')
					{
						flag = equation.charAt(0);
						
						equation = equation.substring(2);
						
						if (flag == 'I')
						{
							 InfixExpression infEx = new InfixExpression(equation);
							 
								System.out.println("Infix form: " + infEx.toString());
								
								System.out.println("Postfix form: " + infEx.postfixString());
								
								System.out.println("Expression value: " + infEx.evaluate());
						}
						else if (flag == 'P')
						{
							PostfixExpression postEx = new PostfixExpression(equation);
							
							System.out.println("Postfix form: " + postEx.toString());
							
							System.out.println("Expression value: " + postEx.evaluate());
						}
					}
				}
			}
			else
			{
				break;
			}
		
			trial ++;
			
			System.out.println();
		}

	}
	
	// helper methods if needed
}
