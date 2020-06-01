import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PropertiesCardStack
{
	public Property[] PropertiesStack() throws IOException
	{
		//we need to create an arraylist of properties that is parallel
		//to the location of the property on the board.
		//if the parallel array is at a location where a property card does not
		//exist, use any image as a filler.
		BufferedImage tempImg = null;
		int[] fillerRent = {0,0,0};

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property zero = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] keathRent = {10,30,90,160,250};
		tempImg = ImageIO.read(new File("Images\\Properties\\keath.jpg"));
		Property one = new Property("Mrs.Keath", "Purple",50, keathRent,tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property two = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property three = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property four = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property five = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property six = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property seven = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property eight = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property nine = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property ten = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property eleven = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twelve = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property fourteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property fifteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property sixteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property seventeen = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property eighteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property nineteen = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property twenty = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentyone = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property twentytwo = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentythree = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentyfour = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentyfive = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentysix = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentyseven = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentyeight = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property twentynine = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property thirty = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtyone = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtytwo = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property thirtythree = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtyfour = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtyfive = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property thirtysix = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtyseven = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);

		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property thirtyeight = new Property("fillerName", "filler", 0,fillerRent, tempImg);

		int[] wuoriRent = {20,60,180,320,450};
		tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
		Property thirtynine = new Property("Mr. Wuori", "Purple", 50, wuoriRent, tempImg);
	}
}
