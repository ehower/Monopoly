import java.awt.Image;

public class CardJail extends Card
{
	public CardJail(Image img)
	{
		super(img);
	}

	@Override
	public void affect(Player p)
	{
		p.addGetOutOfJailCard();
	}
}
