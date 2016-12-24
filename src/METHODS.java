import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.teachingextensions.logo.Tortoise;

public class METHODS {
	
 
 public static void main(String[] args) {
	 for (int i = 0; i > 1; i--) {
		
	}
	 Tortoise.setSpeed(10);
String Sides =	JOptionPane.showInputDialog("how many sides?");
	int numSides = Integer.parseInt(Sides);
	drawShape(numSides);
}
 private static void drawSquare(){
	 for (int i = 0; i < 4; i++) {
			
			
			Tortoise.move(40);
			Tortoise.turn(360/4);
			 }
 }
 private static void drawTriangle(){
	 for (int i = 0; i < 3; i++) {
		 Tortoise.move(40);
			Tortoise.turn(360/3);
	}
 }
 private static void drawCircle()
 {
	 for (int i = 0; i < 360; i++) {
		
	
	 Tortoise.move(2);
		Tortoise.turn(360/360);
	 }
 }
 private static void drawShape (int numSides){
	 for (int i = 0; i < numSides; i++) {
		 Tortoise.move(40);
		 Tortoise.turn(360/numSides);
		
	}
 }
 }
 
 
 

