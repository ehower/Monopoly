import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Player
{
    private String name;
    private int space = 0;
    private int money = 1500;
    private List<Property> properties = new ArrayList<>();
    private Color color;
    private int jailFreeCards = 0;
    private boolean inJail = false;
    
    private boolean owesSpace = false;

    public Player(String n, Color c)
    {
        name = n;
        color = c;
    }
    public String getName()
    {
        return name;
    }
    public int getSpace()
    {
        return space;
    }
    public int getMoney()
    {
        return money;
    }
    public List<Property> getProperties()
    {
        return properties;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSpace(int s)
    {
        setSpace(s, true, true, true);
    }
    public void setSpace(int s, boolean collectGoMoney, boolean payRent, boolean canBuy)
    {
    	if(s < space && collectGoMoney) // Passed/On Go
    		setMoney(getMoney() + 200);
    	
    	this.space = s;
    	
    	if(canBuy)
    	{
    		switch(s)
    		{
    		case 0:
    		case 2:
    		case 4:
    		case 7:
    		case 10:
    		case 17:
    		case 20:
    		case 22:
    		case 30:
    		case 33:
    		case 36:
    		case 38:
    			ProcessingDriver.setDrawBuyMenu(false);
    			break;
			default:
				owesSpace = payRent;
				ProcessingDriver.setDrawBuyMenu(true);
    		}
    	}
    }
    public boolean isInJail()
    {
    	return inJail;
    }
    public void setJail(boolean inJail)
    {
    	this.inJail = inJail;
    }
    public boolean owesSpace()
    {
    	return owesSpace;
    }
    public void setOwesSpace(boolean b)
    {
    	this.owesSpace = b;
    }
    public void setMoney(int m)
    {
    	System.out.println("SET MONEY " + m);
        money = m;
        if(money < 0)
        	ProcessingDriver.lose(this); // gamer down
    }
    public void addProperty(Property p)
    {
        properties.add(p);
    }
    public void setColor(Color c)
    {
    	this.color = c;
    }
    public Color getColor()
    {
    	return color;
    }
    
    public void addGetOutOfJailCard()
    {
    	jailFreeCards++;
    }
    public boolean getOutOfJail()
    {
    	if(jailFreeCards > 0)
    	{
    		jailFreeCards--;
    		return true;
    	}
    	else
    		return false;
    }
}