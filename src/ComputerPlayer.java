import java.util.Random;

public class ComputerPlayer {
	
	Random rng = new Random();
	int i = 1;
	
	public char takeTurn(Board copyOfCurrentBoard){
		if(copyOfCurrentBoard.getCurrentBoard()[1][1]==' '){//it's usually good to start off in the middle box, so try that
			return 's';
		}
		
		int turnInt = rng.nextInt(9);	//otherwise, just go anywhere
		char turnChar = 'r';
		if(turnInt/i==0){
			turnChar = 'q';
		}
		if(turnInt/i==1){
			turnChar = 'w';
		}
		if(turnInt/i==2){
			turnChar = 'e';
		}
		if(turnInt/i==3){
			turnChar = 'a';
		}
		if(turnInt/i==4){//this will never do anything cause the center square is already full!
			turnChar = 's';
		}
		if(turnInt/i==5){
			turnChar = 'd';
		}
		if(turnInt/i==6){
			turnChar = 'z';
		}
		if(turnInt/i==7){
			turnChar = 'x';
		}
		if(turnInt/i==8){
			turnChar = 'c';
		}
		//the following algorithm will supersede the preceding "beginning of the game" algorithm

		//blocks in the center for two corner xs
		if(copyOfCurrentBoard.getCurrentBoard()[0][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[0][2]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[0][1] == ' '){
			return 'w';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[0][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][0]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[1][0] == ' '){
			return 'a';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[0][2]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][2]=='x' && 
				copyOfCurrentBoard.getCurrentBoard()[1][2] == ' '){
			return 'd';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[2][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][2]=='x' && 
				copyOfCurrentBoard.getCurrentBoard()[2][1] == ' '){
			return 'x';
		}
		
		//go for the block on a side
		if(copyOfCurrentBoard.getCurrentBoard()[0][1]=='x' && copyOfCurrentBoard.getCurrentBoard()[0][2]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[0][0] == ' '){
			return 'q';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[1][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][0]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[0][0] == ' '){
			return 'q';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[0][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[0][1]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[0][2] == ' '){
			return 'e';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[1][2]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][2]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[0][2] == ' '){
			return 'e';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[0][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[1][0]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[2][0] == ' '){
			return 'z';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[2][1]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][2]=='x' &&
				copyOfCurrentBoard.getCurrentBoard()[2][0] == ' '){
			return 'z';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[2][0]=='x' && copyOfCurrentBoard.getCurrentBoard()[2][1]=='x' && 
				copyOfCurrentBoard.getCurrentBoard()[2][2] == ' '){
			return 'c';
		}
		if(copyOfCurrentBoard.getCurrentBoard()[0][2]=='x' && copyOfCurrentBoard.getCurrentBoard()[1][2]=='x' && 
				copyOfCurrentBoard.getCurrentBoard()[2][2] == ' '){
			return 'c';
		}
		
		
		if(copyOfCurrentBoard.getCurrentBoard()[1][1]=='x'){//the human player started in the center square
			if(copyOfCurrentBoard.getCurrentBoard()[0][0] == 'x' && copyOfCurrentBoard.getCurrentBoard()[2][2] == ' '){
				return 'c';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[0][2] == 'x' && copyOfCurrentBoard.getCurrentBoard()[2][0] == ' '){
				return 'z';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[2][2] == 'x' && copyOfCurrentBoard.getCurrentBoard()[0][0] == ' '){
				return 'q';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[2][0] == 'x' && copyOfCurrentBoard.getCurrentBoard()[0][2] == ' '){
				return 'e';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[2][1] == 'x' && copyOfCurrentBoard.getCurrentBoard()[0][1] == ' '){
				return 'w';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[1][2] == 'x' && copyOfCurrentBoard.getCurrentBoard()[1][0] == ' '){
				return 'a';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[1][0] == 'x' && copyOfCurrentBoard.getCurrentBoard()[1][2] == ' '){
				return 'd';
			}
			if(copyOfCurrentBoard.getCurrentBoard()[0][1] == 'x' && copyOfCurrentBoard.getCurrentBoard()[2][1] == ' '){
				return 'x';
			}
		}		
		return turnChar;
	}
}