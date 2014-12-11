
public class TicTacToe {

	public static void main(String[] args) {
		/*TODO:
		 * create User class with login, password, totalwins
		 */
		System.out.println("Let's play TicTacToe!\nValid moves include \nq w e \na s d \nz x c\nfor the cooresponding board locations.");
		Game currentGame = new Game();
		currentGame.playGame();
	}
}