package day3method;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        int multiplier = 1;
        
        printMultiplicationTable(number, multiplier);
    }

   
    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1);
        }
    }
}
