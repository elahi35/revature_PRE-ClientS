package day3string;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        inputString = inputString.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

  
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
             
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                
                digits++;
            } else if (ch == ' ') {
               
                spaces++;
            }
        }

    
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of white spaces: " + spaces);

        scanner.close();
    }
}
