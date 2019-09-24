class Bank{
    public static void main(String[] args) {
        // initiate two accounts
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
    
        // view initial balance for each account
        System.out.println("Initial deposit balance");
        System.out.println("Saver 1: " + saver1.getAccountBalance());
        System.out.println("Saver 2: " + saver2.getAccountBalance());
    
        // set the interest rate value to 4%
        SavingAccount.setAnnualInterestRate(0.04);
    
        // calculate compounding monthly interest for one year
        saver1.calculateInterest(12, 1);
        saver2.calculateInterest(12, 1);
    
        // view new balances after 4% interest for each account
        System.out.println("New balance after applying 1-year monthly compound interest with an annual interest rate of 4%");
        System.out.println("Saver 1: " + saver1.getAccountBalance());
        System.out.println("Saver 2: " + saver2.getAccountBalance());
    
        // set the interest rate value to 5%
        SavingAccount.setAnnualInterestRate(0.05);
    
        // calculate compounding monthly interest for another year
        saver1.calculateInterest(12, 1);
        saver2.calculateInterest(12, 1);
    
        // view new balances after 5% interest for each account
        System.out.println("New balance after applying second year of monthly compound interest with an annual interest rate of 5%");
        System.out.println("Saver 1: " + saver1.getAccountBalance());
        System.out.println("Saver 2: " + saver2.getAccountBalance());
      }
}