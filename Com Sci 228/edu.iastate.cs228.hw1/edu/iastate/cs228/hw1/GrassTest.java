package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;


/**
 * 
 * @author Kent Mark
 *
 */

public class GrassTest {

	@Test
	public void testWhat() {
		
		Plain p = new Plain(1);
		
		Grass g = new Grass(p,0,0);
		
		assertEquals(g.who(),State.GRASS);
		
	}
}