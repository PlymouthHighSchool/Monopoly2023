
public class Hotels extends Buildings {
int totalBuildingLimit;
	
	Hotels() {
		totalBuildingLimit = 12;	
	}	

	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
	
	public void sellHotels(Property hotel) { 
		Player token = null;
		token.changeWallet(hotel.getBuildingCost()/2); //changes the players wallet
		hotel.setNumHouses(hotel.numHouses + 4); //adds 4 houses becuase you have just sold 1 hotel, which property is known;
	}
}
