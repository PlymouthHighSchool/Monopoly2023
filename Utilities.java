
public class Utilities extends Property {

	int costProperty; //cost of the property when buying that spaced
	boolean isOwned = false; //keeps track if property is owned by another player
	int rent = 0; //cost when landing on the space, set to 0 when game starts because no one owns it yet
	
	public Utilities() {
		rent = 0;
		isOwned = false;
		costProperty = 150;
	}
public void calcRent(int die1, int die2, boolean bothUtilities) {
	 if (bothUtilities==true) {
		 rent=die1+die2*10;
	 }
		 else {
			 rent=(die1+die2)*4;
		 }
			 
	}
	public static void main(String[] args) {
		
	}
	public int calcRent() {
		//caclulates rent based on instance variables and updates instance variable rent
		
	}
}

