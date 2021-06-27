import java.util.Scanner;

public class StudentA {
    private int rollNo;
    private String name;
    private String stream;
    private String college;
    private String university;

    public StudentA() {
        name = stream = college = university = "";
    }

    public StudentA(String name, String stream, String college, String university, int rollNo) {
        this.name = name;
        this.stream = stream;
        this.rollNo = rollNo;
        this.college = college;
        this.university = university;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
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
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }

    public void print() {
        System.out.println("Student Name: " + name + "\n========================");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Stream: " + stream);
        System.out.println("College: " + college);
        System.out.println("University: " + university);
    }

    public static void main(String[] args) {
        //Make student a using constructor, b using user input.
        StudentA a = new StudentA("Mou Sengupta", "Sociology", "Calcutta University", "Calcutta University", 501);
        StudentA b = new StudentA();
        System.out.println("Enter the details of the second student: ");
        b.input();
        System.out.println("The given details are: ");
        a.print();
        b.print();
    }
}
