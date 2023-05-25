
public class Player{
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;
	Property myProperties[] = new Property()[22];
	
	public Player(String playersPiece, int turnOrder) {
		piece = playersPiece;
		playerNumber = turnOrder;
	}
	public int numOfHotels() {
		int myAmount;
		for(int count = 0; count < 23; count++ ) {
			if (myProperties[count] == null) {
				myAmount = myAmount;
			}
			else {
				myAmount++;
			}
		}
		
		return  myAmount;
	}
	
	public int numOfHouses() {
		int myAmount;
		for(int count = 0; count < 23; count++ ) {
			if (myProperties[count] == null) {
				myAmount = myAmount;
			}
			else {
				myAmount++;
			}
		}
		
		return  myAmount ;
	}
	public boolean checkBankruptcy() {
		if (wallet<0) 
			return true;
		else 
			return false;
	}
	public int calcTax(int totalWorth) {
		totalWorth = (int) (totalWorth * .9);
		return totalWorth;
		
	}

	
}
