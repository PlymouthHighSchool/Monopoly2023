
public class Player {
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;
	int PROPERTIESINGAME=28;
	Property myProperties[] = new Property[28];
	
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
	
	public int getJailCards() {
		return(numOfJailCards);
	}
	
	public void setJailCards(int jailCardsNumber) {//chan\mber of GOOJF Cards
		numOfJailCards = jailCardsNumber;
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

	public Boolean generateFunds(int financialGoal) {
		int howMuchTheySold = wallet;// Assuming they will take the money they have as a building block for selling props.
		boolean playerIsOut = false;
		
		while((howMuchTheySold != financialGoal) || playerIsOut) { // while they have not met their fincancial goal they must keep selling properites, and this while loops ask's them using props[] 
				//mortaging props;
			int numOfPropertiesOwned = 0;
			String[] props = new String[PROPERTIESINGAME]; //array of the names of all the properties the player has
			for(int propCounter = 0; propCounter <=PROPERTIESINGAME; propCounter++) {
					if(myProperties[propCounter] != null) { // checks for if there is a prop there
						props[numOfPropertiesOwned] = myProperties[propCounter].getName(); // i made this method
						numOfPropertiesOwned++;
			}	
		} 
		int num = Interface.createOptionPane(props,"would you like to sell any of these properties:", "you NEED money"); //not yet in interface 6/8 11;21
		myProperties[num].isMortgaged = true; 
		int whatItCost = myProperties[num].getCostProperty() /2;
		howMuchTheySold += whatItCost;
		changeWallet(whatItCost);
		
				//checking if they finally have enough to play
				
				if(howMuchTheySold >= financialGoal) {
					playerIsOut = false;
			}
			else {
				   //takes them away since they will not be able to come up with necasasry capital
				Turn.remove(Turn.getPlayerInfo()); // PG is doing this as of 6/6
				playerIsOut = true;
			}
			
			}
		return playerIsOut;
			
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
