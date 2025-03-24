# How to Take Input From Users in Java?

## Introduction

in Java, taking input from users is a basic yet essential task in many programs. This functionality allows the program to interact with the user and accept dynamic data. Java provides multiple ways to take input from users, and the most common approaches are through the `Scanner` class and `BufferedReader` class.

## There are different ways to read input in Java

1. **Using the `Scanner` class**

2. **Using the `BufferedReader` class**

3. **Using `Console`** (less commonly used in modern applications)

## Using the `Scanner` Class to Take Input

1. Import the Scanner Class
Before using `Scanner` class, we need to import it from the `java.util` package:

```java
import java.util.Scanner;
```

2. Create an Instance of the Scanner Class
To read input, we must create an instance of the `Scanner` class. Here's how to initialize it:

```java
Scanner scanner = new Scanner(System.in);
```

3. Read Differ3ent Types of Input
The `Scanner` class provides several methods for reading different types of input. Some of the most commonly used methods are:

- `nextInt()` : To take integer input.
- `nextFloat()` : To take floating-point numbers as input.
- `nextLine()` : to read a full line of text (including spaces).
- `next()` : To read a single word (delimited by space).

### Example Program: Taking Input from Users

```java

import java.util.Scanner;

public class TakeInputExample {
    public static void main(String[] args) {

        // Create a Scanner object to read input from users
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String fullName = userInput.nextLine();

        // Prompt the user for their age
        System.out.print("Enter you age: ");
        userInput.nextLine();       // Consume the Leftover newLine character
        int age = userInput.nextInt();

        // Display the inputs
        System.out.println("Your name is: " + fullName);
        System.out.println("Your age is: " + age);

        // Close the Scanner object to avoid memory leaks
        userInput.close();
    }
}
```

### Explanation of the Code:

1. **Importing Scanner:** The `Scanner` class is imported from `java.util`.
2. **Creating Scanner object:** We create a new `Scanner` object named `userInput` to read from the standard input stream (`System.in`). 
3. **Taking Input:** 

    - The `nextInt()` method is used to take an integer input (for age).

    - The `nextLine()` method is used to take a full string input (for name). We use `nextLine()` after `nextInt()` because `nextInt()` does not consume the newline character, so we need an additional `nextLine()` to consume it.
4. **Closing the Scanner:** Always close the `Scanner` object after use to free up resources.

### Output

```bash
Enter your age: 21
Enter your name: Rana Smarty

Your name is: Rana Smarty
Your age is: 21
```

## Conclusion
- The `Scanner` class is a simple and powerful tool for taking input from users.

- It provides different methods for reading different types of data (e.g., integers, strings, and floats).

- Always remember to close the `Scanner` object to avoid resource leaks.