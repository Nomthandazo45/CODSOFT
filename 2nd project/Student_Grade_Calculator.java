import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained in biology: ");
        int biologyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in geography: ");
        int geographyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in chemistry: ");
        int chemistryMarks = scanner.nextInt();

        // Repeat the above steps for each subject
        // ...

        scanner.close();

        int totalMarks = biologyMarks + geographyMarks + chemistryMarks + ...;
        int numberOfSubjects = 3; // Assuming there are 3 subjects
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
