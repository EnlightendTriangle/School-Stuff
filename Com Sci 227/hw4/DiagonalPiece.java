package hw4;

import java.awt.Color;
import java.lang.Object;
import api.Position;
import api.Piece;
import api.Icon;
import api.Cell;

public class DiagonalPiece extends AbstractPiece {
	
private Position pos1;
	
	private Cell[] cells;
	
		  public DiagonalPiece(Position position, Icon[] icons) {
			  
			  cells = new Cell[2];
			 
			  Position pos1 = new Position(position.row() + 1, position.col());
			  cells[0] = new Cell(new Icon(Color.GREEN), pos1);
			  
			  Position pos2 = new Position(position.row(), position.col() + 1);
			  cells[1] = new Cell(new Icon(Color.GREEN), pos2);

}

		  public Cell[] getCells() {
				
				Cell[] copy = new Cell[cells.length];
				
			    for(int i = 0; i< cells.length; i++) {
			    	     copy[i] = new Cell(cells[i]);
			    }
				
			    return copy;
			}


		@Override
		public Position getPosition() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Cell[] getCellsAbsolute() {
			
			return null;
		}


		@Override
		public void setCells(Cell[] givenCells) {
		
		}
			

}
