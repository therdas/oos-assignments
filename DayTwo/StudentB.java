import java.util.Scanner;

//Class Student for Assignment B
public class StudentB {
    /*
    ** Inner nested class that contains information about
    ** the subjects encapsulated into one object
    ** Declared static so not tied to any instance of 
    ** outer class.
    */
    private static class Subject {
        String title;
        double internalMarks;
        double theoryMarks;

        //To Print the information stored along with the aggregate
        public String toString() {
            return "Subject: " + title + ",\tInternal Marks: " + internalMarks + ",\tTheory Marks: " + theoryMarks + ",\tTotal marks: " + (internalMarks + theoryMarks);
        }

        //To create a object from another, useful for copying passed arguments.
        public void copyFrom(Subject other) {
            this.title = other.title;
            this.internalMarks = other.internalMarks;
            this.theoryMarks = other.theoryMarks;
        }
    }


    private int rollNo;
    private String name;
    private String stream;
    private String college;
    private String university;
    private Subject[] subjects; //This stores the information about subjects
    
    //Parameterised constructor to initialize an object
    public StudentB(String name, String stream, String college, String university, int rollNo, Subject[] subjects) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
        this.subjects = new Subject[6];

        //Create subject objects
        for(int i = 0; i < 6; ++i){
            this.subjects[i] = new Subject();

            //And copy data onto them
            this.subjects[i].copyFrom(subjects[i]);
        }
    }

    //Print student details
    public void print() {
        System.out.println("Student Name: " + name + "\n=========================");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
        System.out.println("University: " + university);
        System.out.println("Marks\n-------------------------");
        
        int total = 0; //Store total 
        
        //Print marks details
        for(Subject i: subjects){
            System.out.println(i);
            total += i.internalMarks + i.theoryMarks;
        }

        //Print grand total
        System.out.println("Grand Total: " + total);
    }

    //Factory that inputs data and creates object
    public static StudentB inputAndBuild() {
        //Create locals for storing intermediate information to 
        //be passed onto constructor
        int rollNo;
        String name, stream, college, university;
        Subject[] subjects = new Subject[6];
        for(int i = 0; i < 6; ++i)
            subjects[i] = new Subject();    //Create and allocate subjects
        
        //Input A:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No.: ");
        rollNo = sc.nextInt();
        sc.nextLine();                      //Discard newline
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Stream: ");
        stream = sc.nextLine();
        System.out.print("Enter Student College: ");
        college = sc.nextLine();
        System.out.print("Enter Student University: ");
        university = sc.nextLine();

        //Loop over and input subject information
        System.out.println("Enter Subject Details: ");
        for(int i = 0; i < 6; ++i) {
            System.out.print("Enter Subject " + (i+1) + " Name:");
            subjects[i].title = sc.nextLine();
            System.out.print("Enter Internal Marks: ");
            subjects[i].internalMarks = sc.nextDouble();
            System.out.print("Enter Theory Marks: ");
            subjects[i].theoryMarks = sc.nextDouble();
            sc.nextLine();                      //Discard information
        }

        //Return new object
        return new StudentB(name, stream, college, university, rollNo, subjects);
    }

    //Static main method to drive instances of the class
    public static void main(String[] args) {
        System.out.println("Enter the details of the two students: ");
        
        //Make objects
        StudentB a = inputAndBuild();
        StudentB b= inputAndBuild();
        
        //And print
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
