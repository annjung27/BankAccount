public class TestBankAccount{
    public static void main(String[] args){

        // Instances of Bank  Account

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // number of accounts created
        System.out.println("total number of accounts: "+ BankAccount.accountCount());        

        // Account 1 - deposit money
        account1.depositChecking(1000);
        account1.depositSaving(2000);
        account1.withdrawChecking(500);

        // Account 1- balance
        System.out.println("Account1-Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account1-Saving Balance: " + account1.getSavingBalance());


        // Account 2 - deposit money and withdraw money
        account2.depositChecking(500);        
        account2.depositSaving(1300);
        account2.withdrawChecking(200);
        
        // Account 2 - balance 
        System.out.println("Account2-Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account2-Saving Balance: " + account2.getSavingBalance());
    
        // Show total account balance for each account / show total money in all bank accounts.
        System.out.println("Total blances in account1: " + account1.accountBalance());
        System.out.println("Total blances in account2: " + account2.accountBalance());
        System.out.println("Total amounts in all Bank accounts: " + BankAccount.totalMoney());
    }
}