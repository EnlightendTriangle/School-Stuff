package edu.iastate.cs228.hw1;

/**
 *  
 * @author Kent Mark
 *
 */

/**
 * A badger eats a rabbit and competes against a fox. 
 */
public class Badger extends Animal
{
	/**
	 * Constructor 
	 * @param p: plain
	 * @param r: row position 
	 * @param c: column position
	 * @param a: age 
	 */
	public Badger (Plain p, int r, int c, int a) 
	{
		plain = p;
		
		row = r;
		
		column = c;
		
		age = a;
				
				
		
		
	}
	
	/**
	 * A badger occupies the square. 	 
	 */
	public State who()
	{
		
		return State.BADGER; 
	}
	
	/**
	 * A badger dies of old age or hunger, or from isolation and attack by a group of foxes. 
	 * @param pNew     plain of the next cycle
	 * @return Living  life form occupying the square in the next cycle. 
	 */
	public Living next(Plain pNew)
	{
		int cycle[];
		
		cycle = new int[Living.NUM_LIFE_FORMS];
		
		this.census(cycle);
		
		if(this.age >= Living.BADGER_MAX_AGE) {
			
			return new Empty(pNew, this.row, this.column);
		}
		
		else if(cycle[Living.FOX] > 1 && cycle[Living.BADGER] == 1) {
			
			return new Fox(pNew, this.row, this.column, 0);
		}
		
		else if(cycle[Living.FOX] + cycle[Living.BADGER] > cycle[Living.RABBIT]) {
			
			return new Empty(pNew, this.row, this.column);
		}
		
		else {
			
			this.plain = pNew;
			
			this.age++;
			
			return this;
		}
	}
}
