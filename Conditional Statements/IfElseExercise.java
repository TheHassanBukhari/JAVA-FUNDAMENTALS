import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== IF-ELSE EXERCISE ===");
        System.out.print("Enter your marks (0-100): ");
        int marks = input.nextInt();

        System.out.print("Do you have good attendance? (true/false): ");
        boolean attendance = input.nextBoolean();

        // --- Simple if-else ---
        if (marks >= 50) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam!");
        }

        // --- if-else-if ladder ---
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // --- Nested if-else ---
        if (marks >= 50) {
            if (attendance) {
                System.out.println("You are eligible for a certificate!");
            } else {
                System.out.println("You passed, but no certificate due to poor attendance.");
            }
        } else {
            System.out.println("You must retake the exam.");
        }

        // --- Logical operators inside if ---
        if (marks >= 80 && attendance) {
            System.out.println("Excellent! You qualify for a scholarship.");
        } else if (marks >= 80 || attendance) {
            System.out.println("Good effort, but no scholarship.");
        } else {
            System.out.println("Work harder next time.");
        }

        input.close();
    }
}
