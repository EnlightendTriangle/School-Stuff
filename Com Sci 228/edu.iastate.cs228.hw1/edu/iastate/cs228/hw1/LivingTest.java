package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;


/**
 * 
 * @author Kent Mark
 *
 */

public class LivingTest {

	@Test
	public void testCensus() throws FileNotFoundException {
		
		Plain p = new Plain("MytestFile.txt"); //Enter a test file here, but alter the assert statements depending on how your plain was populated
		
		int[] arr  = new int[Living.NUM_LIFE_FORMS];
		
		p.grid[0][0].census(arr);
		
		assertEquals(arr[Living.BADGER], 1); //Change these if needed
		
		assertEquals(arr[Living.FOX], 2);
		
		assertEquals(arr[Living.EMPTY], 1);
		
		assertEquals(arr[Living.GRASS], 0);
		
		assertEquals(arr[Living.RABBIT], 0);
	}
}