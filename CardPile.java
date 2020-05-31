public class CardPile
{
	private Card[] cards;
	private int amountLeft;
	
	public CardPile(Card[] cards)
	{
		this.cards = cards;
		amountLeft = cards.length;
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
}
