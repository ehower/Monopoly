import java.awt.Image;

public class CardSetSpace extends Card
{
	private int space;
	private boolean collectMoney;
	private boolean payRent;
	
	public CardSetSpace(Image img, int space, boolean collectMoney, boolean payRent)
	{
		super(img);
		
		this.space = space;
		this.collectMoney = collectMoney;
		this.payRent = payRent;
	}
	
	@Override
	public void affect(Player p)
	{
		p.setSpace(space, collectMoney, payRent);
	}
}
