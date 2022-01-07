package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;


/**
 * 
 * @author Kent Mark
 *
 */

public class RabbitTest {

	@Test
	public void testWho() {
		
		Plain p = new Plain(1);
		
		Rabbit r = new Rabbit(p,0,0,0);
		
		assertEquals(r.who(),State.RABBIT);
	}
	
	@Test
	public void testAge() {
		
		Plain p = new Plain(1);
		
		Rabbit r = new Rabbit(p,0,0,1);
		
		assertEquals(r.myAge(),1);
	}
}