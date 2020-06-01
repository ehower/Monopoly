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
	boolean wait = false;
	boolean doubles = false;


	Property[] properties;

	private static boolean drawBuyMenu = false;

	public static void setDrawBuyMenu(boolean b)
	{
		drawBuyMenu = b;
	}

	public int[] getCoordsForPoint(int index, int playerNo)
	{
		int addAmt = index % 10 != 0 ? 20 : 0;

		int[] coord;

		final int width = 55;

		if(index < 10)
		{
			addAmt -= 5;
			coord = new int[] { 630 - index * width - addAmt, 640 };
		}
		else if(index < 20)
		{
			addAmt += 20;
			coord = new int[] { 35, 660 - (index % 10) * width - addAmt };
		}
		else if(index < 30)
		{
			addAmt += 15;
			coord = new int[] { 30 + (index % 10) * width + addAmt, 30 };
		}
		else if(index < 40)
		{
			addAmt -= 20;
			coord = new int[] { 635, 70 + (index % 10) * width + addAmt};
		}
		else
			return null;

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

		properties = PropertiesCardStack.PropertiesStack();
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

				for(int i = 0; i < players.size(); i++)
				{
					Player player = players.get(i);
					int[] coords = getCoordsForPoint(player.getSpace(), i);
					fill(players.get(i).getColor().getRGB());
					ellipse(coords[0],coords[1],10,10);
				}

				fill(255);
				textSize(30);
				text(players.get(count).getName() + ", it is your turn!", (width-width/2 + 50),50);
				rect(730,90,130,40);

				fill(0);
				text("Roll Dice",730,120);

				fill(255);
				textSize(45);
				text(Integer.toString(die.getResult()), 730, 200);
				
				if(doubles) {text("DOUBLES!", (width-width/2 + 50),300);}
				
				if(wait && !drawBuyMenu)
				{System.out.println(count + ":" + players.size());
					if(die.getRolledDoubles())
					{
						doubles = true;
						wait = false;
					}
					else
					{
						wait = false;
						count = (count + 1)%players.size();
						doubles = false;
					}
				}
				
				fill(255);
				textSize(30);
				text(players.get(count).getName() + ", it is your turn!", (width-width/2 + 50),50);
				
				if(players.get(count).getSpace() == 4)
				{
					if(players.get(count).getMoney()*.1 < 200)
					{
						text("10% of your wealth has been taken",(width-width/2 + 50), 100);
						players.get(count).setMoney(players.get(count).getMoney() -(int)(players.get(count).getMoney()*.1));
						delay(5000);
					}
					
					else
					{
						text("You have paid $200", (width-width/2 + 50),100);
						players.get(count).setMoney(players.get(count).getMoney() -200);
						delay(5000);
					}
				}
				
				else if(players.get(count).getSpace() == 30)
				{
					text("Go to ISS!", (width-width/2+50),100);
					players.get(count).setSpace(10);
					int[] coords = getCoordsForPoint(players.get(count).getSpace(), count);
					fill(players.get(count).getColor().getRGB());
					ellipse(coords[0],coords[1],10,10);
				}
				
				
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
						count = 0;
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
		if(mouseX <= 850 && mouseX >=730 && state == 2 && !wait)
			if(mouseY <= 130 && mouseY >= 90)
			{
				die.rollDice();
				players.get(count).setSpace((players.get(count).getSpace() + die.getResult()) % 40);
				int[] coords = getCoordsForPoint(players.get(count).getSpace(), count);
				fill(players.get(count).getColor().getRGB());
				ellipse(coords[0],coords[1],10,10);
				wait = true;
			}
	}

	public static List<Player> getPlayers()
	{
		return players;
	}
}
