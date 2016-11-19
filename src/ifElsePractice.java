import javax.swing.JOptionPane;

public class ifElsePractice {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {

			String happy = JOptionPane.showInputDialog("Are you happy?");
			if (happy.equals("yes")) {

				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");

			} else {

				if (happy.equals("no")) {
					String want = JOptionPane.showInputDialog("do you want to be happy?");
					if (want.equals("no")) {
						JOptionPane.showConfirmDialog(null, "Keep Doing whatever you are doing");
					} else {
						JOptionPane.showConfirmDialog(null, "Change Something");

					}

				}

			}
		}
	}
}
