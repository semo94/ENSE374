import java.util.Scanner;

class Bank {
  public static void main(String[] args) {
    // initiate input scanner object
    Scanner scanner = new Scanner(System.in);
    // get the deposited amount from the user
    System.out.println("Enter the amount that you'd like to deposite");
    int balance = scanner.nextInt();
    // get investing period from the user
    System.out.println("How many years you'd like to invest this money for?");
    int years = scanner.nextInt();
    // get the compound interest type (Monthly or Biweekly)
    System.out.println("type '1' for monthly compound interest OR '2' for biweekly compound interest");
    int choice = scanner.nextInt();
    // close scanner stream to prevent resource leakage
    scanner.close();
    if (choice == 1) {
      account.saving.monthly.SavingsTool savingsTool = new account.saving.monthly.SavingsTool(balance);
      savingsTool.calculateInterest(years);
      System.out.println("Your balance after " + years + " years is: " + savingsTool.getAccountBalance());
    } else if (choice == 2) {
      account.saving.biweekly.SavingsTool savingsTool = new account.saving.biweekly.SavingsTool(balance);
      savingsTool.calculateInterest(years);
      System.out.println("Your balance after " + years + " years is: " + savingsTool.getAccountBalance());
    } else {
      System.out.println("Wrong input!");
    }
  }
}