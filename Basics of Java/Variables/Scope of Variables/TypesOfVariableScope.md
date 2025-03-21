# Scope of Variables

Scope of a variable is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically) scoped, i.e. scope of a variable can be determined at compile time and independent of function call stack.

Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

## **Types of Variable Scope in Java** (Overview of the 5 types)

Java supports several types of variable scopes:
- **Global Scope (Static Variables)**
    - variables declared with the `static` keyword within a class but outside any method, constructor, or block.
    - They belong to the class itself rather than to any instance of the class.
    - Accessible anywhere in the program using the class name.

- **Instance Scope (Instance Variables)**
    - Variables declared inside a class but outside any method, constructor, or block.
    - Each object of the class has its own copy of instance variables.
    - Accessible by creating an object of the class and using the dot (.) operator.

- **Local Scope (Local Variables / Member Variables)**
    - Variables declared inside a method or block.
    - These variables are accessible only within the method or block where they are declared.
    - They cease to exist once the method or block execution is over. 

    **Member Variables:
    -  Another name for instance variables, as they are members of a class.
    - Declared at the class level, but not marked as `static`.
    - They exist as long as teh object of the class exists.

- **Method Parameters Scope**
    - Variables are passed to a method as arguments.
    - Their scope is limited to the method where they are declared.
    - Not accessible outside the method.

- **Block Scope (Loops, Conditionals, etc)**
    - Variables declared within a block (like `if`, `for`, `while`) are accessible only within that block. 
    - They are destroyed once the block is exited.




## Global Scope (Static Variables)

One kind of class variable that is shared by all instances is the static variable.  Once declared, static variables can be used anywhere, including outside of the class, without requiring the class to be initialized.  Its scope is not restricted to the block or the class, in contrast to local variables.

### Let’s take a look at an example: 

```java
public class GlobalScopeVariable {
    static int globalVar = 100;

    public static void display() {
        System.out.println("Static variable: " + globalVar);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable from main method: " + globalVar);
        display();
    }
}
```
### Output

```bash
Accessing static variable from main method: 100
Static variable: 100
```


## Instance Scope (Instance Variables)

These variables must be declared inside a class (outside any function). They can be directly accessed anywhere in the class.
    

### Let’s take a look at an example:

```java

pulic class InstanceScopeExample {
    
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
### Member Variables (Class Level Scope)
### Let’s take a look at an another example:

[View the MemberVariableExample Program](https://github.com/RanaSmarty/Java-Learning/blob/main/Basics%20of%20Java/Variables/Scope%20of%20Variables/MemberVariablesExample.java)

- We can declare class variables anywhere in call, but outside methods or functions.
- Access specified of member variables doesn't affect the scope of them within a class.
- Member variables ccan be accessed outside a class with the following rules:

| **Modifier** | **Package** | **Subclass** | **World** |
|--------------|-------------|--------------|-----------|
| public | Yes | Yes | Yes |
| protected | Yes | Yes | No |
| Default (no modifier) | Yes | No | No |
| private | No | No | No |


---



## Local Variables (Method Level Scope)

Variables declared inside a method have method-level scope and can't be accessed outside the method.

### Let’s take a look at an example:

```java

public class MethodLevelScopeExample {

    void method_1() {
        int age = 21; // Local Variable (Method- Level Scope)
    }
}

```

<B>Note:</B> Once the execution of the method is complete, local variables are no longer present.

## Method Parameter Scope
Variables provided to methods upon call are known as method parameters. Their application is restricted to the manner in which they are announced. They are inaccessible via any other technique.

### Let’s take a look at an example:

```java
public class MethodParameterScopeExample {

    private int x;
    public void setX(int x) {
        this.x = x; // 'this' refers to the instance variable
    }
}
```

- The `this` keyword is used to differentiate between the instance variable ans the method parameter.

## Block Scope (Loops, Conditionals, etc)
Only within a block may you access variables that have been declared there (such as `if`, `for`, and `while`).  After leaving the block, they are destroyed.

### Let’s take a look at an example:

```java
public class BlockSpoceExample {

    public void showBlockScope() {
        if (true) {
            int number = 50; // Block variable
            System.out.println("Inside if block: " + number);
        }
    }
}
```

### Output

```bash
Inside if block: 50

```
If you try to access `number` outside the `if` block, you would get an error like:

```bash
cannot find symbol
    symbol: variable number
```


### Here's a complete program that covers all these concepts:

[View the Final Test Scope of Variable Program](https://github.com/RanaSmarty/Java-Learning/blob/main/Basics%20of%20Java/Variables/Scope%20of%20Variables/FinalTestScopeOfVar.java) 

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
## Some Important Points about Variable Scope in Java

- In general, a set of curly bracketss {} defines a scope.
- In Java, we can usially access a varianle as long as it was defined within the same set of brackets as the code we're writing or within any curly brackets inside of the curly brackets where the variable was defined.
- Any variable defined in a class outside of any method can be used by all member method. 
- When a method has the same local variable as a member, `this` keyword can be used to reference the current class variable.
- For a variable to be read after the termination of a loop, it must be declared before the body of the loop. 

## Conclusion

Understanding the different types of variable scope in Java is crucial for writing efficient and error-free code. Each scope type serves a specific purpose nd helps in managing memory, improving readability, and preventing conflicts between variables. by mastering variable scopes, we can write more organized and robust Java program!