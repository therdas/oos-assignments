import java.util.Scanner;

public class aAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //Create Scanner
        
        //Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        //Check if number of elements is correct
        if(n < 1) {
            System.out.println("Invalid number of elements, please enter a value >= 1");
            in.close();
            return;
        }

        //Create Array
        int[] arr = new int[n];

        //Input the elements of the array
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; ++i){
            System.out.print("["+(i+1)+"]: ");      //Prints [1], [2], ...
            arr[i] = in.nextInt();
        }

        //Find sum
        int sum = 0;
        for(int i: arr) 
            sum += i;
        
        //Print sum and average
        System.out.print("The sum is " + sum + " and the average is " + (sum/n));

        //Close input stream
        in.close();
    }
}
