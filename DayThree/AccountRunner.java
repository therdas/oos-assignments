import java.util.Scanner;

public class AccountRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, a;

        System.out.println("Enter first customer details: ");
        System.out.print("Name: ");
        n = sc.nextLine();
        System.out.print("Account No.: ");
        a = sc.nextLine();

        Curr_Acct c = new Curr_Acct(n, a);

        System.out.println("Enter second customer details: ");
        System.out.print("Name: ");
        n = sc.nextLine();
        System.out.print("Account No.: ");
        a = sc.nextLine();

        Savn_Acct s = new Savn_Acct(n, a);

        System.out.println("Enter amount to deposit in first account: ");
        c.deposit(sc.nextDouble());

        System.out.println("Enter amount to deposit in second account: ");
        s.deposit(sc.nextDouble());

        c.DisplayBalance();
        s.DisplayBalance();

        System.out.println("Enter amount to withdraw from first account: ");
        c.withdraw(sc.nextDouble());

        System.out.println("Enter amount to withdraw from second account: ");
        s.withdraw(sc.nextDouble());

        c.DisplayBalance();
        s.DisplayBalance();

        System.out.println("Checking for minimum balance...");
        c.checkMinimumBalance();

        System.out.println("Getting chequebook...");
        c.getChequeBook();

        System.out.println("Calculating interest");
        s.calculateInterest();
     
        sc.close();
    }
}
