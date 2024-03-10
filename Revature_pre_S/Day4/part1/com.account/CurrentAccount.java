class CurrentAccount extends BankAccount {
  public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
      super(accountNumber, accountHolderName, balance);
  }

  @Override
  void calculateInterest() {
      System.out.println("No interest for current account.");
  }
}