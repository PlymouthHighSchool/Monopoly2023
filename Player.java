import java.awt.*;
import BreezyGUI.*;

public class Player extends GBFrame{
	int wallet;
	int location;
	String piece;
	int numOfJailCards;
	int playerNumber;
	Boolean inJail ;
	int timeInJail;
	//these four line are a tester and will be removed:
	Button conputeButton = addButton ("tester" , 6, 3, 2, 1);
	public void buttonClicked (Button buttonObj) {
		System.out.println(calcTax(100));
	}
	
	/*
	public int numOfHotels() {
		return numHotels;
	}
	
	public int numOfHouses() {
		return numHouses;
	}
	*/
	public int calcTax(int totalWorth) {
		totalWorth = (int) (totalWorth * .9);
		return totalWorth;
		
	}

	public Boolean generateFunds(int financialGoal) {
		if(getWallet() > financialGoal) {
			
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Frame frm = new Player();
		frm.setSize(100, 100);
		frm.setVisible (true);
	}
}
