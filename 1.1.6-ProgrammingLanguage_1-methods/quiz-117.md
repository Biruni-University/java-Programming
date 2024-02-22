% Quiz 2: Methods

# Question 1: Method Overload

Consider the following Java code:

```java
public class punchcard {
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		int result1 = add(2, 3);
		double result2 = add(2.5, 3.7);
		System.out.println(result1);
		System.out.println(result2);
	}
}
```

What would be the output of the code?

A) 5 and 6
b) 5 and 6.2
c) 5.0 and 6
d) 5.0 and 6.2
e) error

_answer_: b

---

# Question 2: Recursive Method

Consider the following recursive Java method:

The `factorial` method should break out of the recursion when the value of `n` is 0 or 1. Otherwise, it should return the product of `n` and the result of calling `factorial` with `n - 1`.

```java
public class punchcard {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			________;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
}
```

What should be placed instead of blank?

a) `break`{.java}
b) `main()`{.java}
c) `return`{.java}
d) `return 0`{.java}
e) `return 1`{.java}

_answer_: d

---

# Question 1: Method Pass-by-Value

Consider the following Java code:

```java

public class PunchCard {
	public static void modifyValue(int x) {
		x = x * 2;
	}
	public static void main(String[] args) {
		int num = 5;
		modifyValue(num);
		System.out.println(num);
	}
}
```

What will be the value of `num` after the `modifyValue` method is called?

a) Null
b) 0
c) 5
d) 10
e) The code will result in a compilation error.

_answer_: c

---

# Question 6: Method Overload with Strings

Consider the following Java code:

```java
public class StringOverloadExample {
	public static void displayMessage(String message) {
		System.out.println("Message: " + message);
	}
	public static void displayMessage(String message, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Message: " + message);
		}
	}
	public static void main(String[] args) {
		displayMessage("Hello");
		displayMessage("Java", 3);
	}
}
```

Fill the blank so the second method that print the message multiple times will be called.

a) `displayMessage("Java", 3);`{.java}
b) `displayMessage("Java");`{.java}
c) `displayMessage.second("Java");`{.java}
d) `displayMessage(String "Java",int 3);`{.java}
e) It's not possible to call the second method. The java does not allow multiple methods with the same name.

_answer_: a
