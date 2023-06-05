package Monopoly;

public class Houses {
	int totalBuildingLimit;
	
	Houses() {
		totalBuildingLimit = 32;	
	}
	
	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
	
	public void removeFourHouses(Property currentProperty) {// removes four houses from the board and adds them to the total.(call from Hotels)
		totalBuildingLimit = totalBuildingLimit - 4;
		currentProperty.numHouses = currentProperty.numHouses - 4;
	}
}