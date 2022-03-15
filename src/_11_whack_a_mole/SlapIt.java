package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlapIt implements ActionListener {
	String set = "";
	JFrame jeff = new JFrame();
	JPanel jepp = new JPanel();
	int mo = 0;
	{
		String am = JOptionPane.showInputDialog("How many moles?");
		 mo = Integer.parseInt(am);
	}
	JButton[] jb = new JButton[mo];

	int check = 7;
	int store = 7;
	int score = 1;
	int perc;
	int oscore;
	int fscore;
	int fail = 1;
Random r = new Random(System.nanoTime());
int rf = r.nextInt(jb.length);
	public static void main(String[] args) {
		new SlapIt().run();

	}

	public void run() {

		jeff.add(jepp);
		jeff.pack();
	
		System.out.println(score);

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton();
			jb[i].addActionListener(this);
		}
		jeff.setVisible(true);
		for (int i = 0; i < jb.length; i++) {
			jepp.add(jb[i]);
		}
		jeff.add(jepp);
		jeff.setSize(300, 200);
		jeff.pack();
			jeff.setSize(300, 200);
		jb[rf].setText("Hit");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == jb[rf]) {
		
				store = rf;
			
	
				rf = r.nextInt(jb.length);
			
					jb[store].setText(" ");
			jb[rf].setText("Hit");
	
			check = 3;

score++;
System.out.println(score);
fail = fail/score;
fscore = 100/fail;
			System.out.println(fscore + "%");
			System.out.println(" ");

		} else {
			JOptionPane.showMessageDialog(null, "You missed.");
			//score = 0;
			oscore=score-1;
			perc=100/score;
				
			fscore=perc*oscore;
		}
	}
}
