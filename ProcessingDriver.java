import processing.core.PApplet;
import processing.core.PImage;

public class ProcessingDriver extends PApplet
{
	PImage boardImage;
	
	public static void main (String[] args)
	{
		PApplet.main("ProcessingDriver");
	}
	
	public void settings()
	{
		fullScreen();
	}
	
	public void setup()
	{
		background(0);
		noStroke();
		boardImage = loadImage("Images\\Board.png");
	}
	
	public void draw()
	{
		image(boardImage,0,0,width/2, width/2);
	}
	
}
