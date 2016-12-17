
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Soundtrack to Life
Duration=1.00
Platform=Eclipse
Type=Recipe
Objectives=JOptionPane.showOptionDialog, playing videos
*/

/**
* If you can’t think of any, here are some you can use...
*    bit.ly/video-for-happy
*    bit.ly/video-for-sad
*    bit.ly/video-for-angry
*/

import java.net.URI;
import java.util.Random;

import javax.swing.JOptionPane;

public class SoundTrackToLife {

    public static void main(String[] args) {
    	
for (int i = 0; i > -1; i++) {
	int random = new Random().nextInt(6);

	
        // 1. Adjust this pop-up to find out what mood the user is in.
        int userMood = JOptionPane.showOptionDialog(null, "how do you feel?", "Let"
        		+ "s talk about feelings", 0,
                JOptionPane.WARNING_MESSAGE, null, new String[] { "good", "awesome", "sad" }, null);
        
        
        // 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);        // 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

        // 4. Play different songs for other moods.
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

        // If you are seeing ads at the beginning of your videos, install Adblock.

    }

    static void playVideo(String youTubeLink) {
        try {
            URI uri = new URI(youTubeLink);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
