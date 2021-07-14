package pOne;
import java.util.Scanner;

//Base Class: Represents a rectangle
public class Rectangle {
    /* Why protected/public, not default access?
    ** This is because Rectangle is to be accessed in other packages,
    ** but the default-access, package-private, does not allow 
    ** us to use this class's variables or methods from packages
    ** other than the one this class is declared in. Hence, protected
    ** and/or public instance variables and methods have been used.
    */
    protected double width, height;    //data members

    //Default constructor, input data from user
    //has to be public otherwise we will not be able to instantize a
    //object of this class
    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = sc.nextInt();
        System.out.print("Enter the height: ");
        height = sc.nextInt();
    }

    //Parameterized constructor
    //Same reason for it being public as above
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Returns area
    public double area() {
        return width * height;
    }

    //Returns perimeter
    public double perimeter() {
        return 2*(width + height);
    }

    //Prints data about object
    public void print() {
        System.out.println("Rectangle (" + width + ", " + height + ") with perimeter " + perimeter() + "cm. and area " + area() + " sq.cm.");
    }
}
