
public class Houses extends Buildings {
	int totalBuildingLimit; 
	public void sellHouse(Property house) {
		Player token = null;
		token.changeWallet(house.getBuildingCost()/2); //changes the players wallet
		house.setNumHouses(house.numHouses -1); // takes 1 house from that property becuase you have now sold it
	}

	Houses() {
		totalBuildingLimit = 32;	
	}

	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
}
