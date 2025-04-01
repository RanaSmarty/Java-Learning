import java.util.Scanner; 

public class ScannerClassDemo {
    public static void main(String[] args) {
    
        Scanner userScanner = new Scanner(System.in);

        System.out.print("Enter multiple numbers (space-separated): ");
        while (userScanner.hasNextInt()) {  // Check if the next input is an integer
            int number = userScanner.nextInt();     // Read the integer 
            System.out.println("You entered: " + number);
        }
        System.out.println("Non-integer input detected! Exiting...");
        userScanner.close();
    }
}