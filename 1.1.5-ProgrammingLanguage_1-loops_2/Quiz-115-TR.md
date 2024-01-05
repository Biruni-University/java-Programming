% sınav 1

1. Aşağıdaki kodun çıktısı nedir?

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

_cevap_: d - `great`{.java}

---

2. Aşağıdaki kodun `Converted: hELLO wORLD!`{.java} çıktısını vermesi için boşluğa ne yazılmalıdır?

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

_cevap_: c - `i < input.length(); i++`{.java}
