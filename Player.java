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
	
	public Boolean generateFunds(int financialGoal) {
		// generateFunds(Math.abs(wallet+money));//Math.abs(wallet+money)= the amount of money still owed when paying an amount with insufficient funds
		
		// gives player an option to sell(trade) or mortgage, a property, a GOOJF, to hopefully obtain enough money to get the wallet above the desired amount(0). If they can’t, remove the player with remove() in the Turn class
		String[] props = new String[200]; //array of the names of all the properties the player has
		int counter2 = 0;
		int howMuchTheySold = wallet;// asuming they will take the money they have as a building block for selling props.
		int tempProp; //this is the tmepory propeterty that I set to what prop. they choose to sell and use that as a parameter to sell that house
		boolean whatTheyChoose; // this is to be set tru if they choose to sell or false if they dont choose to sell
		
		while(howMuchTheySold != financialGoal) { // while they have not met their fincancial goal they must keep selling properites, and this while loops ask's them using props[] 
				
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
			}
			if(howMuchTheySold == financialGoal) {
				return true;
			}
			else {
				   //takes them away since they will not be able to come up with necasasry capital
				Turn.remove(Turn.getPlayerInfo()); // PG is doing this as of 6/6
				return false;
			}
			
	 }
	
	public int getWallet() {
		return wallet;
}
	public void changeLocation(int newLocation) {
		location = newLocation;
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
		 generateFunds(-1*(wallet+money));
	 }
}
	public int getTotalWorth() {
		int valofHouses; 
		int valofHotels; 
		int valofProperties;
		int totalWorth;
		int currentPlayer= Player.playerNumber;
		for(int property=0;property<=22;property++) {
			if(myProperties[property].isOwnedBy==currentPlayer) {
				valofProperties=valofProperties+myProperties[property].costProperty;
				valofHouses=valofHouses+(myProperties[property].numHouses*myProperties[property].costOfBuilding);
				valofHotels=valofHotels+(myProperties[property].numHotels*myProperties[property].costOfBuilding);
				totalWorth=totalWorth+valofProperties+valofHouses+valofHotels;
			}
		}
		return totalWorth;
	}
	
	public static void main(String[] args) {

	}
}
