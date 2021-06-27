public class StudentC {
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

        //Parameterless constructor
        public Subject() {}

        //Parameterised constructor
        public Subject(String t, int i, int th) {
            title = t; internalMarks = i; theoryMarks = th;
        }

        //To Print the information stored along with the aggregate
        public String toString() {
            return "Subject: " + title + ",\tInternal Marks: " + internalMarks + ",\tTheory Marks: " + theoryMarks + ",\tTotal Marks" + (theoryMarks + internalMarks);
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
    public StudentC(String name, String stream, String college, String university, int rollNo, Subject... subjects) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
        this.subjects = new Subject[subjects.length];       //Create array
        for(int i = 0; i < subjects.length; ++i){    
            this.subjects[i] = new Subject();               //Create elements
            this.subjects[i].copyFrom(subjects[i]);         //and copy over values
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
        int total = 0;

        //Print individual subject marks
        for(Subject i: subjects){
            System.out.println(i);
            total += i.internalMarks + i.theoryMarks;
        }

        //and print total
        System.out.println("Grand Total: " + total);
    }


    //Static main method to drive instances of the class
    public static void main(String[] args) {
        System.out.println("Enter the details of the two students: ");
        
        //Make two objects
        StudentC a = new StudentC("Jhumpa Das", "Computer Science", "UCSTA", "Calcutta University", 35, new Subject("Computer Networks", 80,20), new Subject("SE", 70, 30), new Subject("DAA", 75, 25), new Subject("OOS", 75,25), new Subject("Compiler Design", 70, 30));
        StudentC b = new StudentC("Rohan Chackraborty", "Computer Science", "UCSTA", "Calcutta University", 42, new Subject("Data Communications", 60,20), new Subject("ADS", 70, 30), new Subject("Architecture", 73, 25), new Subject("DBMS", 83,15));
        
        //Print details
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
