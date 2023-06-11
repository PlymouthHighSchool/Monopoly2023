package Monopoly;

public class Game {
	//communityCard[] communityDeck = new communityCard[16];
	//chanceCard[] chanceDeck = new changeCard[18];
	int numOfPlayers;
	Player[] allPlayers = new Player[numOfPlayers];
	Object[] arrSpaces = new Object[40];
	Interface theInterface = new Interface();
	
	int TopChanceCard;
	int[] randomCardOrder = new int[68];

	public Game() {
		setSpaces();
	}
	
	public void setSpaces(){
		arrSpaces[0]=new CornerSpace(0, "GO");
		arrSpaces[1]=new Property(1, "MEDITERANEAN AVENUE",60,2,10,30,90,160,250,"Purple");
		arrSpaces[2]=new Space(2,"COMMUNITY CHEST");   //(Community Chest)
		arrSpaces[3]=new Property(3, "BALTIC AVENUE",60,4,20,60,180,320,450,"Purple");
		arrSpaces[4]=new Taxes(4, "LUXURY TAX");
		arrSpaces[5]=new Railroads(5, "READING RAILROAD");
		arrSpaces[6]=new Property(6, "ORIENTAL AVENUE",100,6,30,90,270,400,550,"BabyBlue");
		arrSpaces[7]=new Space(7,"CHANCE");   //(Chance)
		arrSpaces[8]=new Property(8, "VERMONT AVENUE",100,6,30,90,270,400,550,"BabyBlue");
		arrSpaces[9]=new Property(9, "CONNECTICUT AVENUE",120,8,40,100,300,450,600,"BabyBlue");
		arrSpaces[10]=new CornerSpace(10, "JAIL");
		arrSpaces[11]=new Property(11, "ST. CHARLES PLACE",140,10,50,150,450,625,750,"Pink");
		arrSpaces[12]=new Utilities(12, "ELECTRIC COMPANY");
		arrSpaces[13]=new Property(13, "STATES AVENUE",140,10,50,150,450,625,750,"Pink");
		arrSpaces[14]=new Property(14, "VIRGINIA AVENUE",160,12,60,180,500,700,900,"Pink");
		arrSpaces[15]=new Railroads(15, "PENNSYLVANIA RAILROAD");
		arrSpaces[16]=new Property(16, "ST. JAMES PLACE",180,14,70,200,550,750,950,"Orange");
		arrSpaces[17]=new Space(17,"COMMUNITY CHEST");  // (Community Chest)
		arrSpaces[18]=new Property(18, "TENNESSEE AVENUE",180,14,70,200,550,750,950,"Orange");
		arrSpaces[19]=new Property(19, "NEW YORK AVENUE",200,16,80,220,600,800,1000,"Orange");
		arrSpaces[20]=new CornerSpace(20, "FREE PARKING");
		arrSpaces[21]=new Property(21, "KENTUCKY AVENUE",220,18,90,250,700,875,1050,"Red");
		arrSpaces[22]=new Space(22,"CHANCE");  // (Chance)
		arrSpaces[23]=new Property(23, "INDIANA AVENUE",220,18,90,250,700,875,1050,"Red");
		arrSpaces[24]=new Property(24, "ILLINOIS AVENUE",240,20,100,300,750,925,1100,"Red");
		arrSpaces[25]=new Railroads(25, "B. & O. RAILROAD");
		arrSpaces[26]=new Property(26, "ATLANTIC AVENUE",260,22,110,330,800,975,1150,"Yellow");
		arrSpaces[27]=new Property(27, "VENTNOR AVENUE",260,22,110,330,800,975,1150,"Yellow");
		arrSpaces[28]=new Utilities(28, "WATER WORKS");
		arrSpaces[29]=new Property(29, "MARVIN GARDENS",280,24,120,360,850,1025,1200,"Yellow");
		arrSpaces[30]=new CornerSpace(30, "GO TO JAIL");
		arrSpaces[31]=new Property(31, "PACIFIC AVENUE",300,26,130,390,900,1100,1275,"Green");
		arrSpaces[32]=new Property(32, "NORTH CAROLINA AVENUE",300,26,130,390,900,1100,1275,"Green");
		arrSpaces[33]=new Space(33,"COMMUNITY CHEST");   //(Community Chest)
		arrSpaces[34]=new Property(34, "PENNSYLVANIA AVENUE",320,28,150,450,1000,1200,1400,"Green");
		arrSpaces[35]=new Railroads(29, "SHORT LINE");
		arrSpaces[36]=new Space(36,"CHANCE");  // (Chance)
		arrSpaces[37]=new Property(37, "PARK PLACE",350,35,175,500,1100,1300,1500,"Blue");
		arrSpaces[38]=new Taxes(38, "INCOME TAX");
		arrSpaces[39]=new Property(39, "BOARDWALK",400,50,200,600,1400,1700,2000,"Blue");
	}	
	
	public Object[] getArrSpace() {
		return arrSpaces;
	}
	
	public int getPlayerNumber() {
		return numOfPlayers;
	}
		
	public Player[] getPlayerArray() {
		return allPlayers;
	}
}