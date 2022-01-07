package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 * @author Kent Mark
 *
 */

public class BadgerTest {
	
	
	
	@Test
	public void IsBadgerRightAgeTest() {
		
		Living badger = new Badger(null, 0, 0, 3);
		
		assertEquals(3, ((Animal)badger).myAge());
	}
	
}
