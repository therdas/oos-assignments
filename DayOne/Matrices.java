import java.util.Scanner;

public class Matrices {

    
    static final Scanner in = new Scanner(System.in);

    
    private static double[][] add(double[][] a, double[][] b) {
        
        if(a[0].length != b[0].length || a.length != b.length)
            return null;
        
        
        double[][] res = new double[a.length][a[0].length];

        
        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] + b[i][j];  
        
        
        return res;
    }

    
    private static double[][] subtract(double[][] a, double[][] b) {
        
        if(a[0].length != b[0].length || a.length != b.length)
            return null;
        
        
        double[][] res = new double[a.length][a[0].length];

        
        for(int i = 0; i < a.length; ++i) 
            for(int j = 0; j < a[0].length; ++j)
                res[i][j] = a[i][j] - b[i][j];  
        
        
        return res;
    }

    
    private static double[][] multiply(double[][] a, double[][] b) {
        
        if(a[0].length != b.length)
            return null;
        
        
        double[][] res = new double[a.length][b[0].length];

        
        for(int i = 0; i < a.length; ++i) {
            
            for(int j = 0; j < b[0].length; ++j){
                
                
                for(int k = 0; k < b.length; ++k){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        

        
        return res;
    }

    
    private static void print(double[][] a) {
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                System.out.print(a[i][j] + "\t");   
            }
            
            System.out.println();
        }
    }

    
    private static void input(String s, double[][] a) {
        
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j) {
                a[i][j] = in.nextDouble(); 
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
        
        
        if(m < 1 || n < 1 || p < 1 || q < 1) {
            System.out.println("Invalid dimensions. ");
            return;
        }
    

        
        double[][] a = new double[m][n];
        double[][] b = new double[p][q];

        
        System.out.println(" Enter the elements in the first matrix: ");
        input("A", a);

        
        System.out.println("Enter the elements in the second matrix: ");
        input("B", b);

        double res[][] = add(a, b);
        if(res == null) {
            System.out.println("Cannot add matrices!");
        } else {
            print(res);
        }

        res = subtract(a, b);
        if(res == null) {
            System.out.println("Cannot subtract matrices!");
        } else {
            print(res);
        }

        res = multiply(a, b);
        if(res == null) {
            System.out.println("Cannot multiply matrices!");
        } else {
            print(res);
        }

        
        in.close();
    }
}