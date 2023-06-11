package Monopoly;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	JLabel marvinGardensLabel;
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
	
	JTextField rollField;
	JTextField moneyField;
	
	JLabel pieceLabel1;
	JLabel pieceLabel2;
	JLabel pieceLabel3;
	JLabel pieceLabel4;
	JLabel pieceLabel5;
	JLabel pieceLabel6;
	JLabel pieceLabel7;
	JLabel pieceLabel8;
		
	JButton buyClick;
	JButton rollClick;
	JButton endTurnClick;
	JButton tradeClick;
	
	JFrame frame;
	
	public Interface (){
		//AFTER DONE CHANGE ALL FILE PATHS TO STUDENT SHARE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		frame = new JFrame("Interface");
		frame.setLayout(null);
		frame.setSize(2200,1600);
		//T:\Java\Monopoly 2023\MonopolyCards
		boardLabel = new JLabel();
		ImageIcon boardImage = new ImageIcon(new ImageIcon("T:\\Java\\Monopoly 2023\\MonopolyCards\\board.jpg").getImage().getScaledInstance(1000, 1000, Image.SCALE_SMOOTH));
		boardLabel.setIcon(boardImage);
		boardLabel.setVisible(true);
		boardLabel.setBounds(0,0,1000,1000);
		frame.add(boardLabel);
		
		mediterraneanAveLabel = new JLabel();
		ImageIcon mediterraneanAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\mediterraneanAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		mediterraneanAveLabel.setIcon(mediterraneanAveImage);
		mediterraneanAveLabel.setVisible(true);
		mediterraneanAveLabel.setBounds(1100,200,150,300);
		frame.add(mediterraneanAveLabel);
		
		balticAveLabel = new JLabel();
		ImageIcon balticAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\balticAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		balticAveLabel.setIcon(balticAveImage);
		balticAveLabel.setVisible(true);
		balticAveLabel.setBounds(1260,200,150,300);
		frame.add(balticAveLabel);
		
		readingRailroadLabel = new JLabel();
		ImageIcon readingRailroadImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\readingRailroad.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		readingRailroadLabel.setIcon(readingRailroadImage);
		readingRailroadLabel.setVisible(true);
		readingRailroadLabel.setBounds(1420, 200, 150, 300);
		frame.add(readingRailroadLabel);
		
		orientalAveLabel = new JLabel();
		ImageIcon orientalAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\orientalAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		orientalAveLabel.setIcon(orientalAveImage);
		orientalAveLabel.setVisible(true);
		orientalAveLabel.setBounds(1580, 200, 150, 300);
		frame.add(orientalAveLabel);
		
		vermontAveLabel = new JLabel();
		ImageIcon vermontAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\vermontAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		vermontAveLabel.setIcon(vermontAveImage);
		vermontAveLabel.setVisible(true);
		vermontAveLabel.setBounds(1740, 200, 150, 300);
		frame.add(vermontAveLabel);
		
		connecticutAveLabel = new JLabel();
		ImageIcon connecticutAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\connecticutAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		connecticutAveLabel.setIcon(connecticutAveImage);
		connecticutAveLabel.setVisible(true);
		connecticutAveLabel.setBounds(1900, 200, 150, 300);
		frame.add(connecticutAveLabel);
		
		stCharlesPlaceLabel = new JLabel();
		ImageIcon stCharlesPlaceImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\stCharlesPlace.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		stCharlesPlaceLabel.setIcon(stCharlesPlaceImage);
		stCharlesPlaceLabel.setVisible(true);
		stCharlesPlaceLabel.setBounds(1100, 410, 150, 300);
		frame.add(stCharlesPlaceLabel);
		
		electricCompanyLabel = new JLabel();
		ImageIcon electricCompanyImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\electricCompany.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		electricCompanyLabel.setIcon(electricCompanyImage);
		electricCompanyLabel.setVisible(true);
		electricCompanyLabel.setBounds(1260,410,150,300);
		frame.add(electricCompanyLabel);
		
		statesAveLabel = new JLabel();
		ImageIcon statesAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\statesAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		statesAveLabel.setIcon(statesAveImage);
		statesAveLabel.setVisible(true);
		statesAveLabel.setBounds(1420, 410, 150, 300);
		frame.add(statesAveLabel);
		
		virginiaAveLabel = new JLabel();
		ImageIcon virginiaAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\virginiaAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		virginiaAveLabel.setIcon(virginiaAveImage);
		virginiaAveLabel.setVisible(true);
		virginiaAveLabel.setBounds(1580, 410, 150, 300);
		frame.add(virginiaAveLabel);
		
		pennsylvaniaRailroadLabel = new JLabel();
		ImageIcon pennsylvaniaRailroadImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\pennsylvaniaRailroad.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		pennsylvaniaRailroadLabel.setIcon(pennsylvaniaRailroadImage);
		pennsylvaniaRailroadLabel.setVisible(true);
		pennsylvaniaRailroadLabel.setBounds(1740, 410, 150, 300);
		frame.add(pennsylvaniaRailroadLabel);
		
		stJamesPlaceLabel = new JLabel();
		ImageIcon stJamesPlaceImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\stJamesPlace.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		stJamesPlaceLabel.setIcon(stJamesPlaceImage);
		stJamesPlaceLabel.setVisible(true);
		stJamesPlaceLabel.setBounds(1900, 410, 150, 300);
		frame.add(stJamesPlaceLabel);
		
		tennesseeAveLabel = new JLabel();
		ImageIcon tennesseeAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\tennesseeAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		tennesseeAveLabel.setIcon(tennesseeAveImage);
		tennesseeAveLabel.setVisible(true);
		tennesseeAveLabel.setBounds(1100, 620, 150, 300);
		frame.add(tennesseeAveLabel);
		
		newYorkAveLabel = new JLabel();
		ImageIcon newYorkAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\newYorkAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		newYorkAveLabel.setIcon(newYorkAveImage);
		newYorkAveLabel.setVisible(true);
		newYorkAveLabel.setBounds(1260, 620, 150, 300);
		frame.add(newYorkAveLabel);
		
		kentuckyAveLabel = new JLabel();
		ImageIcon kentuckyAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\kentuckyAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		kentuckyAveLabel.setIcon(kentuckyAveImage);
		kentuckyAveLabel.setVisible(true);
		kentuckyAveLabel.setBounds(1420, 620, 150, 300);
		frame.add(kentuckyAveLabel);
		
		indianaAveLabel = new JLabel();
		ImageIcon indianaAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\indianaAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		indianaAveLabel.setIcon(indianaAveImage);
		indianaAveLabel.setVisible(true);
		indianaAveLabel.setBounds(1580, 620, 150, 300);
		frame.add(indianaAveLabel);
		
		illinoisAveLabel = new JLabel();
		ImageIcon illinoisAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\illinoisAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		illinoisAveLabel.setIcon(illinoisAveImage);
		illinoisAveLabel.setVisible(true);
		illinoisAveLabel.setBounds(1740, 620, 150, 300);
		frame.add(illinoisAveLabel);
		
		BORailroadLabel = new JLabel();
		ImageIcon BORailroadImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\BORailroad.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		BORailroadLabel.setIcon(BORailroadImage);
		BORailroadLabel.setVisible(true);
		BORailroadLabel.setBounds(1900, 620, 150, 300);
		frame.add(BORailroadLabel);
		
		atlanticAveLabel = new JLabel();
		ImageIcon atlanticAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\atlanticAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		atlanticAveLabel.setIcon(atlanticAveImage);
		atlanticAveLabel.setVisible(true);
		atlanticAveLabel.setBounds(1100, 830, 150, 300);
		frame.add(atlanticAveLabel);
		
		ventnorAveLabel = new JLabel();
		ImageIcon ventnorAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\ventnorAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		ventnorAveLabel.setIcon(ventnorAveImage);
		ventnorAveLabel.setVisible(true);
		ventnorAveLabel.setBounds(1260, 830, 150, 300);
		frame.add(ventnorAveLabel);
		
		waterWorksLabel = new JLabel();
		ImageIcon waterWorksImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\waterWorks.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		waterWorksLabel.setIcon(waterWorksImage);
		waterWorksLabel.setVisible(true);
		waterWorksLabel.setBounds(1420, 830, 150, 300);
		frame.add(waterWorksLabel);
		
		marvinGardensLabel = new JLabel();
		ImageIcon marvinGardensImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\marvinGardens.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		marvinGardensLabel.setIcon(marvinGardensImage);
		marvinGardensLabel.setVisible(true);
		marvinGardensLabel.setBounds(1580, 830, 150, 300);
		frame.add(marvinGardensLabel);
		
		pacificAveLabel = new JLabel();
		ImageIcon pacificAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\pacificAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		pacificAveLabel.setIcon(pacificAveImage);
		pacificAveLabel.setVisible(true);
		pacificAveLabel.setBounds(1740, 830, 150, 300);
		frame.add(pacificAveLabel);
		
		noCarolinaAveLabel = new JLabel();
		ImageIcon noCarolinaAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\noCarolinaAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		noCarolinaAveLabel.setIcon(noCarolinaAveImage);
		noCarolinaAveLabel.setVisible(true);
		noCarolinaAveLabel.setBounds(1900, 830, 150, 300);
		frame.add(noCarolinaAveLabel);
		
		pennsylvaniaAveLabel = new JLabel();
		ImageIcon pennsylvaniaAveImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\pennsylvaniaAve.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		pennsylvaniaAveLabel.setIcon(pennsylvaniaAveImage);
		pennsylvaniaAveLabel.setVisible(true);
		pennsylvaniaAveLabel.setBounds(1100, 1040, 150, 300);
		frame.add(pennsylvaniaAveLabel);
		
		shortLineRailroadLabel = new JLabel();
		ImageIcon shortLineRailroadImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\shortLineRailroad.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		shortLineRailroadLabel.setIcon(shortLineRailroadImage);
		shortLineRailroadLabel.setVisible(true);
		
		shortLineRailroadLabel.setBounds(1260, 1040, 150, 300);
		frame.add(shortLineRailroadLabel);
		
		parkPlaceLabel = new JLabel();
		ImageIcon parkPlaceImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\parkPlace.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		parkPlaceLabel.setIcon(parkPlaceImage);
		parkPlaceLabel.setVisible(true);
		parkPlaceLabel.setBounds(1420, 1040, 150, 300);
		frame.add(parkPlaceLabel);
		
		boardWalkLabel = new JLabel();
		ImageIcon boardWalkImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\boardWalk.jpg").getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH)); 
		boardWalkLabel.setIcon(boardWalkImage);
		boardWalkLabel.setVisible(true);
		boardWalkLabel.setBounds(1580, 1040, 150, 300);
		frame.add(boardWalkLabel);
		
		getOutOfJailFreeccLabel = new JLabel();
		ImageIcon getOutOfJailFreeccImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\jailCC.jpg").getImage().getScaledInstance(220, 100, Image.SCALE_SMOOTH)); 
		getOutOfJailFreeccLabel.setIcon(getOutOfJailFreeccImage);
		getOutOfJailFreeccLabel.setVisible(true);
		getOutOfJailFreeccLabel.setBounds(1740, 1000, 220, 300);
		frame.add(getOutOfJailFreeccLabel);
		
		getOutOfJailFreecLabel = new JLabel();
		ImageIcon getOutOfJailFreecImage = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\jailC.jpg").getImage().getScaledInstance(220, 100, Image.SCALE_SMOOTH)); 
		getOutOfJailFreecLabel.setIcon(getOutOfJailFreecImage);
		getOutOfJailFreecLabel.setVisible(true);
		getOutOfJailFreecLabel.setBounds(1740, 1110, 220, 300);
		frame.add(getOutOfJailFreecLabel);
		
		pieceLabel1 = new JLabel();
		ImageIcon pieceImage1 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\dogPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel1.setIcon(pieceImage1);
		pieceLabel1.setVisible(true);
		pieceLabel1.setBounds(0,1010,50,50);
		frame.add(pieceLabel1);
		
		pieceLabel2 = new JLabel();
		ImageIcon pieceImage2 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\carPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel2.setIcon(pieceImage2);
		pieceLabel2.setVisible(true);
		pieceLabel2.setBounds(60,1010,50,50);
		frame.add(pieceLabel2);
		
		pieceLabel3 = new JLabel();
		ImageIcon pieceImage3 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\hatPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel3.setIcon(pieceImage3);
		pieceLabel3.setVisible(true);
		pieceLabel3.setBounds(120,1010,50,50);
		frame.add(pieceLabel3);
		
		pieceLabel4 = new JLabel();
		ImageIcon pieceImage4 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\ironPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel4.setIcon(pieceImage4);
		pieceLabel4.setVisible(true);
		pieceLabel4.setBounds(180,1010,50,50);
		frame.add(pieceLabel4);
		
		pieceLabel5 = new JLabel();
		ImageIcon pieceImage5 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\shipPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel5.setIcon(pieceImage5);
		pieceLabel5.setVisible(true);
		pieceLabel5.setBounds(240,1010,50,50);
		frame.add(pieceLabel5);
		
		pieceLabel6 = new JLabel();
		ImageIcon pieceImage6 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\shoePiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel6.setIcon(pieceImage6);
		pieceLabel6.setVisible(true);
		pieceLabel6.setBounds(300,1010,50,50);
		frame.add(pieceLabel6);
		
		pieceLabel7 = new JLabel();
		ImageIcon pieceImage7 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\thimblePiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel7.setIcon(pieceImage7);
		pieceLabel7.setVisible(true);
		pieceLabel7.setBounds(360,1010,50,50);
		frame.add(pieceLabel7);
		
		pieceLabel8 = new JLabel();
		ImageIcon pieceImage8 = new ImageIcon(new ImageIcon("T:\\Java\\MonopolyCards\\wheelPiece.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		pieceLabel8.setIcon(pieceImage8);
		pieceLabel8.setVisible(true);
		pieceLabel8.setBounds(420,1010,50,50);
		frame.add(pieceLabel8);

		buyClick = new JButton("Buy");
		buyClick.setBounds(1100,0,100,25);
		buyClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//the method of the button goes here ASK NORMAN IF U DONT UNDERSTAND!!!!!!!!!
			}
		});
		frame.add(buyClick);
		
		rollClick = new JButton("Roll");
		rollClick.setBounds(1250,0,100,25);
		rollClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int roll = Dice.Roll() + Dice.Roll();
				rollField.setText(String.valueOf(roll));
			}
		});
		frame.add(rollClick);
		
		endTurnClick = new JButton("End Turn");
		endTurnClick.setBounds(1400,0,100,25);
		endTurnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn.endTurn();
			}
		});
		frame.add(endTurnClick);
		
		rollLabel = new JLabel("Roll: ");
		rollLabel.setVisible(true);
		rollLabel.setBounds(1250, 50, 100, 25);
		frame.add(rollLabel);
		
		moneyLabel = new JLabel("Money: ");
		moneyLabel.setVisible(true);
		moneyLabel.setBounds(1100, 50, 100, 25);
		frame.add(moneyLabel);
		
		rollField = new JTextField();
		rollField.setBounds(1280,50,100,25);
		rollField.setEditable(false);
		frame.add(rollField);
		
		moneyField = new JTextField();
		moneyField.setBounds(1144,50,100,25);
		moneyField.setEditable(false);
		frame.add(moneyField);

		frame.setVisible(true);
	}
	
	public static int createOptionPane(String taxOptions[], String prompt, String payment) {
		return 0;
		//this is a placeholder for an unfinished method 
	}
	
	public static void main(String args[]){
		Interface interFace;
		interFace = new Interface();
	}
	
}