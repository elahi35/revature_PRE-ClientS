public class StudentMain {
  public static void main(String[] args) {
    Student john = new Student("John", 2, "1234567890", "123 Street, City");

    Student sam = new Student("Sam", 1, "9876543210", "456 Avenue, Town");

    System.out.println("Details of John:");
    john.printDetails();
    System.out.println();

    System.out.println("Details of Sam:");
    sam.printDetails();
  }
}
