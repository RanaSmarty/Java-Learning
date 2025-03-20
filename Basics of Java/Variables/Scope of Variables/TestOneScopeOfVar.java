// The TestScopeOfVar class demonstrates the usage of member variables and methods in JAva...
public class TestOneScopeOfVar {

    // Member variable 'a' is an interger type and is accessible by only method within this class
    int a;

    // Member variable 'b' is a private string. It can only be accessed within this class.
    @SuppressWarnings("unused")
    private String b;

    // Method 'method1' performs an action. It does not return any value
    void method1() {

        // Add code logic here...
    }

    // Method 'method2' returns an integer value. It can be used to perform operations and return an integer result.
    int method2() {

        // Add code logic here...

        return 0; // Example return value
    }

    // Member variable 'R' is a character type,, which can store a single character value
    char R;
}