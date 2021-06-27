import java.util.Scanner;

public class StudentB {
    private static class Subject {
        String title;
        double internalMarks;
        double theoryMarks;

        public String toString() {
            return "Subject: " + title + ",\tInternal Marks: " + internalMarks + ",\tTheory Marks: " + theoryMarks + ",\tTotal marks: " + (internalMarks + theoryMarks);
        }

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
    private Subject[] subjects;
    

    public StudentB(String name, String stream, String college, String university, int rollNo, Subject[] subjects) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
        this.subjects = new Subject[6];
        for(int i = 0; i < 6; ++i)
            this.subjects[i] = new Subject();

        for(int i = 0; i < 6; ++i) {
            this.subjects[i].copyFrom(subjects[i]);
        }
    }

    public void print() {
        System.out.println("Student Name: " + name + "\n=========================");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
        System.out.println("University: " + university);
        System.out.println("Marks\n-------------------------");
        int total = 0;
        
        for(Subject i: subjects){
            System.out.println(i);
            total += i.internalMarks + i.theoryMarks;
        }
        System.out.println("Grand Total: " + total);
    }

    public static StudentB inputAndBuild() {
        int rollNo;
        String name, stream, college, university;
        Subject[] subjects = new Subject[6];
        for(int i = 0; i < 6; ++i)
            subjects[i] = new Subject();
        
        //Input A:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No.: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Stream: ");
        stream = sc.nextLine();
        System.out.print("Enter Student College: ");
        college = sc.nextLine();
        System.out.print("Enter Student University: ");
        university = sc.nextLine();

        System.out.println("Enter Subject Details: ");
        for(int i = 0; i < 6; ++i) {
            System.out.print("Enter Subject " + (i+1) + " Name:");
            subjects[i].title = sc.nextLine();
            System.out.print("Enter Internal Marks: ");
            subjects[i].internalMarks = sc.nextDouble();
            System.out.print("Enter Theory Marks: ");
            subjects[i].theoryMarks = sc.nextDouble();
            sc.nextLine();
        }

        return new StudentB(name, stream, college, university, rollNo, subjects);
    }

    public static void main(String[] args) {
        System.out.println("Enter the details of the two students: ");
        
        StudentB a = inputAndBuild();
        StudentB b= inputAndBuild();
        
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
