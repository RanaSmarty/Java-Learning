# Formatted Outputs in Java

## Introduction

In Java, **formatted output** allows us to print variables and values in a structured and readable way. Java provides `System.out.printf()` and `String.format()` to formate text, similar to C-style formatting.

These methods support **format specifiers** to control how data is displayed (such as number of decimal places, alignment, width, etc.).

## Common Format Specifiers

| **Specifier** | **Description** | **Example Output** |
|---------------|-----------------|--------------------|
| `%d` | Integer | `21` |
| `%f` | Floating point (default 6 digits) | `3.141593` |
| `%.2f` | Floating point with 2 decimals | `3.14` |
| `%s` | String | `Hello World!`|
| `%n` | New line (cross-platform) | \n |
| `%10s` | String right-aligned in 10 spaces | `   Hello!` |
| `%-10s` | String left-aligned in 10 spaces | `Hello  !` |


## Conclusion

Java provides powerful tools like `printf()` and `String.format()` for printing **well-formatted outputs**, which is useful for displaying structured data, aligning text, controlling precision, and improving the user interface in console applications.