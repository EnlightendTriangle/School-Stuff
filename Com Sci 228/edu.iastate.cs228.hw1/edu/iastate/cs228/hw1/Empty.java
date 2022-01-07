package edu.iastate.cs228.hw1;

/**
 *  
 * @author Kent Mark 
 *
 */

/** 
 * Empty squares are competed by various forms of life.
 */
public class Empty extends Living 
{
	public Empty (Plain p, int r, int c) 
	{
		plain = p;
		
		row = r;
		
		column = c;
	}
	
	public State who()
	{
		
		return State.EMPTY; 
	}
	
	/**
	 * An empty square will be occupied by a neighboring Badger, Fox, Rabbit, or Grass, or remain empty. 
	 * @param pNew     plain of the next life cycle.
	 * @return Living  life form in the next cycle.   
	 */
	public Living next(Plain pNew)
	{
		int cycle[];
		
		cycle = new int[5];
		
		this.census(cycle);
		
		if(cycle[Living.RABBIT] > 1) {
			
			return new Rabbit(pNew, this.row, this.column, 0);
		}
		
		else if(cycle[Living.FOX] > 1) {
			
			return new Fox(pNew, this.row, this.column, 0);
		}
		
		else if(cycle[Living.BADGER] > 1) {
			
			return new Badger(pNew, this.row, this.column, 0);
		}
		
		else if(cycle[Living.GRASS] >= 1) {
			
			return new Grass(pNew, this.row, this.column);
		}
		
		else {
			
			plain = pNew;
			
			return this;
		}
	}
}
