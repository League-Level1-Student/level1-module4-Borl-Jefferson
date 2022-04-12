package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import sun.applet.Main;

public class SlotMathing {
	JFrame jeff = new JFrame();
	JPanel jepp = new JPanel();
	JButton jebb = new JButton();

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
		JLabel jell1 = createLabelImage("GitHubLogo.png");
		JLabel jell2 = createLabelImage("");
		JLabel jell3 = createLabelImage("");
		
		jepp.add(jebb);
		jepp.add(jell1);
		
		jeff.add(jepp);
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
}
