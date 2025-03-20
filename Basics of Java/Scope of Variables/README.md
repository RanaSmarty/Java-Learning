# Scope of Variables

Scope of a variable is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically) scoped, i.e. scope of a variable can be determined at compile time and independent of function call stack.

Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

## **Types of Variable Scope in Java** (Overview of the 5 types)

Java supports several types of variable scopes:
- **Global Scope (Static Variables)**
- **Instance Scope (Instance Variables)**
- **Local Scope (Local Variables)**
- - Member Variable (Explanation + Example) 
- **Method Parameters Scope**
- **Block Scope (Loops, Conditionals, etc)**

## Global Scope (Static Variables)

Static variables are declared with the `static` keyword within a class but outside any method, constructor, or block. They belong to the class itselt rather than to any instance of the class. accessible anywhere in the program using the class name. 

### Example: 
```java


## Member Variables (Class Level Scope)

These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class.

### Let's take a look at an example:

```java

pulic class Test {
    
    // Remember about Member Variables: All variables must be declared inside class!!!

    int a;
    private String b;
    void method1() {
        // Code...
    }
    int method2() {
        // Code...
    }
    char c;
}
```
- We can declare class variables anywhere in call, but outside methods or functions.
- Access specified of member variables doesn't affect the scope of them within a class.
- Member variables ccan be accessed outside a class with the following rules:

| **Modifier** | **Package** | **Subclass** | **World** |
|--------------|-------------|--------------|-----------|
| public | Yes | Yes | Yes |
| protected | | Yes | Yes | No |
| Defailt (no modifier) | | Yes | No | No |
| private | No | No | No |


---



## Local Variables (Method Level Scope)

Variables declared inside a method have method level scope and can't be accessed outside the method.

### Let’s take a look at an example:

```java

public class Test {

    void method_1() {
        int age = 21; // Local Variable (Method Level Scope)
    }
}

```

<B>Note:</B> Local variables don't exist after method's execution is over.

### Here’s another example of method scope, except this time the variable got passed in as a parameter to the method: 

```java

class Test {
    private int x;
    public void setX(int x) {
        this.x = x;
    }
}

```

## The above code uses this keyword too differentiate between the locsl and class variables.

### As an example, predict the output of following Java program...

```java

public class FinalTestScopeOfVar {

    // Static Variable (Class-Level Variable) 
    static int classVariable = 10;
    
    // Instance Variable (Object-Level Variable)
    private int instanceVariable = 25; // Instance variable

    // Method with a Local Variable (Method Scope) 
    public void methodScopeExample(int localVariable) {
        // Local variable is only visible within this method
        System.out.println("Local variable inside method: " + localVariable);
        System.out.println("Instance variable inside method: " + instanceVariable);
        System.out.println("Static variable inside method: " + classVariable);
    }

    // Method demonstrating block scope (within control structures)
    public void blockScopeExample() {
        if (true) {
            int blockVariable = 18; // Block variable is scoped only to this block
            System.out.println("Block variable inside 'if' block: " +blockVariable);
        }

        // The following line will cause an error if uncommented because blockvariable is not accessible here.
        // System.out.println("Block variable inside 'if' block: " +blockVariable); // Error: can not find symbol

    }

    public static void main(String[] args) {
        // Static variable can be accessed directly through the class
        System.out.println("Static variable from main method: " + FinalTestScopeOfVar.classVariable);

        // Create an instance of the class to access instance variables and methods
        FinalTestScopeOfVar obj = new FinalTestScopeOfVar();
        System.out.println("Instance variable from main method (accessing through object): " + obj.instanceVariable);

        // Call method to demonstrate method scope 
        obj.methodScopeExample(30); // Local variable 'LocalVariable' in method 

        // Call method to demonstrate block scope
        obj.blockScopeExample();

        // Demonstrate changing Static and Instance variables
        FinalTestScopeOfVar.classVariable = 100; // Change Static variable through class name
        obj.instanceVariable = 40; // Change Instance variable through object

        System.out.println("Updated Static variable from main method: " + FinalTestScopeOfVar.classVariable);
        System.out.println("Updated Instance variable from main method: " + obj.instanceVariable);
    }
} 

```

### Output 

```bash
Static variable from main method: 10
Instance variable from main method (accessing through object): 25
Local variable inside method: 30
Instance variable inside method: 25
Static variable inside method: 10
Block variable inside 'if' block: 18
Updated Static variable from main method: 100
Updated Instance variable from main method: 40

```
