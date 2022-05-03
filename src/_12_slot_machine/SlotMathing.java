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
import javax.swing.JOptionPane;
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
	ImageIcon con = new ImageIcon("constitution.png");
	ImageIcon java = new ImageIcon("javalogo.png");
	int rf = r.nextInt(3);
	int rf2 = r.nextInt(3);
	int rf3 = r.nextInt(3);

	private JLabel createLabelImage(String fileName) {
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
		jell1 = createLabelImage("constitution.png");
		jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jepp.add(jebb);
		jepp.add(jell1);
		jell1.setPreferredSize(new Dimension(175, 175));
		jepp.add(jell2);
		jell2.setPreferredSize(new Dimension(175, 175));
		jepp.add(jell);
		jell.setPreferredSize(new Dimension(175, 175));
		jeff.add(jepp);
		jebb.addActionListener(this);
		jeff.setVisible(true);
		jeff.pack();

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
		
		jepp.removeAll();
		jepp.add(jebb);
		for (int i = 0; i < 3; i++) {
			jell1 = null;
			float dell = r.nextInt(5);
			long st = System.currentTimeMillis();

			while ((System.currentTimeMillis() - st) / 1000 < dell) {
				if (jell1 != null) {

					jepp.remove(jell1);
					jeff.pack();
					jeff.revalidate();
					jeff.repaint();
					jepp.revalidate();
					jepp.repaint();
				}
				rf2 = r.nextInt(3);
				if (rf2 == 1) {
					git.getImage().flush();
					jell1 = createLabelImage("GitHubLogo.png");
				} else if (rf2 == 2) {
					git.getImage().flush();
					jell1 = createLabelImage("constitution.png");
				} else if (rf2 == 0) {
					git.getImage().flush();
					jell1 = createLabelImage("javalogo.png");

				}
				jepp.add(jell1);

				jeff.pack();
				jeff.revalidate();
				jeff.repaint();
				jepp.revalidate();
				jepp.repaint();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println(jell1);
		}
		/*
		 * if (rf3 == 1) { git.getImage().flush(); jell =
		 * createLabelImage("GitHubLogo.png"); } if (rf3 == 2) { git.getImage().flush();
		 * jell = createLabelImage("constitution.png"); } if (rf3 == 0) {
		 * git.getImage().flush(); jell = createLabelImage("javalogo.png"); }
		 * 
		 * if (rf == 1) { git.getImage().flush(); jell2 =
		 * createLabelImage("GitHubLogo.png"); } if (rf == 2) { git.getImage().flush();
		 * jell2 = createLabelImage("constitution.png"); } if (rf == 0) {
		 * git.getImage().flush(); jell2 = createLabelImage("javalogo.png"); }
		 * 
		 * jepp.add(jebb); jepp.add(jell); jepp.add(jell2); jepp.add(jell1);
		 * 
		 * jeff.pack();
		 */
		
		if (rf == rf2) {
			if (rf3 == rf) {
				JOptionPane.showMessageDialog(null, "You Won!");
			}
		}

	}
}
