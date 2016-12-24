import java.util.Random;

import javax.swing.JOptionPane;

public class OptionDialog {

public static void main(String[] args) {
	

    	
for (int i = 0; i > -1; i++) {
	int random = new Random().nextInt(6);

	
        // 1. Adjust this pop-up to find out what mood the user is in.
        int userMood = JOptionPane.showOptionDialog(null, "how do you feel, choose:","colors", 0, 
                JOptionPane.WARNING_MESSAGE, null, new String[] { "good", "awesome", "sad" }, null);
        
        
        // 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);        // 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

        // 4. Poods.
if (userMood==2) {
	JOptionPane.showMessageDialog(null, "I am glad you feel good");
	
}
if (userMood==1) {
	JOptionPane.showMessageDialog(null,"YEAH!@ Let's ROCK");
	
}
if (userMood==0) {
	JOptionPane.showMessageDialog(null, "I feel bad for you ;( ");
	

}
}
}
}



