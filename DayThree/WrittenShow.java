//Abstract class that represents the base of a class hierarchy
//with method show()
abstract public class WrittenShow {
    private String title;               //Stores name of Work
    private String author;              //Stores name of Author

    //Constructor to initialize the two values
    public WrittenShow(String t, String a) {
        author = a;
        title = t;
    }

    //The overloadable method to show the value of the members
    //of the objects
    public void show() {
        System.out.println(title + ", by " + author);
    }
}