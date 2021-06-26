import java.util.Scanner;

public class StudentC {
    private static class Subject {
        String title;
        double internalMarks;
        double theoryMarks;

        public Subject(String t, int i, int th) {
            title = t; internalMarks = i; theoryMarks = th;
        }

        public String toString() {
            return "Subject: " + title + ",\tInternal Marks: " + internalMarks + ",\tTheory Marks: " + theoryMarks + ",\tTotal Marks" + (theoryMarks + internalMarks);
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
    

    public StudentC(String name, String stream, String college, String university, int rollNo, Subject... subjects) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
        this.subjects = new Subject[subjects.length];
        for(int i = 0; i < subjects.length; ++i) {
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


    public static void main(String[] args) {
        System.out.println("Enter the details of the two students: ");
        
        StudentC a = new StudentC("Rahul Das", "Computer Science", "UCSTA", "Calcutta University", 4, new Subject("Computer Networks", 80,20), new Subject("SE", 70, 30), new Subject("DAA", 75, 25), new Subject("OOS", 80,25));
        StudentC b = new StudentC("Rohan Chackraborty", "Computer Science", "UCSTA", "Calcutta University", 4, new Subject("Data Communications", 60,20), new Subject("ADS", 75, 30), new Subject("Architecture", 73, 25), new Subject("DBMS", 83,25));
        
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
