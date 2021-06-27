import java.util.Scanner;

/* This class represents a book. It contains
** the name of the book and that of the aut-
** hor.
*/
class Book {
    private String name;
    private String author;
    
    //Constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    //Constructor that copies another object
    //'s state onto this object
    public Book(Book other) {
        this.name = other.name;
        this.author = other.author;
    }

    //Overriding toString to be able to easily print the
    //object
    public String toString() {
        return "Book: " + name + " by " + author;
    }
}

/* This class represents a library. For the purpose of this
** excercise we assume that the library contains only one
** book. It also provides functions to create, store books
** and clone itself.
*/
public class Library {
    private Book b;

    //Parameterless constructor: Set book to NA/NA
    Library() {
        b = new Book("NA", "NA");
    }

    //Change book
    void setBook(Book b) {
        this.b = new Book(b);
    }

    //Print the book
    void printBook(Book b) {
        System.out.println("Book: " + b);
    }

    //Make a clone of the library
    /*
    ** (!) This function returns a reference to same class's
    **     object
    */
    Library makeCopy() {
        Library ret = new Library();
        ret.b = new Book(b);
        return ret;
    }

    //Override toString to provide easier printing support
    public String toString() {
        return "This Library contains " + b;
    }

    //Create a book with input from the user.
    /*
    ** (!) This function returns a reference to another class's
    **     object
    */
    Book makeBook() {
        Scanner in = new Scanner(System.in);    //Make Book
        
        System.out.println("Enter the name of the book: ");
        String bv = in.nextLine();              //Get Name

        System.out.println("Enter the name of the author: ");
        String av = in.nextLine();              //Get Author

        return new Book(bv, av);                //Return reference to 
                                                //the book
    }

    //Main function to drive the class
    public static void main(String[] args) {
        System.out.println("Creating Library...");  //Make library
        
        Library l = new Library();
        System.out.println(l);

        System.out.println("Creating book...");     //Make and Assign Book
        Book b = l.makeBook();
        System.out.println(b);

        System.out.println("Assigning book to Library...");
        l.setBook(b);
        System.out.println(l);

        System.out.println("Copying Library...");   //Clone Library
        Library r = l.makeCopy();
        System.out.println(r);
    }
}

