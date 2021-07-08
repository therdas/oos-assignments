public class Curr_Acct extends Account {
    private boolean hasChequeBook;                  //Stores wether the user has a chequebook
    private double fine;                            //Stores if the user receives any fines

    //Constructor to store the details of a Current Account
    public Curr_Acct(String name, String accNo) {
        super(name, accNo, "Current", 1000.00);     //Call superclass's constructor, assume that
        hasChequeBook = false;                      //initial balance is Rs 1000 and that the user
                                                    //does not have any cheque books.
    }

    @Override
    public void withdraw(double amt) {
        //Check minimum balance
        if(balance - amt < 1000) {
            System.out.println("Cannot withdraw, as balance will fall below minimum limit of INR 1000.");
            return;
        }

        //If permissible, allow withdrawing
        super.withdraw(amt);
    }

    //Method to check if a account has appropriate minimum balance
    public void checkMinimumBalance() {
        //If balance is below 1000
        if(balance < 1000){
            balance -= 100;             //Impose fine
            fine += 100;                //and keep track of how much the customer has been fined
            System.out.println("Account balance found under INR 1000, imposing INR 100 fine..."); //Print message
        } else {
            //Meets requirements, let customer know
            System.out.println("Account meets minimum balance requirements.");
        }
    }

    //Method to dispense chequebook
    public void getChequeBook() {
        System.out.println("Dispense ChequeBook..."); //Print and dispense chequebook
        hasChequeBook = true;                         //Mark chequebook as given.
    }
}
