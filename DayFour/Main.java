import pTwo.Square;

//Simple class to drive a Square object
public class Main {
    //Main method
    public static void main(String[] args) {
        Square s = new Square();        //Create using parameterless constructor
                                          //that is, with user input
        Square r = new Square(5);       //Create using parameterized constructor

        //Print the two squares.
        System.out.println("Printing the two squares... ");
        s.print();
        r.print();
    }
}
