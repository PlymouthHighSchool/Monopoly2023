

public class Utilities {
	int rent;
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
