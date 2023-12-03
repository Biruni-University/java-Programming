% Veri Dönüşümü

| Veri Türü | Varsayılan               | Boyut (bit cinsinden) | Örnek Değerler     | Değer Aralığı                  |
|-----------|--------------------------|-----------------------|---------------------|--------------------------------|
| `byte`    | 0                        | 8                     | `byte b = 5;`       | -128 ila 127                    |
| `short`   | 0                        | 16                    | `short s = 10;`     | -32,768 ila 32,767              |
| `int`     | 0                        | 32                    | `int i = 42;`       | -2,147,483,648 ila 2,147,483,647|
| `long`    | 0L                       | 64                    | `long l = 123L;`    | -2^63 ila 2^63 - 1              |
| `float`   | 0.0f                     | 32                    | `float f = 3.14f;`  | ±1.4 x 10^-45 ila ±3.4 x 10^38 |
| `double`  | 0.0                      | 64                    | `double d = 2.718;`| ±4.9 x 10^-324 ila ±1.7 x 10^308|
| `char`    | `\u0000` (null karakteri)| 16                    | `char c = 'A';`     | 0 ila 65,535                    |
| `boolean` | `false`                  | 1                     | `boolean flag = true;` | `true` veya `false`         |


| Veri Türü | Genişletme              | Daraltma                                      |
|-----------|-------------------------|-----------------------------------------------|
| `byte`    | `short`, `int`, `long`, `float`, `double` | `char`                            |
| `short`   | `int`, `long`, `float`, `double`          | `byte`, `char`                    |
| `int`     | `long`, `float`, `double`                  | `byte`, `short`, `char`           |
| `long`    | `float`, `double`                          | `byte`, `short`, `char`, `int`    |
| `float`   | `double`                                  | `byte`, `short`, `char`, `int`, `long`  |
| `double`  | -                                         | `byte`, `short`, `char`, `int`, `long`, `float` |
| `char`    | `int`, `long`, `float`, `double`          | `byte`, `short`                   |
| `boolean` | -                                         | -                                 |

\pagebreak


1. Java'da, dönüşümün amacı nedir?

A) String'i int'e dönüştürmek
B) Int'i string'e dönüştürmek
C) Bir veri türünü başka bir veri türüne dönüştürmek
D) Boolean'ı int'e dönüştürmek

---

2. Bir char'ın int değerini nasıl alabilirsiniz?

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

3. Aşağıdaki kodun çıktısı nedir?

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
D) hata (error)

---

4. Aşağıdaki kodun sorunu nedir?

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

A) Hiçbir şey
B) `println`{.java} `print`{.java} olmalı
C) Bir ifadenin içinde double'ı int'e dönüştürmek mümkün değil
D) int'i double'a dönüştüremezsiniz

---

5. Aşağıdaki kodun çıktısı nedir?

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
D) hata (error)

---

6. Aşağıdaki kodun çıktısı nedir?

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
D) hata (error)

---

7. Bir uzun sayı üretecek ve yazdıracak tüm doğru cevapları seçin.
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

8. Aşağıdaki kodu hatasız derleyip çalıştırmak için gerekli minimum takas (swap) nedir?


**NOTE**: Yalnızca iki en yakın dönüşüm operatörünü takas edebilirsiniz. Örneğin, `(short)`{.java} ifadesini `num`{.java} ifadesinden önce sona taşımak için bunu 3 kez takas etmeniz gerekecek.

```java
class punchcard {
	public static void main(String[] args) {
		double num = 20.1;
		int result = (byte) (double) (short) (int) (float) (long) num;
		//yukarıdaki dönüşüm operatörlerini sadece bunları takas edebilirsiniz//
		System.out.println(result);

	}
}
```

A) 0
B) 1
C) 3
D) 5

---

9. Aşağıdaki kodun çıktısı ne olur?

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
D) hatası (error)

---

10. Aşağıdaki kodun, 14'ü yazdırması için boşluğu doldurun.

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

11. Aşağıdaki kodun çıktısı ne olur?

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
D) hata (error)

---

12. Aşağıdaki kodun çıktısı ne olur?

```java
class punchcard {
	public static void main(String[] args) {
		int a = 7;
		int b = ++a + a--;
		System.out.print("a'nın değeri: " + a);
		System.out.println(" ve b'nin değeri: " + b);
	}
}
```

A) a'nın değeri: 7 ve b'nin değeri: 14
B) a'nın değeri: 6 ve b'nin değeri: 14
C) a'nın değeri: 8 ve b'nin değeri: 14
D) a'nın değeri: 7 ve b'nin değeri: 16


---

13. Aşağıdaki kodun çıktısı ne olur?

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
D) hata (error)

---

14. Aşağıdaki kodun çıktısı ne olur?

```java
class punchcard {
	public static void main(String[] args) {
		System.out.println(0.1 + 0.2);
		System.out.println(9999999999999999.0 - 9999999999999998.0); // 16 digits
	}
}
```

A) 0.3 ve 1.0
B) 0.30000000000000004 ve 1.0
C) 0.30000000000000004 ve 2.0
D) Hata

\pagebreak

_Cevaplar:_:

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
