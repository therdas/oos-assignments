import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Equation: ax^2 + bx + c = 0");
        System.out.print("[a]: ");
        double a = sc.nextDouble();
        System.out.print("[b]: ");
        double b = sc.nextDouble();
        System.out.print("[c]: ");
        double c = sc.nextDouble();

        double d = Math.pow(b,2.0) - 4*a*c;
        if(a == 0) {
            double r = -c / b;
            System.out.println("{"+ r +"}");
        } else if (d < 0) {
            System.out.println("{}");
        } else if(d == 0) {
            double r = (-b) /  (2 * a);
            System.out.println("{" + r + "}");
        } else {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("{"+ r1 +", "+ r2 + "}");
        }
        sc.close();
    }
}
