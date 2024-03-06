package day2_postlunch;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 45, 15};

        System.out.println("Initial array:");
        printArray(array);

        // Perform Selection Sort
        selectionSort(array);

        System.out.println("\nArray after Selection Sort:");
        printArray(array);
    }

    // Selection Sort algorithm implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
