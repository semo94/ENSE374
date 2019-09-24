class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;
  
    // class constructor 
    SavingAccount(double balance) {
      savingsBalance = balance;
    }
  
    // account balance getter
    public double getAccountBalance() {
      return savingsBalance;
    }
  
    // static method to set the annual interest rate
    public static void setAnnualInterestRate(double newInterestRate) {
      annualInterestRate = newInterestRate;
    }
  
    /** 
    * intrest calculator based on the Compound Interest Formula P(1 + R/n)^(nt) WHERE:
    * P is principal amount.
    * R is the annual interest rate.
    * t is the time the money is invested for
    * n is the number of times that interest is compounded per unit t
    */
    public void calculateInterest(Integer n, Integer t) {
      this.savingsBalance = this.savingsBalance * Math.pow(1 + ( annualInterestRate / n), n * t);
    }
  }