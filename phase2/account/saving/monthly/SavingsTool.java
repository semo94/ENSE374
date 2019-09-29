package account.saving.monthly;
public class SavingsTool {
    private static double annualInterestRate = 0.03;
    private double savingsBalance;

    /**
     * class constructor 
     * @param balance the amount of money held in this account
     */
    public SavingsTool(double balance) {
      savingsBalance = balance;
    }
  
    /**
     * account balance getter
     * @return saving account balance
     */
    public double getAccountBalance() {
      return savingsBalance;
    }
  
    /**
     * static method to set the annual interest rate
     * @param newInterestRate the new anual interest rate in decimal
     */
    public static void setAnnualInterestRate(double newInterestRate) {
      annualInterestRate = newInterestRate;
    }
  
    /** 
    * monthly intrest calculator
    * @param years the investing period in years
    */
    public void calculateInterest(Integer years) {
      this.savingsBalance = this.savingsBalance * Math.pow(1 + ( annualInterestRate / 12), 12 * years);
    }
  }