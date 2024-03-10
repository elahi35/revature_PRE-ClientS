class SavingAccount extends BankAccount {
  private double interestRate;

  public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
      super(accountNumber, accountHolderName, balance);
      this.interestRate = interestRate;
  }

  @Override
  void calculateInterest() {
      double interest = balance * (interestRate / 100);
      balance += interest;
      System.out.println("Interest calculated and added to the account balance.");
  }
}
