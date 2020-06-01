import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.ImageIO;

public class WingsOfPraiseStack
{
	public static CardPile WingsStack()
	{
		try
		{
			BufferedImage tempImg = null;
			
			Card[] cards = new Card[17];
			
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\01.jpg"));
			cards[0] = new CardGainMoney(tempImg, 200);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\02.jpg"));
			cards[1] = new CardGainMoney(tempImg, 75);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\03.jpg"));
			cards[2] = new CardPayMoney(tempImg, 50);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\04.jpg"));
			cards[3] = new CardJail(tempImg);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\05.jpg"));
			cards[4] = new CardGotoJail(tempImg);
			
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\06.jpg"));
			cards[5] = new Card(tempImg)
			{
				@Override
				public void affect(Player p)
				{
					for(Player player : ProcessingDriver.getPlayers())
					{
						if(!p.equals(player))
						{
							if(player.getMoney() < 20)
							{
								p.setMoney(player.getMoney() + p.getMoney());
								player.setMoney(-1); // Makes them lose
							}
							else
							{
								player.setMoney(player.getMoney() - 20);
								p.setMoney(p.getMoney() + 20);
							}
						}
					}
				}
			}; 
			
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\07.jpg"));
			cards[6] = new Card(tempImg)
			{
				@Override
				public void affect(Player p)
				{
					for(Player player : ProcessingDriver.getPlayers())
					{
						if(!p.equals(player))
						{
							if(player.getMoney() < 50)
							{
								p.setMoney(player.getMoney() + p.getMoney());
								player.setMoney(-1); // Makes them lose
							}
							else
							{
								player.setMoney(player.getMoney() - 50);
								p.setMoney(p.getMoney() + 50);
							}
						}
					}
				}
			}; 
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\08.jpg"));
			cards[7] = new CardGainMoney(tempImg, 20);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\09.jpg"));
			cards[8] = new CardGainMoney(tempImg, 100);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\10.jpg"));
			cards[9] = new Card(tempImg)
			{
				// 50$ / each property color
				@Override
				public void affect(Player p)
				{
					Set<Color> cols = new HashSet<>(); // Sets won't add duplicates
					for(Property prop : p.getProperties())
					{
						cols.add(prop.getColor());
					}
					p.setMoney(p.getMoney() - cols.size() * 50);
				}
			};
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\11.jpg"));
			cards[10] = new CardPayMoney(tempImg, 50);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\12.jpg"));
			cards[11] = new Card(tempImg)
			{
				@Override
				public void affect(Player p)
				{
					for(Property prop : p.getProperties())
					{
						if(prop.getHouses() == 5)
							p.setMoney(p.getMoney() - 100);
						else
							p.setMoney(p.getMoney() - 40 * prop.getHouses());
					}
				}
			};
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\13.jpg"));
			cards[12] = new CardGainMoney(tempImg, 10);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\14.jpg"));
			cards[13] = new CardGainMoney(tempImg, 100);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\15.jpg"));
			cards[14] = new CardGainMoney(tempImg, 200);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\16.jpg"));
			cards[15] = new CardGainMoney(tempImg, 50);
	
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\17.jpg"));
			cards[16] = new CardGainMoney(tempImg, 100);
			
			tempImg = ImageIO.read(new File("Images\\Wings of Praise\\front.jpg"));
			return new CardPile(cards, tempImg);
		}
		catch(IOException ex)
		{
			throw new RuntimeException(ex);
		}
	}
}
