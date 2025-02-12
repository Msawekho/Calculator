# Calculator Project

This project is a simple calculator application implemented in Java, which supports basic arithmetic operations like addition and multiplication.

## Features

- **Addition**: You can add two numbers or multiple numbers.
- **Multiplication**: You can multiply two numbers or multiple numbers.

## Structure

### Main Class

The `Main` class contains the following methods:

- **add(int a, int b)**: Adds two integers.
- **add(int... var)**: Adds multiple integers.
- **multiply(int a, int b)**: Multiplies two integers.
- **multiply(int... var)**: Multiplies multiple integers.

### CalculatorTest Class

The `CalculatorTest` class contains unit tests for the methods in the `Main` class. It uses JUnit to validate the functionality of the add and multiply methods.

- **testAddingTwoNumbers()**: Tests the addition of two numbers.
- **testAddingManyNumbers()**: Tests the addition of multiple numbers.
- **testMultiplyingTwoNumbers()**: Tests the multiplication of two numbers.

## Requirements

- Java 8 or higher
- JUnit 5 for running tests

## Running the Application

1. Clone or download the repository.
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile the code.
4. Run the `Main` class to use the calculator methods.

## Running Tests

1. Open the project in an IDE.
2. Make sure JUnit 5 is configured.
3. Run the `CalculatorTest` class to execute the tests.

## Example Usage

Here's an example of how to use the `add` and `multiply` methods:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(add(15, 15)); // Output: 30
        System.out.println(add(1, 2, 3, 4, 5)); // Output: 15
        System.out.println(multiply(2, 4)); // Output: 8
        System.out.println(multiply(-1, 3)); // Output: -3
    }
}
