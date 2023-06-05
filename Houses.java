public class Houses {
	int totalBuildingLimit;
	
	Houses() {
		totalBuildingLimit = 32;	
	}
	
	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
	
	public void buildHouse(Houses buildLocation, Player currentPlayer) { //takes a house from the total and builds a house on a property
		currentPlayer.changeWallet((-buildLocation.getBuildingCost())); //-(cost to build) is added to wallet
		houseTotal--; //take a house away from the total
		buildLocation.setNumHouses(buildLocation.getNumHouses()+1); //adds a house to the house total of the player
	}
}
