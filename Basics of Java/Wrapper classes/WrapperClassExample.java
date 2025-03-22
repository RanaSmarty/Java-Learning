public class WrapperClassExample {

    public static void main(String[] args) {
        // Autoboxing: Converting primitive to object
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing...

        double primitiveDouble = 9.8;
        Double wrapperDouble = primitiveDouble; // Autoboxing... 

        // Unboxing: Converting object back to primitive
        int unboxedInt = wrapperInt; // Unboxing...
        @SuppressWarnings("unused")
        double unboxedDouble = wrapperDouble; // Unboxing... 

        // Using utility methods to parse strings to primitive types
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("9.8");

        // Output
        System.out.println("Autoboxed Integer: " + wrapperInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println("Parsed Double: " + parsedDouble);
    }
}

