
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
	

	public int getWallet() {
		return wallet;
}
	public void changeLocation(int newLocation) {
		location = newLocation;
	}
	
	public int calcTax(int totalWorth) {
		totalWorth = (int) (totalWorth * .9);
		return totalWorth;
	}

	public void setInJail(boolean GoingToJail) { //setting inJail to what is passed when called on
		timeInJail=0;//sets to 0 regardless because time in jail is 0 turns after you get there and after you leave
		inJail=GoingToJail;		
	}
	
	public boolean getInJail() { //simply gets the value of inJail
		return inJail;
	}
}
