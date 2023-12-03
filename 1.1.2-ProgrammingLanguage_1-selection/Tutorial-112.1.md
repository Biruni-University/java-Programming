% Selection 2

| Operation                       | Example                                                                                                            |
|---------------------------------|--------------------------------------------------------------------------------------------------------------------|
| `if`{.java}                     | `if (x > 0) { sout("Positive"); }`{.java}                                                               |
| `if ... else`{.java}            | `if (x > 0) { sout("Positive"); } else { sout("Non-positive"); }`{.java}                                |
| `if ... elseif ... else`{.java} | `if (x > 0) { sout("Positive"); } else if (x < 0) { sout("Negative"); } else { sout("Zero"); }`{.java}  |
| `switch`{.java}                 | `switch (x) { case 1: sout("One"); break; case 2: sout("Two"); break; default: sout("Other"); }`{.java} |
| Nested `if`{.java} statement    | `if (x > 0) { if (x % 2 == 0) { sout("Positive and Even"); } }`{.java}                                  |
| Conditional Operators           | `boolean isTrue = (x > 0) && (x < 10);`{.java}                                                                     |

| Operation                             | Description                             | Example                               | Output Example      |
|---------------------------------------|-----------------------------------------|---------------------------------------|---------------------|
| `+`{.java} (Binary addition)          | Binary arithmetic addition.             | `int a = 5 + 3;`{.java}               | `a` equals `8`      |
| `-`{.java} (Binary subtraction)       | Binary arithmetic subtraction.          | `int b = 8 - 4;`{.java}               | `b` equals `4`      |
| `*`{.java}(Multiplication)            | Binary multiplication.                  | `int c = 6 * 4;`{.java}               | `c` equals `24`     |
| `/`{.java}(Division)                  | Binary division.                        | `int d = 20 / 5;`{.java}              | `d` equals `4`      |
| `%`{.java}(Modulus)                   | Binary modulus (remainder of division). | `int e = 17 % 5;`{.java}              | `e` equals `2`      |
| `+`{.java}(Unary plus)                | Unary plus.                             | `int f = +5;`{.java}                  | `f` equals `5`      |
| `-`{.java}(Unary minus)               | Unary minus.                            | `int g = -7;`{.java}                  | `g` equals `-7`     |
| `++var`{.java}(Pre-increment)         | Pre-increment.                          | `int h = 5; ++h;`{.java}              | `h` becomes `6`     |
| `--var`{.java}(Pre-decrement)         | Pre-decrement.                          | `int i = 10; --i;`{.java}             | `i` becomes `9`     |
| `var++`{.java}(Post-increment)        | Post-increment.                         | `int j = 5; j++;`{.java}              | `j` becomes `6`     |
| `var--`{.java}(Post-decrement)        | Post-decrement.                         | `int k = 10; k--;`{.java}             | `k` becomes `9`     |
| `!`{.java}(Not)                       | Logical NOT.                            | `boolean l = !flag;`{.java}           | `l` becomes `false` |
| `<`{.java}(Less than)                 | Less than comparison.                   | `boolean m = (5 < 10);`{.java}        | `m` becomes `true`  |
| `>`{.java}(Greater than)              | Greater than comparison.                | `boolean n = (10 > 5);`{.java}        | `n` becomes `true`  |
| `!=`{.java}(Not equal to)             | Not equal to comparison.                | `boolean o = (3 != 5);`{.java}        | `o` becomes `true`  |
| `==`{.java}(Equal to)                 | Equal to comparison.                    | `boolean p = (5 == 5);`{.java}        | `p` becomes `true`  |
| `<=`{.java}(Less than or equal to)    | Less than or equal to comparison.       | `boolean q = (10 <= 15);`{.java}      | `q` becomes `true`  |
| `>=`{.java}(Greater than or equal to) | Greater than or equal to comparison.    | `boolean r = (20 >= 10);`{.java}      | `r` becomes `true`  |
| `&&`{.java}(Logical AND)              | Conditional AND.                        | `boolean s = (true && false);`{.java} | `s` becomes `false` |
| `||`{.java}(Logical OR)               | Conditional OR.                         | `boolean t = (true || false);`{.java} | `t` becomes `true`  |
| `^`{.java}(Logical XOR)          | Conditional XOR (exclusive OR). | `boolean u = (true ^ false);`{.java} | `u` becomes `true` |
| `=`{.java}(Assignment)           | Assignment.                     | `int w = 5;`{.java}                  | `w` becomes `5`    |
| `+=`{.java}(Add and assign)      | Add and assign.                 | `int x = 5; x += 3;`{.java}          | `x` becomes `8`    |
| `-=`{.java}(Subtract and assign) | Subtract and assign.            | `int y = 10; y -= 4;`{.java}         | `y` becomes `6`    |
| `*=`{.java}(Multiply and assign) | Multiply and assign.            | `int z = 20; z *= 2;`{.java}         | `z` becomes `40`   |
| `/=`{.java}(Divide and assign)   | Divide and assign.              | `int m = 15; m /= 3;`{.java}         | `m` becomes `5`    |
| `%=`{.java}(Modulus and assign)  | Modulus and assign.             | `int n = 12; n %= 5;`{.java}         | `n` becomes `2`    |

\pagebreak

1. Fill the blanks so the code prints `Path A`{.java}.

```java
class punchcard {
	public static void main(String[] args) {
		int x = 4;
		______ (x) {
			____ 4:
				System.out.println("Path A");
				_____;
			default:
				System.out.println("Path B");
				break;
		}
	}
}
```

A) `switch`, `case`, `break`
B) `if`, `else`, `continue`
C) `if`, `else`, `break`
D) `switch`, `case`, `continue`

---

2. Given the following code snippet, what will be the output?

```java
class punchcard {
	public static void main(String[] args) {
		int y = 4;
		switch (y) {
			default:
				System.out.println("Default");
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
				break;
		}
	}
}
```

A) `Default`{.java}
B) `One`{.java}
C) `Default \n One`{.java}
D) `Default \n One \n Two \n Three`{.java}
E) `Default \n Two \n Three`{.java}

---

3. What is the output of the following Java code?

```java
class punchcard {
	public static void main(String[] args) {
		int z = 2;
		switch (z) {
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
			case 3:
				System.out.println("Case 2 or 3");
				break;
			default:
				System.out.println("Default");
		}

	}
}
```

A) `Case 1`{.java}
B) `Case 2 or 3`{.java}
C) `Default`{.java}
D) `Case 2 or 3 \n Default`{.java}
E) `No output`{.java}
F) `Error`{.java}

---

4. What is the output of the following Java code?

```java
class punchcard {
	public static void main(String[] args) {
		int input = 7;
		switch (input % 5) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Default");
		}
	}
}
```

A) One
B) Two
C) Three
D) Default

---

* Question 5 to 7 are extra. You can skip them if you want.
* These switch features require Java 14 or higher.

5. What is the output of the following Java code?

```java
class punchcard {
	public static void main(String[] args) {
		int dayofweek = 6;
		switch (dayofweek) {
			case 1, 2, 3, 4, 5:
				System.out.println("wait, we have class today?!!");
				break;
			case 6, 7:
				System.out.println("going to a parttttttttttttty");
				break;
			default:
				System.out.println("not a valid day!");
		}
	}
}
```

A) wait, we have class today?!!
B) going to a parttttttttttttty
C) Not a valid day!
D) Error

---

6. What is the output of the following Java code?

```java
[class](class) punchcard {
	public static void main(String[] args) {
		int dayOfWeek = 6;
		switch (dayOfWeek) {
			case 1, 2, 3, 4, 5 -> System.out.println("wait, we have class today?!!");
			case 6, 7 -> System.out.println("going to a parttttttttttttty");
			default -> System.out.println("Not a valid day!");
		}
	}
}
```

A) wait, we have class today?!!
B) going to a parttttttttttttty
C) Not a valid day!
D) Error

---

7. What is the output of the following Java code?

```java
class punchcard {
	public static void main(String[] args) {
		int dayOfWeek = 7;
		int day = 23, month = 5, year = 2021;

		String date = switch (dayOfWeek) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
				default -> "Invalid day of week!";
		}
		+ ", " + day + ". "
			+ switch (month) {
				case 1 -> "January";
				case 2 -> "February";
				case 3 -> "March";
				case 4 -> "April";
				case 5 -> "May";
				case 6 -> "June";
				case 7 -> "July";
				case 8 -> "August";
				case 9 -> "September";
				case 10 -> "October";
				case 11 -> "November";
				case 12 -> "December";
				default -> "Invalid month!";
			}
		+ " " + year;
		System.out.println(date + "\n");
	}
}
```

A) Sunday, 23. May 2021
B) Invalid day of week!, 23. Invalid month! 2021
C) Invalid day of week!, 23. May 2021
C) Thursday, 23. April 2021
D) Error

---

8. You are creating a program to simulate a color-matching game where each color corresponds to a specific number. Your task is to write a code that takes a user input of type string (`color`). The input color is matched with a numeric code based on the following color chart:

The color codes are as follows:
- Red - `101`
- Blue - `202`
- Green - `303`
- Yellow - `404`
- Orange - `505`

Then print the corresponding numeric code to the console.

Example function signature:
```java
public class Main {
	public static void main(String[] args) {
		// make a scanner object

		// get the color from the user

		// use if-else or switch-case to print the corresponding numeric code
	}
}
```

### Constraints:
- The input `color` will always be a valid string among: "Red", "Blue", "Green", "Yellow", "Orange".

### Example:
```java
```

This question challenges candidates to use a `switch-case` statement to match the input color string with its corresponding numeric code efficiently and creatively. The goal is to implement a compact and elegant `getColorCode` function using the switch-case construct.

\pagebreak

_Answers_:

1. A
2. C
3. B
4. B
5. B
6. B
7. A
8. a possible solution:

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String color = scanner.nextLine();
		switch (color) {
			case "Red":
				System.out.println("101");
				break;
			case "Blue":
				System.out.println("202");
				break;
			case "Green":
				System.out.println("303");
				break;
			case "Yellow":
				System.out.println("404");
				break;
			case "Orange":
				System.out.println("505");
				break;
			default:
				System.out.println("Invalid color");
		}
	}
}
```
