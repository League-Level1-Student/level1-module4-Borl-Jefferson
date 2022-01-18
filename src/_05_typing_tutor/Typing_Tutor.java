package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel jell = new JLabel;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	char currentLetter;
public static void main(String[] args) {
	
}
void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	currentLetter = generateRandomLetter();
	jell.setText(currentLetter);
}
}
