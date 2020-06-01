import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChanceCardsStack 
{
	public static CardPile create()
	{
		Card[] cards = new Card[14];
		
		cards[0] = new CardPayMoney(img("Images/Chance/01.jpg"), 30);
		cards[1] = new CardGotoJail(img("Images/Chance/02.jpg"));
		cards[2] = new Card(img("Images/Chance/03.jpg"))
		{
			@Override
			public void affect(Player p)
			{
				for(Player other : ProcessingDriver.getPlayers())
				{
					if(!p.equals(other))
					{
						if(p.getMoney() >= 20)
						{
							other.setMoney(other.getMoney() + 20);
							p.setMoney(p.getMoney() - 20);
						}
						else
						{
							throw new RuntimeException("NOT IMPLEMENTED");
						}
					}
				}
			}
		};
		cards[3] = new CardSetSpace(img("Images/Chance/04.jpg"), 39, true, true);
		cards[4] = new CardSetSpace(img("Images/Chance/05.jpg"), 25, true, true);
		cards[5] = new Card(img("Images/Chance/06.jpg"))
		{
			@Override
			public void affect(Player p)
			{
				for(Property prop : p.getProperties())
				{
					if(prop.getHouses() == Property.HOTEL)
					{
						p.setMoney(p.getMoney() - 115);
					}
					else
					{
						p.setMoney(p.getMoney() - prop.getHouses() * 40);
					}
				}
			}
		};
		cards[6] = new CardGotoJail(img("Images/Chance/07.jpg"));
		cards[7] = new Card(img("Images/Chance/08.jpg"))
		{
			@Override
			public void affect(Player p)
			{
				p.setSpace(p.getSpace() - 3, false, true, false);
			}
		};
		cards[8] = new CardJail(img("Images/Chance/09.jpg"));
		cards[9] = new CardGainMoney(img("Images/Chance/10.jpg"), 50);
		cards[10] = new CardSetSpace(img("Images/Chance/11.jpg"), 18, true, true, true);
		cards[11] = new CardSetSpace(img("Images/Chance/12.jpg"), 13, true, true);
		cards[12] = new CardSetSpace(img("Images/Chance/13.jpg"), 21, true, true);
		cards[13] = new CardGainMoney(img("Images/Chance/Image14.jpg"), 100);
		
		return new CardPile(cards, img("Images/Chance/front.jpg"));
	}
	
	private static Image img(String s)
	{
		try
		{
			return ImageIO.read(new File(s));
		}
		catch(IOException ex)
		{
			throw new RuntimeException(ex);
		}
	}
}
