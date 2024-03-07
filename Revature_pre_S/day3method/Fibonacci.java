package day3method;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7; 
        System.out.println("Fibonacci term at position " + n + " is: " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
