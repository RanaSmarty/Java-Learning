# Data Types in Java

## Introduction
Java is a statically typed and strongly typed language. Every data type (such as integer, character, decimal, etc.) is predefined in the Java language, ensuring that all constants and variables must be declared with a specific data type.

## Types of Data in Java
Java data types are categorized into two main types:

1. **Primitive Data Types** - Includes boolean, char, int, short, byte, long, float, and double.
2. **Non-Primitive (Reference) Data Types** - Includes String, Arrays, Classes, objects, and Interfaces.

## 1. Primitive Data Types 
Primitive data types hold only single values and don't have special capabilities. Java provides eight primitive data types: 

|  **Type** | **Size** | **Default Value** | **Description** | 
|-----------|----------|-------------------|-----------------| 
| `boolean` | 1 bit    | `false`           | Stores `true` or `false` values |
|  `byte`   | 1 byte   | `0`               | Small integer (-128 to 127) |
|  `short`  | 2 bytes  | `0`               | Larger integer (-32,768 to 32,767) |
|   `int`   | 4 bytes  | `0`               | Common integer type (-2^31 to 2^31-1) |
|   `long`  | 8 bytes  | `0L`              | Large integer (-2^63 to 2^63-1) |
|  `float`  | 4 bytes  | `0.0f`            | Single-precision decimal (up to 7 decimal places) |
|  `double` | 8 bytes  | `0.0d`            | Double-precision decimal (up to 16 decimal places) |
|   `char`  | 2 bytes  | `\u0000`          | Single character (Unicode-based) |

### Example of Primitive Data Types in Java
```java
public class PrimitiveDataType {
    public static void main(String[] args) {

        boolean flag = true;
        byte smallNumber = 1;
        short shortNumber = 4999;
        int integerNumber = 100000;
        long largeNumber = 150000L;
        float floatNumber = 9.8f;
        double doubleNumber = 5.10d;
        char character = 'R';

        System.out.println("Boolean: " + flag);
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Integer: " + integerNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + character);
        
        return;
    }
}
```

## 2. Non-Primitive (Reference) Data Types 
Reference data types store memory address instead of raw values. Examples include Strings, Arrays, Classes, and Objects.

### String Data Type
Strings are sequences of characters enclosed in double quotes.

```java 
String message = "Welcome to GitHub!";
```

### Array Data Type
Arrays store multiple values of the same type.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Classes and Objects
A class is a blueprint (plans) for objects, and Objects are instances of classes.
```java
class Car {
    String model = "Supra";
} 

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println(myCar.model);
        return;
    }
}
```
## Key Points
- Java enforces strict type-checking at compile-time..
- Strings are immutable, meaning they can't be changed after creation.
- Arrays have fixed lengths once declared.

## 3. Differences between Primitive and Non-Primitive Data Types:

| Feature             | Primitive Data Types     | Non-Primitive Data Types  |
|---------------------|--------------------------|---------------------------|
| **Definition**      | Stores single values     | Stores references to objects |
| **Memory Usage**    | Requires less memory     | Requires more memory      |
| **Operations**      | Supports arithmetic      | Can call methods and functions |
| **Examples**        | `int, char, boolean`     | `String, Arrays, Objects` |
| **Stored in**       | Stack memory             | Heap memory               |

### Quick Example:
```java
int number = 99; // Primitive data type
String text = "Hi..!"; // Non-Primitive data type
```


## Conclusion
Understanding Java's data types is crucial for effective programming. Choosing the correct data type ensures efficient memory usage and program performance.