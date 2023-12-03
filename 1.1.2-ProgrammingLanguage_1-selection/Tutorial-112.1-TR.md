% Seçim 2

| İşlem                           | Örnek                                                                                                            |
|---------------------------------|--------------------------------------------------------------------------------------------------------------------|
| `if`{.java}                     | `if (x > 0) { sout("Pozitif"); }`{.java}                                                               |
| `if ... else`{.java}            | `if (x > 0) { sout("Pozitif"); } else { sout("Pozitif değil"); }`{.java}                                |
| `if ... elseif ... else`{.java} | `if (x > 0) { sout("Pozitif"); } else if (x < 0) { sout("Negatif"); } else { sout("Sıfır"); }`{.java}  |
| `switch`{.java}                 | `switch (x) { case 1: sout("Bir"); break; case 2: sout("İki"); break; default: sout("Diğer"); }`{.java} |
| İç İçe `if`{.java} ifadesi      | `if (x > 0) { if (x % 2 == 0) { sout("Pozitif ve Çift"); } }`{.java}                                  |
| Koşullu Operatörler             | `boolean isTrue = (x > 0) && (x < 10);`{.java}                                                                     |

| İşlem                             | Açıklama                                 | Örnek                               | Çıktı Örneği      |
|-----------------------------------|------------------------------------------|-------------------------------------|---------------------|
| `+`{.java} (İkili toplama)        | İkili aritmetik toplama.                 | `int a = 5 + 3;`{.java}               | `a`, `8`'e eşittir |
| `-`{.java} (İkili çıkarma)        | İkili aritmetik çıkarma.                 | `int b = 8 - 4;`{.java}               | `b`, `4`'e eşittir |
| `*`{.java}(Çarpma)                | İkili çarpma.                             | `int c = 6 * 4;`{.java}               | `c`, `24`'e eşittir|
| `/`{.java}(Bölme)                 | İkili bölme.                              | `int d = 20 / 5;`{.java}              | `d`, `4`'e eşittir |
| `%`{.java}(Modül)                 | İkili modül (bölümün kalanı).            | `int e = 17 % 5;`{.java}              | `e`, `2`'ye eşittir |
| `+`{.java}(Ünary artı)            | Ünary artı.                               | `int f = +5;`{.java}                  | `f`, `5`'e eşittir |
| `-`{.java}(Ünary eksi)            | Ünary eksi.                              | `int g = -7;`{.java}                  | `g`, `-7`'ye eşittir|
| `++var`{.java}(Ön-ekleme)         | Ön-ekleme.                               | `int h = 5; ++h;`{.java}              | `h`, `6`'ya dönüşür|
| `--var`{.java}(Ön-azaltma)        | Ön-azaltma.                              | `int i = 10; --i;`{.java}             | `i`, `9`'a dönüşür |
| `var++`{.java}(Son-ekleme)       | Son-ekleme.                              | `int j = 5; j++;`{.java}              | `j`, `6`'ya dönüşür|
| `var--`{.java}(Son-azaltma)       | Son-azaltma.                             | `int k = 10; k--;`{.java}             | `k`, `9`'a dönüşür |
| `!`{.java}(Değil)                 | Mantıksal DEĞİL.                         | `boolean l = !flag;`{.java}           | `l`, `false` olur  |
| `<`{.java}(Küçük)                 | Küçüktür karşılaştırması.               | `boolean m = (5 < 10);`{.java}        | `m`, `true` olur   |
| `>`{.java}(Büyük)                 | Büyüktür karşılaştırması.               | `boolean n = (10 > 5);`{.java}        | `n`, `true` olur   |
| `!=`{.java}(Eşit değil)           | Eşit değil karşılaştırması.             | `boolean o = (3 != 5);`{.java}        | `o`, `true` olur   |
| `==`{.java}(Eşit)                 | Eşit karşılaştırması.                   | `boolean p = (5 == 5);`{.java}        | `p`, `true` olur   |
| `<=`{.java}(Küçük veya eşit)      | Küçük veya eşit karşılaştırması.        | `boolean q = (10 <= 15);`{.java}      | `q`, `true` olur   |
| `>=`{.java}(Büyük veya eşit)      | Büyük veya eşit karşılaştırması.        | `boolean r = (20 >= 10);`{.java}      | `r`, `true` olur   |
| `&&`{.java}(Mantıksal VE)         | Koşullu VE.                              | `boolean s = (true && false);`{.java} | `s`, `false` olur  |
| `||`{.java}(Mantıksal VEYA)       | Koşullu VEYA.                            | `boolean t = (true || false);`{.java} | `t`, `true` olur   |
| `^`{.java}(Mantıksal XOR) | Koşullu XOR (özel VEYA). | `boolean u = (true ^ false);`{.java} | `u`, `true` olur |
| `=`{.java}(Atama)         | Atama.                   | `int w = 5;`{.java}                  | `w`, `5` olur    |
| `+=`{.java}(Ekle ve ata)  | Ekle ve ata.             | `int x = 5; x += 3;`{.java}          | `x`, `8` olur    |
| `-=`{.java}(Çıkar ve ata) | Çıkar ve ata.            | `int y = 10; y -= 4;`{.java}         | `y`, `6` olur    |
| `*=`{.java}(Çarp ve ata)  | Çarp ve ata.             | `int z = 20; z *= 2;`{.java}         | `z`, `40` olur   |
| `/=`{.java}(Böl ve ata)   | Böl ve ata.              | `int m = 15; m /= 3;`{.java}         | `m`, `5` olur    |
| `%=`{.java}(Modül ve ata) | Modül ve ata.            | `int n = 12; n %= 5;`{.java}         | `n`, `2` olur    |

\pagebreak

1. Kodun `Path A`{.java} yazdırması için boşlukları doldurun.

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

2. Aşağıdaki kod parçası için çıktı ne olur?

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

3. Aşağıdaki Java kodunun çıktısı nedir?

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
E) `Çıktı yok`{.java}
F) `Hata`{.java}

---

4. Aşağıdaki Java kodunun çıktısı nedir?

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

* 5 ila 7. sorular ekstradır. İsterseniz bunları atlayabilirsiniz.
* Bu switch özellikleri Java 14 veya daha üstünü gerektirir.

5. Aşağıdaki Java kodunun çıktısı nedir?

```java
class punchcard {
	public static void main(String[] args) {
		int dayofweek = 6;
		switch (dayofweek) {
			case 1, 2, 3, 4, 5:
				System.out.println("bekle, bugün ders mi var?!!");
				break;
			case 6, 7:
				System.out.println("partiye gidiyoruzzzzz");
				break;
			default:
				System.out.println("geçerli bir gün değil!");
		}
	}
}
```

A) bekle, bugün ders mi var?!!
B) partiye gidiyoruzzzzz
C) Geçerli bir gün değil!
D) Hata

---

6. Aşağıdaki Java kodunun çıktısı nedir?

```java
[class](class) punchcard {
	public static void main(String[] args) {
		int dayOfWeek = 6;
		switch (dayOfWeek) {
			case 1, 2, 3, 4, 5 -> System.out.println("bekle, bugün ders mi var?!!");
			case 6, 7 -> System.out.println("partiye gidiyoruzzzzz");
			default -> System.out.println("Geçerli bir gün değil!");
		}
	}
}
```

A) bekle, bugün ders mi var?!!
B) partiye gidiyoruzzzzz
C) Geçerli bir gün değil!
D) Hata

---

7. Aşağıdaki Java kodunun çıktısı nedir?

```java
class punchcard {
	public static void main(String[] args) {
		int dayOfWeek = 7;
		int day = 23, month = 5, year = 2021;

		String date = switch (dayOfWeek) {
			case 1 -> "Pazartesi";
			case 2 -> "Salı";
			case 3 -> "Çarşamba";
			case 4 -> "Perşembe";
			case 5 -> "Cuma";
			case 6 -> "Cumartesi";
			case 7 -> "Pazar";
				default -> "Geçersiz haftanın günü!";
		}
		+ ", " + day + ". "
			+ switch (month) {
				case 1 -> "Ocak";
				case 2 -> "Şubat";
				case 3 -> "Mart";
				case 4 -> "Nisan";
				case 5 -> "Mayıs";
				case 6 -> "Haziran";
				case 7 -> "Temmuz";
				case 8 -> "Ağustos";
				case 9 -> "Eylül";
				case 10 -> "Ekim";
				case 11 -> "Kasım";
				case 12 -> "Aralık";
				default -> "Geçersiz ay!";
			}
		+ " " + year;
		System.out.println(date + "\n");
	}
}
```

A) Pazar, 23. Mayıs 2021
B) Geçersiz haftanın günü!, 23. Geçersiz ay! 2021
C) Geçersiz haftanın günü!, 23. Mayıs 2021
C) Perşembe, 23. Nisan 2021
D) Hata

---

8. Renk eşleştirme oyununu simüle eden bir program oluşturuyorsunuz. Her rengin belirli bir sayıya karşılık geldiği bir renk tablosu bulunmaktadır. Göreviniz, kullanıcıdan string türünde (`color`) bir giriş almak olan bir kod yazmaktır. Giriş rengi, aşağıdaki renk tablosuna dayalı olarak bir sayısal koda eşleştirilecektir:

Renk kodları şöyledir:
- Kırmızı - `101`
- Mavi - `202`
- Yeşil - `303`
- Sarı - `404`
- Turuncu - `505`

Ardından, karşılık gelen sayısal kodu konsola yazdırın.

Örnek fonksiyon imzası:
```java
public class Main {
	public static void main(String[] args) {
		// bir tarama nesnesi oluşturun

		// kullanıcıdan rengi alın

		// switch-case kullanarak karşılık gelen sayısal kodu yazdırmak için if-else veya switch-case kullanın
	}
}
```

### Kısıtlamalar:
- Giriş `color` her zaman "Kırmızı", "Mavi", "Yeşil", "Sarı", "Turuncu" arasında geçerli bir dize olacaktır.

### Örnek:
```java
```

Bu soru, adayların `switch-case` ifadesini kullanarak giriş renk dizesini karşılık gelen sayısal koda verimli ve yaratıcı bir şekilde eşleştirmesini istemektedir. Hedef, switch-case yapısını kullanarak kompakt ve zarif bir `getColorCode` fonksiyonu uygulamaktır.

\pagebreak

_Cevaplar_:

1. A
2. C
3. B
4. B
5. B
6. B
7. A
8. Olası bir çözüm:

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String color = scanner.nextLine();
		switch (color) {
			case "Kırmızı":
				System.out.println("101");
				break;
			case "Mavi":
				System.out.println("202");
				break;
			case "Yeşil":
				System.out.println("303");
				break;
			case "Sarı":
				System.out.println("404");
				break;
			case "Turuncu":
				System.out.println("505");
				break;
			default:
				System.out.println("Geçersiz renk");
		}
	}
}
```
