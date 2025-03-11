// Java example to demonstrate Static Variables...

class StaticVariable {

    // Static variable
    static String company = "Medinet Hospital";

    public static void main(String[] args) {

        // Accessing Static Variable without object creaton;
        System.out.println("Company: " + StaticVariable.company);
    }
}