import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class endTurnClick {

	public static void main(String[] args) {
		JButton endTurnClick = new JButton("End Turn");
		endTurnClick.setBounds(0,0, 0,0);//must position
		endTurnClick.setVisible(true);
		endTurnClick.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					Turn.endTurn()
		}
		});
		
	}
	
}
