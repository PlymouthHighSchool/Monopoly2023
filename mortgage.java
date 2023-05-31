	private static int mortgage(Property theProperty) {
		int tempNum;
		if (theProperty.getMortgaged() == false) {
			if (theProperty.getNumHotels == 1) {
				tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * 5)) / 2;
			}
			else {
				tempNum = (theProperty.getCostProperty() + (theProperty.getBuildingCost() * theProperty.getNumHouses)) / 2;
			}
			
			theProperty.setMortgaged(true);
			return tempNum;
		}
		else {
			return 0;	
		}
	}
