import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SWITCH STATEMENT EXERCISE ===");
        System.out.print("Enter a day number (1-7): ");
        int day = input.nextInt();

        // --- Simple switch with grouped cases ---
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a weekday. Time to study and work!");
                break;

            case 6:
            case 7:
                System.out.println("It's the weekend. Enjoy your rest!");
                break;

            default:
                System.out.println("Invalid day number! Please enter 1 to 7.");
        }

        // --- Switch on characters ---
        System.out.print("Enter a grade (A, B, C, D, F): ");
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! 🎉");
                break;
            case 'B':
                System.out.println("Good job 👍");
                break;
            case 'C':
                System.out.println("Fair, but can improve");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed 😢");
                break;
            default:
                System.out.println("Invalid grade input!");
        }

        // --- Switch on strings ---
        System.out.print("Enter your favorite fruit: ");
        String fruit = input.next().toLowerCase(); // lowercase for consistency

        switch (fruit) {
            case "apple":
            case "banana":
            case "orange":
                System.out.println("That's a healthy choice! 🍎🍌🍊");
                break;

            case "burger":
            case "pizza":
                System.out.println("That's tasty but not healthy! 🍔🍕");
                break;

            default:
                System.out.println("Interesting choice!");
        }

        input.close();
    }
}
