//November 3, 2017
import java.awt.Color;
import java.awt.Graphics;

public class Person {
	//attributes
	public Color eyeColor;
	private Color hairColor;
	private int height; //pixels
	private int x; //top of body
	private int y; //top of body
	
	
	
	
	
	//methods
	
	//constructor (overload) --> public
	public Person (Color ec, Color hc, int h, int xin, int yin) {
		//save specific instance to person
		eyeColor = ec;
		hairColor = hc;
		height = h;
		x = xin;
		y = yin;	
	}




	//how to create
	public void show(Graphics g) {
		//body
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + height - 50);
		//legs
		g.drawLine(x, y + height - 50, x - 30, y + height);
		g.drawLine(x, y + height - 50, x + 30, y + height);
		//arms
		g.drawLine(x, y + ((height - 50)/2), x - 15, y + ((height - 50)/2));
		g.drawLine(x, y + ((height - 50)/2), x + 15, y + ((height - 50)/2));
		//hair
		g.setColor(hairColor);
		g.fillOval(x,  y -100, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval(x, y - 80, 100, 100);
		//head 
		//find upper left corner
		
		g.setColor(Color.BLACK);
		g.fillOval(x - 40, y - 100, 80, 100);
		//g.drawOval(x, y, width, height);
		
		//eyes
		g.setColor(eyeColor);
		g.fillOval(x - 10, y - 50, 10, 10);
		g.fillOval(x + 10, y - 50, 10, 10);
		
		
	}
	
	//create person
	

}
