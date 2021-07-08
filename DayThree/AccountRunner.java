import java.util.Scanner;

//Class to run the two classes Savn_Acct and Curr_Acct
public class AccountRunner {

    //Utility method to print the menu for Savings account
    public static void printMenuForSavingsAcc() {
        System.out.println("Menu\n==========================================================");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Display Balance");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    //Utility method to print the menu for Current Accounts.
    public static void printMenuForCurrentAcc() {
        System.out.println("Menu\n==========================================================");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Display Balance");
        System.out.println("4. Check Minimum Balance");
        System.out.println("5. Get Chequebook");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Accept type of account
        System.out.print("Enter type of account (savings, current): ");
        String type = sc.next();

        //If user enters Savings or s
        if(type.equalsIgnoreCase("savings") || type.equalsIgnoreCase("s")) {
            sc.nextLine();                          //clear buffer
            System.out.print("Enter name: ");       //Enter the name of the user
            String name = sc.nextLine();            
            System.out.print("Enter Account Number: "); //Enter the account no.
            String accNo = sc.nextLine();
            Savn_Acct S = new Savn_Acct(name, accNo);   //Create object using constructor

            //Loop forever and show menu at beginning of each iteration.
            while(true) {
                printMenuForSavingsAcc();
                int choice = sc.nextInt();              //Input choice

                switch(choice) {
                            //Deposit amount
                    case 1: System.out.print("Enter amount to Deposit: ");
                            S.deposit(sc.nextDouble());
                            break;

                            //Withdraw amount
                    case 2: System.out.print("Enter amount to Withdraw: ");
                            S.withdraw(sc.nextDouble());
                            break;

                            //Display Balance
                    case 3: S.DisplayBalance();
                            break;

                            //Enter the number of months and apply compound interest
                    case 4: System.out.println("Enter the number of months since last interest applied: ");
                            S.calculateInterest(sc.nextInt());
                            S.DisplayBalance();
                            break;

                            //Exit
                    case 5: return;

                            //Incorrect input
                    default:System.out.println("Incorrect choice, try again!");
                }
            }

            //If user inputs Current or c
        } else if(type.equalsIgnoreCase("current") || type.equalsIgnoreCase("c")) {
            sc.nextLine();                          //flush buffer
            System.out.print("Enter name: ");       //Enter the name of the customer
            String name = sc.nextLine();
            System.out.print("Enter Account Number: ");//Enter the account number
            String accNo = sc.nextLine();
            Curr_Acct C = new Curr_Acct(name, accNo);//Create object through constructor

            //Loop forever and print the menu at beginning of each iteration
            while(true) {
                printMenuForCurrentAcc();
                int choice = sc.nextInt();

                switch(choice) {
                            //Deposit
                    case 1: System.out.print("Enter amount to Deposit: ");
                            C.deposit(sc.nextDouble());
                            break;

                            //Withdraw amount
                    case 2: System.out.print("Enter amount to Withdraw: ");
                            C.withdraw(sc.nextDouble());
                            break;

                            //Display account details
                    case 3: C.DisplayBalance();
                            break;

                            //Check if minimum balance criterion are met
                    case 4: C.checkMinimumBalance();
                            break;

                            //Issue Chequebook
                    case 5: C.getChequeBook();
                            break;

                            //Exit
                    case 6: return;

                            //Incorrect choice
                    default:System.out.println("Incorrect choice, try again!");
                }
            }
            //Incorrect type
        } else {
            System.out.println("Invalid type! Please try again.");
        }

        //Close Scanner
        sc.close();
    }
}
