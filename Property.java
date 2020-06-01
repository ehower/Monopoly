import java.awt.Color;
import java.awt.Image;

public class Property
{
	private Player owner;
	
	private int houses = 0;
	private String name;
	private Color color;
	private int houseCost;
	private Image image;
	private int cost;
	
	private int[] rents;
	
	public static final int HOTEL = 5; // 5 houses = 1 hotel
	
	public Property(String name, Color color, int cost, int houseCost, int[] rents, Image image)
	{
		this.name = name;
		this.color = color;
		this.rents = rents;
		this.houseCost = houseCost;
		this.image = image;
		this.cost = cost;
	}
	
	public int addHouse()
	{
		houses++;
		return houseCost;
	}
	
	public int sellHouse()
	{
		houses--;
		return houseCost / 2;
	}
	
	public Image getImage() { return image; }
	
	public int getHouses() { return houses; }
	public void setHouses(int houses) { this.houses = houses; }
	
	public String getName() { return name; }
	public Color getColor() { return color; }
	
	public int getHouseCost() { return houseCost; }
	
	public int getRent() { return rents[houses]; }
	
	public void setOwner(Player p) { this.owner = p; }
	public Player getOwner() { return owner; }
	
	public int getCost() { return cost; }
}
