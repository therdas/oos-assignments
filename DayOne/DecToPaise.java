import java.util.Scanner;

public class DecToPaise {
    public static void main (String args[]) {
        if(args.length == 0) {
            Scanner sc = new Scanner(System.in);
            try {
                double d = sc.nextDouble();
                System.out.println((int)(d*100));
            } catch(Exception e) {
                System.out.println("Not a valid number.");
            }
            sc.close();
        } else if(args.length != 1) {
            System.out.println("Invalid number of arguments.");
            System.out.println("Usage: DecToPaise [number in decimal]");
        } else {
            double d = 0.0;
            try {
                d = Double.parseDouble(args[0]);
            } catch (Exception e) {
                System.out.println("Not a valid number.");
                return;
            }
            System.out.println((int)(d*100));
        } 
    }
}
