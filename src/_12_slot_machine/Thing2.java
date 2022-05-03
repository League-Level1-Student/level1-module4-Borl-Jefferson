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
import javax.swing.JPanel;
import javax.swing.Timer;

public class Thing2 extends JPanel implements ActionListener {
	
	BufferedImage con;
	BufferedImage git;
	BufferedImage java;
	BufferedImage []img;
	int fps=1000/8;
	Random r = new Random();
	int c1 = 0, c2=1, c3 = 2;
	Timer time;
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
	time.start();
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

		
	
	if(c1<5) {
		slot1=img[c3%img.length];
	}
	else if (c1< 50) {
		if(c1%2==0) {
			slot1=img[c3%img.length];
		
		}
		
	}
	slot2=img[c2%img.length];
	slot3=img[c1%img.length];
	c1++;
	c2++;
	c3++;


		repaint();
		
		if(e.getSource() == jebb) {
			
		}
	}
	
}
