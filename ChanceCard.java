//OK
import java.util.*;
public class ChanceCard
{
	//initializing the ArrayList
	ArrayList<Card> list = new ArrayList<Card>();
	private int startNum;

	//constructor
	public ChanceCard()
	{
		list.add(new Card("You hold the door for a teacher, move 4 spaces.", 1, 4));
		list.add(new Card("You found a mechanical pencil, collect $100.", 2, 100));
		list.add(new Card("You did not Settle, Settle when asked to, move 6 spaces back.", 1, -6));
		list.add(new Card("You volunteered to present a project, collect $50.", 2, 50));
		list.add(new Card("You ran in the halls, Miss Reed catches you, move back 3 spaces", 1, -3));
		list.add(new Card("You picked up trash in the lunch room and Dr. Malinoski saw you, collect $250.", 2, 250));
		list.add(new Card("You forgot you gym clothes, pay Coach Schelhorn $250", 1, -250));
		list.add(new Card("You got caught with your phone in class, move back 3 spaces.", 1, -3));
		list.add(new Card("You become President of your class, collect $300", 2, 300));
		list.add(new Card("You turn in your homework late, pay $100 to Miss Reed.", 2, -100));
		list.add(new Card("You tutor a CSF1 student, move 5 spaces.", 1, 5));
		list.add(new Card("You park in the wrong spot, pay Officer Schlottman.", 1, 100));
	}

	/*
		**Call this method first and once**
		then getCard will cycle through cards
	*/
	public void startNum()
	{
		Random random = new Random();
		startNum = random.nextInt(list.size());
	}
	public void getCard(Player p)
	{
		//gets Card and info
		Card c = list.get(startNum);
		int punish = c.getPunishment();
		int amount = c.getNum();

		//updates Player
		//1 is movment
		//2 is money
		if(punish == 1)
			p.setSpace(p.getSpace() + amount);
		else
			p.setMoney(p.getMoney() + amount);

		//a reset for end of list
		startNum = startNum++;
		if(startNum == list.size())
			startNum = 0;
	}
}