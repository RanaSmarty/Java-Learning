# Wrapper Classes in Java

## Introduction to Wrapper Classes in Java

In Java, **Wrapper Classes** provide a mechanism to convert primitive data types (like `int`, `char`, `boolean`, etc.) into their corresponding objects. They are part of the java.lang package and are essential when an object reference is needed instead of a primitive type.

For example, Collections in Java (like `ArrayList`, `HashMap`) cannot store primitive data types directly. Instead, their wrapper classes are used. 

**The most commonly used wrapper classes are:** 

| **Primitive Data Type** | **Wrapper Class** |
|-------------------------|-------------------|
| `int` | `Integer` |
| `char` | `Character` |
| `boolean` | `Boolean` |
| `byte` | `Byte` |
| `short` | `Short` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` | 

## Why Use Wrapper Classes in Java?

Wrapper classes, which are final and immutable, surround a data type and give it the appearance of an object. They include two concepts: Autoboxing and Unboxing. Autoboxing is the process of transforming a primitive value into an object of the relevant wrapper class. For example, consider changing int to the Integer class. 
The Java compiler implements autoboxing when a primitive value is:

- **Object Manipulation:** Primitive data types can't be used directly in certain situations where objects are required (like Collections).
- **Utilities & Methods:** Wrapper classes provide utility methods to manipulate data, such as parsing a string to an integer.
- **Immutability:** All wrapper classes are immutable (values can't be changed once created).
- **Type Conversion:** Provides methods for converting primitives to strings and vice versa.

## Autoboxing and Unboxing

Java automatically handles the conversion between primitive data types and their corresponding wrapper classes.

- **Autoboxing**: Automatically converting a primitive type to its correspponding wrapper class.
- **Unboxing**: Automatically converting a wrapper class to its corresponding primitive type.

### Let’s take a look at an example:

```java
public class WrappeExample {
    public static void main(String[] args) {

        // Autoboxing: converting int to Integer
        Integer intObj = 10;

        // Unboxing: converting Integer to int
        int intValue = intObj;

        System.out.println("Autoboxed Integer: " + intObj);
        System.out.println("Unboxed int: " + intValue);
    } 
}

```
## Important Methods

1. **parseXxx() Methods:** Converts a string to a primitive type.

```java
int number = Integer.parseInt("21");
```

2. **valueOf() Mathod:** Converts a string to a wrapper class object.

```java
Integer numberObj = Integer.valueOf("21");
// This also utilizes caching for values between -128 and 127.

```

3. **toString() Method:** Converts a wrapper object to a string.

```java
String str = numberObj.toString();
```

4. **intValue(), doubleValue(), etc:** Converts a wrapper object to its primitive type.

```java
int i = numberobj.intValue();
```

## parsing with Wrapper Classes

Wrapper classes are also used to parse strings into primitive types or wrapper class objects. This is a common use for converting user input or string data into usable values for further processing.

1. **Parsing String to primitive:** The `parseXxx()` methods in the wrapper classes can convert strings to primitive data types.

### Let’s take a look at an example:

```java

String intStr = "21";
int number = Integer.parseInt(intStr);  // Parses string to integer (int)

String doubleStr = "3.14159";
double pi = Double.parseDouble(doubleStr);  // Parses string to double.

```

2. **Parsing String to Wrapper Class:** The `valueOf()` method can convert a String to its corresponding wrapper class object.

### Let’s take a look at an example:

```java

String booleanStr = "true";
Boolean booleanObj = Boolean.valueOf(booleanStr);   // Parses string to Boolean object.

String doubleStr = "5.10";
Double doubleObj = Double.valueOf(doubleStr);    // Parses String to Double object

```

3. **Exception Handling:** Parsing methods may throw a `NumberFormatException` if the string is not valid representation of the intended type.

### Let’s take a look at an example:

```java

try {
    String invalidStr = "abcd";
    int number = Integer.parseInt(invalidStr);  // Throws NumebrFormalException
} catch (NumberFormatException e) {
    System.out.println("Invalid number format!");
}

```

## Comparison of Wrapper Objects

- Always use `.equals()` method to compare wrapper objectss instead of `==`, which checks reference equality.

### Let’s take a look at an example:

```java

Integer a = 100;
Integer b = 100;

System.out.println(a == b);       // false (because of Integer Caching)
System.out.println(a.equals(b));  // true
```

```java
Integer x = 999;
Integer y = 999;

System.out.println(x == y);       // false

System.out.println(x.equals(y));  // true
```

### Here's a complete program that covers all these concepts:
[View the Final Test of FinalDemoWrapperClasses](https://github.com/RanaSmarty/Java-Learning/blob/main/Basics%20of%20Java/Wrapper%20classes/FinalDemoWrapperClasses.java)

## Conclusion

Wrapper Classes are essential in Java for handling situations where objects are required instead of primitive data types. They provide numerous utility method, enable compatibility with Collections, and simplify type conversions. However, it's important to use them carefully, as they can be less memory-efficient and slower than primitives.