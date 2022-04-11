public class BankAccount{

    //member variables
    private double checkingBalance;
    private double savingBalance;

    //class member (static) that has the number of accounts created thus far.
    private static int numOfAccounts = 0;

    //class member (static) that tracks the total amount of money stored in every account created.
    private static int totalAmount = 0;

    // Constructor
    public BankAccount(){
        checkingBalance = 0;
        savingBalance = 0;
        numOfAccounts++;  
        
    }

    // static method to access the num of accounts created
    public static int accountCount(){
        return numOfAccounts;
    }

    // static method to see the total money from all bank accounts.
    public static int totalMoney(){
        return totalAmount;
    }
    
    // Methods

    // method that will allow a user to deposit money into either the checking or saving.
    public void depositChecking(double amount){
        this.setCheckingBalance(getCheckingBalance()+ amount);
        // this.checkingBalance += amount;
        totalAmount += amount;
    }

    public void depositSaving(double amount){
        this.setSavingBalance(getSavingBalance()+ amount);
        // this.savivingBalance += amount;
        totalAmount += amount;
    }

    // Methods to withdraw money from one balance. 
    public void withdrawChecking(double amount){
        if(this.getCheckingBalance() >= amount){
            this.setCheckingBalance(getCheckingBalance()- amount);
            totalAmount -= amount;
        } else{
            System.out.println("You don't have enough balance in your checking account.");
        }
    }

    public void withdrawSaving(double amount){
        if(this.getSavingBalance() >= amount){
            this.setSavingBalance(getSavingBalance()- amount);
            totalAmount -= amount;
        } else{
            System.out.println("You don't have enough balance in your saving account.");
        }
    }

    // method to see the total money from the checking and saving.
    public double accountBalance(){
        return this.getCheckingBalance() + this.getSavingBalance();
        // return this.savingBalance + this.checkingBalance;
    }

    
    // Getters and Setters
    // getter method for the user's checking account balance.
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    // setter for checking account
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    
    //getter method for the user's saving account balance.
    public double getSavingBalance(){
        return this.savingBalance;
    }
    // setter for Saving account
    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }

}