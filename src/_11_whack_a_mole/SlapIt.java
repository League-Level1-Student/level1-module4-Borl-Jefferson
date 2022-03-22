package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
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
double score = 0;
	int perc;
	double oscore;
	double fscore;
	double total;
	int hun = 100;
	double fail = 0;
	long tabms;
	long taems;
  
Random r = new Random(System.nanoTime());
int rf = r.nextInt(jb.length);
	public static void main(String[] args) {
		new SlapIt().run();

	}

	public void run() {
jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeff.add(jepp);
		jeff.pack();
	
		

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
tabms=System.currentTimeMillis();
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
total = score + fail;
oscore = score/total;
fscore = oscore * 100;

System.out.println(fscore);
System.out.println(fail + ", " + score);
		} else {
			JOptionPane.showMessageDialog(null, "You missed.");
			//score = 0;
			//oscore=score-1;
			//perc=100/score;
				fail++;
				total = score + fail;
				oscore = score/total;
				fscore = oscore * 100;

				System.out.println(fscore);
				System.out.println(fail + ", " + score);
			//fscore=perc*oscore;
		}
		taems = System.currentTimeMillis();
		long tt = (taems - tabms) / 1000;
		//tt += 215;
		long ttf = tt/60;
		int min = 0;
			
		
		for (int i = 0; i < ttf; i++) {
			
		
		if(ttf > 0) {
			tt -= 60;
			min++;
		}
		}
		if (min == 0) {
		System.out.println(tt + " seconds");
		}
		else {
			if (tt < 10) {
				
			
			System.out.println(min + ":0" + tt);
		}
			else {
				System.out.println(min  + ":" + tt);
			}
		}
	}
}
