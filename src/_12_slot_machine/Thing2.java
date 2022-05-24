package _12_slot_machine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Thing2 extends JPanel implements ActionListener {
	
	//add a skip feature
	BufferedImage con;
	BufferedImage git;
	BufferedImage java;
	BufferedImage []img;
	int fps=1000/8;
	Random r = new Random();
	int c1 = 0, c2=1, c3 = 2;
	int d1, d2, d3, d12, d22, d32;
	int score = 12;
	Timer time;
	int t =1;
String co;
	
	JPanel jepp = new JPanel();
	JButton jebb = new JButton();
	BufferedImage slot1, slot2, slot3;
	public static void main(String[] args) {
		new Thing2();

	}

	public Thing2() {
		loadImage();
		JFrame jeff = new JFrame();
		jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeff.setVisible(true);
		this.add(jebb);
		jebb.addActionListener(this);
		jeff.add(this);
		jeff.setPreferredSize(new Dimension(705, 500));
		jeff.pack();
	slot1=git;
	img = new BufferedImage[] {con, git, java};
		time = new Timer(fps, this);
	//time.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		
		g.drawImage(slot1, 10, 10, 225, 225, null);
		g.drawImage(slot2, 235, 10, 225, 225, null);
		g.drawImage(slot3, 460, 10, 225, 225, null);
		
		
	}
	void loadImage() {

	        try {
	            con = ImageIO.read(this.getClass().getResourceAsStream("constitution.png"));
	            git = ImageIO.read(this.getClass().getResourceAsStream("GitHubLogo.png"));
	            java = ImageIO.read(this.getClass().getResourceAsStream("javalogo.png"));
	   System.out.println("it works 2");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("it works 3");
	        }
	      
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(score > 0) {
		if(e.getSource() == jebb && time.isRunning() == false) {
			time.start();
			c1 = 0;
			c2 =0;
			c3 =0;
			JOptionPane.showMessageDialog(null, "-2 tokens.");
			score -=2;
			if (score < 0) {
				score = 0;
			}
			System.out.println(score + " tokens remaining.");
		
			}
		else {
		d1 =0;
		d2=0;
		d3=0;
		
		d12=0;
		d22=0;
		d32=0;
		 d1 = r.nextInt(13-7)+7;
		 d2 = r.nextInt(18-12)+12;
		 d3 = r.nextInt(23-17)+17;
		
		 d12 = r.nextInt(55-45)+45;
		 d22 = r.nextInt(65-55)+55;
		 d32 = r.nextInt(83-73)+73;
		 
	if(c1<d1) {
		slot1=img[c3%img.length];
	}
	else if (c1< d12) {
		if(c1%2==0) {
			slot1=img[c3%img.length];
		
		}
		
	}
	if(c2<d2) {
		slot2=img[c2%img.length];
	}
	else if (c2< d22) {
		if(c2%2==0) {
			slot2=img[c2%img.length];
		
		}
		
	}
	if(c3<d3) {
		slot3=img[c1%img.length];
	}
	else if (c3< d32) {
		if(c3%2==0) {
			slot3=img[c1%img.length];
		
		}
		
	}
	//slot2=img[c2%img.length];
	//slot3=img[c1%img.length];
	c1++;
	c2++;
	c3++;
	if ( time.isRunning()==true) {

	}
	if(c1 > d12 && c2 > d22 && c3 > d32) {
		if (slot1 == slot2 && slot2 == slot3) {
		JOptionPane.showMessageDialog(null, "3 in a row! + 30 tokens!");
			score +=30;	
		if(slot1==con) {
			JOptionPane.showConfirmDialog(null, "It was a jackpot! + 15 more tokens!");
			score +=15;
		
		}
		System.out.println(score + " tokens remaining.");
		}
		else	if (slot1 != slot2 && slot2 != slot3 && slot3!=slot1) {
			JOptionPane.showMessageDialog(null, "All are unique! + 10 tokens!");
	score +=10;
	
	System.out.println(score + " tokens remaining.");
		}
		
		
		else{
			JOptionPane.showMessageDialog(null, "That roll wasn't special. :(");
			
		}

		time.stop();
	}

		repaint();

		}
		

	
	}
	else{
		co = JOptionPane.showInputDialog("You've ran out of tokens, would you like to continue playing? Type \"yes\" to restart or \"no\" to stop. ");
		
		if(co.equals ("yes")) {
			score = 10;
		}
		else {
			System.exit(0);
		}
		}
	}
	
}
