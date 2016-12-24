
import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cats = JOptionPane.showInputDialog("how many cats do you have?");
		// 2. Convert their answer into an int
int x = Integer.parseInt(cats);

		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (x>3) {
	JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
	
}
if (x>=100) {
	JOptionPane.showMessageDialog(null, "YOU ARE THE ULTRA CAT LADY");
	
}
		// 4. If they have 3 or less, call the method below to show them a cat video
if (x<=3) {
	playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
	
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if (x==0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
			
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
