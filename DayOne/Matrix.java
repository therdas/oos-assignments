import java.util.Scanner;

public class Matrix {
    static final Scanner in = new Scanner(System.in);

    private static int[][] add(int[][] a, int[][] b) {
        if(a[0].length != b.length)
            return null;
        
        int[][] res = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] + b[i][j];
        
        return res;
    }

    private static int[][] subtract(int[][] a, int[][] b) {
        if(a[0].length != b.length)
            return null;
        
        int[][] res = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] - b[i][j];
        
        return res;
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        if(a.length != b.length || a[0].length != b[0].length)
            return null;
        
        int[][] res = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < b.length; ++j){
                for(int k = 0; k < a[0].length; ++k){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return res;
    }

    private static void print(String s, int[][] a) {
        if(a == null){
            System.out.println("Cannot perform " + s + " on array.");
            return;
        }

        System.out.println("The resultant array after "+s+" is: ");
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void input(String s, int[][] a) {
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                System.out.print(s + "["+(i+1)+"]["+(j+1)+"]: ");
                a[i][j] = in.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(" Enter the dimensions of the first matrix ([row] [column]) separated by a space: ");
        int m = in.nextInt();
        int n = in.nextInt();

        System.out.print("Enter the dimensions of the second matrix ([row] [column]) separated by a space: ");
        int p = in.nextInt();
        int q = in.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[p][q];

        System.out.println(" Enter the elements in the first matrix: ");
        input("A", a);

        System.out.println("Enter the elements in the second matrix: ");
        input("B", b);

        print("addition", add(a,b));
        print("subtraction", subtract(a,b));
        print("multiplication", multiply(a,b));

        in.close();
    }
}