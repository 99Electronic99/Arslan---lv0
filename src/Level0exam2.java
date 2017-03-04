
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class Level0exam2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("how old are you?");
		int age1 = Integer.parseInt(age);
		int year;
		year = 2017 - age1;
		System.out.println("you were born in" + year);
		if (age1 > 30) {
			System.out.println("you are too old to play this game");

		} else {
			System.out.println("you can play this game");
		}
	}
}
