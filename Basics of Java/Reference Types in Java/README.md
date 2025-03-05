# Data Types in Java

## Introduction
Java is a statically typed and strongly typed language. Every data type (such as integer, character, decimal, etc.) is predefined in the Java language, ensuring that all constants and variables must be declared with a specific data type.

## Types of Data in Java
Java data types are categorized into two main types:

1. **Primitive Data Types** - Includes boolean, char, int, short, byte, long, float, and double.
2. **Non-Primitive (Reference) Data Types** - Includes String, Arrays, Classes, objects, and Iterfaces.

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