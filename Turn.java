package Monopoly;
import java.awt.*;
public class Turn {
	int doubleCount, rollNum;
	Dice[] dice = new Dice[2];
	Player currentPlayer;
	boolean rolled;
	int unmortgaged;

	public Turn() {
	 	int doubleCount;
		int rollNum;
		int[] dice;
		Player currentPlayer;
		boolean rolled;
		int unmortgaged;
	}
	 public void doTurn(Player playerNow, Game theGame){// rolls the dice, changes the players position and checks for doubles rolled
		rollNum= dice[0].Roll() + dice[1].Roll();
		incrementPosition(); 
		checkDoubles();
	 }
	
private static int unmortgage(Property theProperty) {
	int tempNum;
	if (theProperty.getMortgaged() == true) {
		if (theProperty.getNumHotels() == 1) {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * 5)) / 2;
		}
		else {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * theProperty.getNumHouses())) / 2;
		}
		tempNum *= 1.1;
		theProperty.setMortgaged(false);
		return tempNum;
	}
	else {
		return 0;	
	}
}
	
private static int mortgage(Property theProperty) {
	int tempNum;
	if (theProperty.getMortgaged() == false) {
		if (theProperty.getNumHotels() == 1) {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * 5)) / 2;
		}
		else {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * theProperty.getNumHouses())) / 2;
		}
		theProperty.setMortgaged(true);
		return tempNum;
	}
	else {
		return 0;	
	}
}

	public static Player getPlayerInfo() {
		return currentPlayer;
	}
	
	public static boolean checkDoubles() {
		if(dice[0].getSideNum() == dice[1].getSideNum()) {
			doubleCount++;
		}
		if(doubleCount >= 3) {
			return false;
		} else {
			return true;
		}
	}
	
	public static TradePacket initiateTrade(Player target, Card[] objs, int price, int cardNum) {
		TradePacket request = TradePacket();
		request.setTarget(target);
		request.setCards(objs);
		request.setPrice(price);
		request.setCardNum(cardNum);
		return request;
	}
	
	public static void endTurn() {
		for(int i = 0; i <= 1; i++)
			dice[i].reset();
			doubleCount = 0;
			rollNum = 0;
			currentPlayer = null;
	}
	
	public void incrementPosition() {
		currentPlayer.location = currentPlayer.location + rollNum;
	}
}
	public static void sell(Player buyer, Property soldItem, int price) {
		buyer.changeWallet((price*-1));
		soldItem.setOwner(buyer);
		soldItem.getIsOwnedBy().changeWallet(price);
		soldItem.setIsOwned(true);
	}
}
