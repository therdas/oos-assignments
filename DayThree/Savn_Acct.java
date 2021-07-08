public class Savn_Acct extends Account {
    private static final double rate = 0.045;        //Rate of interest stored as a constant

    //Constructor
    public Savn_Acct(String name, String accNo) {
        super(name, accNo, "Savings", 0.0);         //No unique fields in Savn_acct, so defer to 
                                                    //Superclass constructor. Assume 0 balance
                                                    //Initially
    }

    //Method to calculate interest
    public void calculateInterest(int months) {
        double interest = balance * Math.pow(1 + rate/12, months); //Calculate interest on account

        //Print the interest calculated
        System.out.println("Calculated interest of " + interest);

        //Deposit the interest
        super.deposit(interest);
    }
}
