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
    }
    public static void main(String[] args) throws Exception {
     	 SwingUtilities.invokeLater(new FortuneTeller());
     	 begin();
      }
}
