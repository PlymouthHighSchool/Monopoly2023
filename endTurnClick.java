		JButton endTurnClick = new JButton("End Turn");
		endTurnClick.setBounds(0,0, 0,0);//must position
		endTurnClick.setVisible(true);
		endTurnClick.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					Turn.endTurn()
		}
		});
