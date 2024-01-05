% Quiz 1

1. what is the output of the following code?

```java
public class PunchCard {
	public static void main(String[] args) {
		String original = "Java is great";
		String modified = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			if (original.charAt(i) != ' ') {
				modified = original.charAt(i) + modified;
			} else {
				break;
			}
		}
		System.out.println(modified);
	}
}
```

a) `taerg si avaJ`{.java}
b) `taerg`{.java}
c) `JAVA IS GREAT`{.java}
d) `great`{.java}
e) `java`{.java}


_answer_: d - `great`{.java}

---

2. What should be in the blank to make the following code print `Converted: hELLO wORLD!`{.java}?

```java
public class punchcard {
	public static void main(String[] args) {
		String input = "Hello World!";
		String converted = "";

		for (int i = 0; _______________________) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				converted += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				converted += Character.toUpperCase(c);
			} else {
				converted += c; // For non-alphabetic characters
			}
		}

		System.out.println("Original: " + input);
		System.out.println("Converted: " + converted);
	}
}
```

a) `i ++`{.java}
b) `input.length() - 1`{.java}
c) `i < input.length(); i++`{.java}
d) `i >= input.length(); i--`{.java}
e) `i <= input.length(); i++`{.java}

_answer_: c - `i < input.length(); i++`{.java}
