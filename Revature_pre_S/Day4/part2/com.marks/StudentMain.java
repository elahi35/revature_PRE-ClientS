import java.util.Scanner;

public class StudentMain {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1);
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            students[i].inputMarks(scanner);
        }

        System.out.println("\nRoll Number and Average Marks of Students:");
        for (Student student : students) {
            student.printRollNumberAndAverageMarks();
            System.out.println();
        }

    }
  
}
