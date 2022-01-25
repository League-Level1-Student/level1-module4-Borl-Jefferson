package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel jell = new JLabel();
	String string = ".";
	int score;
	int perc;
	int oscore;
	int fscore;

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'A');
	}
	char currentLetter;


void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	currentLetter = generateRandomLetter();
	
	jell.setText(currentLetter + string);
	jell.setFont(jell.getFont().deriveFont(400.0f));
	jell.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	panel.add(jell);
	frame.add(panel);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	score++;
	System.out.println(fscore);
	if ((Character.toLowerCase(e.getKeyChar())) ==
			(Character.toLowerCase(currentLetter))) {
	currentLetter = generateRandomLetter();
	jell.setText(currentLetter + string);
	panel.setBackground(Color.GREEN);
	}
	else {
		panel.setBackground(Color.RED);	
		
		
	oscore=score-1;
	perc=100/score;
		
	fscore=perc*oscore;
	}
	}


}


