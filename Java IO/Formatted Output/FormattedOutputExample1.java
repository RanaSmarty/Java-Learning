public class FormattedOutputExample1  {
    public static void main(String[] args) {

        String name = "Rana";
        int age = 21;
        double gpa = 3.7543;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("GPA: %.2f%n", gpa);

        return;
    }
}
