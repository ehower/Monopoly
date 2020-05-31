import java.awt.Image;

public abstract class Card
{
	private Image img;
	
	public Card(Image img)
	{
		this.img = img;
	}
	
	public abstract void affect(Player p);
	
	public Image getImg() { return img; }
}
