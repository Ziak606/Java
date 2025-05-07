package basics;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        // Determine the grade based on the score
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            scanner.close();
            return; // Exit the program if the score is invalid
        }

        // Print the corresponding grade
        System.out.println("The student's grade is: " + grade);

        // Close the scanner
        scanner.close();

    }
}
