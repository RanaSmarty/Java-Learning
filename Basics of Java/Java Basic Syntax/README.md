# Java Basic Syntax
Java is an object-oriented programming language known for it's simplicity, portability, and robustness. It's syntax closely resemles C and C++, making it easier to understand. This document provides an overview of Java's basic syntax and structure.

## Structure of a JavaProgram
A basic Java program consists of several componets that create a functional application:

```java
public class BasicSyntaxOfJava {
    public static void main(String[] args) {
        System.out.println("Hellow World!");
        return;
    }
}
```
### Output

```
Hello World!

```

---
### Terminologies of a Basic Java Program

### 1. Class
A class is a blueprint (plan) for objects. It defines common properties and behaviors.

- Example: A blueprint of a house is a class.
- Real-world example: "Human" is a class, and Rana Smarty is an object of this class.

### 2. Object:
An object is an instance of a class. It has a state and behavior.

- Example: Dogs, cats, and monkeys are objects of the "Animal" class.
- **Bahavior Example:** A dog running on the road.

### 3. Method:
A method defines the behavior of an object.

- **Example:** A fuel indicator showing the remaining fuel in a car.

### 4. Instance Variable:
Eache object has it's own unique set of instance varibales that define it's state.

#### Example: Compiling and running a Java program in a console>>
```
javac BasicSyntaxOfJava.java
java BasicSyntaxOfJava

```
**Note:** If the class is public, the filename must match tha class name.

---

## Java Basic Syntax

### 1. Comments in Java
There 're three types of comments in Java:

**i. Single-line Comment**
```java
// System.out.println("This is a comment);
```

**ii. Multi-line Comment**
```java
/*
 * There is a multi-line comment.
 * System.out.println("Hello, Rana!");
*/
```

**iii. Documentation Comment (Doc comment)**
```java
/**
 * This is a documentation comment.
 * /
```

### 2. Source File Name
The filename should match the public class name with a `.java` extension.

**Valid:** `BasicSyntaxOfJava.java`
**Invalid:** `basicsyntaxOfjava.java` (case mismatch)

### 3. Case Sensitivity
Java is case-sensitive programming language. Identifiers such as `AB`, `Ab`,`aB`, & `ab` are different.

```java
System.out.println("Hello World!"); // Valid
system.out.println("Hello World!"); // Invalid (System must start with uppercase 's')
```

### 4. Class Name
- The first letter should be uppercase.
- If multiple words are used, each word should start with an uppercase letter.

```java
class MyJavaProgram // Valid
class myJavaProgram // valid but discouraged
class 1Program      // Invalid (can't start with a digit)
class $Program      // Valid but discouraged
```

### 5. `publi static void main(String[] args)`
This is the enrty point of a Java program.

### 6. Method Names
- Should start with a lowercase letter.
- If multiple words are used, each inner word should start with an uppercase letter.

```java
public void studentRecords() // Valid
public void StudentRecords() // Valid but discouraged
```

### 7. Identifiers in Java
Identifiers include variable names, method names, and class names.

**Valid identifiers:** `MinNumber`, `total`, `hello_world`, `_underValue`, `$amound`

**Invalid Identifiers:** `74ak`, `-amount` (Can't start with a digit or special character.)

### 8. White Space in Java
Black lines and spaces are ignored by the Java compiler.

### 9. Access Modifiers
These control the scope of classes and methods.

| Access Modifier | Within Class | Within Package | Outside Package (Subclass) | Outside Package |
|-----------------|--------------|----------------|----------------------------|-----------------|
| Private         | Yes          | No             | No                         | No              |
| Default         | Yes          | Yes            | No                         | No              |
| Protected       | Yes          | Yes            | Yes                        | No              |
| public          | Yes          | Yes            | Yes                        | Yes             |

### 10. Java keywords
Java has reserved keywords that can not be used as identifiers.

| abstract |  assert      | boolean | braek      |
|----------|--------------|---------|------------|
| byte     | case         | catch   | char       |
| class    | const        | continue| default    |
| do       | double       | else    | enum       |
| extends  | final        | finally | float      |
| for      | goto         | if      | implements |
| import   | instanceof   | int     | interface  |
| long     | native       | new     | package    |
| private  | protected    | public  | return     |
| short    | static       | strictfp| suoer      |
| switch   | synchronized | this    | throw      |
| throws   | transient    | try     | void       |
| volatile | white        |         |            |

---

### Conclusion
This document provides an overview of Java's basic syntax and structure. Understanding these concepts is essential for writting efficient and error-free Java program.