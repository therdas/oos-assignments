import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; ++i){
            System.out.print("["+(i+1)+"]: ");
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int i: arr) 
            sum += i;
        
        System.out.print("The sum is " + sum + " and the average is " + (sum/n));
        in.close();
    }
}
