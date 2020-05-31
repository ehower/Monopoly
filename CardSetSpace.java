import java.awt.Image;

public class CardSetSpace extends Card
{
	private int space;
	
	public CardSetSpace(Image img, int space)
	{
		super(img);
		
		this.space = space;
	}
	
	@Override
	public void affect(Player p)
	{
		p.setSpace(space);
	}
}
