
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;


/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {


		// 1. Save the superpower for each person in a variable.
	String SuperPower = "Being Lucky";
	String SuperPowertwo = "going thru things";
	String SuperPowerthree = "making money";
	String SuperPowerFive = "flying";


		// 2. Ask the user to enter a name. Store their answer in a variable.
	String number = JOptionPane.showInputDialog(" if you want to know what superpower you have type in a number from one to four, in letter form please");

		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (number.equals("one")) {
	JOptionPane.showMessageDialog(null, SuperPower);
}
	
if (number.equals("two")) {
	

JOptionPane.showMessageDialog(null, SuperPowertwo);
	}
if (number.equals("three")) {
	JOptionPane.showMessageDialog(null, SuperPowerthree);
}
if (number.equals("four")) {
	JOptionPane.showMessageDialog(null, SuperPowerFive);

}
	
}
}




