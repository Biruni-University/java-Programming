% Matematiksel Fonksiyonlar ve Dizgeler

\pagebreak

1. Aşağıdaki kodun çıktısı nedir?

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

2. Aşağıdaki kodun boşlukları doğru şekilde dolduran seçenek hangisidir?

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

3. Aşağıdakilerden hangisi **char** değişkenini doğru şekilde bildirmenin **DOĞRU OLMAYAN** yolu?

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

4. Terminalde ödül mesajının görüntülenmemesi için boşluğa ne konulmalıdır?

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

5. İkinci çıktı satırındaki ekstra boşlukları nasıl kaldırabilirsiniz? (beklenen çıktı: `wooden clocks`)

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

6. Aşağıdaki kodun çıktısı nedir?

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

7. Java'da bir dizenin uzunluğunu elde etmek için hangi yöntem kullanılır?

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

8. Aşağıdaki kodun çıktısı nedir?

**NOT:** ==, String türündeki referansları karşılaştırmak için kullanılabilir, ancak böyle bir eşitlik testi, iki operatörün aynı String nesnesine işaret edip etmediğini belirler. Operatörler farklı String nesneleri ise sonuç false olur, hatta karakter dizileri aynı karakter dizisini içeriyor olsalar bile (§3.10.5, §3.10.6). İki dizenin s ve t içeriği, s.equals(t) yöntemi çağrısıyla eşitlik için test edilebilir.

```java
// Bu ikisi aynı değere sahip
new String("test").equals("test") // --> true

// ... ama bunlar aynı nesne değil
new String("test") == "test" // --> false

// ... bunlar da değil
new String("test") == new String("test") // --> false

// ... ama bunlar aynı nesne olduğundan
// derleyici tarafından internedir ve bu nedenle aynı nesneye işaret eder
"test" == "test" // --> true

// ... dize literalleri derleyici tarafından birleştirilir
// ve sonuçlar interned olur.
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
C) `Derleme zamanı hatası`{.bash}
D) `Çalışma zamanı istisnası`{.bash}
E) `NullPointerException`{.bash}

---

9. Aşağıdaki kodun çıktısı nedir?

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
C) `Derleme zamanı hatası`{.bash}
D) `Çalışma zamanı istisnası`{.bash}
E) `NullPointerException`{.bash}

---

10. Aşağıdaki kodun çıktısı nedir?

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
B) Negatif bir tamsayı
C) Pozitif bir tamsayı
D) `True`{.bash}
E) `False`{.bash}

---

11. Aşağıdaki kod parçasının çıktısı nedir?

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

12. Aşağıdaki kod parçasının çıktısı nedir?

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
C) `hata`{.bash} çünkü char dizeyle birleştirilemez
D) `hata`{.bash} çünkü dizeler `==`{.java} ile karşılaştırılamaz
E) `hata`{.bash} çünkü operatörler aynı türde değil

---

13. Aşağıdaki kod parçasının çıktısı nedir?

> Kullanıcı girişinin hem input1 hem de input2 için 'clock' olduğunu varsayalım.

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
C) `Derleme zamanı hatası`{.bash}
D) `Çalışma zamanı istisnası`{.bash}
E) `NullPointerException`{.bash}

---

14. Aşağıdaki kod parçasının çıktısı nedir?

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
C) `Derleme zamanı hatası`{.bash}
D) `Çalışma zamanı istisnası`{.bash}
E) `NullPointerException`{.bash}

---

15. Aşağıdaki kod parçasının çıktısı nedir?

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

16. Aşağıdaki kod parçasının çıktısı nedir?

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
D) `derleme zamanı hatası`{.bash}
E) `çalışma zamanı istisnası`{.bash}

---

17. Aşağıdaki kod parçasının çıktısı nedir?

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
E) `derleme zamanı hatası`{.bash}

---

18. Aşağıdaki kod parçasının çıktısı nedir?

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
E) `Derleme zamanı hatası`{.bash}

---

19. Aşağıdaki kod parçasının çıktısı nedir?

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
E) `Derleme zamanı hatası`{.bash}

---

20. Aşağıdaki kod parçasının çıktısı nedir?

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
E) `derleme zamanı hatası`{.bash}

\pagebreak

_Cevaplar:_

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
