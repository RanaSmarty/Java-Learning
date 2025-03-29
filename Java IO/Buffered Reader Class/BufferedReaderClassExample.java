import java.io.BufferedReader;     // Importing BufferedReader class for input
import java.io.IOException;        // Importing IOException to handle input errors
import java.io.InputStreamReader;   // Importing InputStreamReader to read input stream

public class BufferedReaderClassExample {
    public static void main(String[] args) {

        // Creating BufferedReader object to read user input
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Taking user input as a string
            System.out.print("Enter your name: ");
            String name = userInputReader.readLine();  // Reads a full line of text input

            // Taking integer input and converting it from string to int
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(userInputReader.readLine());  // Reads input and parses it as an integer

            // Taking floating-point input and converting it from String to double
            System.out.print("Enter your height in cm: ");
            double height = Double.parseDouble(userInputReader.readLine());  // Reads input and parses it as a double

            // Displaying user inputs...
            System.out.println();
            System.out.println("User Information...");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age + " Years");
            System.out.println("Height: " + height + " cm");

        } catch (IOException e) {
            // Handling input/output exceptions
            System.out.println("An error occurred while reading input!");
            e.printStackTrace();  // Prints error details for debugging
        } finally {
            try {
                // Closing BufferedReader to free resources
                userInputReader.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader!");
            }
        }
    }
}

/* 
 * Try block: Attempts to read inputs. (Learn more later)
 * Catch block: Catches `IOException` and prints an ERROR message if an input error occurs.
 * Finally block: Ensure `Buffer3dReader` is closed properly even if an exception occurs.
 * ...
*/
