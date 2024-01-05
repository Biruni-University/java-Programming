% Mathematical Functions and Strings

\pagebreak

1. What's the output of the following code?

```java
public class punchcard {
	public static void main(String[] args) {
		int result = Math.max(15, 10) + Math.min(5, 20);
		System.out.println(result);
	}
}
```

A) 25
B) 30
C) 20
D) 35
E) 15

---

2. Which option correctly fills the blanks in the following code?

```java
public class punchcard {
	public static void main(String[] args) {
		x = 15;
		double result = Math.____(x);
		System.out.println(result);
	}
}
```

A) `root(x)`{.java}
B) `sqrt(x)`{.java}
C) `sqr(x)`{.java}
D) `squareRoot(x)`{.java}
E) `sqrRoot(x)`{.java}

---

3. which of the following is **NOT** the correct way to declare a charater variable?

```java
public class punchcard {
	public static void main(String[] args) {
		_______________;
		System.out.println(ch);
	}
}
```

A) `char ch = 'A';`{.java}
B) `char ch = 65;`{.java}
C) `char ch = "A";`{.java}
D) `char ch = '\u0041';`{.java}
E) `char ch = 0x41;`{.java}

---

4. What should be placed in the blank so the prize massage is not shown in terminal?

```java
public class punchcard {
	public static void main(String[] args) {
		String str = "You found the prize!";
		System.out.print(str + ____);
	}
}
```

A) `"\n"`{.java}
B) `"\t"`{.java}
C) `"\b"`{.java}
D) `"\r"`{.java}
E) `"\f"`{.java}

---

5. how to remove the extra spaces in the second output line? (expected output: `wooden clocks`)

```java
public class punchcard {
	public static void main(String[] args) {
		String str = "clock and time";
		str = str.substring(0, 6);
		str = "wooden " + str + "_____s";
		System.out.println(str);
	}
}
```

A) `"\n"`{.java}
B) `"\t"`{.java}
C) `"\b"`{.java}
D) `"\r"`{.java}
E) `"\f"`{.java}

---

6. What will be the output of the following code?

```java
public class punchcard {
	public static void main(String[] args) {
		System.out.println("Java\tProgramming\nLanguage");
	}
}
```

A)
```bash
Java	Programming Language
```

B)
```bash
Java	Programming
Language
```

C)
```bash
Java	ProgrammingLanguage
```

D)
```bash
Java Programming

Language
```

E)
```bash
Java\tProgramming\nLanguage
```

---

7. Which method is used to obtain the length of a string in Java?

```java
public class punchcard {
	public static void main(String[] args) {
		String str = "The length of this string is 31";
		System.out.println(str._______);
	}
}
```

A) `len()`{.java}
B) `lengthOf()`{.java}
C) `size()`{.java}
D) `getLength()`{.java}
E) `length()`{.java}

---

8. What is the output of the following code?

**NOTE:** While == may be used to compare references of type String, such an equality test determines whether or not the two operands refer to the same String object. The result is false if the operands are distinct String objects, even if they contain the same sequence of characters (§3.10.5, §3.10.6). The contents of two strings s and t can be tested for equality by the method invocation s.equals(t)

```java
// These two have the same value
new String("test").equals("test") // --> true

// ... but they are not the same object
new String("test") == "test" // --> false

// ... neither are these
new String("test") == new String("test") // --> false

// ... but these are because literals are interned by
// the compiler and thus refer to the same object
"test" == "test" // --> true

// ... string literals are concatenated by the compiler
// and the results are interned.
"test" == "te" + "st" // --> true
```

```java
public class punchcard {
	public static void main(String[] args) {
		String first = "Hello";
		String second = "Hello";
		System.out.println(first == second);
	}
}
```

A) `true`{.bash}
B) `false`{.bash}
C) `Compile-time error`{.bash}
D) `Runtime exception`{.bash}
E) `NullPointerException`{.bash}

---

9. What is the output of the following code?

```java
public class punchcard {
	public static void main(String[] args) {
		String first = "H";
		String second = 'H';
		System.out.println(first.equals(second));
	}
}
```

A) `true`{.bash}
B) `false`{.bash}
C) `Compile-time error`{.bash}
D) `Runtime exception`{.bash}
E) `NullPointerException`{.bash}

---

10. What is the output of the following code?

```java
public class punchcard {
	public static void main(String[] args) {
		String word1 = "Java";
		String word2 = "JavaIsFun";
		System.out.println(word1.compareTo(word2));
	}
}
```

A) `0`{.bash}
B) a negative integer
C) a positive integer
D) `True`{.bash}
E) `False`{.bash}

---

11. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String original = "brown fox";
		String substring = original.substring(2, 8);
		System.out.println(substring);
	}
}
```

A) `brown`{.bash}
B) `wn fox`{.bash}
C) `own fox`{.bash}
D) `own fo`{.bash}
E) `rown f`{.bash}

---

12. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		if ( 'A' + "BC" == "AB"  + 'C' ) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
```

A) `Equal`{.bash}
B) `Not Equal`{.bash}
C) `error`{.bash} because char cannot be concatenated with string
D) `error`{.bash} because strings cannot be compared with `==`{.java}
E) `error`{.bash} because operands are not of same type

---

13. What will be the output of the following code snippet?

> Suppose that user input is 'clock' for both input1 and input2

```java
import java.util.Scanner;

public class punchcard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		System.out.println(input1 == input2);
	}
}
```

A) `true`{.bash}
B) `false`{.bash}
C) `Compile-time error`{.bash}
D) `Runtime exception`{.bash}
E) `NullPointerException`{.bash}

---

14. What will be the output of the following code snippet?

```java
import java.util.Scanner;

public class punchcard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = input1;
		System.out.println(input1 == input2);
	}
}
```

A) `true`{.bash}
B) `false`{.bash}
C) `Compile-time error`{.bash}
D) `Runtime exception`{.bash}
E) `NullPointerException`{.bash}

---

15. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String sentence = "Java is fun to learn";
		int index = sentence.indexOf('a');
		System.out.println(index);
	}
}
```

A) `0`{.bash}
B) `1`{.bash}
C) `2`{.bash}
D) `1 3 16`{.bash}
E) `2 4 17`{.bash}

---

16. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String sentence = "Java is fun to learn";
		int index = sentence.indexOf('j');
		System.out.println(index);
	}
}
```

A) `-1`{.bash}
B) `0`{.bash}
C) `False`{.bash}
D) `compile-time error`{.bash}
E) `runtime exception`{.bash}

---

17. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String sentence = "Java is fun to learn";
		int index = sentence.indexOf('a', 3);
		System.out.println(index);
	}
}
```

A) `-1`{.bash}
B) `1`{.bash}
C) `3`{.bash}
D) `17`{.bash}
E) `compile-time error`{.bash}

---

18. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String first = "Hello";
		String second = "World";
		String result = 1 + 2 + first + second + 20 + 23;
		System.out.println(result);
	}
}
```

A) `3HelloWorld2023`{.bash}
B) `12HelloWorld2023`{.bash}
C) `3HelloWorld43`{.bash}
D) `12HelloWorld43`{.bash}
E) `Compile-time error`{.bash}

---

19. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String first = "lazy";
		String second = "dog";
		String result = first.toUpperCase() + " " + second.toLowerCase();
		System.out.print(result);
		String result2 = (first.toUpperCase()).concat(second.toLowerCase());
		System.out.println(result2);
	}
}
```

A) `LAZY dogLAZYdog`{.bash}
B) `LAZY dogLAZY dog`{.bash}
C) `LAZYdogLAZYdog`{.bash}
D) `LAZYdogLAZY dog`{.bash}
E) `Compile-time error`{.bash}

---

20. What will be the output of the following code snippet?

```java
public class punchcard {
	public static void main(String[] args) {
		String sentence = "Java is fun to learn";
		int index = sentence.indexOf("fun");
		System.out.println(index);
	}
}
```

A) `-1`{.bash}
B) `7`{.bash}
C) `8`{.bash}
D) `9`{.bash}
E) `compile-time error`{.bash}

\pagebreak

_Answers:_

1. C - 20
2. B - `sqrt(x)`{.java}
3. `C - char ch = "A";`{.java}
4. `A - "\r"`{.java}
5. C - `"\b"`{.java}
6. B
7. E - `length()`{.java}
8. A - `true`{.bash}
9. C - `Compile-time error`{.bash}
10. B - a negative integer
11. D - `own fo`{.bash}
12. A - `Equal`{.bash}
13. B - `false`{.bash}
14. A - `true`{.bash}
15. B - `1`{.bash}
16. A - `-1`{.bash}
17. D - `17`{.bash}
18. A - `3HelloWorld2023`{.bash}
19. A - `LAZY dogLAZYdog`{.bash}
20. C - `8`{.bash}
