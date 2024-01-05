% Methods

A method is a collection of statements that perform some specific
task and return the result to the caller. A method can perform some
specific task without returning anything. Methods allow us to reuse
the code without retyping the code. In Java, every method must be
part of some class which is different from languages like C, C++,
and Python. Methods are time savers and help us to reuse the code
without retyping the code. In Java, every method must be part of
some class which is different from languages like C, C++, and Python.

```java
public class MethodExample {
    public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c = sum(a, b);
	System.out.println("The sum of a and b is " + c);
    }

    public static int sum(int num1, int num2) {
	int result;
	result = num1 + num2;
	return result;
    }
}
```

A method can be returning nothing. In such case, the return type of
the method is void.

```java
public class MethodExample {
    public static void main(String[] args) {
	int a = 10;
	int b = 20;
	sum(a, b);
    }

    public static void sum(int num1, int num2) {
	int result;
	result = num1 + num2;
	System.out.println("The sum of a and b is " + result);
    }
}
```

**Extra but IMPORTANT**: In any Java project, there sould be one and
only one public class. The name of the public class should be the
same as the name of the file. For example, if the name of the file
is `MethodExample.java`, the name of the public class should be
`MethodExample`.

tldr: file name = class name

for class with `public static void main(String[] args)`{.java}

\pagebreak

1. Fill the blank to print `time savor functions` in the output.

```java
public class Punchcard {
	public static void printMessage() {
		System.out.println("time savor functions");
	}
	public static void main(String[] args) {
		_______________
	}
}
```

A) `void(printMessage);`{.java}
B) `printVoid();`{.java}
C) `void();`{.java}
D) `printMessage;`{.java}
E) `printMessage();`{.java}

_answer_: E

---

2. What is wrong with the following code?

```java
public class Punchcard {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n + " squared is " + toTwo(n));
		System.out.println(n + " cubed is " + toThree(n));
	}
}

class power {
	public static int toTwo(int n) {
		return n * n;
	}
	public static int toThree(int n) {
		return n * n * n;
	}
}
```

A) The class name should be `Power`{.java}
B) To call a method from another class, you need to use the class name
B) The variable `n` should be declared in the `toTwo` and `toThree` methods
C) The methods `toTwo` and `toThree` should be declared as `void`{.java}
D) It's not possible to have two classes in the same java file

_answer_: B

---

3. Fill the blank to print `Imagine 2 dragons` in the output.

```java
public class Punchcard {
	public static ______ printMessage(_____) {
		return "Imagine " + x +  " dragons";
	}
	public static void main(String[] args) {
		System.out.println(printMessage(2));
	}
}
```

A) `void`{.java} and `int`{.java}
B) `int`{.java} and `int x`{.java}
C) `int`{.java} and `String x`{.java}
D) `String x`{.java} and `int`{.java}
E) `String`{.java} and `int x`{.java}

_answer_: E

---

4. what is the output of the following code?

```java
public class Punchcard {
	public static void main(String[] args) {
		System.out.println(middle(1, 2, 3));
		System.out.println(middle(1, 3, 2));
	}
	public static int middle(int a, int b, int c) {
		if (a > b) {
			if (b > c) {
				return b;
			} else if (a > c) {
				return c;
			} else {
				return a;
			}
		} else {
			if (a > c) {
				return a;
			} else if (b > c) {
				return c;
			} else {
				return b;
			}
		}
	}
}
```

A) 2 and 2
B) 2 and 3
C) 3 and 2
D) error, It's not possible to call a methods two times in the same program
E) error, the method `middle` should be declared as `void`{.java}

_answer_: A

---

5. Why the following code fails to execute properly?

**Extra**: To call a method from another class, The method should be
declared as `static`{.java}

```java
public class Punchcard {
	public static void main(String[] args) {
		cat.meow;
	}
}
class cat {
	public static void eat() {
		System.out.println("kitty cat eating");
	}
	public static void meow() {
		System.out.println("meow");
	}
}
```

A) It's not possible to call a method from another class
B) The method `meow`{.java} should be declared as `String`{.java}
C) parameter state is missing, there need to be a `()`{.java} after the method name (`cat.meow()`{.java})
D) The class cat should be written before the main method
E) The unused method `eat`{.java} should be removed

_answer_: C

---

6. What change will correct the code to print the sum of two integers?

```java
public class punchcard {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("The sum is: " + add(a, b));
    }

    public static int add(int x, int y) {
        return x - y;
    }
}
```

A) Change `return x - y;` to `return x + y;`{.java}
B) Change `System.out.println("The sum is: " + add(a, b));` to `System.out.println("The sum is: " + subtract(a, b));`{.java}
C) Remove the method `add`{.java}
D) Change `int a = 5;` to `int a = 15;`{.java}
E) Add a new method `public static int subtract(int x, int y) { return x + y; }`{.java}

_answer_: A

---

7. What modification will make the following code print "Hello, Java!"?

```java
public class punchcard {
    public static void main(String[] args) {
        greet();
    }

    public static void greet(String message) {
        System.out.println(message);
    }
}
```

A) Add `String message = "Hello, Java!";` before `greet();`{.java}
B) Change `greet();` to `greet("Hello, Java!");`{.java}
C) Remove `String[] args`{.java} from `main`{.java} method
D) Change `public static void greet(String message)`{.java} to `public static void greet()`{.java}
E) Rename `greet(String message)`{.java} to `greet()`{.java}

_answer_: B

---

8. What modification will make the code properly compile and execute?

```java
public class punchcard {
    public static void main(String[] args) {
        System.out.println(quote("Java is fun."));
    }
}

public class Text {
    public static String quote(String text) {
        return "Quote: " + text;
    }
}
```

A) Change `System.out.println(quote("Java is fun."));` to `System.out.println(Text.quote("Java is fun."));`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Add `String quote = quote("Java is fun.");` before `System.out.println(quote);`{.java}
D) Remove the method `quote(String text)`{.java}
E) Change `return "Quote: " + text;` to `System.out.println("Quote: " + text);`{.java}

_answer_: A

---

9. What modification will fix the code to print "5"?

```java
public class punchcard {
    public static void main(String[] args) {
        int result = square(2);
        System.out.println(result);
    }

    public static void square(int num) {
        return num * num + 1;
    }
}
```

A) Change `public static void square(int num)` to `public static int square(int num)`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Add `return`{.java} before `num * num;`{.java} in the `square`{.java} method
D) Change `int result = square(2);` to `int result = square(5);`{.java}
E) Add `int num = 5;` before `int result = square(2);`{.java}

_answer_: A

---

10. What modification will fix the code to print "Hello, World!"?

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greet());
    }

    public static void greet() {
        return "Hello, World!";
    }
}
```

A) Change `System.out.println(greet());`{.java} to `System.out.println(HelloWorld.greet());`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Change `public static void greet()`{.java} to `public static String greet()`{.java}
D) Change `public static void greet()`{.java} to `public static String greet() { return "Hello, World!"; }`{.java}
E) Remove the method `greet()`{.java}

_answer_: C

---

11. What change will make the code correctly print "true"?

```java
public class Logic {
    public static void main(String[] args) {
        System.out.println(isEven(4));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return "true";
        } else {
            return "false";
        }
    }
}
```

A) Change `public static boolean isEven(int number)`{.java} to `public static String isEven(int number)`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Remove the quotes (`"`{.java}) in `return "true";`{.java} and `return "false";`{.java} in the `isEven`{.java} method
D) Change `System.out.println(isEven(4));`{.java} to `System.out.println(Logic.isEven(4));`{.java}
E) Change `if (number % 2 == 0)`{.java} to `if (number % 2 != 0)`{.java}

_answer_: C

---

12. What change will fix the code to print "5"?

```java
public class Numbers {
    public static void main(String[] args) {
        int result = add(2, 3);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        a + b;
    }
}
```

A) Change `a + b;`{.java} to `return a + b;`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Add `return` before `a + b;`{.java} in the `add`{.java} method
D) Change `int result = add(2, 3);`{.java} to `int result = add(5, 5);`{.java}
E) Add `int a = 5;`{.java} and `int b = 0;`{.java} before `int result = add(2, 3);`{.java}

_answer_: C

---

13. What change will make the code correctly print "10"?

```java
public class Numbers {
    public static void main(String[] args) {
        int result = multiply(2, 5);
        System.out.println(result);
    }

    public static int multiply(int x, int y) {
        return x + y;
    }
}
```

A) Change `return x + y;`{.java} to `return x * y;`{.java}
B) Remove `String[] args`{.java} from `main`{.java} method
C) Change `int result = multiply(2, 5);`{.java} to `int result = multiply(5, 2);`{.java}
D) Add `int x = 5;`{.java} and `int y = 5;`{.java} before `int result = multiply(2, 5);`{.java}
E) Change `public static int multiply(int x, int y)`{.java} to `public static void multiply(int x, int y)`{.java}

_answer_: A

---

14. Fill the blank so the fox talks.

```java
public class Punchcard {
	public static void main(String[] args) {
		System.out.println("What does the fox say?");
		fox.talk();

	}
}
class ___ {
	public static ____ talk() {
		___________________"Screech"_;
	}
}
```

Certainly! Here are five choices for completing the code:

A) `fox`{.java}, `void`{.java}, `return`{.java}
B) `fox`{.java}, `String`{.java}, `System.out.println()`{.java}
C) `fox`{.java}, `void`{.java}, `System.out.println()`{.java}
D) `Animal`{.java}, `void`{.java}, `return`{.java}
E) `Fox`{.java}, `void`{.java}, `System.out.print()`{.java}

_answer_: C
