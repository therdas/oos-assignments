class Employee
{
    String name;
    int id;
    Employee(){}
    Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String toString()
    {
        return name+" (ID "+id+ ") ";
    }
}

class Scientist extends Employee
{
    int no_of_publication;
    int experience;
    Scientist(){}
    Scientist(String name, int id, int no_of_publication, int experience)
    {
        super(name, id);
        this.no_of_publication=no_of_publication;
        this.experience=experience;
    }
    public String toString()
    {
        return super.toString() + " No. Of Publications: " + no_of_publication+" and Years of Experience: "+experience;
    }

}

class DScientist extends Scientist
{
    int award;
DScientist(String name, int id, int no_of_publication, int experience, int award)
    {
        super(name, id, no_of_publication, experience);
        this.award=award;
    }
    public String toString()
    {
        return super.toString() + " No of Awards: " + award;
    }

}

public class MainClass
{
    public static void main(String args[])
    {
        Employee obj1=new Employee("Rahul Das",1001);
        Scientist obj2=new Scientist("Mijanur Molla",1002, 5,2);
        DScientist obj3=new DScientist("Srilekha Chowdhury", 1003,  7, 3, 5);
        System.out.println("First Object is: "+obj1);
        System.out.println("Second Object is: " + obj2);
        System.out.println("Third Object is: "+obj3);
    }
}
