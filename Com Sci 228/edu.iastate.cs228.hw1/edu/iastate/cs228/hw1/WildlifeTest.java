package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


/**
 * 
 * @author Kent Mark
 *
 */

public class WildlifeTest {

	@Test
	public void testMain() throws IOException {
		
	    System.out.println("main");
	    
	    String[] args = {"argument1", "argument2"};
	    
	    final InputStream original = System.in;
	    
	    final FileInputStream finalInSt = new FileInputStream(new File("")); //Enter test file here
	    
	    System.setIn(finalInSt);
	    
	    Wildlife.main(args);
	   
	    
	}
}