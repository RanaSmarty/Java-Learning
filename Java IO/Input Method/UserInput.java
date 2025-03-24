import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = userInput.nextInt();

        // Consume the Leftover newLine
        userInput.nextLine();

        // Prompt the user for their name
        System.out.print("Enter your full name: ");
        String fullName = userInput.nextLine();

        // Display the input
        System.out.println("Your name is: " + fullName);
        System.out.println("Your favorite number is: " + favoriteNumber);

        // Close the Scanner object
        userInput.close();

    }
}

