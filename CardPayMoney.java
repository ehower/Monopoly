import java.awt.Image;

public class CardPayMoney extends Card
{
	private int amt;
	
	public CardPayMoney(Image img, int amt)
	{
		super(img);
		
		this.amt = amt;
	}

	@Override
	public void affect(Player p)
	{
		p.setMoney(p.getMoney() - amt);
	}
}
