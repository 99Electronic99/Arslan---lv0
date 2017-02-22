import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class The3numbers {
	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog("please type in 1 number");
		String number2 = JOptionPane.showInputDialog("please enter one more number");
		String number3 = JOptionPane.showInputDialog("please type in the third number");
		int numberone = Integer.parseInt(number1);
		int numbertwo = Integer.parseInt(number2);
		int numberthree = Integer.parseInt(number3);

		if (numberone < numbertwo && numberone < numberthree) {
			if (numbertwo < numberthree) {
				System.out.println(numberone + " " + numbertwo + " " + numberthree);
			}
			else if (numberthree<numbertwo) {
				System.out.println(numberone + " " + numberthree + " " + numbertwo);
				
			}
		}
		if (numbertwo < numberone && numbertwo < numberthree) {
			if (numberone < numberthree) {
				System.out.println(numbertwo + " " + numberone + " " + numberthree);
			}
			else if (numberthree<numberone) {
				System.out.println(numbertwo + " " + numberthree + " " + numberone);
			}
		}
		if (numberthree < numberone && numberthree < numbertwo) {
			if (numberone < numbertwo) {
				System.out.println(numberthree + " " + numberone + " " + numbertwo);

			}
			else if (numbertwo<numberone) {
				System.out.println(numberthree + " " + numbertwo + " " + numberone);
			}
		}

	}
}
