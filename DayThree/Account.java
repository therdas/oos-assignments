//Abstract class that Savn_Acct and Curr_Acct are based on.
public abstract class Account {
    private String name;            //Stores name of customer
    private String accNo;           //Stores the account number
    private String type;            //Stores the type of account: (Savings|Current)
    protected double balance;

    //Constructor, is called by subclasses.
    Account(String name, String accNo, String type, double balance) {
        this.name = name;           //Assign values.
        this.accNo = accNo;
        this.type = type;
        this.balance = balance;
    }

    //Method to print customer details
    public void DisplayBalance() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Account No: " + accNo + ", type: " + type);
        System.out.println("Your account balance is " + balance);
    }

    //Method to deposit amount to balance
    public void deposit(double amt) {
        if(amt <= 0) return;        //Check if invalid input.
        balance += amt;             //Credit amount
    }

    //Method to withdraw amount.
    public void withdraw(double amt) {
        if(amt <= 0) return;        //Check if invalid input    

        if(balance - amt <= 0){     //Check if withdrawl leaves account in invalid state
            System.out.println("Insufficient funds for withdrawl. Please retry with a lesser amount.");
            return;
        }

        //Credit amount
        balance -= amt;
    }
}
