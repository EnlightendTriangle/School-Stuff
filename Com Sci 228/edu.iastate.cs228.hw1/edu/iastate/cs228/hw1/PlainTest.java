package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;


/**
 * 
 * @author Kent Mark
 *
 */

public class PlainTest {

	@Test
	public void testGetWidth() {
		
		Plain p = new Plain(6);
		
		assertEquals(p.getWidth(),6);
		
	}
}