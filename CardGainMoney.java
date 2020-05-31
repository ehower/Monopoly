import java.awt.Image;

public class CardGainMoney extends Card
{
	private int amt;
	
	public CardGainMoney(Image img, int amt)
	{
		super(img);
		
		this.amt = amt;
	}

	@Override
	public void affect(Player p)
	{
		p.setMoney(p.getMoney() + amt);
	}
}
