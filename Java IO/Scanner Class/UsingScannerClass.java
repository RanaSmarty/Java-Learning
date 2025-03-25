import java.util.Scanner;

public class UsingScannerClass {
    public static void main(String[] args) {
        
        // Creating a Scanner object to take inputs from user
        Scanner userInput = new Scanner(System.in);

        // Taking a string input by asking user name
        System.out.println("What's your full name?");
        String fullName = userInput.nextLine();

        // Taking an integer like age
        System.out.println("Enter your age...");
        System.out.print("Years: ");
        int userAgeInYear = userInput.nextInt();
        System.out.print("Months: ");
        int userAgeInMonth = userInput.nextInt();

        // Taking user height similar to age format
        System.out.println("Enter your height...");
        System.out.print("Feet: ");
        int heightFeet = userInput.nextInt();
        System.out.print("Inches: ");
        int heightInches = userInput.nextInt();

        // Taking a boolean input from user
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = userInput.nextBoolean();

        // Displaying user inputs...
        System.out.println();
        System.out.println("User Information...\n");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + userAgeInYear + " Years " + userAgeInMonth + " Months");
        System.out.println("Height: " + heightFeet + " Feet " + heightInches + " Inches"); 
        System.out.println("Student: " + isStudent);

        // Closing the scanner object to avoid resource leaks.
        userInput.close();
    }
}