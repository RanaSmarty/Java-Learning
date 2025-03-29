# Buffered Reader Class in Java

## Introduction
The `BufferedReader` class is a part of `java.io` package and is another way to read input in Java. Unlike the `Scanner` class, which provides built-in methods for reading different data types, `BufferedReader` reads input as strings and can be more efficient for reading large amounts of text.

## Key Features of `BufferedReader` Class: 

-  **Efficient for large input:** It reads larger chunks of data at once, making it faster for large inputs.
- **Reads text line-by-lin:** It's suitable for reading full lines of text.
- **Throws IOException:** It requires handling of I/O exceptions.

### Here's an example:

```java

import java.io.BufferedReader;      // Importing BufferedReader class for input
import java.io.IOException;     // Importing IOException to handle input errors
import java.io.InputStreamReader;       // Importing InputStreamReader to read input stream

public class BufferedReaderClassExample {
    public static void main(String[] args) {

        // Creating BufferedReader object to read user input
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

        // Taking user input as a string
        System.out.print("Enter your name: ");
        String name = userInputReader.readLine();      // Reads a full line of text input

        // Taking integer input and converting it from string to int
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(userInputReader.readLine());     // Reads input and parses it as an integer

        // Taking floating-point input and converting it from String to double
        System.out.print("Enter your height in cm: ");
        double height = Double.parseDouble(userInputReader.readLine());        // Reads input and parses it as a double


        // Displaying user inputs...
        System.out.println();
        System.out.println("User Information...");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "Years");
        System.out.println("Height: " + height + "cm");

        // Closing BufferedReader
        userInputReader.close();


        // Closing BufferedReader isn't necessary when using System.in
    }
}
```
### Output Sample

```bash
Enter your name: Rana Smarty
Enter your age: 21
Enter your height in cm: 175.5

User Information...
Name: Rana Smarty
Age: 21 Years
Height: 175.5 cm
```

## Conclusion 

The `BufferedReader` class is more efficient for reading large data and works well when dealing with large inputs, as it reads input line by line.  