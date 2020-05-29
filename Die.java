import java.util.Scanner;
public class Die
{
	//variables - dice1 = result of dice1, dice2 = result of dice2, rolledDoubles = dice values are equal, result = sum of dice values
	private int dice1;
	private int dice2;
	private boolean rolledDoubles;
	private int result;

	//no args constructor
	public Die()
	{
		dice1 = 0;
		dice2 = 0;
		rolledDoubles = false;
		result = 0;
	}
	//toString method returns information on what the dice rolled
	public String toString()
	{
		return "Dice 1 result = " + dice1 + "\nDice 2 Result = " + dice2 + "\nResult = " + result + "\nIs a double = " + rolledDoubles;
	}
	//Static Method for class definition
	public static String definition()
	{
		return "The Die class consists of two dice integer variables which each have 6 faces.\nBoth dice are rolled when rollDice() is called.\nWhen rollDice() is called the two dice will sum toghether to yield the int varaible result\nresult is how many spaces a player moves.\nrollDice() does not return anything, and to acsess the changed variables, use the acsessor methods provided for each variable\nThe boolean rolledDoubles simply states whether the dice valuse rolled were the same.";
	}

	public void rollDice()
	{

		dice1 = 1 + (int)(Math.random()*6);
		dice2 = 1 + (int)(Math.random()*6);
		if(dice1 == dice2)
		{
			rolledDoubles = true;
		}
		else
		{
			rolledDoubles = false;
		}
		result = dice1 + dice2;

	}

	public boolean getRolledDoubles()
	{
		return rolledDoubles;
	}

	public int getDice1()
	{
		return dice1;
	}

	public int getDice2()
	{
		return dice2;
	}

	public int getResult()
	{
		return result;
	}
}
