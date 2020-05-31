import java.awt.Image;

public class Card
{
	private Image img;
	private int cost;
	private int gain;
	private int space;
	
	public Card(Image img, int cost, int gain, int space)
	{
		this.img = img;
		this.cost = cost;
		this.gain = gain;
		this.space = space;
	}
	
	public Image getImg() { return img; }
	public int getCost() { return cost; }
	public int getGain() { return gain; }
	public int getSpace() { return space; }
}
