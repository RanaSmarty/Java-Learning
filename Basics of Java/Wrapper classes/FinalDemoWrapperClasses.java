public class FinalDemoWrapperClasses {
    public static void main(String[] args) {
        
        // Primitive Data types
        byte byteValue = 5;
        int intValue = 100;
        float floatValue = 5.10f;
        double doubleValue = 4.9;
        char characterValue = 'M';
        
        // Wrapping (Autoboxing): Converting primitives to their Wrapper Objects
        Byte byteObj = byteValue;
        Integer integerObj = intValue;
        Float floatObj = floatValue;
        Double doubleObj = doubleValue;
        Character characterObj = characterValue;

        // Displaying the Wrapper Objects
        System.out.println("Wrapped Objects...");
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Integer Object: " + integerObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + characterObj);
        System.out.println();

        // Unwrapping (Unboxing): Converting Wrapper Objects back to their primitive data types.
        byte bytePrimitive = byteObj;
        int intPrimitive = integerObj;
        float floatPrimitive = floatObj;
        double doublePrimitive = doubleObj;
        char characterPrimitive = characterObj;

        // Displaying unboxed Primitive Data Types;
        System.out.println("Unwrapped Primitive Values...");
        System.out.println("byte: " +bytePrimitive);
        System.out.println("int: " + intPrimitive);
        System.out.println("float: " + floatPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("char: " + characterPrimitive);
        System.out.println();

        // Parsing with different wrapper classes
        System.out.println("Parsed Values...");
        String byteStr = "21";
        byte parsedByte = Byte.parseByte(byteStr);
        System.out.println("Parsed Byte: " + parsedByte);

        String shortStr = "12345";
        short parsedShort = Short.parseShort(shortStr);
        System.out.println("Parsed Short: " + parsedShort);

        String longStr = "1660137180";
        long parsedLong = Long.parseLong(longStr);
        System.out.println("Parsed Long: " + parsedLong);

        String floatStr = "5.10f";
        float parsedFloat = Float.parseFloat(floatStr);
        System.out.println("Parsed Float: " + parsedFloat);

        String doubleStr = "3.14159";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsed Double: " + parsedDouble);

        String charStr = "M";
        char parsedChar = charStr.charAt(0);
        System.out.println("Parsed Character: " + parsedChar);
    }
}
