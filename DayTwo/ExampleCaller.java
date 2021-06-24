public class ExampleCaller {
    public static void main(String[] args) {
        Example e = new Example();

        e.setData();
        System.out.println("The Description is: " + e.getDescription());
        System.out.println("The Data is: " + e.getData());
        System.out.println("The Object is: \n" + e);

        e.printStats();
    }
}
