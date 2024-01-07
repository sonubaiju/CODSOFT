import java.util.Scanner;

public class UniqueGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unique Grade Calculator!");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        System.out.println("\nEnter marks obtained in each subject:");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                System.out.print("Subject " + i + ": ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        displayResults(totalMarks, averagePercentage, grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }



    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("----------------------------");
        System.out.println("Total Marks:       " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade:             " + grade);
        System.out.println("----------------------------");
    }

    
}
