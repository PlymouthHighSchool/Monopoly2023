

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
	}
}
