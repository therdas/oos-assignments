/*This class makes, manipulates and prints data
** related to Example class.
*/
public class ExampleCaller {
    public static void main(String[] args) {
        Example e = new Example();  //Make an object

        //Get user input
        e.setData();

        //Print the object
        System.out.println("The Description is: " + e.getDescription());
        System.out.println("The Data is: " + e.getData());
        System.out.println("The Object is: \n" + e);

        //Print statistics about the data in the object.
        e.printStats();
    }
}
