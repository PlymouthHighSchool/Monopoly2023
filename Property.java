
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
	
	public int getRent() { //returns the cost of landing on the property
		if (numHotels == 1) {
			return propertyHotel;
		}
		else if (numHouses == 1) { 
			return propertyOneHouse; 
		}
		else if (numHouses ==2) {
			return propertyTwoHouse;
		}
		else if (numHouses == 3) {
			return propertyThreeHouse;
		}
		else if (numHouses == 4) {
			return propertyFourHouse;
		}
		else {
			return  0;
		}
		
	public boolean getIsOwned() {
		return isOwned;
	}
	
	public void setIsOwned(boolean owned) {
		isOwned = owned;
	}
	
	public int getCostProperty() {
		return costProperty;
	}
}
