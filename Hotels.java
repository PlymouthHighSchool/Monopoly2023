
public class Hotels extends Buildings {
int totalBuildingLimit;
	
	Hotels() {
		totalBuildingLimit = 12;	
	}	

	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
	
	public void buildHotel(Property buildLocation, Player currentPlayer) { //takes a hotel from the total and builds a hotel on a property and removes the four other houses already there
		Houses houses = new Houses();
		houses.removeFourHouses(buildLocation); //remove four hotels from location
		currentPlayer.changeWallet((-buildLocation.getBuildingCost())); //-(cost to build) is added to wallet
		totalBuildingLimit--; //take a hotel away from the total
		buildLocation.setNumHotels(buildLocation.getNumHotels()+1); //adds a hotel to the hotel total of the player
	}
	
	public void sellHotels(Property hotel,  Player currentPlayer) { 
		currentPlayer.changeWallet(hotel.getBuildingCost()/2); //changes the players wallet
		hotel.setNumHouses(hotel.numHouses + 4); //adds 4 houses becuase you have just sold 1 hotel, which property is known;
	}
}
