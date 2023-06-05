

public class Houses {
int totalBuildingLimit;
	
	Houses() {
		totalBuildingLimit = 32;	
	}
	
	public int getBuildingLimit() {
		return totalBuildingLimit; 
	}
	public void returnHouses(Property currentProperty) {
		currentProperty.numofHouses=4;
		totalBuildingLimit=totalBuildingLimit-4;
	}
}
