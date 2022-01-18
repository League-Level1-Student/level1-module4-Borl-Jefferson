package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	JButton jebbj = new JButton();
	JButton jebbp = new JButton();
public static void main(String[] args) {
	
	
	
	
Chuckle_Clicker button = new Chuckle_Clicker();
button.makebuttons();
}
	void makebuttons() {
		
			JFrame jeff = new JFrame();
			jeff.setVisible(true);
			JPanel jepp = new JPanel();
			jebbj.setText("Joke");
			jebbp.setText("Punchline");
			
			jepp.add(jebbj);
			jepp.add(jebbp);
			jeff.add(jepp);
			jebbj.addActionListener(this);
			jebbp.addActionListener(this);
			jeff.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	if(e.getSource() == jebbj) {
		JOptionPane.showMessageDialog(null, "What is the best thing about Sweden?");
	}
	if(e.getSource() == jebbp) {
		JOptionPane.showMessageDialog(null, "I don't know but the flag is a big plus.");
	}

	}
}
