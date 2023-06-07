
public class Property extends Object {
	int costProperty;
	int numHouses;
	int numHotels;
	boolean isOwned;
	int rent;
	boolean isMortgaged; //add player number and tunr order and use p-g's constructor edit fro it
	String colorSet;
	String name;
	int propertyOneHouse;
	int propertyTwoHouses;
	int propertyThreeHouses;
	int propertyFourHouses;
	int propertyHotel;
	int costOfBuilding;
	
public Property(String varName, int varCostProperty, int varRent,int varPropertyOneHouse, int varPropertyTwoHouses, int varPropertyThreeHouses,int varPropertyFourHouses,int varPropertyHotel,String varColorSet) {
	costProperty = varCostProperty;
	numHouses = 0;
	numHotels = 0;
	isOwned = false;
	rent = varRent;
	isMortgaged = false;
	propertyOneHouse = varPropertyOneHouse;
	propertyTwoHouses = varPropertyTwoHouses;
	propertyThreeHouses = varPropertyThreeHouses;
	propertyFourHouses = varPropertyFourHouses;
	propertyHotel = varPropertyHotel;
	name = varName;
	colorSet = varColorSet;

}

public boolean getIsOwned() {
		return isOwned;

	}
public void setIsOwned(boolean owned) {
		isOwned = owned;
	}
	
public String getColor() {
		return colorSet;
}		
public int getNumHouses() {
	return numHouses;
}

public int getNumHotels() {
	return numHotels;
}

public int getBuildingCost() {
	return costOfBuilding;
}

public int getCostProperty() {
	return costProperty;
}

public void setMortgaged(Boolean mortgaged) {
	isMortgaged = mortgaged;
}

public void setNumHotels(int inNumHotels) {
	numHotels = inNumHotels;
}

public void setNumHouses(int inNumHouses) {
	numHouses = inNumHouses;
}

public boolean getMortgaged() {
	return isMortgaged;
}
}
