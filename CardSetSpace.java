import java.awt.Image;

public class CardSetSpace extends Card
{
	private int space;
	private boolean collectMoney;
	private boolean payRent;
	private boolean canBuy;
	
	public CardSetSpace(Image img, int space, boolean collectMoney, boolean payRent)
	{
		this(img, space, collectMoney, payRent, false);
	}
	
	public CardSetSpace(Image img, int space, boolean collectMoney, boolean payRent, boolean canBuy)
	{
		super(img);
		
		this.space = space;
		this.collectMoney = collectMoney;
		this.payRent = payRent;
		this.canBuy = canBuy;
	}
	
	@Override
	public void affect(Player p)
	{
		p.setSpace(space, collectMoney, payRent, canBuy);
	}
}
