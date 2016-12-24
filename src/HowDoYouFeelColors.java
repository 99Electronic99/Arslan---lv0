import java.util.Random;

import javax.swing.JOptionPane;

public class HowDoYouFeelColors {




public static void main(String[] args) {
	

    	
for (int i = 0; i > -1; i++) {
	int random = new Random().nextInt(6);

	
        // 1. Adjust this pop-up to find out what mood the user is in.
        int userMood = JOptionPane.showOptionDialog(null, "what is your favorite color, choose:","colors", 0, 
                JOptionPane.WARNING_MESSAGE, null, new String[] { "red", "blue", "green" }, null);
   if (userMood==0) {
	   JOptionPane.showMessageDialog(null, "you picked red");
   }
   if (userMood==1) {
	   JOptionPane.showMessageDialog(null, "you picked blue");
   }
   if (userMood==2) {
	JOptionPane.showMessageDialog(null, "you picked green");
}
	
}
	
}

}





