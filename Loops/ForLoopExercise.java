import java.util.Scanner;


public class ForLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== For Loop Practice ===");

        System.out.print("Enter a small positive integer (n): ");
        int n = sc.nextInt();

        System.out.print("Enter a number for multiplication table (m): ");
        int m = sc.nextInt();

        // 1) Count from 1 to n
        System.out.println("\n-- 1) Count from 1 to n --");
        for (int i = 1; i <= n; i++) {
            System.out.println("Number: " + i);
        }

        // 2) Even numbers from 2 to n (step update)
        System.out.println("\n-- 2) Even numbers from 2 to n (i += 2) --");
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }

        // 3) Reverse count from n to 1
        System.out.println("\n-- 3) Reverse count from n to 1 --");
        for (int i = n; i >= 1; i--) {
            System.out.println("Rev: " + i);
        }

        // 4) Sum and average of 1..n
        System.out.println("\n-- 4) Sum and average of 1..n --");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // accumulate
        }
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", (n > 0) ? (double) sum / n : 0.0);

        // 5) Multiplication table for m (1..10)
        System.out.println("\n-- 5) Multiplication table of " + m + " --");
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }

        // 6) Factorial of n (1 * 2 * ... * n)
        System.out.println("\n-- 6) Factorial of n --");
        long fact = 1L;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact + "  (note: may overflow for large n)");

        // 7) Is n prime? (simple check)
        System.out.println("\n-- 7) Is n prime? --");
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // stop early when a divisor is found
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }

        sc.close();
    }
}
