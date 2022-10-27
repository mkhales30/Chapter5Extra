/**
 * class name: Poem
 * author: Monauver Rahman
 * course: ITEC 2150
 * date: October 26, 2022
 * version 1.0
 * description: A class representing information about a poem for use in Chapter 5 Exercise 2
 *
  */
public class Poem
{
    private String name;
    private String poet;
  
    public Poem()
    {
        name = "unknown";
        poet = "unknown";
    }
    public String getName()
    {
        return name;
    }
  
    public void setName(String name)
    {
        this.name = name;
    }

    public String getPoet()
    {
        return poet;
    }

    public void setPoet(String poet)
    {
        this.poet = poet;
    }

    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

}
