---
title: "Problem Session 1"
date: \today
---

# Question 1 - Data Types - 10 points

What do the following Java expressions evaluate to? If an expression does not
compile or cause and exception at runtime, put an **X** in both columns.

| Expression | Value | Type |
| -------------------------- | -------------- | --- |
| `"1" + 2 * 6`{.java} ||
| || |
| `1 / 2 / 6`{.java} ||
| || |
| `Integer.parseInt(12) * 6`{.java} ||
| || |
| `(1 >= 26) || (12 >= 6)`{.java} ||
| || |
| `(int) 1.26 / (double) 10`{.java} ||
| || |
| `1.2e6 % 1.2e5`{.java} ||
| || |
| `1 <= 2 < 6`{.java} ||
| || |
| `Math.min(1.2e6, 1.2e7, 1.2e8)`{.java} ||
| || |
| `true != false && true > false`{.java} ||
| || |
| ` !!!!!!false`{.java} ||

\pagebreak

# Question 2 - Arrays - 10 points

Consider the following Java code fragment.

```java
int[] a = { 1, 6, 5, 3, 0, 2, 4 };
int n = a.length;

int [] b = new int[n];
for (int i = 0; i < n; i++)
	b[a[i]] = i;

int [] c = new int [n];
for (int i = 0; i < n; i++)
	c[i] = a[b[i]];
```

What are the values of the elements in the array `b[]`{.java} and `c[]`{.java}
after the above code fragment is executed? Write your answers in the space
below.

`a[] = { 1, 6, 5, 3, 0, 2, 4 }`{.java}

`b[] = { _, _, _, _, _, _, _ }`{.java}

`c[] = { _, _, _, _, _, _, _ }`{.java}

\pagebreak

# Question 3 - Arrays - 10 points

Determine whether each statement below is true or false. Assume no index is out
of bounds. Write either "true" or "false" on each line.

**For Part 8-11**:

```java
int[] a = new int [6];
int [] b = new int [6];
int[] c = a;
c[0] = 3;
```

| Statement | True or False |
| ------------------------------------- | ------ |
| 1. Every element in a new array of integers in initialized to 0. | **true** |
| | |
| 3. Every element in a new array of booleans is initialized to true. | |
| | |
| 4. N-1 is the last valid index into an array of size N. | |
| | |
| 5. 0 is the index of the smallest element in an array of size N. | |
| | |
| 6. N-3 is the index of the third-to-last element in an array of size N. | |
| | |
| 7. `(int) (Math.random() * N)`{.java} is a valid index into an array of size N. | |
| | |
| 8. You can create a new array without using the `new`{.java} keyword. | |
| | |
| 9. Given the array `a`, `b` and `c` as defined above, `a == b`{.java} evaluates to `true`. | |
| | |
| 10. Given the array `a`, `b` and `c` as defined above, `a == c`{.java} evaluates to `true`. | |
| | |
| 11. Given the array `a`, `b` and `c` as defined above, `a[b[0]]`{.java} evaluates to `0`. | |
| | |
| 12. Given the array `a`, `b` and `c` as defined above, `a[b[c[0]]]`{.java} evaluates to `0`. | |

\pagebreak

# Question 4 - Functions - 10 points

Which of the following statements are true for Java functions (static
methods). Mark each statement as either true or false.

| true | false | Statement |
| --- | --- | ------------------------------------------------ |
| || A function can accept more than one argument. |
| || |
| || You can use `double`{.java} as the return type of a function. |
| || |
| || A function can call other functions only if those functions are defined in the same `.java` file. |
| || |
| || Two functions defined in the same `.java` file can have the same name only if they have a different number of argument |
| || |
| || If you pass a (reference to an) array as an argument to a function, the function can not only read the array's entries, but it can also change them. |

\pagebreak

# Question 5 - Functions - 10 points

What do each of the following functions return? Fill in the table below.

Assume that the array `x`, `y` and `z` are defined as follows:

```java
int[] x = new int[5];
int[] y = {1, 2, 6};
int[] z = {-10, 0, 10};
```

A)

```java
public static int f(int[] a) {
	int t = 0;
	int n = a.length;
	for (int i = 0; i < n; i++)
		t += a[i];
	return t;
}
```

| f(x) | f(y) | f(z) |
| ---- | ---- | ---- |
|      |      |      |

B)

```java
public static int g(int[] a) {
	int n = a.length;
	for (int i = 0; i < n; i++)
		a[i] = a[n-i-1];
	return f(a);
}
```

| g(x) | g(y) | g(z) |
| ---- | ---- | ---- |
|      |      |      |

**NOTE**: The arrays `x`, `y` and `z` are reset to their original values before
calling `h()`{.java}.

C)

```java
public static int h(int[] a) {
	int n = a.length;
	for (int i = 0; i < n; i++)
		a[i] = f(a);
	return f(a);
}
```

| h(x) | h(y) | h(z) |
| ---- | ---- | ---- |
|      |      |      |

\pagebreak

# Question 6 - Arrays - 10 points

Which of the following are properties of arrays in Java?

Mark each statement as either true or false by filling in the table below.

| true | false | Statement |
| ---- | ----- | ------------------------------------------------ |
| || After you create and initialize an `int[]`{.java} array, you cannot change its length. |
| || |
| || If `a`{.java} is an array of type `char[]`{.java} and length 10, then `a[0.0]`{.java} is a valid expression that given its first element. |
| || |
| || It is possible to declare, create and initialize a `String[]`{.java} array without using the keyword `new`{.java}. |
| || |
| || If `a[]`{.java} and `b[]`{.java} are two different arrays of the same type and length, then the expression `(a == b)`{.java} evaluates to `true`{.java} if the corresponding array elements are equal, and `false`{.java} otherwise. |
| || |
| || The elements of an array of type `int[]`{.java} are stored in the computer's memory (i.e., in consecutive memory locations). |
| || |
| || It is possible to create and initialize a two-dimensional array `a[][]`{.java} of type `double[][]`{.java} such that (`a[0].length != a[1].length`{.java}) |

\pagebreak

# Question 7 - Functions, arrays and pass-by-value - 5 points

Consider the following two functions, which purport to negate the values in an
integer array:

```java
public static void negate1(int[] a) {
	for (int i = 0; i < a.length; i++)
		a[i] = -a[i];
}

public static int[] negate2(int[] a) {
	int[] b = new int[a.length];
	for (int i = 0; i < a.length; i++)
		b[i] = -a[i];
	a = b;
	return b;
}
```

Suppose that an integer array `a[]`{.java} in `main`{.java} is declared and
initialized to contain the three integers `[1, 2, 3]`{.java}. What will be
the contents in the array referenced by `a[]`{.java} after executing each of the
following statements? Answer each part independently.

For each statement on the left, write the letter of the best-matching description
on the right. You may use each letter once, more than once, or not at all.

| Statement | Description |
| --------- | ----------- |
| ____ `negate1(a);`{.java} | A. `[1, 2, 3]`{.java} |
|||
| ____ `negate2(a);`{.java} | B. `[-1, -2, -3]`{.java} |
|||
| ____ `a = negate2(a);`{.java} | C. `[0, 0, 0]`{.java} |
|||
| ____ `negate1(negate2(a));`{.java} | D. compile-time error or run-time exception |
|||
| ____ `a = negate2(negate2(negate2(a)));`{.java} | |

\pagebreak

# Question 8 - Properties of types, variables and expressions - 5 points

Which of the following are properties of type, variables and expressions in Java?

Mark each statement as either true or false by filling in the table below.

| true | false | Statement |
| --- | --- | ------------------------------------------------ |
| || Every variable has a type (such as `int`{.java}, `double`{.java} or `String`{.java}) that is known at compile time. |
| || |
| || The result of applying one of the arithmetic operators (`+`{.java}, `-`{.java}, `*`{.java}, `/`{.java}) to two `double`{.java} operands always evaluates to a value of type `double`{.java}(and never produces a run-time exception). |
| || |
| || If you attempt to use a local variable of type `int`{.java} in an expression before that variable has been assigned a value, Java will substitute the value 0. |
| || |
| || If a variable is declared and initialized in the body of a `for`{.java} loop, that variable cannot be accessed outside that loop. |
| || |
| || If you name a variable with all uppercase letters and initialize it to some value, attempting to subsequently change its value would lead to a compile-time error. |
