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

## 3.