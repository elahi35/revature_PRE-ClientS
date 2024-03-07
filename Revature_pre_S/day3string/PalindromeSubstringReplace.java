package day3string;

import java.util.Scanner;

public class PalindromeSubstringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");
        for (int i = 0; i < words.length; i++) {
          
            if (isPalindrome(words[i])) {
                words[i] = "*".repeat(words[i].length());
            }
        }

        String modifiedString = String.join(" ", words);


        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
    
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        
        while (start < end) {
           
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}
