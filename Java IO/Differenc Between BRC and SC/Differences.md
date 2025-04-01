# Differences Between BufferedReader and Scanner Class in Java

## Introduction
When choosing between `Scanner` and `BufferedReader` class, it's important to understand the trade-offs and which tool suits our use case better. Both classes are designed to read input, but they have different strengths and weaknesses.

## Comparison Table

| **Feature** | **Scanner Class** | **BufferedReader Class** |
|-------------|-------------------|--------------------------|
| **Type of Input** | Supports multiple data types. | Reads input as  strings (we need to parse the string manually). |
| **Ease of Use** | Very easy to use with built-in methods for parsing data. | Requires more code for parsing (e.ge, converting strings to numbers). |
| **Efficiency** | Slower for large data compared to `BufferedReader` | Faster for large data as it reads chunks of data at once. | 
| **Exceptions** | No explicit exception handling for I/O | Requires handling `IOException` | 
| **Common Use** | Ideal for small to medium input sizes and simple data types. | Ideal for reading large input efficiently. | 

## Conclusion 
- use `Scanner` when we need to read various types oof data and when ease of use is a priority. 
- Use `BufferedReader` when we need to handle large inputs efficiently and are okay with manually parsing the data.  
