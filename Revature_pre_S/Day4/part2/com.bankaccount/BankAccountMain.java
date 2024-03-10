import java.util.Scanner;

public class BankAccountMain {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numberOfDepositors = scanner.nextInt();
        scanner.nextLine(); 

        BankAccount[] accounts = new BankAccount[numberOfDepositors];

        for (int i = 0; i < numberOfDepositors; i++) {
            System.out.println("\nEnter information for Depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Type of Account: ");
            String typeOfAccount = scanner.nextLine();
            System.out.print("Initial Balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine(); 

            accounts[i] = new BankAccount(name, address, typeOfAccount, balance);
        }

        System.out.println("\nDisplaying information of Depositor 1:");
        accounts[0].displayInformationAndBalance();

        System.out.println("\nDepositing $200 for Depositor 1...");
        accounts[0].deposit(200);
        System.out.println("Final information of Depositor 1:");
        accounts[0].displayInformationAndBalance();

        System.out.println("\nWithdrawing $100 from Depositor 1...");
        accounts[0].withdraw(100);
        System.out.println("Final information of Depositor 1:");
        accounts[0].displayInformationAndBalance();

        System.out.println("\nChanging address of Depositor 1...");
        accounts[0].changeAddress("New Address");
        System.out.println("Final information of Depositor 1:");
        accounts[0].displayInformationAndBalance();

        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumberOfTransactions();
        }
        System.out.println("\nTotal number of transactions: " + totalTransactions);

    }
  
}
