public class Student {
  private String name;
  private int roll_no;
  private String phoneNumber;
  private String address;

  public Student(String name, int roll_no, String phoneNumber, String address) {
      this.name = name;
      this.roll_no = roll_no;
      this.phoneNumber = phoneNumber;
      this.address = address;
  }

  public void printDetails() {
      System.out.println("Name: " + name);
      System.out.println("Roll Number: " + roll_no);
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Address: " + address);
  }
}