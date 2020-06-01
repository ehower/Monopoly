import java.awt.Image;

public class Property
{
	private Player owner;
	
	private int houses = 0;
	private String name;
	private String color;
	private int houseCost;
	private Image image;
	
	private int[] rents;
	
	public Property(String name, String color, int houseCost, int[] rents, Image image)
	{
		this.name = name;
		this.color = color;
		this.rents = rents;
		this.houseCost = houseCost;
		this.image = image;
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
	public String getColor() { return color; }

	public int getHouseCost() { return houseCost; }
	
	public int getRent() { return rents[houses]; }
	
	public void setOwner(Player p) { this.owner = p; }
	public Player getOwner() { return owner; }
}
