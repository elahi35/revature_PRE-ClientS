package day3method;
public class Main {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean isEPresent = false;

        
        for (int i = 0; i < word.length(); i++) {
           
            if (word.charAt(i) == 'e') {
                isEPresent = true;
                break; 
            }
        }

        
        if (isEPresent) {
            System.out.println("The letter 'e' is present in the word 'Umbrella'.");
        } else {
            System.out.println("The letter 'e' is not present in the word 'Umbrella'.");
        }
    }
}