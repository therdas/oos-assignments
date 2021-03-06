import java.util.Scanner;

public class Matrix {

    //Create Scanner as class variable, this way all methods can use it.
    static final Scanner in = new Scanner(System.in);

    //Function to compute the sum of two matrices, a and b
    private static double[][] add(double[][] a, double[][] b) {
        //Check if matrices compatible
        if(a[0].length != b[0].length || a.length != b.length)
            return null;
        
        //Create array
        double[][] res = new double[a.length][a[0].length];

        //Loop over each element of each array and 
        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] + b[i][j];  //add and store in res
        
        //Return result
        return res;
    }

    //Function to compute the difference of two matrices, a and b
    private static double[][] subtract(double[][] a, double[][] b) {
        //Check if matrices compatible
        if(a[0].length != b[0].length || a.length != b.length)
            return null;
        
        //Create array
        double[][] res = new double[a.length][a[0].length];

        //Loop over each element of each array and 
        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] - b[i][j];  //subtract and store in res
        
        //Return result
        return res;
    }

    //Function to compute the product of two matrices, a and b
    private static double[][] multiply(double[][] a, double[][] b) {
        //Check if matrices compatible
        if(a[0].length != b.length)
            return null;
        
        //Create array
        double[][] res = new double[a.length][b[0].length];

        //Loop over rows of first array
        for(int i = 0; i < a.length; ++i) {
            //and columns of the second array
            for(int j = 0; j < b[0].length; ++j){
                //and perform dot product of the row and transpose of column
                //vector
                for(int k = 0; k < b.length; ++k){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        

        //Return result
        return res;
    }

    //Utility method to print a matrix
    private static void print(String s, double[][] a) {
        //Check if matrix null
        if(a == null){
            System.out.println("Cannot perform " + s + " on array.");
            return;
        }

        //This prints the operation just performed
        System.out.println("The resultant array after "+s+" is: ");

        //Loop over and
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                System.out.print(a[i][j] + "\t");   //print matrix
            }
            //Go to next line
            System.out.println();
        }
    }

    //Utility method to input an array
    private static void input(String s, double[][] a) {
        //Loop over the matrix and
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                //This prints A[1][1], A[1][2], ...
                System.out.print(s + "["+(i+1)+"]["+(j+1)+"]: ");
                a[i][j] = in.nextDouble(); //input elements
            }
        }
    }

    public static void main(String[] args) {
        //Input the dimensions of the first matrix
        System.out.print(" Enter the dimensions of the first matrix ([row] [column]) separated by a space: ");
        int m = in.nextInt();
        int n = in.nextInt();

        //Input the dimensions of the second matrix
        System.out.print("Enter the dimensions of the second matrix ([row] [column]) separated by a space: ");
        int p = in.nextInt();
        int q = in.nextInt();
        
        //Check for invalid dimensions
        if(m < 1 || n < 1 || p < 1 || q < 1) {
            System.out.println("Invalid dimensions. ");
            return;
        }
    

        //Create the matrices
        double[][] a = new double[m][n];
        double[][] b = new double[p][q];

        //Input matrix A
        System.out.println(" Enter the elements in the first matrix: ");
        input("A", a);

        //Input matrix B
        System.out.println("Enter the elements in the second matrix: ");
        input("B", b);

        //Perform the different operations on both the matrices
        print("addition", add(a,b));
        print("subtraction", subtract(a,b));
        print("multiplication", multiply(a,b));

        //Close input stream
        in.close();
    }
}