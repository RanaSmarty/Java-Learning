public class PrimativeDataType {

    public static void main(String[] args) {
        
        // integer Types
        byte byteValue = 127;
        short shorrtValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372025L;

        // Floating-Point Types
        float floatValue = 3.1416f;
        double doubleValue = 3.141592653589793238462643383279502884197;

        // Character Type
        char characterValue = 'R';

        // Boolean Type
        boolean booleanValue = true;

        // Displaying the value and their corresponding data-types
        System.out.println("Byte value: " + byteValue + "(byte).");
        System.out.println("Short value: " + shorrtValue + "(short).");
        System.out.println("Integer value: " + intValue + "(int).");
        System.out.println("Long value: " + longValue + "(long).");
        System.out.println("Float value: " + floatValue + "(float).");
        System.out.println("Double value: " + doubleValue + "(double).");
        System.out.println("Character value: " + characterValue + "(char).");
        System.out.println("Boolean value: " + booleanValue + "(boolean).");

        return;
    }
}