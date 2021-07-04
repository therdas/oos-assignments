public class Account {
    private String name;
    private String accNo;
    private String type;
    protected double balance;

    Account(String name, String accNo, String type, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.type = type;
        this.balance = balance;
    }

    public void DisplayBalance() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Your account balance is " + balance);
    }

    public void deposit(double amt) {
        if(amt <= 0) return;
        balance += amt;
    }

    public void withdraw(double amt) {
        if(amt <= 0) return;
        if(balance - amt <= 0){
            System.out.println("Insufficient funds for withdrawl. Please retry with a lesser amount.");
            return;
        }
        balance -= amt;
    }
}
