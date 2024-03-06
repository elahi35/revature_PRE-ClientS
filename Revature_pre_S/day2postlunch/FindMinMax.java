package day2_postlunch;

public class FindMinMax {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 1, 6, 5}; // Sample array

        // Initialize variables to hold the largest and smallest elements
        int smallest = array[0];
        int largest = array[0];

        // Iterate through the array to find the smallest and largest elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Print the smallest and largest elements
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}

