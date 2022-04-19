package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import sun.applet.Main;

public class SlotMathing implements ActionListener {
	JFrame jeff = new JFrame();
	JPanel jepp = new JPanel();
	JButton jebb = new JButton(); 
	Random r = new Random();
	JLabel jell = new JLabel();
	JLabel jell1 = new JLabel();
	JLabel jell2 = new JLabel();
	ImageIcon git = new ImageIcon("GitHubLogo.png");
	ImageIcon con = new ImageIcon("constitution.jpeg");
	ImageIcon java = new ImageIcon("javalogo.png");
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	public void run() throws MalformedURLException {
		jell = createLabelImage("javalogo.png");
		jell2 = createLabelImage("GitHubLogo.png");
		jell1 = createLabelImage("constitution.jpeg");
		
		jepp.add(jebb);
		jepp.add(jell1);
		jell1.setPreferredSize(new Dimension (175, 175));
		jepp.add(jell2);
		jell2.setPreferredSize(new Dimension (175, 175));
		jepp.add(jell);
		jell.setPreferredSize(new Dimension (175, 175));
		jeff.add(jepp);
		jebb.addActionListener(this);
		jeff.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		try {
			new SlotMathing().run();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		
		//for (int i = 0; i < 4; i++) {
			
			int rf = r.nextInt(2);
		int rf2 = r.nextInt(2);
		int rf3 = r.nextInt(2);
	
		
			
			
		if (rf == 1) {
			git.getImage().flush();
			jell1.setIcon(git);
		}
		if (rf == 2) {
			git.getImage().flush();
			jell1.setIcon(con);
		}
		if (rf == 0) {
			git.getImage().flush();
			jell1.setIcon(java);
		}
		
	//	for (int j = 0; j < 3; j++) {
			
	//	}
		
		
		if (rf == 1) {
			git.getImage().flush();
			jell.setIcon(git);
		}
		if (rf == 2) {
			git.getImage().flush();
			jell.setIcon(con);
		}
		if (rf == 0) {
			git.getImage().flush();
			jell.setIcon(java);
		}
		
		
		if (rf == 1) {
			git.getImage().flush();
			jell2.setIcon(git);
		}
		if (rf == 2) {
			git.getImage().flush();
			jell2.setIcon(con);
		}
		if (rf == 0) {
			git.getImage().flush();
			jell2.setIcon(java);
	//	}

		
		
		}
	}
}
