class DematAccount extends BankAccount {
  public DematAccount(String accountNumber, String accountHolderName, double balance) {
      super(accountNumber, accountHolderName, balance);
  }

  @Override
  void calculateInterest() {
      System.out.println("No interest for demat account.");
  }
}
