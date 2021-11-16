package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class The_Thing_I_Did_For_This_Thing implements ActionListener {

		
	

	

	//basicly the same thing as the click me thing exept have a different thing
	//happen when click happens
	JButton trick = new JButton();
	JButton treat = new JButton();
	public void yes() {

JFrame jeff = new JFrame();
JPanel jepp = new JPanel();
jeff.add(jepp);
jeff.setVisible(true);
treat.setText("Treat!");
treat.addActionListener(this);
trick.setText("Trick!");
trick.addActionListener(this);
jepp.add(trick);
jepp.add(treat);
jepp.setPreferredSize(new Dimension(250, 150));
treat.setPreferredSize(new Dimension(100,100));
trick.setPreferredSize(new Dimension(100,100));
jeff.pack();
jeff.setTitle("The c̶a̶k̶e̶ button is a lie");






}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == (treat)) {
	System.out.println("it works treat");
	showPic("https://cdn.vox-cdn.com/thumbor/szAeSd3G6D2GBnBxx1MeHILKtGg=/0x51:639x477/1200x800/filters:focal(0x51:639x477)/cdn.vox-cdn.com/uploads/chorus_image/image/49292097/bsodwindows10.0.0.jpg");
	}
	if (buttonPressed == (trick)) {
		System.out.println("it works trick");
	showPic("https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg");
	}
	}
	private void showPic(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	        frame.setPreferredSize(new Dimension(2000, 4500));
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	}

 


