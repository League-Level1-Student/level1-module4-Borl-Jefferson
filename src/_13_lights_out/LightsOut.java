package _13_lights_out;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener, MouseWheelListener {
	JFrame jeff = new JFrame();
	int check = 0;
	JPanel jepp = new JPanel();
	Light[] jl = new Light[26];
	Random r = new Random();

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		// 1. Make your jepp a 5x5 grid with setLayout(new GridLayout(5, 5));
		jepp.setLayout(new GridLayout(5, 5));

		// 2. Add 25 JLabels to your jepp (these are your lights)

		// 3. Use setText() to add a position number to each light (0-24).
		for (int i = 0; i < 25; i++) {
			JLabel j = new JLabel();
			j.setText("" + i);
			j.setBackground(Color.LIGHT_GRAY);
			j.setOpaque(true);
			j.addMouseListener(this);
			j.addMouseWheelListener(this);

			jepp.add(j);
			jl[i] = new Light(j);
		}

		jeff.add(jepp);
		jeff.setPreferredSize(new Dimension(500, 500));
		jeff.setVisible(true);
		jeff.pack();
		// 4. Set the background of each light to LIGHT_GRAY
		// - you will also have to set the background to opaque.
		// - Use light.setOpaque(true);

		// 5. Add a mouseListener to each light

		// 6. Add your panel to a frame

		// 7. Set the size of the frame
		int f1 = r.nextInt(24);
		int f2 = r.nextInt(24);
		toggle((jl[f2]));
		toggle((jl[f1]));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
     
System.out.println("part of it works at least");
		for (int i = 0; i < 25; i++) {
			if (e.getSource() == jl[i].jell) {
				makeMove(i);
System.out.println(i);
			}

			/*
			if (jl[i].on) {
				check += 1;
			} else {
				dbg += i + ", ";

			}*/
		}


		// 2. Get the number (position) of the light

		// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) jepp.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) jepp.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) jepp.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) jepp.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) jepp.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) jepp.getComponent(lightPosition);
	}

	void toggle(JLabel jell) {

		for (int i = 0; i < jl.length; i++) {
			if (jl[i].jell == jell) {
				toggle(jl[i]);
				break;
			}
		}
	}

	void toggle(Light light) {
		if (light.jell.getBackground() == Color.WHITE) {
			light.jell.setBackground(Color.LIGHT_GRAY);
			light.on = false;

		} else {
			light.jell.setBackground(Color.WHITE);
			light.on = true;
		}
	}

	class Light {
		JLabel jell;
		boolean on;

		Light(JLabel jell) {

			this.on = false;
			this.jell = jell;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; i++) {

			if (e.getSource() == jl[i].jell) {
				toggle(jl[i]);
			}
		}
	}
}
