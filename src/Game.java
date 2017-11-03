import java.awt.*;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "Person");
	
	//create person object for Person.java
	static Color BROWN = new Color(146, 64, 4);
	static Person mrsLombardi = new Person(Color.GREEN, BROWN, 300, 100, 150);
	
	public static void main(String[] args) {
		showGameBoard(gb);

		//System.out.println(mrsLombardi.hairColor);
	
	}
	//draw on pink background
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		
	}

}
