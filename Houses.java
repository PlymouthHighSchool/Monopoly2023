package Monopoly;

public class Houses extends Buildings {
	int totalBuildingLimit; 
	
	public Houses() {
		totalBuildingLimit = 32;	
	}
	
	public int sellHouse(Property house) {
		house.setNumHouses(house.numHouses - 1); // takes 1 house from that property becuase you have now sold it
		return house.getBuildingCost()/2; //changes the players wallet
	}

	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}

	public void returnHouses(Property currentProperty) { //When a hotel on a property is sold, four houses are taken from the total and put in its place
		currentProperty.setNumHouses(4);
		totalBuildingLimit=totalBuildingLimit-4;
	}
	
	public void buildHouse(Property house, Player currentPlayer) { //takes a house from the total and builds a house on a property
		currentPlayer.changeWallet(-costOfBuilding); //-(cost to build) is added to wallet
		totalBuildingLimit--; //take a house away from the total
		house.setNumHouses(house.getNumHouses()+1); //adds a house to the house total of the player
	}
		
	public void removeFourHouses(Property currentProperty) {// removes four houses from the board and adds them to the total.(call from Hotels)
		totalBuildingLimit = totalBuildingLimit - 4;
		currentProperty.numHouses = currentProperty.numHouses - 4;
	}
}