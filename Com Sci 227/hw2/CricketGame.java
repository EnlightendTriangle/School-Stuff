package hw2;
/**
 * @author Kent Mark
 * 
 * A class that simulates the playing of a Cricket game.
 */
import static api.Defaults.*;
import static api.Outcome.*;

import api.Outcome;

public class CricketGame {
	/**
	 * Variable that stores the amount of bowls allowed per Over.
	 */
	private int bowlsPerOver;
	/**
	 * Variable that stores the amount of Overs allowed per Innings.
	 */
	private int oversPerInnings;
	/**
	 * Variable that stores the total amount of innings allowed in a game.
	 */
	private int totalInnings;
	/**
	 * Variable that store the amount of innings that was provided by the user.
	 */
	private int givenInnings;
	/**
	 * Variable that stores the total amount of players that was provided by the user
	 */
	private int numPlayers;
	/**
	 * Variable that stores which Side is currently batting.
	 */
	private int battingSide;
	/**
	 * Variable that stores whether or not the ball is in play.
	 */
	private boolean ball_status;
	/**
	 * Variable that stores the amount of players currently in the innings.
	 */
	private int playersOut;
	/**
	 * Variable that stores the amount of Overs currently played by team that is bowling.
	 */
	private int overs;
	/**
	 * Variable that stores the amount of bowls currently thrown by the bowling team.
	 */
	private int bowlCount;
	/**
	 * Variable that stores the amount of points Side 0 currently has.
	 */
	private int side0Points;
	/**
	 * Variable that stores the amount of points Side 1 currently has.
	 */
	private int side1Points;
	/**
	 * Variable that returns the score for either Side 0 or Side 1.
	 */
	private int score;
	/**
	 * Variable that helps determine whether or not a player from the batting team is currently running the bases.
	 */
	private boolean player_running;
	/**
	 * Constructs a CricketGame using the public default values.
	 * @param givenBowlsPerOver the amount of bowls allowed for each Over.
	 * @param givenOversPerInnings the amount of Overs allowed for each innings.
	 * @param givenTotalInnings the amount of innings allowed for each game.
	 * @param givenNumPlayers the amount of players in the current game.
	 */
	public CricketGame(int givenBowlsPerOver, int givenOversPerInnings, int givenTotalInnings, int givenNumPlayers) {
		
		bowlsPerOver = givenBowlsPerOver;
		
		oversPerInnings = givenOversPerInnings;
		
		givenInnings = givenTotalInnings;
		
		if(givenTotalInnings % 2 != 0) {
			
			givenInnings++;
		}
		
		
		
		numPlayers = givenNumPlayers;
		
		battingSide = 0;
		
		
	}
	/**
	 * Constructs a CricketGame with the given configuration parameters.
	 */
	public CricketGame() {
		
		bowlsPerOver = DEFAULT_BOWLS_PER_OVER;
		
		oversPerInnings = DEFAULT_OVERS_PER_INNINGS;
		
		givenInnings = DEFAULT_NUM_INNINGS;
		
		numPlayers = DEFAULT_NUM_PLAYERS;
		
		battingSide = 0;
	}
	/**
	 * Method that returns the current for either team.
	 * @param battingSide the side whose score the user wants to know.
	 * @return score - the score for either Side 1 or Side 0.
	 */
	public int getScore(boolean battingSide) {
		
		if(battingSide == true && whichSideIsBatting() == 0) {
			
			score = side0Points;
		}
		
		if(battingSide == true && whichSideIsBatting() == 1) {
			
			score = side1Points;
		}
		
		if(battingSide == false && whichSideIsBatting() == 0 ) {
			
			score = side1Points;
		}
		
		if(battingSide == false && whichSideIsBatting() == 1) {
			
			score = side0Points;
		}
		
		
		return score;
	}

	/**
	 * Method that returns the current amount of bowls made.
	 * @return bowlCount - the amount of bowls made by the bowling team in the current Over.
	 */
	public int getBowlCount() {
		
		
		
		return bowlCount;
	}
	/**
	 * Method that returns the current amount of Overs completed.
	 * @return overs - the amount of Overs completed in the current Innings.
	 */
	public int getOverCount() {
		
		
		
		return overs;
	}
	/**
	 * Method that returns the current amount of outs for the batting team.
	 * @return playersOut - the amount of players out for the batting team. 
	 */
	public int getOuts() {
		
		
	
		return playersOut;
	}
	/**
	 * Method that checks if the game has ended.
	 * @return true/false.
	 */
	public boolean isGameEnded() {
		
		if(totalInnings == givenInnings && player_running == false) {
			
			return true;
		}
		
		
		
		if(totalInnings == givenInnings - 1 && player_running == false) {
			
			if(whichSideIsBatting() == 1 && side1Points > side0Points) {
				
				return true;
			}
			
			if(whichSideIsBatting() == 0 && side0Points > side1Points)
				
				return true;
		}
		
		
		
		return false;
	}
	/**
	 * Method that returns which side is currently at bat.
	 * @return battingSide - the side that is currently at bat. 
	 */
	public int whichSideIsBatting() {
		
		if(totalInnings >= 1 && totalInnings % 2 != 0) {
			
			battingSide = 1;
		}
		
		if(totalInnings >= 1 && totalInnings % 2 == 0) {
			
			battingSide = 0;
		}
		
		return battingSide;
	}
	/**
	 * Method that returns the amount of Innings that has currently been completed.
	 * @return totalInnings - the amount of innings that has been completed. 
	 */
	public int getCompletedInnings() {
		
		if(totalInnings > givenInnings) {
			
			totalInnings = givenInnings;
		}
		return totalInnings;
	}
	/**
	 * Method that returns the current status of the ball, that is if it is in play or not. 
	 * @return ball_status - the current status of the ball, is it in play or not. 
	 */
	public boolean isInPlay() {
		
		return ball_status;
	}
	/**
	 * Method that returns whether of not a player from the batting team is running the bases.
	 * @return player_running - the current state the player is in, are they running after a successful play or not. 
	 */
	public boolean isRunning() {
		
		return player_running;
	}
	/**
	 * Method that simulates the outcome of a bowl.
	 * @param outcome - Enumerator that stores the outcomes of a successful bowl. 
	 */
	public void bowl(Outcome outcome) {
		
		if(outcome == HIT && ball_status != true) {
			
			ball_status = true;
			
			
			bowlCount += 1;
		}
		 
		if(outcome == WICKET && ball_status != true) {
			
			ball_status = false;
			
			playersOut += 1;
			
			bowlCount += 1;
		
			
		
		
		}
		
		
		if(outcome == LBW) {
			
			ball_status = false;
			
			playersOut += 1;
			
			bowlCount += 1;
		}
		
		if(outcome == CAUGHT_FLY) {
			
			ball_status = false;
			
			playersOut += 1;
			
			bowlCount += 1;
		}
		
		if(outcome == WIDE && whichSideIsBatting() == 0) {
			
			ball_status = false;
			
			side0Points = side0Points + 1;
		}
		
		if(outcome == WIDE && whichSideIsBatting() == 1) {
			
			ball_status = false;
			
			side1Points = side1Points + 1;
		}
		
		if(outcome == NO_BALL && whichSideIsBatting() == 0) {
			
			ball_status = false;
			
			side0Points = side0Points + 1;
		}
		
		if(outcome == NO_BALL && whichSideIsBatting() == 1) {
			
			ball_status = false;
			
			side1Points = side1Points + 1;
		}
		
		if(outcome == BOUNDARY_SIX && whichSideIsBatting() == 0 && ball_status != true && isGameEnded() != true) {
			
			player_running = false;
			
			ball_status = false;
			
			bowlCount += 1;
			
			side0Points = side0Points + 6;
		}
		
		if(outcome == BOUNDARY_SIX && whichSideIsBatting() == 1 && ball_status != true && isGameEnded() != true) {
			
			player_running = false;
			
			ball_status = false;
			
			bowlCount +=1;
			
			side1Points = side1Points + 6;
		}
		if(outcome == BOUNDARY_FOUR && whichSideIsBatting() == 1 && ball_status != true) {
			
			player_running = false;
			
			ball_status = false;
			
			bowlCount += 1;
			
			side1Points = side1Points + 4;
		}
		
		if(outcome == BOUNDARY_FOUR && whichSideIsBatting() == 0 && ball_status != true) {
			
			player_running = false;
			
			ball_status = false;
			
			bowlCount += 1;
			
			side0Points = side0Points + 4;
		}
		
		if(bowlCount == bowlsPerOver) {
			
			bowlCount = 0;
			
			overs = overs + 1;
		}
		
		
		if(playersOut == numPlayers - 1 ) {
			
			playersOut = playersOut - playersOut;
			
			totalInnings += 1;
			
			overs = 0;
			
			bowlCount = 0;
		}
		
		
		if(overs == oversPerInnings) {
			
			
			overs = 0;
			
			playersOut = 0;
			
			bowlCount = 0;
			
			
			totalInnings = totalInnings + 1;
			
			
		}
		
		
		
		
	}
	/**
	 * Method that makes the batter run after a hit. 
	 */
	public void tryRun() {
		
		if(ball_status == false || isGameEnded() == true) {
			
			
		}
		
		
		
		if(ball_status == true && player_running == false) {
			
			player_running = true;
			
		}
		
		else if(ball_status == true && player_running == true) {
			
			
			
			if(whichSideIsBatting() == 0) {
				
				side0Points = side0Points + 1;
				
			}
			
			else if(whichSideIsBatting() == 1) {
				
				side1Points = side1Points + 1;
			}
			
		}
	
		
		
	
	}
	/**
	 * Method that makes a player that was running safe. Also makes the ball dead. 
	 */
	public void safe() {
		
		if(ball_status == false || isGameEnded() == true) {
			
			
			
		}
		
		if(ball_status == true && player_running == true) {
			
			
			
			
			
				if(whichSideIsBatting() == 0) {
				
				side0Points += 1;
				
				}
			
				else if(whichSideIsBatting() == 1) {
				
				side1Points += 1;
				}
			
		}
		
		ball_status = false;
		player_running = false;
	}
	/**
	 * Method that makes a running player out. 
	 */
	public void runOut() {
		
		if(isRunning() == false || isGameEnded() == true) {
			
			playersOut +=0;
		}
		
		
		
		 if(isRunning() == true) {
			
			player_running = false;
			ball_status = false;
			playersOut++;
		}
		
	}
	
}
