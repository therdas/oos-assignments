public class Curr_Acct extends Account {
    private boolean hasChequeBook;
    private double fine;

    public Curr_Acct(String name, String accNo) {
        super(name, accNo, "Current", 1000.00);
        hasChequeBook = false;
    }

    @Override
    public void withdraw(double amt) {
        if(balance - amt < 1000) {
            System.out.println("Cannot withdraw, as balance will fall below minimum limit of INR 1000.");
            return;
        }
        super.withdraw(amt);
    }

    public void checkMinimumBalance() {
        if(balance < 1000){
            balance -= 100;
            System.out.println("Account balance found under INR 1000, imposing INR 100 fine...");
        } else {
            System.out.println("Account meets minimum balance requirements.");
        }
    }

    public void getChequeBook() {
        System.out.println("Dispense ChequeBook...");
        hasChequeBook = true;
    }
}
