package Monopoly;

public class Property extends Space {
	int costProperty;
	int numHouses;
	int numHotels;
	boolean isOwned;
	int rent;
	boolean isMortgaged; //add player number and turn order and use p-g's constructor edit fro it
	String colorSet;
	String name;
	int propertyOneHouse;
	int propertyTwoHouses;
	int propertyThreeHouses;
	int propertyFourHouses;
	int propertyHotel;
	int costOfBuilding;
	Player owner;
	
	public Property(int localLocation, String nameSpace) {
		super(localLocation, nameSpace);
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
	
	public Property(int localLocation, String nameSpace, int varCostProperty, int varRent, int varPropertyOneHouse, int varPropertyTwoHouses, int varPropertyThreeHouses, int varPropertyFourHouses, int varPropertyHotel, String varColorSet) {
		super(localLocation, nameSpace);
		costProperty = varCostProperty;
		numHouses = 0;
		numHotels = 0;
		isOwned = false;
		rent = varRent;
		isMortgaged = false;
		colorSet = varColorSet;
		propertyOneHouse = varPropertyOneHouse;
		propertyTwoHouses = varPropertyTwoHouses;
		propertyThreeHouses = varPropertyThreeHouses;
		propertyFourHouses = varPropertyFourHouses;
		propertyHotel = varPropertyHotel;
	}
	
	public int getRent() { //returns the cost of landing on the property
		int rentAmount=0;
		if (numHotels == 1) {
			rentAmount = propertyHotel;
		}
		else if (numHouses == 1) { 
			 rentAmount = propertyOneHouse; 
		}
		else if (numHouses ==2) {
			 rentAmount = propertyTwoHouses;
		}
		else if (numHouses == 3) {
			 rentAmount = propertyThreeHouses;
		}
		else if (numHouses == 4) {
			rentAmount = propertyFourHouses;
		}
		return rentAmount;
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
	
	public void setOwner(Player localPlayer) {
		owner = localPlayer;
		setIsOwned(true);
	}
	
	public Player getOwner() {
		return owner;
	}
}