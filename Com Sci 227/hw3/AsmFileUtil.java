package hw3;
/**
 * 
 * @author Kent Mark
 * 
 * A collection of utility methods for working with files containing programs for the CS227Comp architecture.
 *
 */
import java.io.File;
import java.util.*;

import api.Instruction;
import api.NVPair;
import api.SymbolTable;
import hw3.CS227Asm;

public class AsmFileUtil {
	/**
	 * Empty Constructor.
	 */
	public AsmFileUtil() {
		
	}
	/**
	 * Reads the given file and assembles the program, returning the machine code as a list of strings (including descriptions).
	 * @param filename Given name of text file. 
	 * @return j.assemble() - Method from CS227Asm that would run the text file through an assembler object.
	 * @throws java.io.FileNotFoundException
	 */
	public static java.util.ArrayList<java.lang.String> assembleFromFile(java.lang.String filename)
            throws java.io.FileNotFoundException{
			
		
		File file = new File(filename);
		
		ArrayList<java.lang.String> data = new ArrayList();
		
		ArrayList<java.lang.String> t = new ArrayList();
		
		Scanner scanner = new Scanner(file);
		
		CS227Asm j = new CS227Asm(data);
		
		
		
		//data.add(scanner.nextLine());
		
		while(scanner.hasNextLine()) {
			
			data.add(scanner.nextLine());
			
		 j = new CS227Asm(data);
		}
	
		return j.assemble();
	}
	/**
	 * Reads the given file and assembles the program, returning the machine code as an array of integer values (not including the sentinel value).
	 * @param filename Use entered name of file. 
	 * @return null
	 * @throws java.io.FileNotFoundException
	 */
	public static int[] createMemoryImageFromFile(java.lang.String filename)
            throws java.io.FileNotFoundException{
		
	
	
			return null;
	
	}

	/**
	 * Reads the given file and assembles the program, writing the machine code to a file.
	 * @param filename User entered name of file.
	 * @param annotated - determines whether of not the file should be given label descriptions.
	 * @throws java.io.FileNotFoundException
	 */
	public static void assembleAndWriteFile(java.lang.String filename,
            boolean annotated)
     throws java.io.FileNotFoundException{
		
File file = new File(filename);
		
		ArrayList<java.lang.String> data = new ArrayList();
		
		ArrayList<java.lang.String> t = new ArrayList();
		
		Scanner scanner = new Scanner(file);
		
		CS227Asm j = new CS227Asm(data);
		
		
		
		//data.add(scanner.nextLine());
		
		while(scanner.hasNextLine()) {
			
			data.add(scanner.nextLine());
			
			j = new CS227Asm(data);
		
			if(annotated == true) {
				
				j.assemble();
			}
		
			else
				
				j.getInstructionStream();
		
		}
	
		
	}


}
