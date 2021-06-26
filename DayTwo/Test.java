import java.util.Scanner;

public class Test {
    private int data;
    public void set(int data) {
        this.data = data;
    }
    public void print() {
        System.out.println(data);
    }
    public String toString() {
        return "(Test) " + data;
    }

    public void swapWith(Test other) {
        int temp = this.data;
        this.data = other.data;
        other.data = temp;
    }

    public void swapWith(OtherTest other) {
        int temp = this.data;
        this.data = other.get();
        other.set(temp);
    }
    
    public static void main(String[] args) {
        Test a = new Test(), b = new Test();
        OtherTest c = new OtherTest();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values for a, b and c: ");
        int av = in.nextInt(), bv = in.nextInt(), cv = in.nextInt();

        a.set(av);
        b.set(bv);
        c.set(cv);

        System.out.println("Values are:\na = " + a + "\nb = " + b + "\nc = " +  c);
        System.out.println("Swapping a with b...");
        a.swapWith(b);

        System.out.println("Values are:\na = " + a + "\nb = " + b + "\nc = " +  c);
        System.out.println("Swapping a with c...");
        a.swapWith(c);

        System.out.println("Values are:\na = " + a + "\nb = " + b + "\nc = " +  c);

        in.close();
    }

}
