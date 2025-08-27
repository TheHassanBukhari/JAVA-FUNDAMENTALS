# Conditional Statements

**Exercise & Project**

Welcome — this folder contains the practice material for **if-else** and **switch statements**, based on Blog Posts #7 and #8 of *Java Fundamentals*.
This is the second step after completing the [Basics](../Basics/README.md) folder.

**Goal:** download the provided files (`IfElseExercise.java`, `SwitchExercise.java`), run them, then *break them down* so you can identify every concept you’ve studied. After that, complete the mini-projects at the end.

---

## Study first

Read these posts before attempting the exercises (in order):

7. [If-Else Statements in Java](https://hassan-codes.blogspot.com/2025/08/07-java-fundamentals-if-else-statements.html)
8. [Switch Statements in Java](https://hassan-codes.blogspot.com/2025/08/08-java-fundamentals-switch-statements.html)

---

## Exercise files

Files:

* `IfElseExercise.java`
* `SwitchExercise.java`

### How to run

Open terminal / command prompt in this folder and run:

```bash
javac IfElseExercise.java
java IfElseExercise

javac SwitchExercise.java
java SwitchExercise
```

---

## What to do (Step-by-step)

1. **Run the programs** to see how they behave. Test with multiple inputs (valid + invalid) and observe results.
2. **Break the file into sections** — label each section with the concept it demonstrates. Suggested sections:

   * Condition checking
   * Nested conditions
   * Multiple pathways (else-if ladder / switch cases)
   * Use of `break` and `default` in switch
   * Grouped cases
3. For **each line** of the program, write a short note (1–2 words) identifying the exact concept used. Example:
   `if (marks >= 50)` → *if, relational operator (>=), condition*
4. **Answer these reflection questions**:

   * When should you prefer `if-else` instead of `switch`?
   * What happens if you remove `break` from a switch case?
   * Can you write a range-based condition (like 1–10) using switch? Why / why not?
   * Which datatypes are allowed in switch cases?
5. **Modify the exercises**:

   * Add at least one extra condition or case.
   * Use both `if-else` and `switch` to solve the same small problem, then compare which looks cleaner.
   * Add short comments above each new line to explain what it represents.

---

## Mini Projects

### 1. If-Else Project — **Grade Calculator**

* Ask user for a percentage (0–100).
* Print grade according to these rules:

  * 90–100 → A
  * 80–89 → B
  * 70–79 → C
  * 60–69 → D
  * Below 60 → F
* Add an extra rule: if marks are < 0 or > 100, print “Invalid Input”.
* Bonus: also print a motivational message (e.g., “Excellent!”, “Keep working hard”).

---

### 2. Switch Project — **Simple Menu System**

* Show a menu:

  ```
  1. Check Balance
  2. Deposit Money
  3. Withdraw Money
  4. Exit
  ```
* Use `switch` to handle the choice.
* For deposit/withdraw, update a balance variable.
* For invalid choice, show “Invalid Option”.
* Bonus: Add grouped cases (e.g., `case 1:` and `case 2:` both display balance in different styles).

---

## Hints

* Use `else-if` when working with **ranges or complex conditions**.
* Use `switch` when comparing a **single variable against many fixed values**.
* Always test edge cases (like highest/lowest marks, invalid menu input).
* Remember: `switch` does not work with `double`, `float`, `long`, or `boolean`.

---
