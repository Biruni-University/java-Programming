---
title: "Sorun Oturumu 1"
date: \today
---

# Soru 1 - Veri Tipleri - 10 puan

Aşağıdaki Java ifadeleri neyi değerlendirir? Bir ifade derlenmez veya çalışma zamanında bir istisna oluşturursa, her iki sütuna da **X** koyun.

| İfade | Değer | Tür |
| -------------------------- | -------------- | --- |
| `"1" + 2 * 6`{.java} | "112" | String |
| || |
| `1 / 2 / 6`{.java} | 0 | int |
| || |
| `Integer.parseInt(12) * 6`{.java} | X | X |
| || |
| `(1 >= 26) || (12 >= 6)`{.java} | true | boolean |
| || |
| `(int) 1.26 / (double) 10`{.java} | 0.1 | double |
| || |
| `1.2e6 % 1.2e5`{.java} | 0.0 | double |
| || |
| `1 <= 2 < 6`{.java} | X | X |
| || |
| `Math.min(1.2e6, 1.2e7, 1.2e8)`{.java} | X | X |
| || |
| `true != false && true > false`{.java} | X | X |
| || |
| ` !!!!!!false`{.java} | false | boolean |

\pagebreak

# Soru 2 - Diziler - 10 puan

Aşağıdaki Java kod parçasını düşünün.

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

Yukarıdaki kod parçası çalıştırıldıktan sonra `b[]`{.java} ve `c[]`{.java} dizilerindeki elemanların değerleri nedir? Cevaplarınızı aşağıdaki boşluğa yazın.

`a[] = { 1, 6, 5, 3, 0, 2, 4 }`{.java}

`b[] = { 4, 0, 5, 3, 6, 2, 1 }`{.java}

`c[] = { 0, 1, 2, 3, 4, 5, 6 }`{.java}

\pagebreak

# Soru 3 - Diziler - 10 puan (Cevaplar doğrulanmamış)

Aşağıdaki ifadelerin her biri doğru mu yoksa yanlış mı belirleyin. Herhangi bir dizin sınırlarının dışında olmayacağını varsayın. Her satıra "true" veya "false" yazın.

**Bölüm 8-11 için**:

```java
int[] a = new int [6];
int [] b = new int [6];
int[] c = a;
c[0] = 3;
```

| İfade | Doğru mu yoksa Yanlış mı? |
| ------------------------------------- | ------ |
| 1. Bir tamsayılar dizisinin her elemanı 0'a başlatılır. | true |
| | |
| 3. Bir boolean dizisinin her elemanı true olarak başlatılır. | false |
| | |
| 4. N-1, N boyutundaki bir dizinin son geçerli dizini olarak kabul edilir. | true |
| | |
| 5. Bir dizinin en küçük elemanının dizini 0'dır. | false |
| | |
| 6. N-3, N boyutundaki bir dizinin üçüncü sıradan sonuncu elemanının dizinidir. | true |
| | |
| 7. `(int) (Math.random() * N)`{.java}, boyutu N olan bir dizi için geçerli bir dizindir. | true |
| | |
| 8. `new`{.java} anahtar kelimesini kullanmadan yeni bir dizi oluşturabilirsiniz. | false |
| | |
| 9. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a == b`{.java} ifadesi `true` değerini alır. | false |
| | |
| 10. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a == c`{.java} ifadesi `true` değerini alır. | true |
| | |
| 11. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a[b[0]]`{.java} ifadesi `0` değerini alır. | false |
| | |
| 12. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a[b[c[0]]]`{.java} ifadesi `0` değerini alır. | true |

\pagebreak

# Soru 4 - Fonksiyonlar - 10 puan (Cevaplar doğrulanmamış)

Aşağıdaki ifadeler Java fonksiyonları (statik metotlar) için doğru mu yoksa yanlış mıdır? Her ifadeyi doğru veya yanlış olarak işaretleyin.

| doğru | yanlış | İfade |
| --- | --- | ------------------------------------------------ |
| || |
| true | | Bir fonksiyon birden fazla argüman alabilir. |
| || |
| true | | Bir fonksiyonun dönüş türü olarak `double`{.java} kullanılabilir. |
| || |
| true | | Bir fonksiyon, yalnızca aynı `.java` dosyasında tanımlanmışsa başka fonksiyonları çağırabilir. |
| || |
| | false | Aynı `.java` dosyasında tanımlanan iki fonksiyonun, farklı sayıda argümanları varsa, aynı ismialması mümkündür. |
| || |
| true | | Bir fonksiyona bir dizi (referansı) argüman olarak geçirirseniz, fonksiyon sadece dizinin girdilerini okuyamaz, aynı zamanda bunları değiştirebilir. |

\pagebreak

# Soru 5 - Fonksiyonlar - 10 puan

Aşağıdaki fonksiyonlar her biri neyi döndürür? Tabloyu doldurun.

`x`, `y` ve `z` dizilerinin aşağıdaki gibi tanımlandığını varsayalım:

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
| 0    | 9    | 0    |

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
| 0    | 14   | 20   |

**NOT**: `x`, `y` ve `z` dizileri, `h()`{.java} çağrılmadan önce orijinal değerlerine sıfırlanır.

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
| 0    | 58   | 30   |

\pagebreak

# Soru 6 - Diziler - 10 puan (Cevaplar doğrulanmamış)

Aşağıdaki Java dizilerinin özelliklerinden hangileri doğrudur?

Tabloyu doldurarak her ifadeyi doğru veya yanlış olarak işaretleyin.

| doğru | yanlış | İfade |
| ---- | ----- | ------------------------------------------------ |
| true | | Bir `int[]`{.java} dizisi oluşturup başlatıldıktan sonra, uzunluğunu değiştiremezsiniz. |
| || |
| true | | Eğer `a`{.java}, uzunluğu 10 olan bir `char[]`{.java} dizisi ise, `a[0.0]`{.java} ifadesi, ilk elemanını veren geçerli bir ifadedir. |
| || |
| | false | `new`{.java} anahtar kelimesini kullanmadan bir `String[]`{.java} dizisi tanımlamak, oluşturmak ve başlatmak mümkündür. |
| || |
| | false | `a[]`{.java} ve `b[]`{.java} iki farklı diziyse ve aynı tür ve uzunluğa sahipse, `a == b`{.java} ifadesi, karşılık gelen dizi elemanları eşitse `true`{.java} değerini verir, aksi halde `false`{.java}. |
| || |
| true | | Bir `int[]`{.java} dizisinin elemanları bilgisayarın belleğine (yani, ardışık bellek konumlarına) depolanır. |
| || |
| true | | `double[][]`{.java} türünde iki boyutlu bir dizi `a[][]`{.java} oluşturup başlatmak mümkündür, bu dizi için (`a[0].length != a[1].length`{.java}) olacak şekilde. |

\pagebreak

# Soru 7 - Fonksiyonlar, diziler ve geç-kopyalama - 5 puan (Herhangi bir cevap sağlanmamış)

Aşağıdaki iki fonksiyonu düşünün, bunlar bir tamsayı dizisindeki değerleri tersine çevirmeyi amaçlar:

```java
public static void negate1(int[] a) {
	for (int i = 0; i < a.length; i++)
		a[i] = -a[i];
}

public static void negate2(int[] a) {
	int[] b = new int[a.length];
	for (int i = 0; i < a.length; i++)
		b[i] = -a[i];
	a = b;
	return b;
}
```

`main`{.java} içindeki bir tamsayı dizisi `a[]`{.java} düşünün ve içeriği `[1, 2, 3]`{.java} olan bir dizi olarak başlatılsın. Aşağıdaki ifadeleri gerçekleştirdikten sonra `a[]`{.java} tarafından referans edilen dizideki içerik nedir? Her bir parça için ayrı ayrı cevap verin.

Soldaki her ifade için, sağdaki açıklamanın en iyi eşleşen harfini yazın.
Her harfi bir kez, birden fazla kez veya hiç kullanabilirsiniz.

| İfade | Açıklama |
| --------- | ----------- |
| ____ `negate1(a);`{.java} | A. `[1, 2, 3]`{.java} |
|||
| ____ `negate2(a);`{.java} | B. `[-1, -2, -3]`{.java} |
|||
| ____ `a = negate2(a);`{.java} | C. `[0, 0, 0]`{.java} |
|||
| ____ `negate1(negate2(a));`{.java} | D. derleme zamanı hatası veya çalışma zamanı istisnası |
|||
| ____ `a = negate2(negate2(negate2(a)));`{.java} | |

\pagebreak

# Soru 8 - Türlerin, değişkenlerin ve ifadelerin özellikleri - 5 puan (Cevaplar doğrulanmamış)

Java'da türlerin, değişkenlerin ve ifadelerin aşağıdaki özelliklerinden hangileri doğrudur?

Her ifadeyi doğru veya yanlış olarak işaretleyerek tabloyu doldurun.

| doğru | yanlış | İfade |
| --- | --- | ------------------------------------------------ |
| true | | Her değişkenin bir türü vardır (`int`{.java}, `double`{.java} veya `String`{.java} gibi), bu tür derleme zamanında bilinir. |
| || |
| true | | İki `double`{.java} operand üzerine bir aritmetik operatör (`+`{.java}, `-`{.java}, `*`{.java}, `/`{.java}) uygulandığında, sonuç her zaman bir `double`{.java} türünden oluşur (ve hiçbir zaman çalışma zamanı istisnası üretmez). |
| || |
| true | | Bir `int`{.java} türündeki bir yerel değişkeni henüz değeri atanmadan önce bir ifadede kullanmaya çalışırsanız, Java bu değişken için 0 değerini yerleştirir. |
| || |
| true | | Bir değişken bir `for`{.java} döngüsünün içinde tanımlanıp başlatılırsa, bu değişkene o döngünün dışından erişilemez. |
| || |
| true | | Bir değişkenin adını tüm büyük harflerle yazarsanız ve başlangıçta bir değer atanırsa, daha sonra değerini değiştirmeye çalışmak derleme zamanında bir hataya neden olur. |
