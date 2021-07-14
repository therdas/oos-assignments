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
    public Square() {
        super(0,0); //Set "empty" rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        width = sc.nextInt();
        height = width; //Set width and height to the same value
    }

    //Parameterized constructor, invokes base constructor with the
    //same two values
    public Square(int side) {
        super(side, side);
    }

    //Overridden print method, prints details about the object
    @Override
    public void print() {
        System.out.println("Square with side " + width + ", perimeter " + perimeter() + "cm. and area " + area() + " sq.cm.");
    }
}
