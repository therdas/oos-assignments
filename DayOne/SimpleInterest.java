public class SimpleInterest {
    private static double interest(double p, double r, double n) {
        return p*r*n/100;
    }

    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Incorrect number of arguments.\nUsage java SimpleInterest [principle] [rate] [time]");
        }

        double n = 0.0, r = 0.0, p = 0.0;
        try {
            p = Double.parseDouble(args[0]);
            r = Double.parseDouble(args[1]);
            n = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("Invalid number(s) as argument.");
            return;
        }

        System.out.println(interest(p, r, n));
    }
}
