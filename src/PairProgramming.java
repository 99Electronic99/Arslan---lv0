import java.util.Scanner;

public class PairProgramming {
public static void main(String[] args) {
	
	Scanner kb = new Scanner(System.in);
	for(int i=1;i<10000;i++){
		
		
	System.out.println("It is the 6th century. your castle is under siege. And you are trying to escape. ");
	
	System.out.println("There is a yellow door to your left, and there a black door to your right, where will you go?");
	String answer = kb.next();
	if (answer.equals("yellow")){
		System.out.println("a raider was waiting for you behind the door and you die. The End");
		
	}
	else if(answer.equals("black")){
		System.out.println("you run into some friendly guards and they tell you to go to the dungeon, and enter the secret door that leads to the nearest village, will you go?");
	String answer3 = kb.next();
		if (answer3.equals("yes")) {
			System.out.println("you try and find the door do you go down left hall or right");
			String answer5 = kb.next();
			if (answer5.equals("left")){
				System.out.println("you go down the hall and you run into some raiders and you fight like an idiot and die.");
			}
			else if (answer5.equals("right")){
				System.out.println("you find the door and go to the other village, but it was already destroyed. Some of the raiders are still there and they kill you. And if you didn't notice, you died");
			}
				
			
		}
		else if (answer3.equals("no")){
			System.out.println("you say that it is too dangerous and you go behind a banner to hide. Then you find another secret door do you go in?");
			String answer4 = kb.next();
			if (answer4.equals("yes")){
				System.out.println("you go to the other village and you win, congrats!!");
			}
			else if (answer4.equals("no")){
				System.out.println("the raiders get through to your room and you are surrounded and die.");
			}
		}
	}
	
	else { System.out.println("sorry, I did not quite get that. Please answer using ONLY the color");
	
	String elseanswer = kb.next();
	if (elseanswer.equals("yellow")){
		System.out.println("a raider was waiting for you behind the door and you die. The End");
	}
	else if(elseanswer.equals("black")){
		System.out.println("you run into some friendly guards and they tell you to go to the dungeon, and enter the secret door that leads to the nearest village, will you go?");
	String answer3 = kb.next();
		if (answer3.equals("yes")) {
			System.out.println("there are enemies waiting for you on the other side. You fight like an idiot and die");
			
		}
		else if (answer3.equals("no")){
			System.out.println("you say that it is too dangerous and you go behind a banner to hide. Then you find another secret door do you go in?");
			String answer4 = kb.next();
			if (answer4.equals("yes")){
				System.out.println("you go to the other village and you win, congrats!!");
			}
			else if (answer4.equals("no")){
				System.out.println("the raiders get through to your room and you die.");
			}
		}
	}
	}
	}
	
	}
}



