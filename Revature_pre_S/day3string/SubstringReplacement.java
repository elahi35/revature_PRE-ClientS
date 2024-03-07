package day3string;

public class SubstringReplacement {
    public static void main(String[] args) {
        String sentence = "A batman with bat";
        String originalSubstring = "bat";
        String newSubstring = "snow";

       
        String newSentence = sentence.replaceAll(originalSubstring, newSubstring);

    
        System.out.println("Original sentence: " + sentence);
        System.out.println("New sentence: " + newSentence);
    }
}
