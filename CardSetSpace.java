import java.awt.Image;

public class CardSetSpace extends Card
{
	private int space;
	private boolean collectGoMoney;
	private boolean payRent;
	private boolean canBuy;
	
	public CardSetSpace(Image img, int space, boolean goMoney, boolean payRent)
	{
		this(img, space, goMoney, payRent, false);
	}
	
	public CardSetSpace(Image img, int space, boolean goMoney, boolean payRent, boolean canBuy)
	{
		super(img);
		
		this.space = space;
		this.collectGoMoney = goMoney;
		this.payRent = payRent;
		this.canBuy = canBuy;
	}
	
	@Override
	public void affect(Player p)
	{
		p.setSpace(space, collectGoMoney, payRent, canBuy);
	}
}
