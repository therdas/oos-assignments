package pTwo;
import pOne.Rectangle;
import java.util.Scanner;

//Child class: Represents a Square
/*
** We can implement/inherit from rectangle most
** of our methods, by simply setting width and
** height of the rectangle to the same value.
*/
public class Square extends Rectangle {
    //Constructor that initializes object with user input
    /* Why protected/public, not default access?
    ** This is because Square is to be accessed in other packages,
    ** but the default-access, package-private, does not allow 
    ** us to use this class's variables or methods from packages
    ** other than the one this class is declared in. Hence, protected
    ** and/or public instance variables and methods have been used.
    */
    public Square() {
        super(0,0); //Set "empty" rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        width = sc.nextInt();
        height = width; //Set width and height to the same value
    }

    //Parameterized constructor, invokes base constructor with the
    //same two values
    //Has to be public or we won't be able to create objects outside this
    //Class's declaration
    public Square(double side) {
        super(side, side);
    }

    //Overridden print method, prints details about the object
    @Override
    public void print() {
        System.out.println("Square with side " + width + ", perimeter " + perimeter() + "cm. and area " + area() + " sq.cm.");
    }
}
