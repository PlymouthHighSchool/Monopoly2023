public class Turn {
	static int doubleCount, rollNum1, rollNum2;
	Dice[] dice = new Dice[2];
	static Player currentPlayer;
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
	
	//not done
	 public void doTurn(Player playerNow, Game theGame){// rolls the dice, changes the players position and checks for doubles rolled
		rollNum1 = dice[0].Roll();
		rollNum2 = dice[1].Roll();
		incrementPosition(); 
		checkDoubles();
	 }
	
	private int unmortgage(Property theProperty) {
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
	
	private int mortgage(Property theProperty) {
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
	
	public boolean checkDoubles() {
		if(rollNum1 == rollNum2) {
			doubleCount++;
		}
		if(doubleCount >= 3) {
			return false;
		} else {
			return true;
		}
	}
	
	public TradePacket initiateTrade(Player target, Cards[] objs, int price, int cardNum) {
		TradePacket request = new TradePacket(target);
		request.setCards(objs);
		request.setPrice(price);
		request.setCardNum(cardNum);
		return request;
	}
	
	public static void endTurn() {
		for(int i = 0; i <= 1; i++)
			doubleCount = 0;
			rollNum1 = rollNum2 = 0;
			currentPlayer = null;
	}
	
	public void incrementPosition() {
		currentPlayer.location = currentPlayer.location + rollNum;
	}
	
	public void collectGo() {
		currentPlayer.changeWallet(200);
	}
	
	public static void buy() {
		Property prop = (Property) Game.getArrSpace()[currentPlayer.getLocation()];
		prop.setIsOwned(true);
		currentPlayer.changeWallet(-1 * prop.getCostProperty());
	}
}
	public void remove(Player bankruptPlayer) {
	//gives builings and properties back to the bank and gives the player who made the other bankrupt gets all available money.
	
		int moneyOnHand = bankruptPlayer.getTotalWorth();
		int	lastLocation = bankruptPlayer.getLocation();
		Space finalPosition;
		Player moneyReciver;
		Player[] playerArray =  theGame.getPlayerArray();
		Object[] spaceArray =theGame.getArrSpace();
		finalPosition = (Space) spaceArray[lastLocation];
		moneyReciver = finalPosition.getIsOwnedBy();
		moneyReciver.changeWallet(moneyOnHand);
		playerArray[bankruptPlayer.getPlayerNumber()] = null;
	}

		currentPlayer.location = currentPlayer.location + rollNum1 + rollNum2;
	}//adds the number rolled to the player position

}
