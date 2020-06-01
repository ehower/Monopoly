import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

public class ProcessingDriver extends PApplet
{
	PImage boardImage;
	int state = 0;
	String typing = "";
	int numPlayers = 0;
	String playerName = "";
	int count = 0;
	
	private static List<Player> players;
	
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
		background(0);
		image(boardImage,0,0,width/2, width/2);
		
		switch(state)
		{
			case 0:
			{
				textSize(25);
				text("How many players are in your game? \nHit enter to save or delete to remove text.", width-width/2 + 50, height/2);
				text(typing, width-width/2 + 50, height - height/3);		
			}
			break;
			
			case 1: 
			{
				textSize(25);
				text("Enter the name of player " + (count + 1) + "\nHit enter to save or delete to remove text.", width-width/2 + 50, height/2);
				text(typing, width-width/2 + 50, height - height/3);	
			}	
			break;
		}
	}
	
	public void keyPressed()
	{
		switch(state)
		{
			case 0:
			{
				 if (key == '\n' ) 
				 {
					numPlayers = Integer.parseInt(typing);
					players = new ArrayList<>(numPlayers);
					typing = ""; 
					state = 1;
				 }
				 
				 else if (key == DELETE)
				 {
					 typing = "";
				 }
					    
				 else 
				 {
					typing = typing + key; 
				 }
			}
			break;
			
			case 1:
			{
				 if (key == '\n' ) 
				 {
					Color[] colors = {Color.red, Color.orange, Color.blue, Color.green};
					playerName = typing;
					typing = ""; 
					players.add(new Player(playerName, colors[count]));
					count++;
					
					if(count == numPlayers)
					{
						state++;
					}
				 }
				 
				 else if (key == DELETE)
				 {
					 typing = "";
				 }
					    
				 else 
				 {
					typing = typing + key; 
				 }
			}
			break;
			
			default:
				System.out.println("If you are seeing this, Ethan did something very wrong.");
		}
	}
	
	public static List<Player> getPlayers()
	{
		return players;
	}
}
