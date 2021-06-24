public class oldSumReverse {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Incorrect number of arguments.\nUsage java SumReverse [number]");
            return;
        }

        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Invalid number, cannot parse");
            return;
        }

        int rev = 0, temp = num, sum = 0;
        while(temp > 0) {
            int d = temp % 10;
            temp = temp / 10;

            rev = 10*rev + d;
            sum +=  d;
        }

        System.out.println("Reverse of " + num + ": " + rev);
        System.out.println("Sum of digits of " + num + ": " + sum);
    }
}
