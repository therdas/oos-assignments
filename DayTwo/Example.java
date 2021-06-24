
import java.util.Scanner;

public class Example {
    private int data;
    private String description;

    public void setData() {
        Scanner in = new Scanner(System.in);
        
        try {

            System.out.print("Enter description of the number: ");
            this.description = in.nextLine();
            System.out.print("Enter the number: ");
            this.data = in.nextInt();

        } catch(Exception err) {
            System.out.println("Invalid Input!");
        } finally {
            in.close();
        }
    }

    public int getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString(){
        return this.description + ": " + this.data;
    }

    public void printStats() {
        System.out.println("Square of the number is " + this.data*this.data);
    }
}