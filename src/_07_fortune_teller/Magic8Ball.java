package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int a = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(a);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("What question might you ask the mighty ball?");
	// 5. If the random number is 0
if (a == 0) {
	JOptionPane.showMessageDialog(null, "Yes.");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (a == 1) {
	JOptionPane.showMessageDialog(null, "Yesn't ( https://www.dictionary.com/e/slang/yesnt/ )");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (a == 2) {
	JOptionPane.showMessageDialog(null,  "I think Google will probrably know.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (a == 3) {
	JOptionPane.showMessageDialog(null, "I don'tn't posess the knoledge to present the information for you to intake so I cant'nt tell you if the answer you are looking for is yesn't or not a no.");
}
	// -- write your own answer
}
}
