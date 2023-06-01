
public class Player {
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;
	Property myProperties[] = new Property[22];
	
	public int numOfHotels() {
		int hotelAmount = 0;
		for(int count = 0; count < 23; count++ ) {
			if (myProperties[count] != null) {
				hotelAmount += (myProperties[count].getNumHotels());
			}
		}
		
		return  hotelAmount;
	}
	
	public int numOfHouses() {
		int houseAmount = 0;
		for(int count = 0; count < 23; count++ ) {
			if (myProperties[count] != null) {
				houseAmount+= (myProperties[count].getNumHouses());
			}
		}
		
		return  houseAmount ;
	}
	
	public int calcTax(int totalWorth) {
		totalWorth = (int) (totalWorth * .9);
		return totalWorth;
		
	}

}
