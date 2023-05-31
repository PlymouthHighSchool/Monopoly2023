import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class setCommunityChance {
	
	Cards[] communityDeck = new Cards[16];
	Cards[] chanceDeck = new Cards[18];
	
	public void setCommunityChance() {
		try {
		File chanceFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\ChanceList.txt");//sets the file path to myFile
		Scanner readChanceFile= new Scanner(chanceFile);//readFile is a scanner which will access the lines in the file
		for (int chanceCount = 0; chanceCount < 18; chanceCount++) { 
			chanceDeck[chanceCount].message = readChanceFile.nextLine();
			chanceDeck[chanceCount].thePosition = readChanceFile.nextLine();
			chanceDeck[chanceCount].venmo = readChanceFile.nextLine();
			chanceDeck[chanceCount].payout = readChanceFile.nextLine();
			chanceDeck[chanceCount].getOutofJail = readChanceFile.nextLine();
			chanceDeck[chanceCount].houseCharge = readChanceFile.nextLine();
			chanceDeck[chanceCount].hotelCharge = readChanceFile.nextLine();
		
		}
		
		
		readChanceFile.close();
		}
		catch (FileNotFoundException e) {//will catch any errors before it breaks something more serious WILL NOT WORK WITHOUT try{} catch{}
			System.out.println("An error occurred");
		}//closes file
		
		try {
			File chestFile = new File("\\\\fileserver1\\studentshare\\Java\\Monopoly 2023\\CommunityChanceList.txt");//sets the file path to myFile
			Scanner readChestFile= new Scanner(chestFile);//readFile is a scanner which will access the lines in the file
			for (int chestCount = 0; chestCount < 18; chestCount++) {
				communityDeck[chestCount].message = readChestFile.nextLine();
				communityDeck[chestCount].thePosition = readChestFile.nextLine();
				communityDeck[chestCount].venmo = readChestFile.nextLine();
				communityDeck[chestCount].payout = readChestFile.nextLine();
				communityDeck[chestCount].getOutofJail = readChestFile.nextLine();
				communityDeck[chestCount].houseCharge = readChestFile.nextLine();
				communityDeck[chestCount].hotelCharge = readChestFile.nextLine();			
			}
			
			readChestFile.close();//closes file
		}catch (FileNotFoundException e) {//will catch any errors before it breaks something more serious WILL NOT WORK WITHOUT try{} catch{}
			System.out.println("An error occurred");
		}
	}				
}

		
		
	

