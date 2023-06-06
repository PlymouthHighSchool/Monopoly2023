

public class Houses {
int totalBuildingLimit;
	
	Houses() {
		totalBuildingLimit = 32;	
	}
	
	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}

	public void returnHouses(Property currentProperty) { //When a hotel on a property is sold, four houses are taken from the total and put in its place
		currentProperty.numofHouses=4;
		totalBuildingLimit=totalBuildingLimit-4;

	

	public void buildHouse(Houses buildLocation, Player currentPlayer) { //takes a house from the total and builds a house on a property
		currentPlayer.changeWallet((-buildLocation.getBuildingCost())); //-(cost to build) is added to wallet
		houseTotal--; //take a house away from the total
		buildLocation.setNumHouses(buildLocation.getNumHouses()+1); //adds a house to the house total of the player

	public void removeFourHouses(Property currentProperty) {// removes four houses from the board and adds them to the total.(call from Hotels)
		totalBuildingLimit = totalBuildingLimit - 4;
		currentProperty.numHouses = currentProperty.numHouses - 4;
 main

	}
}
