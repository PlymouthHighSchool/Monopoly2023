public class Taxes extends Space {
	int payTax; //amount of tax that has to paid when landed on the space
	
	public Taxes(int localLocation, String nameSpace) {
		super(localLocation, nameSpace);
	}
	
	public int calculateTax(Player thePlayer) {
		String[] taxOptions = new String[2];
		taxOptions[0] = "Pay $200";
		taxOptions[1] = "Pay 10% of Worth";
		int playerTax = (int)Math.round(thePlayer.getTotalWorth() * .1);
		if (thePlayer.getLocation() == 4) {
			if (Interface.createOptionPane(taxOptions, "Would you like to pay $200 or pay 10% of your total worth?", "Choose your payment") == 0) {
				payTax = 200;
			}
			else
				payTax = playerTax;
		}
		else if (thePlayer.getLocation() == 38) {
			payTax = 75;
		}
		return payTax;
	}
	
	public void getTax() { //takes tax from palyer's wallet
		Player p = Turn.getPlayerInfo();
		p.changeWallet(-1 * p.calcTax(p.getTotalWorth()));
	}
}
