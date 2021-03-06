public class SumReverse {
    public static void main(String[] args) {
        //Check for correct number of command line arguments
        if(args.length != 1) {
            System.out.println("Incorrect number of arguments.\nUsage java SumReverse [number]");
            return;
        }

        //Try to parse command-line argument as an integer.
        int num = 0;
        try {
            //Convert to positive Integer
            num = Math.abs(Integer.parseInt(args[0]));
        } catch (Exception e) {
            System.out.println("Invalid number, cannot parse");
            return;
        }

        //Loop over the numbers, one digit at a time
        int rev = 0, temp = num, sum = 0;
        while(temp > 0) {
            int d = temp % 10;  //Extract Digit
            temp = temp / 10;   //Remove Digit

            rev = 10*rev + d;   //Process Digit
            sum +=  d;
        }

        //Print results
        System.out.println("Reverse of " + num + ": " + rev);
        System.out.println("Sum of digits of " + num + ": " + sum);
    }
}
