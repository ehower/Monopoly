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

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\03.jpg"));
		Card img3 = new CardPayMoney(tempImg, 50);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\04.jpg"));
		Card img4 = new CardJail(tempImg, 50);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\05.jpg"));
		Card img5 = new CardSetSpace(tempImg, 10);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\06.jpg"));
		Card img6 = new CardGainMoney(/*set*/);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\07.jpg"));
		Card img7 = new CardGainMoney(/*set*/);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\08.jpg"));
		Card img8 = new CardGainMoney(tempImg, 20);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\09.jpg"));
		Card img9 = new CardGainMoney(tempImg, 100);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\10.jpg"));
		Card img10 = new CardPayMoney(/*set*/);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\11.jpg"));
		Card img11 = new CardPayMoney(tempImg, 50);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\12.jpg"));
		Card img12 = new CardGainMoney(/*set*/);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\13.jpg"));
		Card img13 = new CardPayMoney(/*set*/);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\14.jpg"));
		Card img14 = new CardGainMoney(tempImg, 10);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\15.jpg"));
		Card img15 = new CardGainMoney(tempImg, 100);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\16.jpg"));
		Card img16 = new CardGainMoney(tempImg, 200);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\17.jpg"));
		Card img17 = new CardGainMoney(tempImg, 50);

		tempImg = ImageIO.read(new File("Images\\Wings of Praise\\18.jpg"));
		Card img1 = new CardGainMoney(tempImg, 100);

		//after you finish all the cards, add them to an array and use the CardPile class to create a CardPile.
	}
}
