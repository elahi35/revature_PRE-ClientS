public class Matrix {
  private int rows;
  private int columns;
  private int[][] elements;

  public Matrix(int rows, int columns) {
      this.rows = rows;
      this.columns = columns;
      this.elements = new int[rows][columns];
  }

  public int getRows() {
      return rows;
  }

  public int getColumns() {
      return columns;
  }

  public void setElement(int i, int j, int value) {
      if (i >= 0 && i < rows && j >= 0 && j < columns) {
          elements[i][j] = value;
      } else {
          System.out.println("Invalid position. Cannot set element.");
      }
  }
  public Matrix add(Matrix matrix) {
 
      Matrix result = new Matrix(rows, columns);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              result.elements[i][j] = this.elements[i][j] + matrix.elements[i][j];
          }
      }
      return result;
 }

  public Matrix multiply(Matrix matrix) {

      Matrix result = new Matrix(rows, matrix.columns);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < matrix.columns; j++) {
              for (int k = 0; k < columns; k++) {
                  result.elements[i][j] += this.elements[i][k] * matrix.elements[k][j];
              }
          }
      }
      return result;
  }

  public void printMatrix() {
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              System.out.print(elements[i][j] + " ");
          }
          System.out.println();
      }
  }
}