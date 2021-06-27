import java.util.Scanner;

public class StudentA {
    private int rollNo;
    private String name;
    private String stream;
    private String college;
    private String university;

    //Parameterless constructor that assigns empty values.
    //RollNo is 0 by default so we do not initalize that.
    public StudentA() {
        name = stream = college = university = "";
    }

    //Constructor with parameters
    public StudentA(String name, String stream, String college, String university, int rollNo) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
    }

    //This initializes the class based on inputs provided by the user
    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Student Roll No.: ");
            rollNo = sc.nextInt();                      //Input Roll No
            sc.nextLine();                              //Discard NewLine
            System.out.print("Enter Student Name: ");
            name = sc.nextLine();                       //Input Name
            System.out.print("Enter Student Stream: ");
            stream = sc.nextLine();                     //Input Stream
            System.out.print("Enter Student College: ");
            college = sc.nextLine();                    //Input College
            System.out.print("Enter Student University: ");
            university = sc.nextLine();                 //Input University
        } catch (Exception e) {
            System.out.println("Invalid input!");       //In case of invalid input
                                                        //Eg string instead of int
        }
    }

    //Method that prints the values in the object
    public void print() {
        System.out.println("Student Name: " + name + "\n========================");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
        System.out.println("University: " + university);
    }

    //Driver static method for the class
    public static void main(String[] args) {
        //Make student a using constructor, b using user input.
        StudentA a = new StudentA("Mou Sengupta", "Sociology", "Calcutta University", "Calcutta University", 501);
        StudentA b = new StudentA();
        System.out.println("Enter the details of the second student: ");
        b.input();

        //Print student details
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
