import java.awt.Image;

public class CardGotoJail extends CardSetSpace
{
	public CardGotoJail(Image img)
	{
		super(img, 10, false, false);
	}
	
	@Override
	public void affect(Player p)
	{
		p.setJail(true);
	}
}
