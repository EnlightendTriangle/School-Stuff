package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;


/**
 * 
 * @author Kent Mark
 *
 */

public class EmptyTest {
	
	
	
	@Test
	public void testWhat() {
		
		Plain plain = new Plain(1);
		
		Empty empty = new Empty(plain,0,0);
		
		assertEquals(empty.who(),State.EMPTY);
	}
	
	@Test
	public void testRow() {
		
		Plain plne = new Plain(5);
		
		Empty emt = new Empty(plne,1,0);
		
		assertEquals(emt.row,1);}
	
	@Test
	
	public void testColumn() {
		
		Plain pl = new Plain(5);
		
		Empty em = new Empty(pl,1,4);
		
		assertEquals(em.column,4);
	}
	
	
}