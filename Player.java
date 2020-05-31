public class Player
{
    private String name;
    private int space = 0;

    public Player(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public int getSpace()
    {
        return space;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSpace(int s)
    {
        space = s;
    }
}