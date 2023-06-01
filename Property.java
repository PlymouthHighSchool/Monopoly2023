
public class Property extends Object {
	int costProperty;
	int numHouses;
	int numHotels;
	boolean isOwned;
	int rent;
	boolean isMortgaged;
	String colorSet;
	int propertyOneHouse;
	int propertyTwoHouses;
	int propertyThreeHouses;
	int propertyFourHouses;
	int propertyHotel;

	public boolean getIsOwned() {
		return isOwned;
	}

	public void setIsOwned(boolean owned) {
		isOwned = owned;
	}
public Property() {
	costProperty = 0;
	numHouses = 0;
	numHotels = 0;
	isOwned = false;
	rent = 0;
	isMortgaged = false;
	colorSet = "";
	propertyOneHouse = 0;
	propertyTwoHouses = 0;
	propertyThreeHouses = 0;
	propertyFourHouses = 0;
	propertyHotel = 0;
	

}
public int getNumHouses() {
	return numHouses;
}

public int getNumHotels() {
	return numHotels;
}

}
