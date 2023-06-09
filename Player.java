
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
	
public Boolean generateFunds(int financialGoal) {
		// generateFunds(Math.abs(wallet+money));//Math.abs(wallet+money)= the amount of money still owed when paying an amount with insufficient funds
		// gives player an option to sell(trade) or mortgage, a property, a GOOJF, to hopefully obtain enough money to get the wallet above the desired amount(0). If they can’t, remove the player with remove() in the Turn class
		String[] props = new String[22]; //array of the names of all the properties the player has
		int counter2 = 0;
		int howMuchTheySold = wallet;// asuming they will take the money they have as a building block for selling props.
		boolean playerIsOut = false;
		
		while(howMuchTheySold != financialGoal || playerIsOut) { // while they have not met their fincancial goal they must keep selling properites, and this while loops ask's them using props[] 
				
			for(int propCounter = 0; propCounter <23; propCounter++) {
					if(myProperties[propCounter] != null) { // checks for if there is a prop there
						props[counter2] = myProperties[propCounter].getName(); // i made this method
						counter2++;
					}	
		} 
				int num = createOptionPane(props,"would you like to sell any of these properties:", "you NEED money"); //not yet in interface 6/8 11;21
				myProperties[num].isMortgaged = true; 
				int whatItCost = myProperties[num].getCostProperty() /2;
				howMuchTheySold += whatItCost;
				changeWallet(whatItCost);
				
				if(howMuchTheySold == financialGoal) {
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
