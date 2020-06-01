import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Player
{
    private String name;
    private int space = 0;
    private int money = 1500;
    private List<Property> properties = new ArrayList<>();
    private String color;
    private int jailFreeCards = 0;
    
    private boolean owesSpace = false;

    public Player(String n, String c)
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
    	
    	owesSpace = payRent;
    	
    	this.space = s;
    	
    	if(canBuy)
    	{
    		System.out.println("A BUY MENu HAS TO BE POPPED UP");
    	}
    }
    public boolean owesSpace()
    {
    	return owesSpace;
    }
    public void setMoney(int m)
    {
        money = m;
    }
    public void addProperty(Property p)
    {
        properties.add(p);
    }
    public void setColor(String c)
    {
    	this.color = c;
    }
    public String getColor()
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