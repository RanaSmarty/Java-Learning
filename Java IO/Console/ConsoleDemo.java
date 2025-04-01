package java.io.Console;
import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        
        // Getting the Console object 
        Console user = System.console();

        // Checking if the console is available 
        if (user == null) {
            System.out.println("No console available!");
            return;
        }
        // Reading a line of text 
        String userName = user.readLine("Enter your name: ");
        
        // Reading a password securely (it will not be shown on the screen). 
        char[] passwordChars = user.readPassword("Enter password: ");
        String password = new String(passwordChars);    //  Converting char array to string 

        // Displaying user inputs
        System.out.println("\nUser Information...");
        System.out.println("Username: " + userName);
        System.out.println("Password Length: " + password.length() + "characters");

        // Cleaning password from memory for securely 
        java.util.Arrays.fill(passwordChars,'');
    }
}
