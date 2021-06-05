public class GCD {
    public static int calcGCD(int a, int b) {
        if(b == 0)
            return a;
        return calcGCD(b, a % b);    
    }

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Incorrect number of arguments.\nUsage java GCD [number] [number]");
        }

        int a = 0, b = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println("Invalid integer(s) as argument.");
            return;
        }

        System.out.println(calcGCD(a, b));
    }
}
