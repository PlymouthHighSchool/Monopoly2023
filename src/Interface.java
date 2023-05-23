import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Interface {
	ImageIcon[] pieceArray;
	//Player currentPlayer;
	int[] spaceArray;
	
	JLabel boardLabel; 
	JLabel mediterraneanAveLabel;
	JLabel balticAveLabel;
	JLabel readingRailroadLabel;
	JLabel orientalAveLabel;
	JLabel vermontAveLabel;
	JLabel connecticutAveLabel;
	JLabel stCharlesPlaceLabel;
	JLabel electricCompanyLabel;
	JLabel statesAveLabel;
	JLabel virginiaAveLabel;
	JLabel pennsylvaniaRailroadLabel;
	JLabel stJamesPlaceLabel;
	JLabel tennesseeAveLabel;
	JLabel newYorkAveLabel;
	JLabel kentuckyAveLabel;
	JLabel indianaAveLabel;
	JLabel illinoisAveLabel;
	JLabel BORailroadLabel;
	JLabel atlanticAveLabel;
	JLabel ventnorAveLabel;
	JLabel waterWorksLabel;
	JLabel marvinGardesLabel;
	JLabel pacificAveLabel;
	JLabel noCarolinaAveLabel;
	JLabel pennsylvaniaAveLabel;
	JLabel shortLineRailroadLabel;
	JLabel parkPlaceLabel;
	JLabel boardWalkLabel;
	JLabel getOutOfJailFreeccLabel;
	JLabel getOutOfJailFreecLabel;
	
	JLabel rollLabel;
	JLabel moneyLabel;
	
	JLabel pieceLabel;
	
	
	JPanel boardPanel;
	JPanel buttonsPanel;
	JPanel cardImagePanel;
	
	JButton buyClick;
	JButton rollClick;
	JButton endTurnClick;
	JButton tradeClick;
	
	JFrame frame;
	
	

	
	public Interface (){
		
		frame = new JFrame("Interface");
		frame.setSize(2200,1100);
		frame.setVisible(true);
	
		
		ImageIcon boardImage; //move these to constructor and replace with labels
		ImageIcon mediterraneanAveImage;
		ImageIcon balticAveImage;
		ImageIcon readingRailroadImage;
		ImageIcon orientalAveImage;
		ImageIcon vermontAveImage;
		ImageIcon connecticutAveImage;
		ImageIcon stCharlesPlaceImage;
		ImageIcon electricCompanyImage;
		ImageIcon statesAveImage;
		ImageIcon virginiaAveImage;
		ImageIcon pennsylvaniaRailroadImage;
		ImageIcon stJamesPlaceImage;
		ImageIcon tennesseeAveImage;
		ImageIcon newYorkAveImage;
		ImageIcon kentuckyAveImage;
		ImageIcon indianaAveImage;
		ImageIcon illinoisAveImage;
		ImageIcon BORailroadImage;
		ImageIcon atlanticAveImage;
		ImageIcon ventnorAveImage;
		ImageIcon waterWorksImage;
		ImageIcon marvinGardesImage;
		ImageIcon pacificAveImage;
		ImageIcon noCarolinaAveImage;
		ImageIcon pennsylvaniaAveImage;
		ImageIcon shortLineRailroadImage;
		ImageIcon parkPlaceImage;
		ImageIcon boardWalkImage;
		ImageIcon getOutOfJailFreeccLabel;
		ImageIcon getOutOfJailFreecLabel;
		
		ImageIcon pieceImage;
		
	}
	public static void main(String args[]){
		Interface interFace;
		interFace = new Interface();
	}
	
}




