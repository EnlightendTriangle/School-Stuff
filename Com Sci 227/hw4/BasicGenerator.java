
package hw4;

import java.util.Random;

import api.Generator;
import api.Icon;
import api.Piece;
import api.Position;
import examples.SamplePiece;

/**
 * Generator for Piece objects in BlockAddiction. Icons are 
 * always selected uniformly at random, and the Piece types
 * are generated with the following probabilities:
 * <ul>
 * <li>LPiece - 10%
 * <li>DiagonalPiece - 25%
 * <li>CornerPiece - 15%
 * <li>SnakePiece - 10%
 * <li>IPiece - 40%
 * </ul>
 * The initial position of each piece is based on its
 * vertical size as well as the width of the grid (given
 * as an argument to getNext).  The initial column is always
 * width/2 - 1.  The initial row is:
 *  * <ul>
 * <li>LPiece - row = -2
 * <li>DiagonalPiece - row = -1
 * <li>CornerPiece - row = -1
 * <li>SnakePiece - row = -1
 * <li>IPiece - row = -2
 * </ul>
 * 
 */
public class BasicGenerator implements Generator
{
  private Random rand;

  /**
   * Constructs a BasicGenerator that will use the given
   * Random object as its source of randomness.
   * @param givenRandom
   *   instance of Random to use
   */
  public BasicGenerator(Random givenRandom)
  {
    rand = givenRandom;
  }
  
  @Override
  public Piece getNext(int width)
  {
    int col = width / 2 - 1;
    
    int num = rand.nextInt() + 100;
	
	
	
    if(num >= 0 && num <= 10 ) {
	
	return new LPiece(new Position(-2,col), null );
    }
    
    if(num >= 11 && num <= 35) {
    	
    	return new DiagonalPiece(new Position(-1, col), null);
    }
    
    if(num >= 36 && num <= 51) {
    	
    	return new CornerPiece(new Position(-1, col), null);
    }
   
    if(num >= 52 && num <= 61) {
    
    return new SnakePiece(new Position(-1, col), null);
    }
    
    if(num >= 62 && num <= 100) {
    	
    	 return new SnakePiece(new Position(-1, col), null);
    }
 
    return null;
  }


  @Override
  public Icon randomIcon()
  {
    return new Icon(Icon.COLORS[rand.nextInt(Icon.COLORS.length)]);
  }

}
