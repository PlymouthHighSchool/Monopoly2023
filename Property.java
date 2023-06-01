
public class Property extends Object {
	int costProperty;
	int numHouses;
	int numHotels;
	boolean isOwned;
	int rent;
	boolean isMortgaged;
	String colorSet;
	String name;
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
	
	public String getColor() {
		return colorSet;
}
public Property(String name, int costProperty, int rent,int propertyOneHouse, int propertyTwoHouses, int propertyThreeHouses,int propertyFourHouses,int propertyHotel,String colorSet) {
	costProperty = costProperty;
	numHouses = 0;
	numHotels = 0;
	isOwned = false;
	rent = rent;
	isMortgaged = false;
	propertyOneHouse = propertyOneHouse;
	propertyTwoHouses = propertyTwoHouses;
	propertyThreeHouses = propertyThreeHouses;
	propertyFourHouses = propertyFourHouses;
	propertyHotel = propertyHotel;
	name = name;
	colorSet = colorSet;

}
public int getNumHouses() {
	return numHouses;
}

public int getNumHotels() {
	return numHotels;
}
}
