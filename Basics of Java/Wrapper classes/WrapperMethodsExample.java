public class WrapperMethodsExample  {
    public static void main(String[] args) {
        
        // Parsing string to Primitive type...
        int number = Integer.parseInt("21");
        double pi = Double.parseDouble("3.14159");

        // Creating Wrapper objects using valueOf()
        Integer intObj = Integer.valueOf(number);
        Double doubleObj = Double.valueOf(pi);

        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);

    }
}

