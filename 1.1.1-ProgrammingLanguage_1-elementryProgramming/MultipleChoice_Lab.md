% Multiple Choice Questions

1. Which choice is the correct option to get user input.

```java
class Main {
    public static void main(String[] Args) {
        _______ scanner = new Scanner(System.in);
        String str = scanner._______();
    }
}
```

A) `scanner`, `getLine`
B) `Input`, `nextGet`
C) `Scanner`, `nextLine`
D) `Input`, `nextLine`

---

2. What is the purpose of the Scanner class in Java?

A) To perform mathematical operations
B) To read input from the user
C) To generate random numbers
D) To convert data types

---

3. Which of the following is used to read a floating-point number in the Scanner class?

A) next()
B) Float()
C) nextFloat()
D) next(Float)

---

4. Correctly declare the following variables.

```java
class Main {
	public static void main(String[] Args) {
		______ name = "Octavia";
		______ weight = 67;
		double height = 1.9;
		______ BMI = weight / Math.pow(height, 2);
		Scanner scanner = new Scanner(System.in);
		______ isStudent = scanner.nextBoolean();
		System.out.println(name + "'s BMI is " + BMI);
	}
}
```

A) `char`, `double`, `int`, `String`
B) `string`, `double`, `double`, `char`
C) `String`, `Int`, `Double`, `Boolean`
D) `String`, `int`, `double`, `boolean`

---

\pagebreak

5. How to correctly get the second last digit of a number? (more than one answer)

```java
class Main {
	public static void main(String[] Args) {
		int number = 123456;
		int secondLastDigit = _______________;
		// expected output: 5
		System.out.println(secondLastDigit);
	}
}
```

A) `(number/100)%10`{.java}
B) `number % 100`{.java}
C) `(number%100)/10`{.java}
D) `(number/10)%10`{.java}

---

6. Which of the following choice can NOT be used in the blank to get the result of `x / y`?

```java
class Main {
	public static void main(String[] Args) {
		int result = 0;
		int x = 15;
		int y = 4;
		______ = x / y;
	}
}
```
A) `x`
B) `y`
C) `result`
D) `int result`

---

7. What is the output of the following code?

```java
class Main {
	public static void main(String[] Args) {
		int x = 15;
		int y = 4;
		double result = x / y;
		System.out.println(result);
	}
}
```

A) 3.75
B) 3
C) 4
D) 3.0

---

\pagebreak

8. What is the output of the following code?

```java
class Main {
	public static void main(String[] Args) {
		int x = 15;
		double y = 4;
		System.out.println(x / y);
	}
}
```

A) 3.75
B) 3
C) 3.0
D) error

---

9. What is the output of the following code?

```java
class Main {
	public static void main(String[] Args) {
		double x = 15;
		int y = 4;
		System.out.println(x / y);
	}
}
```

A) 3.75
B) 3
C) 3.0
D) error

---

10. Which of the following is the correct way to express the following equation in Java?

<math>\begin{align}
x_2 &= \frac{-b + \sqrt {b^2-4ac}}{2a}
\end{align}</math>

```java
class Main {
	public static void main(String[] Args) {
		double a = 1;
		double b = 5;
		double c = 2;
		double x;
		_______________________________;
		System.out.println(x);
	}
}
```

A) `x = (0 - b + Math.pow(Math.sqrt(b), 2) - 4 * a * c) / (2 * a)`{.java}
B) `x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)`{.java}
C) `x = 0 - b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a)`{.java}
D) `x = (-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a) * c / 2 * a`{.java}

---

\pagebreak

# Correct Answers

1. C
2. B
3. C
4. D
5. C, D
6. D
7. D
8. A
9. A
10. B
