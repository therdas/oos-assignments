public class SayHello  {
    public static void main(String args[]) {
        if(args.length < 1) {
            System.out.println("Hello, Rahul Das!");
        } else {
            System.out.print("Hello, ");
            for(String i: args) {
                System.out.print(i + " ");
            }
            System.out.println("\b!");
        }
    }
}