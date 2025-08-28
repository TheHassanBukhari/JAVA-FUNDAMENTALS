import java.util.Scanner;

public class WhileLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretPin = "1234";   // the correct pin
        String enteredPin = "";      // what the user types
        int attempts = 0;            // counter for attempts
        int maxAttempts = 3;         // maximum chances
        int balance = 1000;          // starting balance

        // while loop to check PIN
        while (!enteredPin.equals(secretPin) && attempts < maxAttempts) {
            System.out.print("Enter your secret PIN: ");
            enteredPin = sc.nextLine();
            attempts++;

            if (!enteredPin.equals(secretPin)) {
                System.out.println("Wrong PIN! Attempts left: " + (maxAttempts - attempts) + "\n");
            }
        }

        // check why loop ended
        if (enteredPin.equals(secretPin)) {
            System.out.println("\nAccess Granted!");
            System.out.println("It took you " + attempts + " attempt(s).\n");

            // a simple menu controlled by while loop
            String choice = "";
            while (!choice.equals("exit")) {
                System.out.println("Choose an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Exit");
                System.out.print("Your choice: ");
                choice = sc.nextLine();

                if (choice.equals("1")) {
                    System.out.println("Your balance is $" + balance + ".\n");

                } else if (choice.equals("2")) {
                    System.out.print("Enter withdrawal amount: ");
                    int amount = sc.nextInt();
                    sc.nextLine(); // consume leftover newline

                    if (amount <= 0) {
                        System.out.println("Invalid amount.\n");
                    } else if (amount > balance) {
                        System.out.println("Not enough balance!\n");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal successful. Remaining balance: $" + balance + ".\n");
                    }

                } else if (choice.equals("3") || choice.equalsIgnoreCase("exit")) {
                    System.out.println("Logging out... Goodbye!");
                    choice = "exit"; // force exit

                } else {
                    System.out.println("Invalid choice! Try again.\n");
                }
            }

        } else {
            System.out.println("\nToo many wrong attempts! Your account is locked.");
        }

        sc.close();
    }
}
