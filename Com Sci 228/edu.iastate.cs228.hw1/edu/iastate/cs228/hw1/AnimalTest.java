package edu.iastate.cs228.hw1;



import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 * @author Kent Mark
 *
 */

public class AnimalTest {
	
	@Test
	public void IsRabbitRightAgeTest()
	
	{
		Living rabbit = new Rabbit(null, 0, 0, 8);
		
		assertEquals(8, ((Animal)rabbit).myAge());
		
	}
	
	@Test
	public void IsBadgerRightAgeTest() {
		
		Living badger = new Badger(null, 0, 0, 3);
		
		assertEquals(3, ((Animal)badger).myAge());
	}
	
	@Test
	public void IsFoxRightAgeTest() {
		
		Living fox = new Fox(null, 0, 0, 2);
		
		assertEquals(2, ((Animal)fox).myAge());
		
	}
	
	

}
