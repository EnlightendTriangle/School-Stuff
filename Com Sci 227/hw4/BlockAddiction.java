/**
 * @author Kent Mark
 */

package hw4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import hw4.BasicGenerator;
import api.AbstractGame;
import api.Generator;
import api.Position;

public class BlockAddiction extends AbstractGame{
	
	private int score;
	
	
	public BlockAddiction(int height, int width, Generator gen) {
		
		super(height, width, gen);
	}
	
	public BlockAddiction(int height, int width, Generator gen, int preFillRows) {
		
		super(height, width, gen);
	}
	
	@Override
	  public List<Position> determinePositionsToCollapse()
	  {
	    List<Position> positions = new ArrayList<>();
	    for (int row = 0; row < getHeight(); ++row)
	    {
	      if (isRowFilled(row))
	      {
	        // row forms a collapsible set, put all positions in the list
	        for (int col = 0; col < getWidth(); ++col)
	        {
	          positions.add(new Position(row, col));
	        }
	      }
	    }
	    
	    // the algorithm above already guarantees there are no duplicates in the
	    // list, but we have to sort them
	    Collections.sort(positions);
	    return positions;
	  }


	 private boolean isRowFilled(int row)
	  {
	    for (int col = 0; col < getWidth(); ++col)
	    {
	      if (getIcon(row, col) == null)
	      {
	        return false;
	      }
	    }
	    return true;
	  }







}
