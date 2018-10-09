import java.util.*;
public class Zoo
{
    public List<Animal> a;
    public Zoo()
    {
      a=new ArrayList<Animal>();
    }
    public void addanimal(Animal A)
    {
        String name1=A.getName();
        int i=0;
        boolean insert=false;
        for(i=0; i<a.size(); i++)
        {
            String name2=a.get(i).getName();
            if ((name2.compareTo(name1)>0))
            {
            a.add(i,A);
            insert=true;
            break;
            }
            
        }
        
        if(!insert)
           a.add(A);
        
    }
    public ArrayList<String> getSpecies(String name)
    {
        ArrayList<String> names=new ArrayList<String>();
        for (int i=0;i<a.size();i++)
        {
            if (a.get(i).getSpecies().equals(name))
            {
                names.add(a.get(i).getName());
            }
        }
                
        return names;
    }
    public int cagenumber(int idno)
    {
        int cage=-1;
        for (int i=0;i<a.size();i++)
        {
            if (a.get(i).getID()==idno)
            {
                cage=a.get(i).getCageNo();
            }
        }
        return cage;
    }
    public void GroupSpecies()
    {
        ArrayList<Animal> bird=new ArrayList<Animal>();
        ArrayList<Animal> reptile=new ArrayList<Animal>();
        ArrayList<Animal> mammal=new ArrayList<Animal>();
        for (int i=0;i<a.size();i++)
        {
            if (a.get(i).getSpecies().equals("bird"))
            {
                bird.add(a.get(i));
            }
            else if (a.get(i).getSpecies().equals("reptile"))
            {
                reptile.add(a.get(i));
            }
            else
            {
                mammal.add(a.get(i));
            }
        }
        System.out.println(bird);
        System.out.println();
        System.out.println(reptile);
        System.out.println();
        System.out.println(mammal);
    }
    public void display()
    {
        for (int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).getID()+"\t"+a.get(i).getName()+"\t"+a.get(i).getCageNo()+"\t"+a.get(i).getSpecies());
        }
    }
} 