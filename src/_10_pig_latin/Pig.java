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
	boolean swap = false;
	JButton jebs = new JButton();
JButton jebl = new JButton();
	public void run() {
		jeff.setTitle("Look down there, not up here");
		jeff.setPreferredSize(new Dimension(1100, 150));
		jeff.setVisible(true);
		jebb.setText("-> Translate ->");
		jetfl.setPreferredSize(new Dimension(450, 30));
		jetfr.setPreferredSize(new Dimension(450, 30));
		jebs.setText("English");

		jebb.addActionListener(this);
		jebs.addActionListener(this);
		jepp.add(jetfl);

		jepp.add(jebb);
		jeff.add(jepp);
		jepp.add(jetfr);
		jepp.add(jebs);
	
		jeff.pack();

		// do stuff down here

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if (buttonpressed == jebb) {
			String oc = jetfl.getText();
			String ocr = jetfr.getText();

			PigLatinTranslator sho = new PigLatinTranslator();
			if (swap) {

				String eng = sho.translatePigLatinToEnglish(ocr);
				jetfl.setText(eng);
				
			} else {
				String lat = sho.translateEnglishToPigLatin(oc);
				jetfr.setText(lat);
			}
		}
		if (buttonpressed == jebs) {

			swap =! swap;
			jetfl.setText("");
			jetfr.setText("");
			if (swap == false) {
				jebs.setText("English");
			}
			else {
				jebs.setText("ig`Pay atin`Lay");
			}
		}

	}
}