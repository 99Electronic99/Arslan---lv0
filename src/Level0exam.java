
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Level0exam {

	public static void main(String[] args) {
		Robot bob = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("what color would you like?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (color.equals("red")) {
			bob.setPenColor(Color.red);

			if (color.equals("green")) {
				bob.setPenColor(Color.green);

			}

		}
		// 2. set the pen width to 10
		bob.setPenWidth(10);
		// 1. make the Robot draw a shape
		bob.penDown();
		for (int i = 0; i < 4; i++) {

			bob.move(100);
			bob.turn(90);
		}
	}

}
