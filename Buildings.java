package Monopoly;

public class Buildings {
	int costOfBuilding;
	int totalBuildingLimit;
	
	public Buildings() { // 32 house limit, 12 hotel limit
		costOfBuilding = 0; 
		totalBuildingLimit = 0;
	}
	
	public int getCost() {//returns the cost of a building
		return(costOfBuilding);
	}
}