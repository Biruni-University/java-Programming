% Quiz 2

1. what is the output of the following code?

```java
public class punchcard {
	public static void main (String args [ ]) {
		int result, x ;
		x = 1 ;
		result = 0;
		while (x <= 10) {
			if (x%2 == 0) result += x ;
			++ x ;
		}
		System.out.println(result) ;
	}
}
```

a) `20`{.java}
b) `25`{.java}
c) `30`{.java}
d) `35`{.java}
e) `40`{.java}


_answer_: c - `30`{.java}

---

2. What should be in the blank to make the following code print `character L appears 3 times`{.java}?

```java
public class punchcard {
	public static void main (String args [ ]) {
		String str = "HELLO WORLD" ;
		int count = 0 ;
		for (int i = 0 ; i < str.length() ; i++) {
			if (____________________) {
				count++ ;
			}
		}
		System.out.println("character L appears " + count + " times") ;
	}
}
```

a) `str.charAt(i) == 'L'`{.java}
b) `str.charAt(i).equals('L')`{.java}
c) `str == 'L'`{.java}
d) `str.equals('L')`{.java}
e) `charAt(str, i) == 'L'`{.java}

_answer_: a - `str.charAt(i) == 'L'`{.java}
