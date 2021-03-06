public class Factorial {

    //Recursive function to calculate the Factorial of a number
    public static int factorial(int n) {
        //Base case
        /* Strictly, checking if n < 1 is enough, however
        ** checking for 1 as well saves a recursion.
        */
        if(n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        //Check for correct number of arguments
        if(args.length != 1) {
            System.out.println("Incorrect number of arguments.\nUsage java Factorial [number]");
        }

        //Try to parse the number as an Integer
        int n = 0;
        try {
            n = Math.abs(Integer.parseInt(args[0]));
        } catch (Exception e) {
            //Couldn't pass number, exit
            System.out.println("Invalid integer as argument.");
            return;
        }

        //Print factorial
        System.out.println(factorial(n));
    }
}
