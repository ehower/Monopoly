import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WingsOfPraiseStack 
{
	public CardPile WingsStack() throws IOException
	{
		BufferedImage tempImg = null;
		
		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\01.jpg"));
		Card img1 = new CardGainMoney(tempImg, 200);
		
		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\02.jpg"));
		Card img2 = new CardGainMoney(tempImg, 75);
		
		//after you finish all the cards, add them to an array and use the CardPile class to create a CardPile.
	}
}
