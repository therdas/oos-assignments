//Required for input
import java.util.Scanner;

/* Class Example
    This class contains one data element, data and the des
    -cription of the data element, description.
    This class may be used, for example, to store error 
    codes and their corresponding reasons.
*/
public class Example {
    private double data;
    private String description;

    //Get data from User as input and assign to local variables
    public void setData() {
        Scanner in = new Scanner(System.in);
        
        //The Try-Catch block catches errors in input, 
        //for example, if user enters string instead of a int.
        try {
            //Input the Description
            System.out.print("Enter description of the number: ");
            this.description = in.nextLine();

            //Input the number
            System.out.print("Enter the number: ");
            this.data = in.nextDouble();
        } catch(Exception err) {
            System.out.println("Invalid Input!");
        } 
    }

    //Getter method to return the data.
    public double getData() {
        return this.data;
    }

    //Getter method to return the description
    public String getDescription() {
        return this.description;
    }

    //This method allows us to directly use this object in a 
    //println statement.
    public String toString(){
        return this.description + ": " + this.data;
    }

    //This function prints some statistics about the number
    //Namely its square and square root
    public void printStats() {
        System.out.println("Square of the number is " + this.data*this.data);
        System.out.println("Square Root of the number is " + Math.sqrt(this.data));
    }
}