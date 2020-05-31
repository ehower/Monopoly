import java.util.Scanner;
public class Neighborhoods
{
	//each neighborhood and the properties in them
	String[] purpleNeighborhood = {"Mrs. Keath", "Mr. Wuori"};
	String[] lightBlueNeighborhood = {"Frau Marini", "Mrs. Zackey", "Senor Plichta"};
	String[] pinkNeighborhood = {"Mr. Dissinger", "Ms. Hepler", "Mr. Wildasin"};
	String[] orangeNeighborhood = {"Dr. Z", "Mr. War", "Mr. Risser"};
	String[] redNeighborhood = {"Mr. Straight", "Mr. Snyder", "Mrs. Cosce"};
	String[] yellowNeighborhood = {"Mr. Dresch", "Mrs. Lebo", "Mrs. Light"};
	String[] greenNeighborhood = {"Mrs. Kohr", "Mr. Schultheis", "Mr. Thomas"};
	String[] blueNeighborhood = {"Mr. Eggert", "Mrs. Reed"};


		//this method will ask the player what Color Neighborhood they would like to check the properties needed to have Monopoly over it
		public static String getCards()
		{
			Scanner scan = new Scanner(System.in);
			String color;

			System.out.println("Enter a Color to check the properties in its Neighborhood:");
			color = scan.nextLine();

			if(color.equalsIgnoreCase("Purple"))
				return "To have Monopoly over the Purple Neighborhood, you must have these properties:/n" + purpleNeighborhood[0] + "/n" + purpleNeighborhood[1];
			else if(color.equalsIgnoreCase("Light Blue"))
				return "To have Monopoly over the Light Blue Neighborhood, you must have these properties:/n" + lightBlueNeighborhood[0] + "/n" + lightBlueNeighborhood[1] + "/n" + lightBlueNeighborhood[2];
			else if(color.equalsIgnoreCase("Pink"))
				return "To have Monopoly over the Pink Neighborhood, you must have these properties:/n" + pinkNeighborhood[0] + "/n" + pinkNeighborhood[1] + "/n" + pinkNeighborhood[2];
			else if(color.equalsIgnoreCase("Orange"))
				return "To have Monopoly over the Orange Neighborhood, you must have these properties:/n" + orangeNeighborhood[0] + "/n" + orangeNeighborhood[1] + "/n" + orangeNeighborhood[2];
			else if(color.equalsIgnoreCase("Red"))
				return "To have Monopoly over the Red Neighborhood, you must have these properties:/n" + redNeighborhood[0] + "/n" + redNeighborhood[1] + "/n" + redNeighborhood[2];
			else if(color.equalsIgnoreCase("Yellow"))
				return "To have Monopoly over the Yellow Neighborhood, you must have these properties:/n" + yellowNeighborhood[0] + "/n" + yellowNeighborhood[1] + "/n" + yellowNeighborhood[2];
			else if(color.equalsIgnoreCase("Green"))
				return "To have Monopoly over the Green Neighborhood, you must have these properties:/n" + greenNeighborhood[0] + "/n" + greenNeighborhood[1] + "/n" + greenNeighborhood[2];
			else if(color.equalsIgnoreCase("Blue"))
				return "To have Monopoly over the Blue Neighborhood, you must have these properties:/n" + blueNeighborhood[0] + "/n" + blueNeighborhood[1];
			else
				return "You did not enter a valid Neighborhood Color.";
		}

}

