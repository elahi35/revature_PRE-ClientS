public class Twoarray {

    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Odd numbers in the 2D array:");
        printOddNumbers(array2D);
    }

    public static void printOddNumbers(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
