public class Savn_Acct extends Account {
    public static final double rate = 0.045;

    public Savn_Acct(String name, String accNo) {
        super(name, accNo, "Savings", 0.0);
    }

    void calculateInterest() {
        double interest = rate * balance;
        System.out.println("Calculated interest of " + interest);
        super.deposit(interest);
    }
}
