% Data Conversion


| Data Type | Default                   | Size (in bits) | Example Literals       | Range of Values                 |
|-----------|---------------------------|----------------|------------------------|---------------------------------|
| `byte`    | 0                         | 8              | `byte b = 5;`          | -128 to 127                     |
| `short`   | 0                         | 16             | `short s = 10;`        | -32,768 to 32,767               |
| `int`     | 0                         | 32             | `int i = 42;`          | -2,147,483,648 to 2,147,483,647 |
| `long`    | 0L                        | 64             | `long l = 123L;`       | -2^63 to 2^63 - 1               |
| `float`   | 0.0f                      | 32             | `float f = 3.14f;`     | ±1.4 x 10^-45 to ±3.4 x 10^38   |
| `double`  | 0.0                       | 64             | `double d = 2.718;`    | ±4.9 x 10^-324 to ±1.7 x 10^308 |
| `char`    | `\u0000` (null character) | 16             | `char c = 'A';`        | 0 to 65,535                     |
| `boolean` | `false`                   | 1              | `boolean flag = true;` | `true` or `false`               |


| Data Type | Widening To                           | Narrowing To                                     |
|-----------|---------------------------------------|--------------------------------------------------|
| `byte`    | `short`, `int`, `long`, float, double | char                                             |
| `short`   | `int`, `long`, `float`, `double`      | `byte`, `char`                                   |
| `int`     | `long`, `float`, `double`             | `byte`, `short`, `char`                          |
| `long`    | `float`, `double`                     | `byte`, `short`, `char`, `int`                   |
| `float`   | `double`                              | `byte`, `short`, `char`, `int`, `long`           |
| `double`  | -                                     | `byte`, `short`, `char`, `int`, `long`, `float`  |
| `char`    | `int`, `long`, `float`, `double`      | `byte`, `short`                                  |
| `boolean` | -                                     | -                                                |

\pagebreak

1. In Java, what is the purpose of casting?

A) To convert string to int
B) To convert int to string
C) To convert one data type to another
D) To convert boolean to int

---

2. how you can get the int value of the char?

```java
class punchcard {
    public static void main(String[] args) {
	char var = 'A';
	System.out.println(___________);
    }
}
```

A) `(int) var`{.java}
B) `(int) var.value`{.java}
C) `'var'`{.java}
D) `var`{.java}

3. What is the output of the following code?

---

```java
class punchcard {
	public static void main(String[] args) {
		double x = 10.75;
		int y = 5;
		int result = (int) (x + y);
		System.out.println(result);
	}
}
```

A) 15
B) 15.75
C) 10
D) error

---

4. what is wrong with the following code?

```java
class punchcard {
	public static void main(String[] args) {
		int x = 10;
		double y = 5.25;
		int result = (x + (int) y);
		System.out.println(result);
	}
}
```

A) nothing
B) `println`{.java} should be `print`{.java}
C) It's not possible to cast double to int inside an expression
D) you can't cast int to double

---

5. What is the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		int x = 10;
		double y = 5.25;
		int result = ((int) x + y);
		System.out.println(result);
	}
}
```

A) 15
B) 15.25
C) 10
D) error

---

6. What would be the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		float x = 10;
		double y = 5.25;
		double result = ((double)x + (int) y);
		System.out.println(result);
	}
}
```

A) 15
B) 15.25
C) 15.0
D) error

---

7. choose all the correct answers that will generate and print a long number.
```java
class punchcard {
	public static void main(String[] args) {
		long result = 1000.0;
		System.out.println(result);

	}
}
```

<math>\begin{align}
10000000000 &= 10^{10}
\end{align}</math>

A) `long result = 1000.0;`{.java}
B) `long result = 10000000000.0;`{.java}
C) `long result = 1000;`{.java}
D) `long result = 10000000000;`{.java}
E) `long result = 1000L;`{.java}
F) `long result = (long) 1000.0;`{.java}
G) `long result = (long) 1000;`{.java}
H) `long result = (long) 1000L;`{.java}
I) `long result = (long) 1000.0f;`{.java}
J) `long result = (long) 1000f;`{.java}
K) `long result = (int) 1000.0;`{.java}

---

8. What is the minimum swap required to convert the following code to compile and run without error?


**NOTE**: you can only swap two closest casting operators. for example to move `(short)`{.java} to end before `num`{.java} you need to swap it 3 times.

```java
class punchcard {
	public static void main(String[] args) {
		double num = 20.1;
		int result = (byte) (double) (short) (int) (float) (long) num;
		/////////////you can only swap these oprators aboveeeeeee/////
		System.out.println(result);

	}
}
```

A) 0
B) 1
C) 3
D) 5

---

9. What do you expect the following code to print?

```java
class punchcard {
	public static void main(String[] args) {
		int x = 10;
		double y = 5.25;
		int z = (int) 5.5;
		double a = (double) z;
		System.out.println((int) ((x + y) / (z + a)));
	}
}
```

A) 1.525
B) 1
C) 3.75
D) error

---

10. fill the blank so that the following code will print 14.

```java
class punchcard {
	public static void main(String[] args) {
		int x = 14;
		System.out.println(___________);
	}
}
```

A) x+= ;
B) x++ ;
C) ++x ;
D) -+x ;

---

11. What is the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		int x = 5;
		x += ++x;
		System.out.println(x);
	}
}
```

A) 5
B) 11
C) 10
D) error

---

12. what will be the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		int a = 7;
		int b = ++a + a--;
		System.out.print("the value of a is: " + a);
		System.out.println(" and the value of b is: " + b);
	}
}
```

A) the value of a is: 7 and the value of b is: 14
B) the value of a is: 6 and the value of b is: 14
C) the value of a is: 8 and the value of b is: 14
D) the value of a is: 7 and the value of b is: 16

---

13. what will be the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = num1-- + ++num1 * 2;
		System.out.println(Num2);
	}
}
```

A) 10
B) 12
C) 6
D) error

---

14. what will be the output of the following code?

```java
class punchcard {
	public static void main(String[] args) {
		System.out.println(0.1 + 0.2);
		System.out.println(9999999999999999.0 - 9999999999999998.0); // 16 digits
	}
}
```

A) 0.3 and 1.0
B) 0.30000000000000004 and 1.0
C) 0.30000000000000004 and 2.0
D) error

\pagebreak

_Answers_:

1. C
2. A
3. A
4. A
5. D
6. C
7. C, E, F, G, H, I, J, K
8. A
9. B
10. B
11. B
12. D
13. D
14. C
