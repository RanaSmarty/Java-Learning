# Java Variables

## Introduction

In Java, **Variables** are containers for storing data values, also known as **memory location names** for data.

### Each variables has three essentian components:

1. **Data Type:** Specifies the type of data (like.., `int`, `String`, `float`, `double`, `char`, and `boolean`).
2. **Variable Name:** Uniquely identifies the variable.
3. **Value:** The actual data assigned to the variable.

## Java Has **Three Types of Variables:**
- **Local Variables**
- **Instance Variables**
- **Static Variables**

---

## Java Variables Example

```java
int age = 21; // Integer variable holding value 21.
String name = "RanaSmarty"; // String variable holding "RanaSmarty"
```

## How to Declarer Java variables?
When declaring a variable, we need to specify:

1. **Data Type** &rarr; The type of data the variable will store.
2. **Variable Name** &rarr; A unique identifier for the variable.

## Declaration Syntax:

```java
<data_type> <variable_name>;
<data_type> <variable_name> = <value>;
```

### Example:
```java
float simpleInterest; // Declaring a float variable

// Declaring and initializing integer variables
int time = 10;
int speed = 20;

char variable = 'R'; // Declaring and initializing a character variable.
```

## Types of Java Variables
Java variables can be classified into three categories based on their scope and lifetime:

| **Variable Type** | **Declared Inside** | **Lifetime & Scope** |
|-------------------|---------------------|----------------------|
| **Local Variables** | Methods, blocks, constructors | Created when the method/block is executed and destroyed after exit.|
| **Instance Variables** | Inside a class (outside any method) | Created when an object is instantiated and destroyed when the object is destroyed.|
| **Static Variables** | Inside a class with `static` keyword | Shared among all objects, created at program start, destroyed when program ends. |

## 1. Local Variables
Local variables are declared inside a method, vlock, or constructor and exist only within that scope.

**Characteristics:**
- Must be initialized before use.
- Can not be accessed outside the method/block they are declared in.
- Memory is allocated at runtime, and variables are destroyed once the method finishes execution.

### Example: 

```java
// Java program to demonstrate Local Variables
public class LocalVariable {
    public static void main(String[] args) {
        
        // Declaring a local variable
        int localVar = 21;
        System.out.println("Local Variable: " + localVar);
        return;
    }
}
```
---
### Ooutput:

```bash
Local Variable: 21
```

## 2. Instance Variables
Instance vaariables are declared inside a class but outside any method.

**Characteristics:**

- Created when an object of the class is instantiated.
- Can have access modifiers (private, public, and protected).
- Default values are assigned based on data types (e.g., `int = 0`, `String = null`).
- Accessible by all methods in the class.

### Example:

```java
// Java program to demonstratate Instance variables...
class Example {

    // Declared instance variable
    String name;
    int age;

    // Constructor
    Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Example obj = new Example("Rana Smarty",21);
        obj.display();
    }
} 
```
### Output:
```bash
Name: Rana Smarty
Age: 21
```

## 3. Static Variables
Static variables are declared inside a class with the `static` keyword.

**Characteristics:**
- Shared among all instances of the class.
- Created when the program starts & destroyed when the program stops.
- Can be accessed directly using the class name.

### Example:

```java
// Java example to demonstrate Static Variables...

class StaticVariable {

    // Static variable
    static String company = "Medinet Hospital";

    public static void main(String[] args) {

        // Accessing Static Variable without object creaton;
        System.out.println("Company: " + StaticVariable.company);
    }
}
```
### Output:
```bash
Company: Medinet Hospital
```

## Differences between Instance Variables and Static Variables

| **Feature** | **Instance Variable** | **Static Variable** |
|-------------|-----------------------|---------------------|
| **Declaration** | Inside a class (no `static`keyword) | Inside a class with `static` keyword |
| **Scope** | Exits per object | Shared across all objects |
| **Access** | Requires object creation | Can be accessed using class name |
| **Memory** | Allocated per object | Single memory allocation in class area |

### Example:

```java
class InstanceVsStaticVariable {
    
    // declared an Instance variable and stored value
    int instanceVariable = 21;

    // Declared a Static Variable
    static int staticVariable = 22; 

    public static void main(String [] args) {

        InstanceVsStaticVariable obj1 = new InstanceVsStaticVariable();
        InstanceVsStaticVariable obj2 = new InstanceVsStaticVariable();

        obj1.instanceVariable += 4;
        obj2.staticVariable += 4;

        System.out.println("Object 1 - Instance Variable: " + obj1.instanceVariable); // 25
        
        // An extra example for Instance Variable... (obj2) but essential;
        System.out.println("Object 2 - Instance variable: " + obj2.instanceVariable); // 21
        System.out.println();
        System.out.println("Difference...");
        System.out.println();
        System.out.println("Static Variable: " + InstanceVsStaticVariable.staticVariable); // 26
    }
}
```

### Output:
```badh
Object 1 - Instance Variable: 25
Object 2 - Instance Variable: 21

Difference...

Static Variable: 26
```
## Summary
- **Variables** store data values in `Java`.
- **Local Variables** exist only inside methods, blocks, or constructors.
- **Instance Variable** exist within object, declared inside classes bu outside methodds.
- **Static Variables** are shared among all objects of a class, declared with the `static` keyword.

## Conclusion

In Java, variables are fundamental building blocks that enable data storage and manipulation. Understading the differences between **Local, Instance, and Static Variables** is crucial for efficient programming. local variables are temporary and limited to methods or blocks, while Instance variables are associated with objects and maintain their state throughout an object's lifespan. Static variable, on the other hand, are shared among all insatance of a class, providing a way to manage shared data efficiently.

***Note:** Mastering Java variables is essential for writing clean, efficient, and maintainable code..!*