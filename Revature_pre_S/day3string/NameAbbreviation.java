package day3string;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

       
        String[] nameParts = fullName.split(" ");

      
        if (nameParts.length >= 2) {
            
            String firstName = nameParts[0];
            String middleName = "";
            for (int i = 1; i < nameParts.length - 1; i++) {
                middleName += nameParts[i].charAt(0) + ".";
            }

           
            String lastName = nameParts[nameParts.length - 1];

            System.out.println(firstName.charAt(0) + "." + middleName + lastName);
        } else {
      
            System.out.println("Please enter your full name in the correct format.");
        }

        scanner.close();
    }
}
