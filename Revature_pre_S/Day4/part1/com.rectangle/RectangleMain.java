import java.util.Scanner;
public class RectangleMain {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter length of the rectangle:");
      double length = scanner.nextDouble();
      System.out.println("Enter breadth of the rectangle:");
      double breadth = scanner.nextDouble();

      Area rectangle = new Area();
      rectangle.setDim(length, breadth);

      System.out.println("Area of the rectangle: " + rectangle.getArea());

  }
}
