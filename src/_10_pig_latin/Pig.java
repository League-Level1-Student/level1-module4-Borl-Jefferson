package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig implements ActionListener {
	JFrame jeff = new JFrame();
	JPanel jepp = new JPanel();
	JButton jebb = new JButton();
	JTextField jetfl = new JTextField();
	JTextField jetfr = new JTextField();

	public void run() {
		jeff.setTitle("Look down there, not up here");
		jeff.setPreferredSize(new Dimension (1100, 150));
		jeff.setVisible(true);
			jebb.setText("-> Translate ->");
		jetfl.setPreferredSize(new Dimension (450, 30));
		jetfr.setPreferredSize(new Dimension (450, 30));

			jebb.addActionListener(this);
			jepp.add(jetfl);
			
			jepp.add(jebb);
			jeff.add(jepp);
			jepp.add(jetfr);
			jeff.pack();
			//do stuff down here
			
		
			
			
			
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String oc = jetfl.getText();	
		
		PigLatinTranslator sho = new PigLatinTranslator();
		String lat = sho.translate(oc);
		jetfr.setText(lat);
	}
}