import java.awt.*;
public class TradePacket {
	private String query;
	private Card[] offer = new Card[11];
	private Player partner;
	private int asking, cardNum;
	
	public TradePacket() {
		query = "";
		for(int i = 0; i <= 10; i++) {
			offer[i] = Card();
		}
		partner = Player();
		asking = 0;
		cardNum = 0;
	}
	
	private void generateQuery() {
		String temp = partner.getName() + " would like to trade their ";
		for(int i = 0; i <= cardNum - 1; i++) {
			temp += offer[i].getName() + ", ";
		}
		temp += "for $" + asking + '.';
		query = temp;
	}
	
	public void setCards(Card[] objs) {
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
	
	public Card[] getCards() {
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
