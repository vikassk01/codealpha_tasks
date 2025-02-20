import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numStudents = 5;

        // Create an array to store the students' grades
        double[] grades = new double[numStudents];

        // Loop through and enter grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        // Calculate the average, highest, and lowest scores
        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 0; i < numStudents; i++) {
            total += grades[i];
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        // Calculate the average
        double average = total / numStudents;
        
        System.out.println("\nStudent Grades Summary:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        scanner.close();
    }
}
