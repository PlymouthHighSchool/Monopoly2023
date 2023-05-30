
public class Houses  {
public void sellHouse() {
	Player.changeWallet((getCost() * -1));
	numHotels--;
}

int totalBuildingLimit;

Houses() {
	totalBuildingLimit = 32;	
}

public int getBuildingLimit() {
	return totalBuildingLimit; 
}
}
