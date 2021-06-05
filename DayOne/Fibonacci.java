public class Fibonacci {
    private static void fibShow(int a, int b, int iteration, int target) {
        if(iteration == target)
            return;
        
        System.out.println(a);

        fibShow(b, a+b, iteration + 1, target);
    }

    public static void fibonacci(int n) {
        fibShow(0,1,0,n);
    }

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Incorrect number of arguments.\nUsage java Fibonacci [number]");
        }

        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalid integer as argument.");
            return;
        }

        fibonacci(n);
    }
}
