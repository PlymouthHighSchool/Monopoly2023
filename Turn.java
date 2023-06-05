
public class Turn {
  int doubleCount;
	int rollNum;
	int[] dice;
	Player currentPlayer;
	boolean rolled;
	int unmortgaged;

private static int unmortgage(Property theProperty) {
	int tempNum;
	if (theProperty.getMortgaged() == true) {
		if (theProperty.getNumHotels == 1) {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * 5)) / 2;
		}
		else {
			tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * theProperty.getNumHouses)) / 2;
		}
		tempNum *= 1.1;
		theProperty.setMortgaged(false);
		return tempNum;
	}
	else {
		return 0;	
	}
}
}
