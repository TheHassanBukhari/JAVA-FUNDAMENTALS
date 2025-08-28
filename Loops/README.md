# Loops  
Exercises & Projects  

Welcome — this folder contains the practice material for **While Loop** and **For Loop**, based on Blog Posts #9 and #10 of Java Fundamentals. This is the third step after completing the **Conditional Statements** folder.  

---

## Study first  
Read these posts before attempting the exercises (in order):  

- [While Loop in Java (Blog Post #9)](https://hassan-codes.blogspot.com/2025/08/09-java-fundamentals-while-loop-in-java.html)  
- [For Loop in Java (Blog Post #10)](https://hassan-codes.blogspot.com/2025/08/10-java-fundamentals-for-loop-in-java.html)  

---

## Exercise files  
Files:  
- **WhileLoopExercise.java**  
- **ForLoopExercise.java**  

---

## How to run  
Open terminal / command prompt in this folder and run:  

    javac WhileLoopExercise.java
    java WhileLoopExercise

    javac ForLoopExercise.java
    java ForLoopExercise

---

## What to do (Step-by-step)  

1. Run the programs to see how they behave.  
2. Break the file into sections — label each section with the concept it demonstrates. Suggested sections:  
   - Loop setup (counter initialization)  
   - Condition checking  
   - Update step (inside or outside loop body)  
   - Output  
3. For each line of the program, write a short note (1–2 words) identifying the exact concept used. Example:  

   `while (i <= 5)` → while, condition (<=), counter  

4. Answer these reflection questions:  
   - What happens if you forget to update the counter?  
   - How is `while` different from `for` in terms of where initialization and update happen?  
   - When would you prefer `for` over `while`?  
   - What happens if the loop condition is false at the start?  

5. Modify the exercises:  
   - Add one more example of a descending loop.  
   - Change the update step (e.g., `i = i + 2`) and see how the output changes.  
   - Add comments above each new line to explain what it represents.  

---

## Mini Projects  

### 1. While Loop Project — Countdown Timer  
Write a program using a **while loop** that counts down from 10 to 1 and then prints **“Blast Off!”**.  

- Use a counter initialized at 10.  
- Decrement the counter each time.  
- When the loop ends, print the final message.  

**Bonus:** Modify the program to start from any number the user gives.  

---

### 2. For Loop Project — Multiplication Table  
Write a program using a **for loop** that prints the multiplication table of a number (for example, 5).  

Expected output (if number = 5):  

    5 x 1 = 5  
    5 x 2 = 10  
    5 x 3 = 15  
    ...  
    5 x 10 = 50  

**Bonus:** Let the user choose the number for the table.  

---

## Hints  
- Use **while** when you don’t know in advance how many times the loop will run (depends on a condition).  
- Use **for** when you know the exact number of iterations.  
- Always test edge cases (start = end, step too large, negative numbers).  

---

✅ With these exercises and projects, you’ll be able to “see” how loops work — whether repeating until a condition is met or running a fixed number of times.  
