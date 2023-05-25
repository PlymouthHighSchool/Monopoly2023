
public class Player{
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;
	Property myProperties[] = new Property()[22];
	
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
	
	public int calcTax(int totalWorth) {
		totalWorth = (int) (totalWorth * .9);
		return totalWorth;
		
	}

	
}
