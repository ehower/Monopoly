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
		cards[1] = new CardSetSpace(img("Images/Chance/02.jpg"), Monopoly.JAIL_SPACE, false, false);
		
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
