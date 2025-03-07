# Java Identifiers

Java identifiers are names used for **classes, variables, methods, interfaces, and packages.** Identifiers must follow specific rules to be valid.

## Structure of Java Identifiers

A Java identifier can be any combination of **letters, digits, underscores (_), and dollar signs ($),** but  must follow these rules:

- Must **begin with a letter (A-Z or a-z), underscore (_), or dollar sign ($)**.
- It can't be a **Java-reserved keyword**.
- It can not contain **whitespace** or **special characters** like @, %, & etc.
- Java is **case-sensitive**, so Variable and variable are different identifiers.

## Example
```java

public class TestIdentifiers {

    public static void main(String[] args) {
        
        int number = 10;
        int age = 21;
        /*
         * 'number' and 'age' is valid identifiers
         */

        String firstName = "Rana"; // 'firstName' folllows Java naming conventions
        
        // unnecessary but no problem! 
        System.out.println("First Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        
        return;
    }
}
```
### Identifiers in the Above Code:

- TestIdentifiers: Class Name
- main: Method Name
- args: Parameter Name
- number and age: Variable Name
- firstName: Variable Name

### Rules for Naming Java Identifiers

1. **Identifiers must begin with a letter (A-Z or a-z), an underscore (_), or a dollar sign ($).**

   ✅ `studentName`, `_value`, `$amount`  
   ❌ `123abc`, `@home`, `total-cost`

2. **Can not use Java-reserved keywords.**

   ❌ `int while = 10;`  // `while` is a reserved keyword

3. **Java identifiers are case-sensitive.**

   ✅ `MyVariable`, `myVariable`, and `MYVARIABLE` are different.

4. **Identifiers can be of any length but should be readable and meaningful.**

   ✅ `firstName` (Good practice)  
   ❌ `fn` (Avoid using unclear names)

5. **It can't contain spaces or special characters (except `_` and `$`).**

   ❌ `my variable`, `num#value`

## ✅ Valid Identifiers

```
int myVariable;
String _name;
float $amount;
double speed123;
boolean isActive;
```

## ❌ Invalid Identifiers

```
int 1stNumber;   // Cannot start with a digit
float total#cost; // Special character '#' is not allowed
String class;    // 'class' is a reserved keyword
```

## Reserved Words in Java

Java reserves **50 keywords** that can not be used as identifiers.

### 🔹 List of Java Keywords:

| Keyword      | Keyword      | Keyword      | Keywor       |
|--------------|--------------|--------------|--------------|
| abstract     | continue     | for          | protected    |
| transient    | assert       | default      | goto         |
| public       | try          | boolean      | do           |
| if           | static       | throws       | break        |
| double       | implements   | strictfp     | package      |
| byte         | else         | import       | super        |
| private      | case         | enum         | interface    |
| short        | switch       | catch        | extends      |
| instanceof   | return       | void         | char         |
| final        | int          | synchronized | volatile     |
| class        | finally      | long         | throw        |
| this         | const        | float        | native       |
| while        | null         |              |              |

**Note:** `const` **and** `goto` **are reserved but not used in Java.**

## Conclusion

Understanding Java identifiers is essential for writing **error-free and maintainable Java programs**. Following proper naming conventions improves code readability and reduces errors.