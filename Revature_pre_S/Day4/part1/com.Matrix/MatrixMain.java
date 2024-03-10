public class MatrixMain {

  public static void main(String[] args) {
    Matrix matrix1 = new Matrix(2, 2);
    Matrix matrix2 = new Matrix(2, 2);

    matrix1.setElement(0, 0, 1);
    matrix1.setElement(0, 1, 2);
    matrix1.setElement(1, 0, 3);
    matrix1.setElement(1, 1, 4);

    matrix2.setElement(0, 0, 5);
    matrix2.setElement(0, 1, 6);
    matrix2.setElement(1, 0, 7);
    matrix2.setElement(1, 1, 8);

    System.out.println("Matrix 1:");
    matrix1.printMatrix();
    System.out.println();

    System.out.println("Matrix 2:");
    matrix2.printMatrix();
    System.out.println();

    System.out.println("Addition of Matrix 1 and Matrix 2:");
    Matrix additionResult = matrix1.add(matrix2);
    if (additionResult != null) {
        additionResult.printMatrix();
    }
    System.out.println();

    System.out.println("Multiplication of Matrix 1 and Matrix 2:");
    Matrix multiplicationResult = matrix1.multiply(matrix2);
    if (multiplicationResult != null) {
        multiplicationResult.printMatrix();
    }
  }
  
}
