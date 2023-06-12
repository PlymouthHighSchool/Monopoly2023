public class Cards {
	String message;
	int[] thePosition;
	int venmo;
	int payout;
	Boolean getOutOfJail;
	int houseCharge;
	int hotelCharge;
	Cards[] communityDeck = new Cards[16];
	Cards[] chanceDeck = new Cards[18];
	
	public Cards(int deckType) { //deck type determines the file path to read form 
	File theFile;
		try {
			if (deckType==1)
				theFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\ChanceList.txt");//sets the file path to myFile
			else
				theFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\CommunityChanceList.txt");//sets the file path to myFile
			
		Scanner readTheFile= new Scanner(theFile);//readFile is a scanner which will access the lines in the file
		for (int chanceCount = 0; chanceCount < 18; chanceCount++) { //repeats18 times 
			message = readTheFile.nextLine(); // assigned to messsage from file, etc
			thePosition = Integer.valueOf(readTheFile.nextLine());
			venmo = Integer.valueOf(readTheFile.nextLine());
			payout = Integer.valueOf(readTheFile.nextLine());
			getOutOfJail = Boolean.valueOf(readTheFile.nextLine());
			houseCharge = Integer.valueOf(readTheFile.nextLine());
			hotelCharge = Integer.valueOf(readTheFile.nextLine());
		}	
		readTheFile.close();
		}
		catch (FileNotFoundException e) {//will catch any errors before it breaks something more serious WILL NOT WORK WITHOUT try{} catch{}
			System.out.println("An error occurred");
		}//closes file		
	}
	
	public String DoAction() {
		return "";
	}
	
	private int calculatePayout() {
		return 0;
	}
}
