import java.util.Scanner;
public class Student {
  private int rollNumber;
  private int[] marks = new int[3];

  public Student(int rollNumber) {
      this.rollNumber = rollNumber;
  }

  public void inputMarks(Scanner scanner) {
      for (int i = 0; i < marks.length; i++) {
          System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
          marks[i] = scanner.nextInt();
      }
  }

  public double calculateAverageMarks() {
      double sum = 0;
      for (int mark : marks) {
          sum += mark;
      }
      return sum / marks.length;
  }

  public void printRollNumberAndAverageMarks() {
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Average Marks: " + calculateAverageMarks());
  }
}
