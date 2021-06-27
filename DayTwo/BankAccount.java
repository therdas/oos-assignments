import java.util.Scanner;

public class BankAccount {
    private String name;
    private String address;
    private String accountNo;
    private double balance;

    public BankAccount() {
        name = address = accountNo = "";
        balance = 0.00;
    }

    public BankAccount(String name, String address, String accountNo, double balance) {
        this.name = name;
        this.address = address;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Account No.: ");
        accountNo = sc.nextLine();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }

    public void deposit(double amount) {
        if(amount <= 0) return;
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance - amount < 0){
            System.out.println("Cannot withdraw funds! Account balance insufficient.");
            return;
        }
        balance -= amount;
    }

    public void print() {
        System.out.println("Name: " + name +
                           "\nAddress: " + address +
                           "\nBalance: " + balance);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount b = new BankAccount();
        System.out.println("Enter account details:");
        b.initialize();
        System.out.println("Enter amount to deposit: ");
        b.deposit(in.nextDouble());
        b.print();
        System.out.println("Enter amount to withdraw: ");
        b.withdraw(in.nextDouble());
        b.print();
        System.out.println("Trying to overdraw account: ");
        b.withdraw(b.balance + 100.00);
        System.out.println("Displaying account details: ");
        b.print();
        in.close();
    }
}
