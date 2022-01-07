package hw4;

import api.Cell;
import api.Piece;
import api.Position;


/**
 * 
 * @author Kent Mark
 *	
 */
public abstract class AbstractPiece implements Piece {
	
	private Cell[] cells;
	/**
	 * Variable to hold position
	 */
	private Position pos;
	
	/**
	 * Universal Method that shifts the shape to the right
	 */
	public void shiftRight() {
		
		for(int i=0; i<cells.length; i++) {
			cells[i].setCol(cells[i].getCol() + 1);
		}
	}
	/**
	 * Universal Method that shifts the shape to the left
	 */
	public void shiftLeft() {
		
		for(int i=0; i<cells.length; i++) {
			cells[i].setCol(cells[i].getCol() - 1);
		}
	}
	/**
	 * Universal Method that shifts the shape to the down
	 */
	public void shiftDown() {
		
		for(int i=0; i<cells.length; i++) 
		{
			cells[i].setRow(cells[i].getRow() + 1);
		}
	}
	/**
	 * Method that switches the blocks in order to get magic block in optimal position
	 */
	public void cycle() {
		//Makes a copy of Cells for easy cycling(same as copy from getCells
        Cell[] copy = new Cell[cells.length];
		
	    for(int i = 0; i< cells.length; i++) {
	    	     copy[i] = new Cell(cells[i]);
	    }
		
	    cells[0]= copy[cells.length -1];
	    for(int j = 1; j < cells.length - 1; j++) {
	    	    cells[j] = copy[j-1];
	    }
		
	}
	/**
	 * Method that rotates the shape if applicable
	 */
	public void transform(){
	 
	cells = this.getCells();
	
	for(int i=0; i< cells.length; i++) {
		int col = cells[i].getCol()*(-1);
		int row = cells[i].getRow();
		cells[i].setRow(pos.row()+col);
		cells[i].setCol(pos.col()+row);
		
	}
		
		
	}
	/**
	 * Method that returns where the cells are order
	 */
	public Cell[] getCells() {
		
		Cell[] copy = new Cell[cells.length];
		
	    for(int i = 0; i< cells.length; i++) {
	    	     copy[i] = new Cell(cells[i]);
	    }
		
	    return copy;
	}
  
	/**
	 * Deep Cloning Method
	 */
  @Override
    public Piece clone(){
    try
    {
      AbstractPiece s = (AbstractPiece) super.clone();

      
      s.pos = new Position(pos.row(), pos.col());
      s.cells = new Cell[cells.length];
      
      for(int j = 0; j<cells.length; j++) 
      {
    	      s.cells[j] = new Cell(cells[j]);
      }
      
      return s;
      
    }
    catch (CloneNotSupportedException e)
    {
      // can't happen
      return null;
    }
  }
}

