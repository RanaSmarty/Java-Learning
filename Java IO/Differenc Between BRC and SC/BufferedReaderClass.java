import java.io.BufferedReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class BufferedReaderClass {
    public static void main(String[] args) {
        
        BufferedReader userReader = BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(userReader.readLine());  // Must handle IOException

            System.out.println("Your age is: " + age);
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!"); 
        } finally {
            try {
                userReader.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader!");
            }
        }
    }
}
