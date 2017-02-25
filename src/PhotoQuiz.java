

	 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String image = "https://lumiere-a.akamaihd.net/v1/images/Darth-Vader_6bda9114.jpeg?region=0%2C23%2C1400%2C785&width=768";
			// 2. create a variable of type "Component" that will hold your image
Component url;
			// 3. use the "createImage()" method below to initialize your Component
url = createImage(image);
			// 4. add the image to the quiz window
quizWindow.add(url);
			// 5. call the pack() method on the quiz window
quizWindow.pack();
			// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Is this Darth Vader? (answer yes or no)");
			// 7. print "CORRECT" if the user gave the right answer
if (question.equals("yes")) {
	System.out.println("correct");
	
}
			// 8. print "INCORRECT" if the answer is wrong
if (question.equals("no")) {
	System.out.println("Incorrect");
	
}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(url);
			// 10. find another image and create it (might take more than one line of code)
String image2 = "http://vignette2.wikia.nocookie.net/p__/images/4/48/Luke_Skywalker_ROTJ.png/revision/latest?cb=20150807150222&path-prefix=protagonist";
			Component url2;
			url2 = createImage(image2);
// 11. add the second image to the quiz window
			quizWindow.add(url2);

			// 12. pack the quiz window
			quizWindow.pack();

			// 13. ask another question
			String question2 = JOptionPane.showInputDialog("is this guy from the Lord of the Rings?");

			// 14+ check answer, say if correct or incorrect, etc.
			if (question2.equals("yes")) {
				System.out.println("incorrect");
				
				
			}
			if (question2.equals("no")) {
				System.out.println("correct");
				
			}

		}

		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	}






