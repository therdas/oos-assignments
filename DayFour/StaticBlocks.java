//Parent class to test order of execution of static blocks
class Parent{
    public static int count;    //Variable counts the number of instances of Parent
    public int data;            //Stores data

    //Initialize the count variable to 0 for first object creation
    static {
        System.out.println("Within first Static Block of Parent Class");
        count = 0;
    }

    //Parent Constructor
    Parent(int d) {
        System.out.println("Within constructor of Parent Class");
        System.out.println("Made new Parent object...");            //print
                                                                    //info
        ++count;            //Increment the number of objects
        data = d;           //Populate Data
        //Print object information
        System.out.println("Current Parent object is " + count + " with data " + data);
    }

    static {
        System.out.println("Within second Static Block of Parent Class");
    }

    static {
        System.out.println("Within third Static Block of Parent Class");
    }
}

//Child class to test the order of execution of static blocks
class Child extends Parent{
    public static int count;    //Stores the number of instances
    public int data;            //Stores data

    //Initialize count to 0 to prepare for initialization of first instance
    static {
        System.out.println("Within first Static Block of Child Class");
        count = 0;
    }

    //Child Constructor
    Child(int d1, int d2) {
        super(d2);              //Initialize parent
        System.out.println("Within constructor of Child Class");//Print
        System.out.println("Made new Child object...");         //info
        data = d1;
        //Increment the number of instances
        ++count;

        //Print details of the object just created
        System.out.println("Current Child object is " + count + " with data " + data);
    }

    static {
        System.out.println("Within second Static Block of Child class");
    }

    static {
        System.out.println("Within third Static Block of Child class");
    }
}


//Simple class to drive the above two class's objects
public class StaticBlocks {
    //Main method
    public static void main(String[] args) {
        Child c = new Child(5,7);   //Make Child object
        Child d = new Child(8,9);   //Make Child object
        Parent e = new Parent(10);  //Make Parent object
    }
}