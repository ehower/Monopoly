import java.awt.Color;
import processing.core.PImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class PropertiesCardStack
{
	public static Property[] PropertiesStack()
	{
		try
		{
			Property[] props = new Property[40];
			
			//we need to create an arraylist of properties that is parallel
			//to the location of the property on the board.
			//if the parallel array is at a location where a property card does not
			//exist, use any image as a filler.
			BufferedImage tempImg = null;
			int[] fillerRent = {0,0,0};
			
			tempImg = null;
			Property zero = new Property("fillerName", Color.BLUE, 0, 0,fillerRent, tempImg);
	
			int[] keathRent = {10,30,90,160,250};
			tempImg = ImageIO.read(new File("Images\\Properties\\keath.jpg"));
			Property one = new Property("Mrs.Keath", Color.MAGENTA, 60, 50, keathRent,tempImg);
	
			tempImg = null;
			Property two = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] wuoriRent = {20,60,180,320,450};
			tempImg = ImageIO.read(new File("Images\\Properties\\wuori.jpg"));
			Property three = new Property("Mr. Wuori", Color.MAGENTA, 60, 50, wuoriRent, tempImg);
	
			tempImg = null;
			Property four = new Property("fillerName", Color.WHITE, 0, 0,fillerRent, tempImg);
	
			int[] auditoriumRent = {25,50,100,200};
			tempImg = ImageIO.read(new File("Images\\Properties\\auditorium.jpg"));
			Property five = new Property("Auditorium", Color.WHITE, 200, 25, auditoriumRent, tempImg);
	
			int[] frauRent = {30,90,270,400,550};
			tempImg = ImageIO.read(new File("Images\\Properties\\marini.jpg"));
			Property six = new Property("Frau Marini", Color.BLUE, 120, 50, frauRent, tempImg);
	
			tempImg = null;
			Property seven = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] plichtaRent = {40,100,300,450,600};
			tempImg = ImageIO.read(new File("Images\\Properties\\plichta.jpg"));
			Property eight = new Property("Senor Plichta", Color.BLUE, 100, 50, plichtaRent, tempImg);
	
			int[] zackeyRent = {30,90,270,400,550};
			tempImg = ImageIO.read(new File("Images\\Properties\\zackey.jpg"));
			Property nine = new Property("Mr. Wuori", Color.BLUE, 100, 50, zackeyRent, tempImg);
	
			tempImg = null;
			Property ten = new Property("fillerName", Color.WHITE, 0, 0,fillerRent, tempImg);
	
			int[] dissingerRent = {20,60,180,320,450};
			tempImg = ImageIO.read(new File("Images\\Properties\\dissinger.jpg"));
			Property eleven = new Property("Mr. Dissinger", Color.PINK, 140, 100, dissingerRent, tempImg);
	
			tempImg = ImageIO.read(new File("Images\\Properties\\counselingoffice.jpg"));
			Property twelve = new Property("Counseling Office", Color.BLACK, 150, 50, fillerRent, tempImg);
	
			int[] heplerRent = {50,150,450,625,750};
			tempImg = ImageIO.read(new File("Images\\Properties\\hepler.jpg"));
			Property thirteen = new Property("Ms. Hepler", Color.PINK, 140, 100, heplerRent, tempImg);
	
			int[] wildasinRent = {60,180,500,700,900};
			tempImg = ImageIO.read(new File("Images\\Properties\\wildasin.jpg"));
			Property fourteen = new Property("Mr. Wildasin", Color.PINK, 160, 100, wildasinRent, tempImg);
	
			int[] bandroomRent = {25,50,100,200};
			tempImg = ImageIO.read(new File("Images\\Properties\\bandroom.jpg"));
			Property fifteen = new Property("Band Room", Color.WHITE, 200, 50, bandroomRent, tempImg);
	
			int[] risserRent = {80,220,600,800,1000};
			tempImg = ImageIO.read(new File("Images\\Properties\\risser.jpg"));
			Property sixteen = new Property("Mr. Risser", Color.ORANGE, 180, 100, risserRent, tempImg);
	
			tempImg = null;
			Property seventeen = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] warRent = {70,200,550,750,950};
			tempImg = ImageIO.read(new File("Images\\Properties\\war.jpg"));
			Property eighteen = new Property("Mr. War", Color.ORANGE, 180, 90, warRent, tempImg);
	
			int[] zRent = {70,200,550,750,950};
			tempImg = ImageIO.read(new File("Images\\Properties\\z.jpg"));
			Property nineteen = new Property("Dr. Z", Color.ORANGE, 200, 100, zRent, tempImg);
	
			tempImg = null;
			Property twenty = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] cosceRent = {100,300,750,925,1100};
			tempImg = ImageIO.read(new File("Images\\Properties\\cosce.jpg"));
			Property twentyone = new Property("Mrs. Cosce", Color.RED, 220, 150, cosceRent, tempImg);
	
			tempImg = null;
			Property twentytwo = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] snyderRent = {90,250,700,875,1050};
			tempImg = ImageIO.read(new File("Images\\Properties\\snyder.jpg"));
			Property twentythree = new Property("Mr. Snyder", Color.RED, 220, 150, snyderRent, tempImg);
	
			int[] straitRent = {90,250,700,875,1050};
			tempImg = ImageIO.read(new File("Images\\Properties\\strait.jpg"));
			Property twentyfour = new Property("Mr. Strait", Color.RED, 240 , 150, straitRent, tempImg);
	
			int[] lgiRent = {25,50,100,200};
			tempImg = ImageIO.read(new File("Images\\Properties\\lgi.jpg"));
			Property twentyfive = new Property("LGI", Color.WHITE, 200, 50, lgiRent, tempImg);
	
			int[] dreschRent = {110,330,800,975,1150};
			tempImg = ImageIO.read(new File("Images\\Properties\\dresch.jpg"));
			Property twentysix = new Property("Mr. Dresch", Color.YELLOW, 260, 150, dreschRent, tempImg);
	
			int[] leboRent = {110,330,800,975,1150};
			tempImg = ImageIO.read(new File("Images\\Properties\\lebo.jpg"));
			Property twentyseven = new Property("Mrs. Lebo", Color.YELLOW, 260, 50, leboRent, tempImg);
	
			tempImg = ImageIO.read(new File("Images\\Properties\\nursesoffice.jpg"));
			Property twentyeight = new Property("Nurses Office", Color.BLACK, 150, 0, fillerRent, tempImg);
	
			int[] lightRent = {120,360,850,1025,1200};
			tempImg = ImageIO.read(new File("Images\\Properties\\light.jpg"));
			Property twentynine = new Property("Mrs. Light", Color.YELLOW, 280, 150, lightRent, tempImg);
	
			tempImg = null;
			Property thirty = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] kohrRent = {130,390,900,1100,1275};
			tempImg = ImageIO.read(new File("Images\\Properties\\kohr.jpg"));
			Property thirtyone = new Property("Mr. Wuori", Color.GREEN, 300, 200, kohrRent, tempImg);
	
			int[] schultheisRent = {130,390,900,1100,1275};
			tempImg = ImageIO.read(new File("Images\\Properties\\schultheis.jpg"));
			Property thirtytwo = new Property("Mr. Schultheis", Color.GREEN, 300, 200, schultheisRent, tempImg);
	
			tempImg = null;
			Property thirtythree = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] thomasRent = {150,450,1000,1200,1400};
			tempImg = ImageIO.read(new File("Images\\Properties\\thomas.jpg"));
			Property thirtyfour = new Property("Mr. Thomas", Color.GREEN, 320, 200, thomasRent, tempImg);
	
			int[] libraryRent = {25,50,100,200};
			tempImg = ImageIO.read(new File("Images\\Properties\\library.jpg"));
			Property thirtyfive = new Property("Library", Color.WHITE, 200, 50, libraryRent, tempImg);
	
			tempImg = null;
			Property thirtysix = new Property("fillerName", Color.WHITE, 0, 0, fillerRent, tempImg);
	
			int[] eggertRent = {175,500,1100,1300,1500}; //epic gamer egg
			tempImg = ImageIO.read(new File("Images\\Properties\\eggert.jpg"));
			Property thirtyseven = new Property("Mr. Eggert", Color.BLUE.darker(), 350, 200, eggertRent, tempImg);
	
			tempImg = null;
			Property thirtyeight = new Property("fillerName", Color.WHITE, 100, 0, fillerRent, tempImg);
	
			int[] reedRent = {200,600,1400,1700,2000};
			tempImg = ImageIO.read(new File("Images\\Properties\\reed.jpg"));
			Property thirtynine = new Property("Mrs. Reed", Color.BLUE.darker(), 400, 200, reedRent, tempImg);
	
			props[0] = (zero);
			props[1] = (one);
			props[2] = (two);
			props[3] = (three);
			props[4] = (four);
			props[5] = (five);
			props[6] = (six);
			props[7] = (seven);
			props[8] = (eight);
			props[9] = (nine);
			props[10] = (ten);
			props[11] = (eleven);
			props[12] = (twelve);
			props[13] = (thirteen);
			props[14] = (fourteen);
			props[15] = (fifteen);
			props[16] = (sixteen);
			props[17] = (seventeen);
			props[18] = (eighteen);
			props[19] = (nineteen);
			props[20] = (twenty);
			props[21] = (twentyone);
			props[22] = (twentytwo);
			props[23] = (twentythree);
			props[24] = (twentyfour);
			props[25] = (twentyfive);
			props[26] = (twentysix);
			props[27] = (twentyseven);
			props[28] = (twentyeight);
			props[29] = (twentynine);
			props[30] = (thirty);
			props[31] = (thirtyone);
			props[32] = (thirtytwo);
			props[33] = (thirtythree);
			props[34] = (thirtyfour);
			props[35] = (thirtyfive);
			props[36] = (thirtysix);
			props[37] = (thirtyseven);
			props[38] = (thirtyeight);
			props[39] = (thirtynine);
	
			return props;
		}
		catch(IOException ex)
		{
			throw new RuntimeException(ex);
		}
	}
}
