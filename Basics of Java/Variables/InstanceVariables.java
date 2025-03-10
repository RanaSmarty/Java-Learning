class Example {
    String name;
    int age;

    Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Example obj = new Example("Rana Smarty", 21);
        obj.display();
    }
}