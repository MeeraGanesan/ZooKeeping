import java.util.*;
public class MainZoo
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        Zoo Z=new Zoo();
        Z.addanimal(new Animal(1,"cow",24,"mammal"));
        Z.addanimal(new Animal(2,"parrot",28,"bird"));
        Z.addanimal(new Animal(3,"alligator",23,"reptile"));
        Z.addanimal(new Animal(4,"goat",14,"mammal"));
        Z.addanimal(new Animal(5,"donkey",18,"mammal"));
        Z.addanimal(new Animal(6,"cuckoo",12,"bird"));
        Z.addanimal(new Animal(7,"snake",13,"reptile"));
        Z.addanimal(new Animal(8,"lizard",44,"reptile"));
        Z.addanimal(new Animal(9,"crow",73,"bird"));
        Z.addanimal(new Animal(10,"pigeon",11,"bird"));
        System.out.println("Details");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Cage No."+"\t"+"Species");
        Z.display();
        System.out.println("Enter the ID number of the animal to be found");
        int cn=SC.nextInt();
        cn=Z.cagenumber(4);
        System.out.println("Cage number="+cn);
        System.out.println();
        System.out.println("Grouping animals according to their species:");
        Z.GroupSpecies();
    }
}