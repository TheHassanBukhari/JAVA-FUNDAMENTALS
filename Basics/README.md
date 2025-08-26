**Exercise & Project**  

Welcome — this folder contains the practice exercise that covers everything from the first six blog posts.  
This folder is part of the JAVA FUNDAMENTALS GitHub repo. Start here after finishing posts 1–6
**Goal:** download `Exercise.java`, run it, then *break it down* so you can identify every concept you’ve studied (variables, operators, input, output, Scanner methods, placeholders, escape sequences, etc.). After that, complete the mini-project described at the end.

---

## Study first  
Read these posts before attempting the exercise (in order):

1. [Introduction to Java](https://hassan-codes.blogspot.com/2025/08/01-java-fundamentals-introduction-to.html)  
2. [Your First Java Program (Hello World)](https://hassan-codes.blogspot.com/2025/08/02-java-fundamentals-your-first-java.html)  
3. [Variables and Data Types](https://hassan-codes.blogspot.com/2025/08/03-java-fundamentals-variables-and-data_25.html)  
4. [Operators in Java](https://hassan-codes.blogspot.com/2025/08/04-java-fundamentals-operators-in-java.html)  
5. [Input in Java](https://hassan-codes.blogspot.com/2025/08/05-java-fundamentals-input-in-java-by.html)  
6. [Output in Java](https://hassan-codes.blogspot.com/2025/08/06-java-fundamentals-output-in-java-by.html)

---

## Exercise file
File: `Exercise.java` (already in this folder)

### How to run
Open terminal / command prompt in this folder and run:
```bash
javac Exercise.java
java Exercise
```

---

## What to do (Step-by-step)
1. **Run the program** to see how it behaves. Give sample inputs and observe the output.  
2. **Break the file into sections** — label each section with the concept it demonstrates. Suggested sections:
   - Header / greeting / simple print
   - Scanner / input creation
   - Reading different datatypes
   - Small calculations (operators)
   - Logical checks (relational, logical)
   - Output styles (print, println, printf, concatenation, escape sequences)
3. For **each line** of the program, write a short note (1–2 words) identifying the exact concept used. Example:  
   `double gpa = input.nextDouble();` → *double (datatype), nextDouble (Scanner method), assignment (=)*
4. **Make a list** of:
   - All Scanner methods used and what they read (`nextLine`, `nextInt`, `nextDouble`, `next`, `nextBoolean`, `charAt(0)`).
   - All operators used and their categories (arithmetic, assignment, unary, relational, logical).
   - All output methods used and when to use them (`print`, `println`, `printf` + placeholders).
5. **Answer these specific questions** in a short text file (`ANSWERS.md`):
   - Why is `sc.nextLine()` sometimes needed after number inputs?
   - What is the difference between `next()` and `nextLine()`?
   - What does `%.2f` do in `printf`?
   - What will `apples++` print vs `++apples`?
6. **Modify the exercise** (create a copy or edit a new file `Exercise_YOURNAME.java`):
   - Add a `String favouriteSubject` input and print it.
   - Compute one extra value (for example: average monthly allowance or next year age) and print it with `printf` (2 decimal places when needed).
   - Add a short comment above each new line explaining which concept it represents.
7. **Stretch** (optional): extend the program to accept a second student and print both reports.

---


## Mini Project (required)
**Project name:** Student Report Card (single file)

**Requirements**
- Ask user for **name** and **three subject marks** (integers or doubles).
- Calculate **total** and **average** using operators.
- Determine **pass/fail**: pass if average ≥ 40 (or choose your own rule) and none of the marks is zero.
- Print a **formatted report** using `printf`:
  - Student name, each subject mark, total, average (2 decimal places), status (PASS/FAIL).
- Use at least:
  - one `Scanner` method for each datatype you use,
  - arithmetic and relational operators,
  - logical operator to combine conditions,
  - `printf` with placeholders (`%s`, `%d`, `%.2f`, `%b`),
  - at least one escape sequence (`\n` or `\t`).

**Bonus (optional)**
- Allow input for **two students** and print both reports.
- Validate input (reject negative marks).
- Move repeated code to a method (small intro to methods).


---

## Hints
- If you read a number then want to read a full line string, use an extra `sc.nextLine()` to avoid skipping input.
- Use `sc.next().charAt(0)` to read a single character.
- `printf("GPA: %.2f\n", gpa);` prints `gpa` with 2 decimal places.

