import java.awt.*;

public class Turn {
	private int doubleCount, rollNum;
	private static Dice[] dice;
	private Player currentPlayer;
	
	public static Player getPlayerInfo() {
		return currentPlayer;
	}
	
	public static boolean checkDoubles() {
		if(dice[0].rollVal == dice[1].rollVall) {
			doubleCount++;
		} 
		
		if(doubleCount >= 3) {
			return false;
		} else {
			return true;
		}
	}
	
	public static Card[] initiateTrade(Player target, Card obj) {		
		
	}
	
	public static void endTurn() {
		for(int i = 0; i <= 1; i++)
			dice[i].reset;
		doubleCount = 0;
		rollNum = 0;
		currentPlayer = null;
	}
	
	public static Card[]
}