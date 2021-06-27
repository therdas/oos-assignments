import java.util.Scanner;

public class BankAccount {
    private String name;
    private String address;
    private String accountNo;
    private double balance;

    //Parameterless constructor
    public BankAccount() {
        name = address = accountNo = "";
        balance = 0.00;
    }

    //Parameterized constructor
    public BankAccount(String name, String address, String accountNo, double balance) {
        this.name = name;
        this.address = address;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    //Take input from user and initialize an object
    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();   //Discard newlines
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Account No.: ");
        accountNo = sc.nextLine();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }

    //Deposit an amount of money onto the account
    //The amount must be positive
    public void deposit(double amount) {
        if(amount <= 0) return;
        //Add amount
        balance += amount;
    }

    //Withdraw an amount of money from the account
    public void withdraw(double amount) {
        //Check balance, if the withdrawl leaves the account with negative
        //balance, abort.
        if(balance - amount < 0){
            System.out.println("Cannot withdraw funds! Account balance insufficient.");
            return;
        }

        //Deduct amount
        balance -= amount;
    }

    //Print the Name, Address and Balance of the Account
    public void print() {
        System.out.println("Name: " + name +
                           "\nAddress: " + address +
                           "\nBalance: " + balance);
    }

    //Static method to drive the class and call its methods
    public static void main(String[] args) {
        //Create and initialize account
        Scanner in = new Scanner(System.in);
        BankAccount b = new BankAccount();
        System.out.println("Enter account details:");
        b.initialize();

        //Deposit an amount
        System.out.println("Enter amount to deposit: ");
        b.deposit(in.nextDouble());
        b.print();

        //Withdraw an amount
        System.out.println("Enter amount to withdraw: ");
        b.withdraw(in.nextDouble());
        b.print();

        //Try to overdraw from account, by trying to withdraw
        //100 more than what is present in the account
        System.out.println("Trying to overdraw account: ");
        b.withdraw(b.balance + 100.00);

        //Display account details
        System.out.println("Displaying account details: ");
        b.print();
        in.close();
    }
}
