public class TirnalgeMain {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 4, 5);

    double area = triangle.calculateArea();
    System.out.println("Area of the triangle: " + area);

    double perimeter = triangle.calculatePerimeter();
    System.out.println("Perimeter of the triangle: " + perimeter);
  }
  
}
