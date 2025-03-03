# First Java Program

## Introduction
Java is a widely-used object-oriented programming language known for it's platform independence and simplicity. In this section, we will learn how to write, compile, and execute a basic Java program.

---

## Writting First Java Program
Let's start by creating a simple Java program that print "Hurrey! this is my first program in Java language." to the console.

### **Example: Hurrey! this is my first program in Java language.
```java
public class firtsJavaProgram {
    public static void main(String[] args) {

        System.out.println("Hurrey! this is my first program in Java language.");
        return;
    }
}
```

### **Explanation:**
1. **`public class firstJavaProgram`** → Defines a class named `firstJavaProgram`.
2. **`public static void main(String[] args)`** → The `main` method is the entry point of any Java program.
3. **`System.out.println("Hurrey! this is my first program in Java language.");`** → Prints `Hurrey! this is my first program in Java language.` to the console.

---

## Steps to Compile and Run a Java Program
To execute a Java program, follow these steps:

### **Step 1: Save the file**
- Save the program with the same name as the class, followed by `.java` extension.
- Example: `firstJavaProgram.java`

### **Step 2: Compile the Java Program**
Use the Java compiler (`javac`) to compile the program:
```sh
javac firstJavaProgram.java
```

### **Step 3: Run the Compiled Java Program**
Execute the compiled bytecode using the Java Virtual Machine (JVM):
```sh
java firstJavaProgram
```
### **Output:**
```
Hurrey! this is my first program in Java language.
```

---

### Java Compilation and Common Errors

## Understanding Java Compilation
When I develop Java programs, I follow these steps:

1. **Writing Code:** I write my code in a `.java` file.
2. **Compiling:** I use the `javac`compiler to transform the .`java` file into a `.class` file (bytecode).
3. **Execution:** The Java Virtual Machine (JVM) interprets the bytecode to run my program.

## Conclusion

I've successfully written and executed my first Java program. Understanding the structure and compilation process is crucial for developing more complex Java applications in the future.

I plan to stay consistent and keep practicing!!