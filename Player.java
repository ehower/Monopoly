public class Player
{
    private String name;
    private int space = 0;
    private int money = 1500;
    private String properties;
    private String color;

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
    public String getProperty()
    {
        return properties;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSpace(int s)
    {
        space = s;
    }
    public void setMoney(int m)
    {
        money = m;
    }
    public void setProperty(String p)
    {
        properties = p;
    }
}