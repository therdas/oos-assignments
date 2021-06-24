import java.util.Scanner;
public class aGCD {

    //Calculate GCD by Euclid's method
    public static int calcGCD(int a, int b) {
        if(b == 0)                  //Base Case
            return a;
        return calcGCD(b, a % b);   //Recursion
    }

    public static void main(String[] args) {
        //Creating Scanner
        Scanner in = new Scanner(System.in);

        //Variable to store the numbers
        int a = 0, b = 0;
        
        //Input the numbers (positive only)
        System.out.print("Enter the two numbers (separated by a space, eg. a b): ");
        a = Math.abs(in.nextInt());
        b = Math.abs(in.nextInt());

        //Check for zero
        if(a == 0 || b == 0)
            System.out.println("GCD: 0");
        else
            System.out.println("GCD: " + calcGCD(a, b));  //Print GCD

        //Close input Stream
        in.close();
    }
}
