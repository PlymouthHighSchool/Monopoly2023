
public class Player {
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;

	Property myProperties[] = new Property[22];
public Player(String playersPiece, int turnOrder) {
	piece = playersPiece;
	playerNumber = turnOrder;
}

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

	
	public void changeWallet(int money) {
	 if (wallet+money>0) {
		wallet=wallet+money; 
	 }
	 else {
		 generateFunds(Math.abs(wallet+money));//Math.abs(wallet+money)= the amount of money still owed when paying an amount with insufficient funds
	 }
 }
 	public int getTotalWorth() {
 		int valofHouses; 
 		int valofHotels; 
 		int valofProperties;
 		int totalWorth;
 		int currentPlayer= Player.playerNumber;
 		for(int property=0;property<=22;property++) {
 			if(myProperties[property].isOwnedBy==currentPlayer) {	//counts through all properties until a property the current player owns is found, then takes the full value of the property and houses and adds it to the total, then continues on.
 				valofProperties=valofProperties+myProperties[property].costProperty;
 				valofHouses=valofHouses+(myProperties[property].numHouses*myProperties[property].costOfBuilding);
 				valofHotels=valofHotels+(myProperties[property].numHotels*myProperties[property].costOfBuilding);
 				totalWorth=totalWorth+valofProperties+valofHouses+valofHotels;
 			}
 		}
 		return totalWorth;
 	}
}
