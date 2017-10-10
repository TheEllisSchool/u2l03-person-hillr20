import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "Insert Game Name Here");
	
	public static void main(String[] args) {
		showGameBoard(gb);

	}

}
