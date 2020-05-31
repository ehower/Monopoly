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
	public String[] getCards(String color)
	{
		String[] defaultCase = {"wrong", "color"};
		
		if(color.equalsIgnoreCase("Purple"))
			return purpleNeighborhood;
		else if(color.equalsIgnoreCase("Light Blue"))
			return lightBlueNeighborhood;
		else if(color.equalsIgnoreCase("Pink"))
			return pinkNeighborhood;
		else if(color.equalsIgnoreCase("Orange"))
			return orangeNeighborhood;
		else if(color.equalsIgnoreCase("Red"))
			return redNeighborhood;
		else if(color.equalsIgnoreCase("Yellow"))
			return yellowNeighborhood;
		else if(color.equalsIgnoreCase("Green"))
			return greenNeighborhood;
		else if(color.equalsIgnoreCase("Blue"))
			return blueNeighborhood;
		else
			return defaultCase;
	}
}

