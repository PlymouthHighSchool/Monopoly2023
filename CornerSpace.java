public class CornerSpace extends Space {
	int freeParkingMoney;
	
	public CornerSpace(int localLocation, String nameSpace) {
		super(localLocation, nameSpace);
		freeParkingMoney = 500;
	}
	
	public void goJail(Player currentPlayer) {//sets location of player to jail and sets the boolean inJail from player class to true
		currentPlayer.changeLocation(10); //setting position on array to 10, which is the integer location of jail
		currentPlayer.setInJail(true);//calls on the setter to set inJail (from player class) to true
	}
	
	public void addTax(int taxedMoney) { //adds taxed money to free parking money. added a parameter 
		freeParkingMoney += taxedMoney; 
	}
	
	public void parkingReset() {
		freeParkingMoney=500;
	
	}
	
	public int getParkingMoney() { //gives the player all free parking money 
		return freeParkingMoney;

	}
}
