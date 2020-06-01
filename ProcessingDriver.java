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
	boolean winner = false;
	Die die = new Die();
	
	public int[] getCoordsForPoint(int index, int playerNo)
	{
		int addAmt = index % 10 == 0 ? 0 : 30;
		
		int[] coord;
		
		if(index < 10)
		{
			coord = new int[] { 620 - index * 55 - addAmt, 700 };
		}
		else if(index < 20)
		{
			coord = new int[] { 45, 660 - index * 55 + addAmt };
		}
		else if(index < 30)
		{
			coord = new int[] { 30 + index * 55 + addAmt, 60 };
		}
		else if(index < 40)
		{
			coord = new int[] { 635, 70 + index * 55 + addAmt};
		}
		else
			coord = null;
		
		if(coord != null)
		{
			if(playerNo == 0)
			{
				coord[0] -= 15;
				coord[1] -= 15;
			}
			else if(playerNo == 1)
			{
				coord[0] += 15;
				coord[1] -= 15;
			}
			else if(playerNo == 2)
			{
				coord[0] += 15;
				coord[1] += 15;
			}
			else if(playerNo == 3)
			{
				coord[0] -= 15;
				coord[1] += 15;
			}
			
			return coord;
		}
		else
			return null;
	}
	
	private static List<Player> players;
	
	public static void main (String[] args)
	{
		PApplet.main("ProcessingDriver");
	}
	
	public void settings()
	{
		size(1366,768);
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
			
			case 2:
			{
				ellipseMode(CENTER);
				
				fill(players.get(0).getColor().getRGB());
				ellipse(604,626,10,10);
				
				fill(players.get(1).getColor().getRGB());
				ellipse(632,626,10,10);
				
				if(players.size() >= 3)
				{
				fill(players.get(2).getColor().getRGB());
				ellipse(604,657,10,10);
				}
				
				if(players.size() == 4)
				{
				fill(players.get(3).getColor().getRGB());
				ellipse(632,657,10,10);
				}
				
				count = 0;
				
				fill(255);
				textSize(30);
				text(players.get(0).getName() + ", it is your turn!", (width-width/2 + 50),50);
				rect(730,90,130,40);
				
				fill(0);
				text("Roll Dice",730,120);
				
				fill(255);
				textSize(45);
				text(Integer.toString(die.getResult()), 730, 200);
			}
			break;
			
			default:
				System.out.println("If you are seeing this, Ethan did something very wrong.");
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
				break;
		}
	}
	
	public void mousePressed()
	{	
		if(mouseX <= 850 && mouseX >=730 && state == 2)
			if(mouseY <= 130 && mouseY >= 90)
			{
				die.rollDice();
			}
	}
	
	public static List<Player> getPlayers()
	{
		return players;
	}
}
