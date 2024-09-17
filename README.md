# Testing
_count_ is a Java program that is used to calculate amount of characters, vowels, and digits in a provided string.

## Introduction
The program _count_ performs the following tasks:
- Acceps a string as input.
- The program, made of many functions, prints the following statistics:
  1. The total number of characters (excluding spaces).
  2. The total number of vowels (a, e, i, o, u)
  3. The total number of digits.
     
A program with test cases is then used to test the original program using framework JUnit, accounting for  such cases an null input, empty string input, special characters as input, spaces as input, etc. 

## Getting Started
### Dependencies
- Windows 10
- Java Enviroment (for instance, Red Hat OpenJDK/ Azul Platform Core/ Oracle Java SE)
- a unit testing framework for Java JUnit
### Installing
Download files count.java and countTest.java, place them in the same folder.
### Usage

To use _count_, follow these steps:

1. Open the file count.java in your favorite code editor.
2. Run the file: **`npm run build`**
3. Enter a string you want to examine upon request from the program; press Enter.
4. For the testing purposes, open countTest.java file.
5. Click to run tests, read the results of testing in the Results section of the bug console. 

```java
count c = new count();

# input "   " results in 'The string contains 3 characters overall, including 0 vowels and 0 digits.'
c.countAndPrint()

# input "local 42" results in 'The string contains 8 characters overall, including 2 vowels and 2 digits.'
c.countAndPrint()

# input "[]!98Gee" results in 'The string contains 8 characters overall, including 2 vowels and 2 digits.'
c.countAndPrint()
```



## Authors
Kseniys Chadovich, tuq91334@temple.edu
