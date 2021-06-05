import java.util.Scanner;

public class Sum {
    private static double pow(double a, int b) {
        double prod = 1.0;
        for(int i = 0; i < b; ++i) prod *= a;
        return prod;
    }

    private static double seriesSum (double x, int n) {
        double sum = 0.0;
        for(int i = 0; i < n; ++i)
            sum += pow(x, i);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println(seriesSum(x, n));
        sc.close();
    }
}
