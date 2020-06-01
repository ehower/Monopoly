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
		
		tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
		Property four = new Property("fillerName", "filler", 0,fillerRent, tempImg);
		return null;
		
		
	}
}
