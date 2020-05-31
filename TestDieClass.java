import java.util.Scanner;
public class TestDieClass
{
 public static void main(String[]args)
 {
	Die die = new Die();
	
	System.out.println(Die.definition());

	die.rollDice();
	int result = die.getResult();

	System.out.println(die);





 }

}
