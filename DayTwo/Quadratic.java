public class Quadratic {
    private double a, b, c;

    Quadratic() {}
    Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void clone(Quadratic other) {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
    }

    public void clone(Linear other) {
        this.b = other.a;
        this.c = other.b;
    }

    public String toString() {
        if(a != 0 && b != 0 && c != 0)
            return  (this.a >= 0 ? "" : "- ")  + Math.abs(this.a) + "x\u00B2 " + 
                (this.b >= 0 ? "+" : "-") + " " + Math.abs(this.b) + "x " +
                (this.c >= 0 ? "+" : "-") + " " + Math.abs(this.c);
        else if ()
        return "";
    }
    public static void main(String[] args) {

    }
}
