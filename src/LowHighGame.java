 import java.util.Random;

import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class LowHighGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
			
		
		int random = new Random().nextInt(101);
		for (int i = 0; i < 10; i++) {
		// 2. Print out the random variable above
		System.out.println(random);
		String awnser = JOptionPane.showInputDialog("is this number too high, too low or is it the right one?");
		
		if (awnser.equals("too high")) {
				 random = new Random().nextInt(random);
		}
		 if (awnser.equals("too low")) {
				random = new Random().nextInt(random)+random;
			}
		 if (awnser.equals("yes")) {
				System.out.println("the computer guessed your number");
			}
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 


			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low


		// 12. tell them they lose
	}
	}

}




