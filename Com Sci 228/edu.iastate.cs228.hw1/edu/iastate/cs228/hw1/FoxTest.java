package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;


/**
 * 
 * @author Kent Mark
 *
 */

public class FoxTest {

	@Test
	
	public void testWhat() {
		
		Plain pl = new Plain(1);
		
		Fox f = new Fox(pl,0,0,0);
		
		assertEquals(f.who(),State.FOX);
		
	}
	
	@Test
	
	public void testAge() {
		
		Plain plane = new Plain(1);
		
		Fox fox = new Fox(plane,0,0,3);
		
		assertEquals(fox.myAge(),3);
	}
	
	@Test
	public void testRow() {
		
		Plain plne = new Plain(5);
		
		Fox fx = new Fox(plne,2,0,3);
		
		assertEquals(fx.row,2);
	}
	
	@Test
	public void testColumn() {
		
		Plain p = new Plain(5);
		
		Fox f = new Fox(p,2,4,3);
		
		assertEquals(f.column,4);
		
	}
	
	
}