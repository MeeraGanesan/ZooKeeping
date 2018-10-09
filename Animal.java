import java.util.*;
public class Animal
{
    public int ID;
    public String name;
    public int cageno;
    public String species;
    public Animal(int id,String n,int cage,String spec)
    {
        ID=id;
        name=n;
        cageno=cage;
        species=spec;
    }
    public String getName()
    {
        return name;
    }
    public String getSpecies()
    {
        return species;
    }
    public int getCageNo()
    {
        return cageno;
    }
    public int getID()
    {
        return ID;
    }
    public String toString()
    {
        return(name+"\t"+species);
    }
}