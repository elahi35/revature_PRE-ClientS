package day2_postlunch;
public class ArraySumAndProduct {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Sample array

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the product of all elements in the array
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

        // Print the sum and product
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
