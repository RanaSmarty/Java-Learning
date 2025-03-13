// Java program to demonstrate difference between Instance and Static Variables...

class InstanceVsStaticVariable {
    // Declared an Instance variable and stored value...
    int instanceVariable = 21;

    // Declared a static variable;
    static int staticVariable = 22;

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        InstanceVsStaticVariable obj1 = new InstanceVsStaticVariable();
        InstanceVsStaticVariable obj2 = new InstanceVsStaticVariable();

        obj1.instanceVariable += 4;  // Changes obj1's instance variable 25
        obj2.staticVariable += 4;     // Changes the static variable 26 and created this object for just understading not essential;

        System.out.println("Object 1 - Instance Variable: " + obj1.instanceVariable);
       // An extra example for Instance Variable... (obj2) but essential;
       System.out.println("Object 2 - Instance variable: " + obj2.instanceVariable);
       
       System.out.println();
       System.out.println("Difference...");
       System.out.println();
       
       // Static variable is shared across all instances
       System.out.println("Static Variable: " + InstanceVsStaticVariable.staticVariable);

    }
}