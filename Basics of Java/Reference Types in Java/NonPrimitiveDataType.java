public class NonPrimitiveDataType {

    public static void main(String[] args) {
        
        // String type of data type
        String greetingUser = "Asslamu Alaiqum Wa-Rohmatullah!";
        
        // String greetWorld = "Hello World!";
        // String greetJava = "Hey, Java!";

        // Array type data type
        int [] numbers = {1,2, 3, 4, 5};

        // Parallel arrays type of data type
        String nameOfPerson = "Rana Smarty";
        int ageOfPerson = 21;
        double heightPerson = 5.10d;

        // Displaying to the console...
        System.out.println(greetingUser);
        System.out.println("Numbers: ");
        
        for (int number : numbers) {
            System.out.println(number + "");
        }
        System.out.println();

        System.out.println("Person Name: " + nameOfPerson);
        System.out.println("Age: " + ageOfPerson + ".");
        System.out.println("Height: " + heightPerson + "Feet.");

        return;
    }
}