% Methods

# Hands-on Code

1. Create a Java program that calculates the area of a rectangle using a method `calculateRectangleArea` that takes width and height as parameters and returns the area.

2. Design a Java program that implements a method `printPattern` to print a specific pattern. For instance, given an input `n = 4`, the program should print the following pattern:
   ```
   1
   12
   123
   1234
   ```

3. Develop a Java application that checks if a given number is prime or not. Create a method `isPrime` that takes an integer as input and returns true if it's a prime number; otherwise, returns false.

4. Write a Java program that reverses a given string using a method `reverseString` which accepts a string as input and returns the reversed string.

5. Implement a Java program that converts temperature from Celsius to Fahrenheit and vice versa. Create methods `celsiusToFahrenheit` and `fahrenheitToCelsius` for the conversion calculations.

Apologies for the oversight earlier. Here are revised study questions focusing solely on the basics of methods in Java:

# Study Questions

1. What is the purpose of a method in Java? Explain the fundamental role methods play in organizing and structuring code.

2. Describe the components of a method in Java. Explain the significance of method name, return type, parameters, and method body in defining a method.

3. Discuss the difference between method declaration and method invocation. How does calling a method differ from defining a method?

4. Explain the significance of method parameters in Java. How are parameters defined and used within methods? Provide examples to illustrate their importance.

5. Describe the role of the `return` statement in Java methods. How is it used to return a value from a method, and what happens when a `return` statement is encountered?

6. Explain the importance of the `void` keyword in method declarations. When and why is it used? Provide examples to illustrate its usage in methods.

7. What are the benefits of using methods in Java programming? Discuss how methods contribute to code reusability, readability, and maintainability.

8. Describe the conventions and best practices for naming methods in Java. What guidelines should be followed to ensure meaningful and descriptive method names for better code comprehension?

# Answers

**Study Questions:**

# Study Questions

1. **What is the purpose of a method in Java? Explain the fundamental role methods play in organizing and structuring code.**

   **Answer:** In Java, a method is a block of code that performs a specific task and can be reused multiple times. It helps in organizing code by breaking it into smaller, manageable parts, enhancing modularity, readability, and reusability. Methods encapsulate functionality, promoting a structured and organized approach to programming.

2. **Describe the components of a method in Java. Explain the significance of method name, return type, parameters, and method body in defining a method.**

   **Answer:**
   - **Method Name:** It identifies the method and is used to invoke it. It should follow naming conventions and be descriptive.
   - **Return Type:** Specifies the type of value the method returns. It can be `void` if the method doesn’t return anything.
   - **Parameters:** Represents values passed to the method. They define the method's input and can be optional.
   - **Method Body:** Contains the code that defines what the method does when executed.

3. **Discuss the difference between method declaration and method invocation. How does calling a method differ from defining a method?**

   **Answer:**
   - **Method Declaration:** It defines a method's name, return type, parameters, and method body.
   - **Method Invocation (or Method Call):** It is the act of using or executing a method by its name, along with necessary arguments if it requires parameters. Method invocation runs the code within the method body.

4. **Explain the significance of method parameters in Java. How are parameters defined and used within methods? Provide examples to illustrate their importance.**

   **Answer:** Method parameters act as variables that store values passed to a method. They enable methods to receive and use different values dynamically. Parameters are defined in the method declaration and can influence the behavior of the method. For instance:
   ```java
   void printMessage(String message) {
       System.out.println(message);
   }
   ```
   Here, `String message` is a parameter allowing the method `printMessage` to receive and print different messages.

5. **Describe the role of the `return` statement in Java methods. How is it used to return a value from a method, and what happens when a `return` statement is encountered?**

   **Answer:** The `return` statement in Java is used to exit a method and return a value (if the method has a non-void return type). When a `return` statement is encountered, the method execution stops, and the specified value (if any) is passed back to the caller. It also relinquishes control back to the point of invocation.

   **Answer:** A method signature consists of the method name and its parameter list (number, types, and order of parameters). It helps in identifying and distinguishing different methods within a class. Overloaded methods share the same name but have different signatures.

6. **Explain the importance of the `void` keyword in method declarations. When and why is it used? Provide examples to illustrate its usage in methods.**

   **Answer:** The `void` keyword indicates that a method does not return any value. It's used when a method doesn't need to produce a result. For example:
   ```java
   void greet() {
       System.out.println("Hello!");
   }
   ```
   Here, `void` signifies that the `greet` method doesn’t return any value.

7. **What are the benefits of using methods in Java programming? Discuss how methods contribute to code reusability, readability, and maintainability.**

   **Answer:**
   - **Code Reusability:** Methods allow the same functionality to be used repeatedly without rewriting code.
   - **Readability:** By breaking code into smaller, well-named methods, the overall code becomes more readable and comprehensible.
   - **Maintainability:** Methods promote modularity, making it easier to maintain, debug, and update code.

8. **Describe the conventions and best practices for naming methods in Java. What guidelines should be followed to ensure meaningful and descriptive method names for better code comprehension?**

   **Answer:** Method names should be descriptive, follow camelCase conventions, and accurately represent the action or purpose of the method. Use verbs to describe actions, avoid ambiguous names, and strive for clarity and consistency.
