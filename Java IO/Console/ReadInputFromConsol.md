# Way to Read Input From Consol in Java

## Introduction 
In Java, there are various way to take input from the user. The most commonly used methods are through `Scanner`, `BufferedReader`, and `Consol`. Each has its strengths, and choosing the right one depends on the requirements of the program. 

## Common Methods

1. **Using** `Scanner`: For reading input of various data types, easy to use.
2. **Using** `BufferedReader`: Efficient for reading large chunks of input, mainly used for text. 
3. **Using** `Console`: A lesser-known class that reads input from the console.  

### Let's look at the example of using console: 

```java 
public class ConsoleExample {
    public static void main(String[] args) {

        // Getting the console object 
        Console userConsolObj = System.console();

        // Checking if the console is available 
        if (userConsoleObj != null) {
            String name = userConsolObj.readLine("Enter your name: ");
        } else {
            System.out.println("Console is not available!");
        }
    }
}
```
## Important Note: 

- `System.console()` **return** `null` when executed in an IDE. It works **only** in a real command-line environment like **CMD, Terminal,** or **Git Bash**. 
- Use `Scanner` if needed to handle input across all environments. 

## Conclusion 
Java provides different ways to take input from the console, including `Scanner`, `BufferedReader`, and `Console`. Choose the method based on our input requirements and performance needs.  