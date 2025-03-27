# Scanner Class in Java

## Introduction
The `Scanner` class is a part of the `java.util` package, and it's one of the most commonly used methods for reading input from the user in Java. It's versatile and can handle different types of input, such as integers, string, and floating-point numbers. 

## Key Features of `Scanner` Class:
- **Easy to use:** Simple and straightforward methods to read data from various sources.
- **Flexible:** Reads input from `System.in`, files, strings, and other sources.
- **Supports various Data  Types:** Integer, float, double, boolean, string, etc..

### Example: Using Scanner for Different Data Types

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

    // Create a Scanner object to read input from the user
    Scanner UserScannerObj = new Scanner(System.in);

    // Reading an integer
    System.out.print("Enter an integer number: ");
    int number = UserScanner.nextInt();

    // Reading a String 
    System.out.print("Enter you full name: ");
    String fullname = UserScanner.NextLine();

    // Reading a floating-point number
    System.out.print("Enter your GPA: ");
    float gpa = UserScanner.NextFloat();

    // Displaying the values
    System.out.println("Your name is: " + fullName);
    System.out.println("Your age is: " + age);
    System.out.println("Your GPA is: " + gpa);

    UserScanner.close();
    }
}
```
## Conclusion
The `Scanner` class is a powerful tool for taking user input in Java. It can read various data types from the standard input and is widely used due to its simplicity. 