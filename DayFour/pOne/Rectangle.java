package pOne;
import java.util.Scanner;

//Base Class: Represents a rectangle
public class Rectangle {
    protected int width, height;    //data members

    //Default constructor, input data from user
    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = sc.nextInt();
        System.out.print("Enter the height: ");
        height = sc.nextInt();
    }

    //Parameterized constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Returns area
    public int area() {
        return width * height;
    }

    //Returns perimeter
    public int perimeter() {
        return 2*(width + height);
    }

    //Prints data about object
    public void print() {
        System.out.println("Rectangle (" + width + ", " + height + ") with perimeter " + perimeter() + "cm. and area " + area() + " sq.cm.");
    }
}
