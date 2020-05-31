import java.awt.Image;

public class CardPile
{
	private Card[] cards;
	private int amountLeft;
	
	private Image coverImage;
	
	public CardPile(Card[] cards, Image coverImage)
	{
		this.cards = cards;
		amountLeft = cards.length;
		
		this.coverImage = coverImage;
	}
	
	public void shuffle()
	{
		for(int i = 0; i < cards.length; i++)
		{
			int here = (int)(Math.random() * cards.length);
			Card temp = cards[i];
			cards[i] = cards[here];
			cards[here] = temp;
		}
		
		amountLeft = cards.length;
	}
	
	public Card takeTop()
	{
		amountLeft--;
		
		Card ret = cards[amountLeft];
		
		if(amountLeft == 0)
			shuffle();
		
		return ret;
	}
	
	public Image getCoverImage()
	{
		return coverImage;
	}
}
