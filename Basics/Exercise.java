import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        
        // --- Post 1 & 2: Introduction + First Program ---
        System.out.println("Welcome to Java Fundamentals Exercise!");
        System.out.println("Let's practice everything we have learned so far.\n");

        // --- Post 3: Variables & Data Types ---
        String name;
        int age;
        double gpa;
        char grade;
        boolean pass;

        // --- Post 5: Input ---
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your GPA: ");
        gpa = input.nextDouble();

        System.out.print("Enter your grade (A-F): ");
        grade = input.next().charAt(0);

        System.out.print("Did you pass the last exam? (true/false): ");
        pass = input.nextBoolean();

        System.out.println("\n--- Generating Report ---\n");

        // --- Post 4: Operators ---
        int nextYearAge = age + 1; // arithmetic operator
        boolean isAdult = age >= 18; // relational operator
        boolean eligible = isAdult && pass; // logical operator

        // --- Post 6: Output ---
        System.out.printf("Student Report for %s\n", name);
        System.out.printf("Age: %d (Next year: %d)\n", age, nextYearAge);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("Grade: %c\n", grade);
        System.out.printf("Passed: %b\n", pass);

        System.out.println("\nExtra Info:");
        System.out.println("Are you an adult? " + isAdult);
        System.out.println("Eligible for next level? " + eligible);

        System.out.printf("\nQuote of the Day:\t\"Work hard, dream big!\"\n");
        System.out.printf("File Path Example:\tC:\\Users\\%s\n", name);

        input.close();
    }
}
