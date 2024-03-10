import java.util.ArrayList;
import java.util.Scanner;
public class DirectoryMain {
  ArrayList<DirectoryEntry> entries;

  void DirectoryMain() {
      entries = new ArrayList<>();
  }

  void addEntry(DirectoryEntry entry) {
      entries.add(entry);
  }

  void editEntry(String uniqueID) {
      Scanner scanner = new Scanner(System.in);
      for (DirectoryEntry entry : entries) {
          if (entry.uniqueID.equals(uniqueID)) {
              System.out.println("Enter new details:");
              System.out.print("Name: ");
              entry.name = scanner.nextLine();
              System.out.print("Address: ");
              entry.address = scanner.nextLine();
              System.out.print("Telephone Number: ");
              entry.telephoneNumber = scanner.nextLine();
              System.out.print("Mobile Number: ");
              entry.mobileNumber = scanner.nextLine();
              System.out.print("Head of Family: ");
              entry.headOfFamily = scanner.nextLine();
              return;
          }
      }
      System.out.println("Entry with unique ID " + uniqueID + " not found.");
  }

  void searchByKeyword(String keyword) {
      System.out.println("Search Results for keyword \"" + keyword + "\":");
      for (DirectoryEntry entry : entries) {
          if (entry.name.contains(keyword) || entry.address.contains(keyword) || entry.telephoneNumber.contains(keyword) ||
                  entry.mobileNumber.contains(keyword) || entry.headOfFamily.contains(keyword) || entry.uniqueID.contains(keyword)) {
              entry.displayInfo();
              System.out.println();
          }
      }
  }

  void displayAllEntries() {
      System.out.println("Directory Entries:");
      for (DirectoryEntry entry : entries) {
          entry.displayInfo();
          System.out.println();
      }
  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      DirectoryMain directory = new DirectoryMain();

      while (true) {
          System.out.println("\nMenu:");
          System.out.println("1. Create a database entry");
          System.out.println("2. Edit an entry");
          System.out.println("3. Search by keyword");
          System.out.println("4. Display all entries");
          System.out.println("5. Exit");
          System.out.print("Enter your choice: ");
          int choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline

          switch (choice) {
              case 1:
                  System.out.println("Enter details for the new entry:");
                  System.out.print("Name: ");
                  String name = scanner.nextLine();
                  System.out.print("Address: ");
                  String address = scanner.nextLine();
                  System.out.print("Telephone Number: ");
                  String telephoneNumber = scanner.nextLine();
                  System.out.print("Mobile Number: ");
                  String mobileNumber = scanner.nextLine();
                  System.out.print("Head of Family: ");
                  String headOfFamily = scanner.nextLine();
                  System.out.print("Unique ID: ");
                  String uniqueID = scanner.nextLine();
                  directory.addEntry(new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID));
                  System.out.println("Entry added successfully.");
                  break;
              case 2:
                  System.out.print("Enter the unique ID of the entry to edit: ");
                  String editID = scanner.nextLine();
                  directory.editEntry(editID);
                  break;
              case 3:
                  System.out.print("Enter keyword to search: ");
                  String keyword = scanner.nextLine();
                  directory.searchByKeyword(keyword);
                  break;
              case 4:
                  directory.displayAllEntries();
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