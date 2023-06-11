package Monopoly;

public class TradePacket {
	private String query;
	private Cards[] offer = new Cards[11];
	private Player partner;
	private int asking, cardNum;
	
	public TradePacket(Player tradePartner) {
		query = "";
		for(int i = 0; i <= 10; i++) {
			offer[i] = new Cards(1);//passing 1 to make work but not right
		}
		partner = tradePartner; 
		asking = 0;
		cardNum = 0;
	}
	
	private void generateQuery() {
		String temp = partner.getPlayerNumber() + " would like to trade their ";
		for(int i = 0; i <= cardNum - 1; i++) {
			temp += offer[i].getMessage() + ", ";
		}
		temp += "for $" + asking + '.';
		query = temp;
	}
	
	public void setCards(Cards[] objs) {
		offer = objs;
	}
	
	public void setTarget(Player target) {
		partner = target;
	}
	
	public void setPrice(int price) {
		asking = price;
	}
	
	public void setCardNum(int num) {
		cardNum = num;
	}
	
	public String getQuery() {
		generateQuery();
		return query;
	}
	
	public Cards[] getCards() {
		return offer;
	}
	
	public Player getTarget() {
		return partner;
	}
	
	public int getPrice() {
		return asking;
	}
	
	public int getCardNum() {
		return cardNum;
	}
}