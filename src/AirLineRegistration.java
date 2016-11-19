

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirLineRegistration {
	public static void main(String[] args) {
		String Firstname = JOptionPane.showInputDialog("what is your first name?");
		String LastName = JOptionPane.showInputDialog("what is your last name?");
		String Destination = JOptionPane.showInputDialog("what is you Destination Airport?");
		String Birthday = JOptionPane.showInputDialog("what is your birthday? (only for security purposes)");
		String Gender = JOptionPane.showInputDialog("are you male or female? (also only for security purposes");
	
		System.out.println(LastName+"/"+Firstname+"("+Birthday+" , "+ Gender+")"+"\nTraveling to:"+Destination);
	}
}






/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
