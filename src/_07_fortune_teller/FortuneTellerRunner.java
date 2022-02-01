package _07_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {

       
    
    static void begin() {
      	 // Welcome the user. Give them a hint for the secret location.
JOptionPane.showMessageDialog(null, "The game is simple.");
JOptionPane.showMessageDialog(null, "One goal, find Waldo.");
JOptionPane.showMessageDialog(null, "He has been evading his taxes for years.");
JOptionPane.showMessageDialog(null, "We have sent out many images were people have claimed to see him.");
JOptionPane.showMessageDialog(null, "We have put our best people on it, it wasnt working...");
JOptionPane.showMessageDialog(null, "So we published the images for everyone to find him, and gues what?");
JOptionPane.showMessageDialog(null, "People have made fake images since the internet made it into a game.");
JOptionPane.showMessageDialog(null, "There are so many fake sightings online but we recently got a sighting from someone working here.");
JOptionPane.showMessageDialog(null, "This is the most recent Waldo sighting, good luck finding him. You are going to need it.");
JOptionPane.showMessageDialog(null, "Hint* click anywere on the image to get a hint!");
    }
    public static void main(String[] args) throws Exception {
     	 SwingUtilities.invokeLater(new FortuneTeller());
     	 begin();
      }
}
