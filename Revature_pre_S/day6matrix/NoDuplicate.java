import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            int[][] array = new int[rows][cols];
            Set<Integer> numbers = new HashSet<>();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int num;
                    do {
                        System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                        num = scanner.nextInt();

                        if (numbers.contains(num)) {
                            System.out.println("Duplicate value! Please enter a unique value.");
                        }
                    } while (numbers.contains(num));

                    array[i][j] = num;
                    numbers.add(num);
                }
            }

            System.out.println("The 2D array with no duplicate values:");
            display2DArray(array);
        }
    }

    public static void display2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
