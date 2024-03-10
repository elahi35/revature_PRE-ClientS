import java.util.Scanner;

public class BankAccountMain {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount("SA1001", "John Doe", 5000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA1001", "Jane Smith", 10000);
        DematAccount dematAccount = new DematAccount("DA1001", "Alice Johnson", 20000);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Display account information");
            System.out.println("4. Calculate interest (for saving account)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    switch (accountNumber.charAt(0)) {
                        case 'S':
                            savingAccount.deposit(depositAmount);
                            break;
                        case 'C':
                            currentAccount.deposit(depositAmount);
                            break;
                        case 'D':
                            dematAccount.deposit(depositAmount);
                            break;
                        default:
                            System.out.println("Invalid account number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    switch (accountNumber.charAt(0)) {
                        case 'S':
                            savingAccount.withdraw(withdrawAmount);
                            break;
                        case 'C':
                            currentAccount.withdraw(withdrawAmount);
                            break;
                        case 'D':
                            dematAccount.withdraw(withdrawAmount);
                            break;
                        default:
                            System.out.println("Invalid account number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    switch (accountNumber.charAt(0)) {
                        case 'S':
                            savingAccount.displayAccountInfo();
                            break;
                        case 'C':
                            currentAccount.displayAccountInfo();
                            break;
                        case 'D':
                            dematAccount.displayAccountInfo();
                            break;
                        default:
                            System.out.println("Invalid account number.");
                    }
                    break;
                case 4:
                    savingAccount.calculateInterest();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
  
}
