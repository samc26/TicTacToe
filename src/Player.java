import java.util.Scanner;

public class Player {

	Game currentGame;
	Scanner keyboard = new Scanner(System.in);	
		
	public char takeTurn(){
		char turnChar;
		System.out.println("Where do you want to move?");
		String input =  keyboard.next();
		turnChar = input.charAt(0);
		return turnChar;
	}
}