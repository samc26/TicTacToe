import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;


public class Board {
	public Board(){
		//public constructor
	}	
		
	private char[][] currentBoard = new char[][]{
		{' ',' ',' '},
		{' ',' ',' '},
		{' ',' ',' '}
	};
	
	public boolean makeMove(char position,char type){
		int[] coordinates = {0,0};
		if (position == 'q'){
			coordinates[0] = 0;
			coordinates[1] = 0;
		}
		if (position == 'w'){
			coordinates[0] = 0;
			coordinates[1] = 1;
		}
		if (position == 'e'){
			coordinates[0] = 0;
			coordinates[1] = 2;
		}
		if (position == 'a'){
			coordinates[0] = 1;
			coordinates[1] = 0;
		}
		if (position == 's'){
			coordinates[0] = 1;
			coordinates[1] = 1;
		}
		if (position == 'd'){
			coordinates[0] = 1;
			coordinates[1] = 2;
		}
		if (position == 'z'){
			coordinates[0] = 2;
			coordinates[1] = 0;
		}
		if (position == 'x'){
			coordinates[0] = 2;
			coordinates[1] = 1;
		}
		if (position == 'c'){
			coordinates[0] = 2;
			coordinates[1] = 2;
		}
		if (currentBoard[coordinates[0]][coordinates[1]] == ' '){
			currentBoard[coordinates[0]][coordinates[1]] = type;
			return true;
		}
		if (currentBoard[coordinates[0]][coordinates[1]] != ' '){
			//System.out.println("Not a legal move! -_-");
			return false;
		}
		return false;
	}
	
	public boolean chickenDinner(){
		for(int i = 0; i < 3; i++){
			if(currentBoard[0][i]== 'x' && currentBoard[1][i]== 'x' && currentBoard[2][i]== 'x'){
				return true;
			}
			if(currentBoard[0][i]== 'o' && currentBoard[1][i]== 'o' && currentBoard[2][i]== 'o'){
				return true;
			}
			if(currentBoard[i][0]== 'x' && currentBoard[i][1]== 'x' && currentBoard[i][2]== 'x'){
				return true;
			}
			if(currentBoard[i][0]== 'o' && currentBoard[i][1]== 'o' && currentBoard[i][2]== 'o'){
				return true;
			}
		}
		if(currentBoard[0][0] == 'x' && currentBoard[1][1]=='x' && currentBoard[2][2]=='x'){
			return true;
		}
		if(currentBoard[0][0] == 'o' && currentBoard[1][1]=='o' && currentBoard[2][2]=='o'){
			return true;
		}
		if(currentBoard[2][0] == 'x' && currentBoard[1][1]=='x' && currentBoard[0][2]=='x'){
			return true;
		}
		if(currentBoard[2][0] == 'o' && currentBoard[1][1]=='o' && currentBoard[0][2]=='o'){
			return true;
		}
		return false;
	}
	
	public char[][] getCurrentBoard() {
		return currentBoard;
	}

	public void setCurrentBoard(char[][] currentBoard) {
		this.currentBoard = currentBoard;
	}

	public void printBoard(){
		for (int i = 0; i<3; i++){
		    for (int j = 0; j<3; j++){
		        System.out.print(currentBoard[i][j] + " ");
		    }
		    System.out.print('\n');
		}
	}
}