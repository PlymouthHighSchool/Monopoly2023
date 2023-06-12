package Monopoly;

public class Railroads extends Property {
	String railroadName;
	static int railroadIndex = 0;
	static Railroads allRailroads[] = new Railroads[4];
	
	public Railroads(int localLocation, String nameSpace) {
		super(localLocation, nameSpace);
		costProperty = 200;
		allRailroads[railroadIndex] = this;
		railroadIndex++;
	}
	
	public int numOwned() {
		int owned = 0;
		for(int i = 0; i < 4; i++) {
			if(this.getOwner() == allRailroads[i].getOwner()) {
				owned++;
			}
		}
		return owned;
	}//finds if the railroad is owned by a player 
	
	public int calcRent() {
		switch(numOwned()) {
			case 1:
				return 25;
			case 2:
				return 50;
			case 3:
				return 100;
			case 4:
				return 200;
			default:
				return 0;
		}
	}//calculates the payout based on the number of owned railroads 
	
	public String getRailroadName() {
		return railroadName;
	}
}