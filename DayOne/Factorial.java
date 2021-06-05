public class Factorial {
    public static int factorial(int n) {
        if(n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Incorrect number of arguments.\nUsage java Factorial [number]");
        }

        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalid integer as argument.");
            return;
        }

        System.out.println(factorial(n));
    }
}
