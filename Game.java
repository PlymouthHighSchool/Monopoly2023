
public class Game {
	communityCard[] communityDeck = new communityCard[16];
	chanceCard[] chanceDeck = new changeCard[18];
	int numOfPlayers;
	Player[] allPlayers = new Player[numOfPlayers];
	Player[] playerOrder = new Player(piece);
	Object[] arrSpaces = new Object[40];
	int TopChanceCard;
	int[68] randomCardOrder;
	interface theInterface = new interface();
	public void shuffleCards();
	int topCommunityCard();
	
public void setSpaces(){
	arrSpaces[0]=new CornerSpace("GO");
	arrSpaces[1]=new Property("MEDITERANEAN AVENUE",60,2,10,30,90,160,250,"Purple");
	arrSpaces[2]=new Space(2,"COMMUNITY CHEST");   //(Community Chest)
	arrSpaces[3]=new Property("BALTIC AVENUE",60,4,20,60,180,320,450,"Purple");
	arrSpaces[4]=new Taxes();
	arrSpaces[5]=new Railroad("READING RAILROAD");
	arrSpaces[6]=new Property("ORIENTAL AVENUE",100,6,30,90,270,400,550,"BabyBlue");
	arrSpaces[7]=new Space(7,"CHANCE");   //(Chance)
	arrSpaces[8]=new Property("VERMONT AVENUE",100,6,30,90,270,400,550,"BabyBlue");
	arrSpaces[9]=new Property("CONNECTICUT AVENUE",120,8,40,100,300,450,600,"BabyBlue");
	arrSpaces[10]=new CornerSpace("JAIL");
	arrSpaces[11]=new Property("ST. CHARLES PLACE",140,10,50,150,450,625,750,"Pink");
	arrSpaces[12]=new Utilities("ELECTRIC COMPANY");
	arrSpaces[13]=new Property("STATES AVENUE",140,10,50,150,450,625,750,"Pink");
	arrSpaces[14]=new Property("VIRGINIA AVENUE",160,12,60,180,500,700,900,"Pink");
	arrSpaces[15]=new Railroad("PENNSYLVANIA RAILROAD");
	arrSpaces[16]=new Property("ST. JAMES PLACE",180,14,70,200,550,750,950,"Orange");
	arrSpaces[17]=new Space(17,"COMMUNITY CHEST");  // (Community Chest)
	arrSpaces[18]=new Property("TENNESSEE AVENUE",180,14,70,200,550,750,950,"Orange");
	arrSpaces[19]=new Property("NEW YORK AVENUE",200,16,80,220,600,800,1000,"Orange");
	arrSpaces[20]=new CornerSpace("FREE PARKING");
	arrSpaces[21]=new Property("KENTUCKY AVENUE",220,18,90,250,700,875,1050,"Red");
	arrSpaces[22]=new Space(22,"CHANCE");  // (Chance)
	arrSpaces[23]=new Property("INDIANA AVENUE",220,18,90,250,700,875,1050,"Red");
	arrSpaces[24]=new Property("ILLINOIS AVENUE",240,20,100,300,750,925,1100,"Red");
	arrSpaces[25]=new Railroad("B. & O. RAILROAD");
	arrSpaces[26]=new Property("ATLANTIC AVENUE",260,22,110,330,800,975,1150,"Yellow");
	arrSpaces[27]=new Property("VENTNOR AVENUE",260,22,110,330,800,975,1150,"Yellow");
	arrSpaces[28]=new Utilities("WATER WORKS");
	arrSpaces[29]=new Property("MARVIN GARDENS",280,24,120,360,850,1025,1200,"Yellow");
	arrSpaces[30]=new CornerSpace("GO TO JAIL");
	arrSpaces[31]=new Property("PACIFIC AVENUE",300,26,130,390,900,1100,1275,"Green");
	arrSpaces[32]=new Property("NORTH CAROLINA AVENUE",300,26,130,390,900,1100,1275,"Green");
	arrSpaces[33]=new Space(33,"COMMUNITY CHEST");   //(Community Chest)
	arrSpaces[34]=new Property("PENNSYLVANIA AVENUE",320,28,150,450,1000,1200,1400,"Green");
	arrSpaces[35]=new Railroad("SHORT LINE");
	arrSpaces[36]=new Space(36,"CHANCE");  // (Chance)
	arrSpaces[37]=new Property("PARK PLACE",350,35,175,500,1100,1300,1500,"Blue");
	arrSpaces[38]=new Taxes();
	arrSpaces[39]=new Property("BOARDWALK",400,50,200,600,1400,1700,2000,"Blue");
}

	public Object[] getArrSpace() {
	return arrSpaces;
}

public int getPlayerNumber() {
	return playerNumber;
}
	
public Player[] getPlayerArray() {
		return allPlayers;
	}
}
