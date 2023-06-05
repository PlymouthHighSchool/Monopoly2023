

public class Player {
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
