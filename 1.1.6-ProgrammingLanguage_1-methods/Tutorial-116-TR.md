% Yöntemler

Bir yöntem, belirli bir görevi yerine getiren ve sonucu çağıran
bir dizi ifadeden oluşur. Bir yöntem, bir şey döndürmeden belirli bir
görevi yerine getirebilir. Yöntemler, kodu yeniden yazmadan kodu
yeniden kullanmamıza izin verir. Java'da, her yöntem C, C++
ve Python gibi dillerden farklı olarak bir sınıfın bir parçası olmalıdır. Yöntemler
zaman kazandırıcıdır ve kodu yeniden yazmadan kodu
yeniden kullanmamıza yardımcı olur. Java'da, her yöntem
C, C++ ve Python gibi dillerden farklı olarak bir sınıfın bir parçası olmalıdır.

```java
public class MethodExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = toplam(a, b);
        System.out.println("a ve b'nin toplamı " + c);
    }

    public static int toplam(int sayi1, int sayi2) {
        int sonuc;
        sonuc = sayi1 + sayi2;
        return sonuc;
    }
}
```

Bir yöntem hiçbir şey döndürebilir. Bu durumda, yöntemin dönüş türü void olmalıdır.

```java
public class MethodExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        toplam(a, b);
    }

    public static void toplam(int sayi1, int sayi2) {
        int sonuc;
        sonuc = sayi1 + sayi2;
        System.out.println("a ve b'nin toplamı " + sonuc);
    }
}
```

**Ekstra ama ÖNEMLİ**: Herhangi bir Java projesinde yalnızca bir tane ve
yalnızca bir tane `public` sınıf olmalıdır. `public` sınıfın adı dosyanın adıyla
aynı olmalıdır. Örneğin, dosyanın adı `MethodExample.java` ise `public` sınıfın adı `MethodExample` olmalıdır.

tldr: dosya adı = sınıf adı

`public static void main(String[] args)`{.java} olan sınıf için

\pagebreak

1. Çıktıda `zaman kazandırıcı fonksiyonlar`'ı yazdırmak için boşluğu doldurun.

```java
public class Punchcard {
    public static void printMessage() {
        System.out.println("zaman kazandırıcı fonksiyonlar");
    }
    public static void main(String[] args) {
        _____________
    }
}
```

A) `void(printMessage);`{.java}
B) `printVoid();`{.java}
C) `void();`{.java}
D) `printMessage;`{.java}
E) `printMessage();`{.java}

_cevap_: E

---

2. Aşağıdaki kodun neresinde hata var?

```java
public class Punchcard {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " karesi " + ikiye(n));
        System.out.println(n + " küpü " + uce(n));
    }
}

class power {
    public static int ikiye(int n) {
        return n * n;
    }
    public static int uce(int n) {
        return n * n * n;
    }
}
```

A) Sınıf adı `power` olmalıdır
B) Başka bir sınıftan bir yöntemi çağırmak için, sınıf adını kullanmalısınız
B) `n` değişkeni `ikiye` ve `uce` yöntemlerinde bildirilmelidir
C) `ikiye` ve `uce` yöntemleri `void` olarak bildirilmelidir
D) Aynı java dosyasında iki sınıf bulunamaz

_cevap_: B

---

3. Çıktıda `2 ejderha hayal et`i yazdırmak için boşluğu doldurun.

```java
public class Punchcard {
    public static ______ printMessage(_____) {
        return x + " ejderha hayal et";
    }
    public static void main(String[] args) {
        System.out.println(printMessage(2));
    }
}
```

A) `void`{.java} ve `int`{.java}
B) `int`{.java} ve `int x`{.java}
C) `int`{.java} ve `String x`{.java}
D) `String x`{.java} ve `int`{.java}
E) `String`{.java} ve `int x`{.java}

_cevap_: E

---

4. Aşağıdaki kodun çıktısı nedir?

```java
public class Punchcard {
    public static void main(String[] args) {
        System.out.println(ortanca(1, 2, 3));
        System.out.println(ortanca(1, 3, 2));
    }
    public static int ortanca(int a, int b, int c) {
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

A) 2 ve 2
B) 2 ve 3
C) 3 ve 2
D) Hata, Aynı programda bir yöntemi iki kez çağırmak mümkün değil
E) Hata, `ortanca` yöntemi `void` olarak bildirilmelidir

_cevap_: A

---

5. Aşağıdaki kod neden doğru şekilde çalışmaz?

**Ekstra**: Başka bir sınıftan bir yöntemi çağırmak için, yöntemin
`static`{.java} olarak bildirilmesi gerekmektedir

``` java
public class Punchcard {
    public static void main(String[] args) {
        cat.meow;
    }
}
class cat {
    public static void eat() {
        System.out.println("kedi yemek yiyor");
    }
    public static void meow() {
        System.out.println("miyav");
    }
}
```

A) Başka bir sınıftan bir yöntemi çağırmak mümkün değildir
B) `meow`{.java} yöntemi `String`{.java} olarak bildirilmelidir
C) parametre durumu eksik, yöntem adından sonra `()`{.java} olmalıdır (`cat.meow()`{.java})
D) main yönteminden önce cat sınıfı yazılmalıdır
E) Kullanılmayan `eat`{.java} yöntemi kaldırılmalıdır

_cevap_: C

---

6. Aşağıdaki kodu iki tamsayının toplamını yazdıracak şekilde hangi değişiklik düzeltebilir?

```java
public class punchcard {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Toplam: " + ekle(a, b));
    }

    public static int ekle(int x, int y) {
        return x - y;
    }
}
```

A) `return x - y;`{.java} ifadesini `return x + y;`{.java} olarak değiştirin
B) `System.out.println("Toplam: " + ekle(a, b));`{.java} ifadesini `System.out.println("Toplam: " + cikar(a, b));`{.java} olarak değiştirin
C) `ekle`{.java} yöntemini kaldırın
D) `int a = 5;`{.java} ifadesini `int a = 15;`{.java} olarak değiştirin
E) Yeni bir yöntem ekle `public static int cikar(int x, int y) { return x + y; }`{.java}

_cevap_: A

---

7. Aşağıdaki değişiklik hangi kodu "Merhaba, Java!" şeklinde doğru yazdıracaktır?

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

A) `String message = "Merhaba, Java!";`{.java} ifadesini `greet();`{.java} ifadesinden önce ekleyin
B) `greet();`{.java} ifadesini `greet("Merhaba, Java!");`{.java} ifadesine değiştirin
C) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
D) `public static void greet(String message)`{.java} ifadesini `public static void greet()`{.java} olarak değiştirin
E) `greet(String message)`{.java} ifadesini `greet()`{.java} olarak yeniden adlandırın

_cevap_: B

---

8. Aşağıdaki değişiklik kodu düzgün derleyip çalıştıracaktır?

```java
public class punchcard {
    public static void main(String[] args) {
        System.out.println(alinti("Java eğlencelidir."));
    }
}

public class Text {
    public static String alinti(String metin) {
        return "Alıntı: " + metin;
    }
}
```

A) `System.out.println(alinti("Java eğlencelidir."));`{.java} ifadesini `System.out.println(Text.alinti("Java eğlencelidir."));`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `System.out.println(alinti);`{.java} ifadesinden önce `String alinti = alinti("Java eğlencelidir.");`{.java} ifadesini ekleyin
D) `alinti(String metin)`{.java} yöntemini kaldırın
E) `return "Alıntı: " + metin;`{.java} ifadesini `System.out.println("Alıntı: " + metin);`{.java} olarak değiştirin

_cevap_: A

---

9. Aşağıdaki değişiklik kodu "5" olarak düzeltecektir?

```java
public class punchcard {
    public static void main(String[] args) {
        int sonuc = kare(2);
        System.out.println(sonuc);
    }

    public static void kare(int num) {
        return num * num + 1;
    }
}
```

A) `public static void kare(int num)`{.java} ifadesini `public static int kare(int num)`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `kare`{.java} yöntemi içerisinde `num * num;`{.java} ifadesinin önüne `return`{.java} ekleyin
D) `int sonuc = kare(2);`{.java} ifadesini `int sonuc = kare(5);`{.java} olarak değiştirin
E) `int num = 5;`{.java} ve `int sonuc = 0;`{.java} ifadelerini `int sonuc = kare(2);`{.java} ifadesinden önce ekleyin

_cevap_: A

---

10. Aşağıdaki değişiklik kodu "Merhaba, Dünya!" olarak düzeltecektir?

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greet());
    }

    public static void greet() {
        return "Merhaba, Dünya!";
    }
}
```

A) `System.out.println(greet());`{.java} ifadesini `System.out.println(HelloWorld.greet());`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `public static void greet()`{.java} ifadesini `public static String greet()`{.java} olarak değiştirin
D) `public static void greet()`{.java} ifadesini `public static String greet() { return "Merhaba, Dünya!"; }`{.java} olarak değiştirin
E) `greet()`{.java} yöntemini kaldırın

_cevap_: C

---

11. Aşağıdaki değişiklik kodu "true" olarak düzeltecektir?

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

A) `public static boolean isEven(int number)`{.java} ifadesini `public static String isEven(int number)`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `return "true";`{.java} ve `return "false";`{.java} ifadelerindeki tırnakları (`"`{.java}) kaldırın
D) `System.out.println(isEven(4));`{.java} ifadesini `System.out.println(Logic.isEven(4));`{.java} olarak değiştirin
E) `if (number % 2 == 0)`{.java} ifadesini `if (number % 2 != 0)`{.java} olarak değiştirin

_cevap_: C

---

12. Aşağıdaki değişiklik kodu "5" olarak düzeltecektir?

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

A) `a + b;`{.java} ifadesini `return a + b;`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `add`{.java} yöntemi içindeki `a + b;`{.java} ifadesinin önüne `return`{.java} ekleyin
D) `int result = add(2, 3);`{.java} ifadesini `int result = add(5, 5);`{.java} olarak değiştirin
E) `int a = 5;`{.java} ve `int b = 0;`{.java} ifadelerini `int result = add(2, 3);`{.java} ifadesinden önce ekleyin

_cevap_: C

---

13. Aşağıdaki değişiklik kodu "10" olarak düzeltecektir?

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

A) `return x + y;`{.java} ifadesini `return x * y;`{.java} olarak değiştirin
B) `main`{.java} yönteminden `String[] args`{.java} ifadesini kaldırın
C) `int result = multiply(2, 5);`{.java} ifadesini `int result = multiply(5, 2);`{.java} olarak değiştirin
D) `int x = 5;`{.java} ve `int y = 5;`{.java} ifadelerini `int result = multiply(2, 5);`{.java} ifadesinden önce ekleyin
E) `public static int multiply(int x, int y)`{.java} ifadesini `public static void multiply(int x, int y)`{.java} olarak değiştirin

_cevap_: A

---

14. Boşluğu doldurarak tilki konușsun.

```java
public class Punchcard {
	public static void main(String[] args) {
		System.out.println("Tilki ne diyor?");
		fox.talk();

	}
}
class ___ {
	public static ____ talk() {
		___________________"Screech"_;
	}
}
```

Elbette! İşte kodu tamamlamak için beş seçenek:

A) `fox`{.java}, `void`{.java}, `return`{.java}
B) `fox`{.java}, `String`{.java}, `System.out.println()`{.java}
C) `fox`{.java}, `void`{.java}, `System.out.println()`{.java}
D) `Animal`{.java}, `void`{.java}, `return`{.java}
E) `Fox`{.java}, `void`{.java}, `System.out.print()`{.java}

_cevap_: C
