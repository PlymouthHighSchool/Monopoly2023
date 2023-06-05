package Monopoly;

public class Railroads extends Property {
	
	String railroadName;
	
	public Railroads(String name) {
		costProperty = 200;
		railroadName = name;
	}
	
	public int calcRent(int numOfOwnedRailroads) {
		rent = 25;
		if (numOfOwnedRailroads == 2) {
			rent = 50;
		}
		else if (numOfOwnedRailroads == 3) {
			rent = 100;
		}
		else {
			rent = 200;
		}
		return rent;
	}
	
	public String getRailroadName() {
		return railroadName;
	}
}
