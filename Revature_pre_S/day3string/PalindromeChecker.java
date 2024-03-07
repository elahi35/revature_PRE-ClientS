package day3string;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }

    
    public static boolean isPalindrome(String str) {
       
        str = str.toLowerCase();

        
        int start = 0;
        int end = str.length() - 1;

        
        while (start < end) {
            
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }
            
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
        
            start++;
            end--;
        }
        return true;
    }
}

