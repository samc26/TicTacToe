import org.junit.Test;

public class allTest {

	@Test
	public void testBoard(){
		
		//new Game().turn();
		for (int i = 0; i<3; i++){
		    for (int j = 0; j<3; j++){
		        System.out.print(new Board().getCurrentBoard()[i][j] + " ");
		    }
		    System.out.print('\n');
		}		//(new Board().getCurrentBoard());
	}
}