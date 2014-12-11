public class Game {
	Player player1 = new Player();
	ComputerPlayer player2 = new ComputerPlayer();//computer
	Board currentBoard = new Board();
	char player1Turn;
	char player2Turn;
	boolean catsGame;
	
	public Board getCurrentBoard() {
		return currentBoard;
	}

	public void setCurrentBoard(Board currentBoard) {
		this.currentBoard = currentBoard;
	}

	public void playGame(){
		
		while(!currentBoard.chickenDinner()){
			boolean test = true;//is this the best way to do this potentially infinite while loop?
			while (test){
				player1Turn = player1.takeTurn();
				if(currentBoard.makeMove(player1Turn, 'x')){
					break;//if the player makes a valid move stop calling takeTurn on him/her
				}
				currentBoard.printBoard();
			}
			currentBoard.printBoard();	
			if(currentBoard.chickenDinner()){
				break;
			}
			while(test){
				player2Turn = player2.takeTurn(currentBoard);
				if(currentBoard.makeMove(player2Turn, 'o')){
					System.out.println("The computer player takes its turn");
					break;
				}
			}
			currentBoard.printBoard();
			
			catsGame = isCatsGame(currentBoard);
			if(catsGame){
				System.out.println("Womp Womp.. It's a tie.");
				break;
			}
		}
		if(!catsGame){
			System.out.println("Winner winner!");
		}
	}
	
	private boolean isCatsGame (Board board){
		boolean catsGame = true;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if (currentBoard.getCurrentBoard()[i][j] == ' '){
					catsGame = false;
				}
			}
		}
		return catsGame;
	}
}