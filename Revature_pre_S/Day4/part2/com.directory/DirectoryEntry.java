public class DirectoryEntry {
  String name;
  String address;
  String telephoneNumber;
  String mobileNumber;
  String headOfFamily;
  String uniqueID;

  DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
      this.name = name;
      this.address = address;
      this.telephoneNumber = telephoneNumber;
      this.mobileNumber = mobileNumber;
      this.headOfFamily = headOfFamily;
      this.uniqueID = uniqueID;
  }

  void displayInfo() {
      System.out.println("Name: " + name);
      System.out.println("Address: " + address);
      System.out.println("Telephone Number: " + telephoneNumber);
      System.out.println("Mobile Number: " + mobileNumber);
      System.out.println("Head of Family: " + headOfFamily);
      System.out.println("Unique ID: " + uniqueID);
  }
}
