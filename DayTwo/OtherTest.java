public class OtherTest {
    private int data;
    public void print() {
        System.out.println(data);
    }
    public void set(int data) {
        this.data = data;
    }
    public int get() {return data;}
    public String toString() {
        return "(OtherTest) " + data;
    }
}
