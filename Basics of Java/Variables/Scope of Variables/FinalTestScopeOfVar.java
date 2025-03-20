public class FinalTestScopeOfVar {

    // Static Variable (Class-Level Variable) 
    static int classVariable = 10;
    
    // Instance Variable (Object-Level Variable)
    private int instanceVariable = 25; // Instance variable

    // Method with a Local Variable (Method Scope) 
    public void methodScopeExample(int localVariable) {
        // Local variable is only visible within this method
        System.out.println("Local variable inside method: " + localVariable);
        System.out.println("Instance variable inside method: " + instanceVariable);
        System.out.println("Static variable inside method: " + classVariable);
    }

    // Method demonstrating block scope (within control structures)
    public void blockScopeExample() {
        if (true) {
            int blockVariable = 18; // Block variable is scoped only to this block
            System.out.println("Block variable inside 'if' block: " +blockVariable);
        }

        // The following line will cause an error if uncommented because blockvariable is not accessible here.
        // System.out.println("Block variable inside 'if' block: " +blockVariable); // Error: can not find symbol

    }

    public static void main(String[] args) {
        // Static variable can be accessed directly through the class
        System.out.println("Static variable from main method: " + FinalTestScopeOfVar.classVariable);

        // Create an instance of the class to access instance variables and methods
        FinalTestScopeOfVar obj = new FinalTestScopeOfVar();
        System.out.println("Instance variable from main method (accessing through object): " + obj.instanceVariable);

        // Call method to demonstrate method scope 
        obj.methodScopeExample(30); // Local variable 'LocalVariable' in method 

        // Call method to demonstrate block scope
        obj.blockScopeExample();

        // Demonstrate changing Static and Instance variables
        FinalTestScopeOfVar.classVariable = 100; // Change Static variable through class name
        obj.instanceVariable = 40; // Change Instance variable through object

        System.out.println("Updated Static variable from main method: " + FinalTestScopeOfVar.classVariable);
        System.out.println("Updated Instance variable from main method: " + obj.instanceVariable);
    }
}    