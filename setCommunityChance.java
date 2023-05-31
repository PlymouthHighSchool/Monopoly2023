import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class setCommunityChance {
	
	Cards[] communityDeck = new Cards[16];
	Cards[] chanceDeck = new Cards[18];
	
	public  setCommunityChance(int deckType) {
				File theFile;
		
		try {
	
			if (deckType==1)
				theFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\ChanceList.txt");//sets the file path to myFile
			else
				theFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\CommunityChanceList.txt");//sets the file path to myFile
			
		Scanner readTheFile= new Scanner(theFile);//readFile is a scanner which will access the lines in the file
		for (int chanceCount = 0; chanceCount < 18; chanceCount++) { 
			message = readTheFile.nextLine();
			thePosition = readTheFile.nextLine();
			venmo = readTheFile.nextLine();
			payout = readTheFile.nextLine();
			getOutofJail = readTheFile.nextLine();
			houseCharge = readTheFile.nextLine();
			hotelCharge = readTheFile.nextLine();
		
		}
		
		
		readTheFile.close();
		}
		catch (FileNotFoundException e) {//will catch any errors before it breaks something more serious WILL NOT WORK WITHOUT try{} catch{}
			System.out.println("An error occurred");
		}//closes file
		
	}				
}

		
		
	
