import java.awt.Color;

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
	String[] specialNeighborhood = {"Auditorium", "Band Room", "LGI","Library","blocker"};
	String[] healthNeighborhood = {"Counseling Office","Nurses Office","blocker"};
	
	//this method will ask the player what Color Neighborhood they would like to check the properties needed to have Monopoly over it
	public String[] getCards(Color color)
	{
		if(color.equals(Color.MAGENTA))
			return purpleNeighborhood;
		else if(color.equals(Color.BLUE))
			return lightBlueNeighborhood;
		else if(color.equals(Color.PINK))
			return pinkNeighborhood;
		else if(color.equals(Color.ORANGE))
			return orangeNeighborhood;
		else if(color.equals(Color.RED))
			return redNeighborhood;
		else if(color.equals(Color.YELLOW))
			return yellowNeighborhood;
		else if(color.equals(Color.GREEN))
			return greenNeighborhood;
		else if(color.equals(Color.BLUE.darker()))
			return blueNeighborhood;
		else if(color.equals(Color.WHITE))
			return specialNeighborhood;
		else if(color.equals(Color.BLACK))
			return healthNeighborhood;
		else
			return null;
	}
}

