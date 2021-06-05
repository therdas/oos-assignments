import java.util.Scanner;

public class Fahren2Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Degrees Fahrenheit: ");
        try {
            double f = sc.nextDouble();
            double c = (f-32)/1.8;
            System.out.println("> " + c + " degrees Celcius");
        } catch (Exception e) {
            System.out.println("! Invalid number.");
        } finally {
            sc.close();
        }
    }
}
