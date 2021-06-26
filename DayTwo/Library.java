import java.util.Scanner;

class Book {
    private String name;
    private String author;
    
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(Book other) {
        this.name = other.name;
        this.author = other.author;
    }

    public String toString() {
        return "Book: " + name + " by " + author;
    }
}


public class Library {
    private Book b;

    Library() {
        b = new Book("NA", "NA");
    }

    void setBook(Book b) {
        this.b = new Book(b);
    }

    void printBook(Book b) {
        System.out.println("Book: " + b);
    }

    Library makeCopy() {
        Library ret = new Library();
        ret.b = new Book(b);
        return ret;
    }

    public String toString() {
        return "This Library contains " + b;
    }

    Book makeBook() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the name of the book: ");
        String bv = in.nextLine();

        System.out.println("Enter the name of the author: ");
        String av = in.nextLine();

        in.close();
        return new Book(bv, av);          
    }

    public static void main(String[] args) {
        System.out.println("Creating Library...");
        
        Library l = new Library();
        System.out.println(l);

        System.out.println("Creating book...");
        Book b = l.makeBook();
        System.out.println(b);

        System.out.println("Assigning book to Library...");
        l.setBook(b);
        System.out.println(l);

        System.out.println("Copying Library...");
        Library r = l.makeCopy();
        System.out.println(r);
    }
}

