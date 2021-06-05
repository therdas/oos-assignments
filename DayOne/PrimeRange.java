public class PrimeRange {
    private static Boolean isPrime(int n) {
        //Optimization, check once with 2 to halve search space
        if(n % 2 == 0 && n != 2)
            return false;
        
        for(int i = 3; i < n / 2; i += 2)
            if(n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Incorrect number of arguments.\nUsage java PrimeRange [range start] [range end]");
        }

        int s = 0, e = 0;
        try {
            s = Integer.parseInt(args[0]);
            e = Integer.parseInt(args[1]);
        } catch (Exception ex) {
            System.out.println("Invalid integer(s) as argument.");
            return;
        }

        for(int i = s; i <= e; ++i)
            if(isPrime(i))
                System.out.print(i + ", ");
        System.out.println("\b\b  ");
    }
}
