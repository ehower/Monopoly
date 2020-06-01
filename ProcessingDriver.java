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
	CardPile wings;
	CardPile chance;
	
	PImage cardToDraw;
	Card cardToUse;
	
	Property propertyToUse;
	PImage propertyToDraw;

	String statusText;
	
	Property[] properties;

	private static boolean drawBuyMenu = true;

	public static void setDrawBuyMenu(boolean b)
	{
		drawBuyMenu = b;
	}
	
	// its perfect
	public static void lose(Player p)
	{
		for(int i = 0; i < players.size(); i++)
		{
			if(p.equals(players.get(i)))
			{
				players.remove(i);
				return;
			}
		}
		
		throw new RuntimeException("gj, you removed a player that didnt exist you baffoun");
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
		
		wings = WingsOfPraiseStack.WingsStack();
		chance = ChanceCardsStack.create();
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
				
				if(wait)
				{
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
						statusText = null;
					}
				}
				
				fill(255);
				textSize(30);
				text(players.get(count).getName() + ", it is your turn!", (width-width/2 + 50),50);
				
				if(players.get(count).getSpace() == 4)
				{
					if(players.get(count).getMoney()*.1 < 200)
					{
						statusText = "10% of your wealth has been taken";
						players.get(count).setMoney(players.get(count).getMoney() -(int)(players.get(count).getMoney()*.1));
					}
					
					else
					{
						statusText = "You have paid $200";
						players.get(count).setMoney(players.get(count).getMoney() -200);
					}
				}
				
				else if(players.get(count).getSpace() == 30)
				{
					statusText = "Go to ISS!";
					players.get(count).setSpace(10);
					int[] coords = getCoordsForPoint(players.get(count).getSpace(), count);
					fill(players.get(count).getColor().getRGB());
					ellipse(coords[0],coords[1],10,10);
					players.get(count).setJail(true);
				}
				
				else if(players.get(count).getSpace() == 38)
				{
					statusText = "You have paid $100";
					players.get(count).setMoney(players.get(count).getMoney() -100);
				}
				else if(cardToDraw != null)
				{
					image(cardToDraw, width - (-450/2 + width/2), height/2,450,270);
				}
				else if(propertyToDraw != null)
				{
					image(propertyToDraw, width - (-450/2 + width/2), height/2 - 50, 350, 400);
					
					if(properties[players.get(count).getSpace()].getOwner() == null && drawBuyMenu)
					{
						fill(255);
						rect(width/2 + 50, height/2-50, 75,35);
						
						fill(0);
						textSize(35);
						text("Buy", width/2 + 50, height/2 - 23);
						
						fill(255);
						rect(width/2 + 50, height/2 + 100,75,35);
						
						fill(0);
						text("Pass", width/2 + 50, height/2 + 127);
					}
				}
				if(statusText != null && !statusText.isEmpty())
				{
					text(statusText, (width-width/2 + 50),245);
				}
			}
			break;

			default:
				System.out.println("If you are seeing this, Ethan did something very wrong.");
		}
	}
	
	// I'm sorry
	public void doAllThisStuff()
	{
		int playerSpace = players.get(count).getSpace();
		if(cardToDraw == null && propertyToDraw == null)
		{
			if(players.get(count).getSpace() == 2 || players.get(count).getSpace() == 17 ||players.get(count).getSpace() == 33)
			{
				cardToUse = wings.takeTop();
				cardToDraw = new PImage(cardToUse.getImg());
				
				cardToUse.affect(players.get(count));
			}
			else if(players.get(count).getSpace() == 7 || players.get(count).getSpace() == 22 || players.get(count).getSpace() == 36)
			{
				cardToUse = chance.takeTop();
				cardToDraw = new PImage(cardToUse.getImg());
				
				cardToUse.affect(players.get(count));
			}
			
			else if(playerSpace != 0 && playerSpace !=4 && playerSpace != 10 && playerSpace != 30 && playerSpace != 38 && playerSpace != 20)
			{
				System.out.println(players.get(count).getSpace());
				propertyToUse = properties[players.get(count).getSpace()];
				propertyToDraw = new PImage(propertyToUse.getImage());
				
			}
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
				cardToDraw = null;
				die.rollDice();
				propertyToDraw = null;
				drawBuyMenu = true;
				players.get(count).setSpace((players.get(count).getSpace() + die.getResult()) % 40);
				int[] coords = getCoordsForPoint(players.get(count).getSpace(), count);
				fill(players.get(count).getColor().getRGB());
				ellipse(coords[0],coords[1],10,10);
				wait = true;
				
				doAllThisStuff();
			}
		if(drawBuyMenu && mouseX <= (width/2 + 125) && mouseX >= width/2 + 50 && mouseY <= height/2 -15 && mouseY >= height/2 -50)
		{
			properties[players.get(count).getSpace()].setOwner(players.get(count));
			players.get(count).setMoney(players.get(count).getMoney() - properties[players.get(count).getSpace()].getCost());
			drawBuyMenu = false;
		}
		
		if(drawBuyMenu && mouseX <= (width/2 + 125) && mouseX >= width/2 + 50 && mouseY <= height/2 + 135 && mouseY >= height/2 + 100)
		{
			drawBuyMenu = false;
		}
		
	}

	public static List<Player> getPlayers()
	{
		return players;
	}
}
