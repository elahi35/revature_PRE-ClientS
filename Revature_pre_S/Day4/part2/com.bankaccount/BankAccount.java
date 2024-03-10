public class BankAccount {
  private String name;
  private String address;
  private String typeOfAccount;
  private double balance;
  private int numberOfTransactions;
  private static int accountNumberCounter = 1000;
  private String accountNumber;

  public BankAccount(String name, String address, String typeOfAccount, double balance) {
      this.name = name;
      this.address = address;
      this.typeOfAccount = typeOfAccount;
      this.balance = balance;
      this.numberOfTransactions = 0;
      this.accountNumber = "BA" + accountNumberCounter;
      accountNumberCounter++;
  }

  public void displayInformationAndBalance() {
      System.out.println("Name: " + name);
      System.out.println("Address: " + address);
      System.out.println("Type of Account: " + typeOfAccount);
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Balance: " + balance);
  }

  public void deposit(double amount) {
      balance += amount;
      numberOfTransactions++;
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
          numberOfTransactions++;
      } else {
          System.out.println("Insufficient balance.");
      }
  }

  public void changeAddress(String newAddress) {
      this.address = newAddress;
  }

  public int getNumberOfTransactions() {
      return numberOfTransactions;
  }
}
