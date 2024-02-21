---
title: "Sorun Oturumu 1"
date: \today
---

# Soru 1 - Veri Türleri - 10 puan

Aşağıdaki Java ifadeleri neyi değerlendirir? Bir ifade derlenmiyorsa veya çalışma zamanında istisna oluşturuyorsa, her iki sütunda da **X** koyun.

| İfade | Değer | Tür |
| -------------------------- | -------------- | --- |
| `"1" + 2 * 6`{.java} ||
| || |
| `1 / 2 / 6`{.java} ||
| || |
| `Integer.parseInt(12) * 6`{.java} ||
| || |
| `(1 >= 26) || (12 >= 6)`{.java} ||
| || |
| `(int) 1.26 / (double) 10`{.java} ||
| || |
| `1.2e6 % 1.2e5`{.java} ||
| || |
| `1 <= 2 < 6`{.java} ||
| || |
| `Math.min(1.2e6, 1.2e7, 1.2e8)`{.java} ||
| || |
| `true != false && true > false`{.java} ||
| || |
| ` !!!!!!false`{.java} ||

\pagebreak

# Soru 2 - Diziler - 10 puan

Aşağıdaki Java kod parçacığını düşünün.

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

Yukarıdaki kod parçacığı çalıştırıldıktan sonra `b[]`{.java} ve `c[]`{.java} dizilerindeki elemanların değerleri nedir? Cevaplarınızı aşağıdaki boşluğa yazın.

`a[] = { 1, 6, 5, 3, 0, 2, 4 }`{.java}

`b[] = { _, _, _, _, _, _, _ }`{.java}

`c[] = { _, _, _, _, _, _, _ }`{.java}

\pagebreak

# Soru 3 - Diziler - 10 puan

Aşağıdaki ifadelerin her birinin doğru olup olmadığını belirleyin. Herhangi bir indeksin sınır dışı olmadığını varsayın. Her satıra "true" veya "false" yazın.

**8-11. Kısım için**:

```java
int[] a = new int [6];
int [] b = new int [6];
int[] c = a;
c[0] = 3;
```

| İfade | Doğru mu veya Yanlış |
| ------------------------------------- | ------ |
| 1. Yeni bir tamsayı dizisinin her öğesi 0'a başlatılır. | **true** |
| | |
| 3. Yeni bir boolean dizisinin her öğesi true'a başlatılır. | |
| | |
| 4. N-1, N boyutundaki bir dizinin son geçerli indeksidir. | |
| | |
| 5. 0, N boyutundaki bir dizinin en küçük elemanının indeksidir. | |
| | |
| 6. N-3, N boyutundaki bir dizinin üçüncü en sondaki elemanının indeksidir. | |
| | |
| 7. `(int) (Math.random() * N)`{.java}, N boyutundaki bir dizinin geçerli bir indeksidir. | |
| | |
| 8. `new`{.java} anahtar kelimesini kullanmadan yeni bir dizi oluşturabilirsiniz. | |
| | |
| 9. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a == b`{.java} ifadesi `true`{.java} olarak değerlendirilir. | |
| | |
| 10. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a == c`{.java} ifadesi `true`{.java} olarak değerlendirilir. | |
| | |
| 11. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a[b[0]]`{.java} ifadesi `0` olarak değerlendirilir. | |
| | |
| 12. Yukarıda tanımlanan `a`, `b` ve `c` dizileri için, `a[b[c[0]]]`{.java} ifadesi `0` olarak değerlendirilir. | |

\pagebreak

# Soru 4 - Fonksiyonlar - 10 puan

Aşağıdaki ifadeler Java fonksiyonları (statik metotlar) için hangileri doğrudur? Her ifadeyi doğru veya yanlış olarak işaretleyin.

| true | false | İfade |
| --- | --- | ------------------------------------------------ |
| || Bir fonksiyon birden fazla argümanı kabul edebilir. |
| || |
| || Bir fonksiyonun dönüş türü olarak `double`{.java} kullanabilirsiniz. |
| || |
| || Bir fonksiyon, yalnızca o fonksiyonlar aynı `.java` dosyasında tanımlandıysa, diğer fonksiyonları çağırabilir. |
| || |
| || Aynı `.java` dosyasında tanımlanan iki fonksiyon, farklı sayıda argümana sahip değilse, aynı isme sahip olabilir. |
| || |
| || Bir diziyi bir fonksiyona argüman olarak geçirirseniz, fonksiyon sadece dizinin girdilerini okuyamaz, aynı zamanda onları değiştirebilir. |

\pagebreak

# Soru 5 - Fonksiyonlar - 10 puan

Aşağıdaki fonksiyonlar her biri neyi dö

ndürür? Tabloyu doldurun.

`x`, `y` ve `z` dizilerinin aşağıdaki gibi tanımlandığını varsayın:

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
|      |      |      |

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
|      |      |      |

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
|      |      |      |

\pagebreak

# Soru 6 - Diziler - 10 puan

Aşağıdakilerden hangileri Java'daki dizilerin özellikleridir?

Her ifadeyi doğru veya yanlış olarak işaretleyerek tabloyu doldurun.

| true | false | İfade |
| ---- | ----- | ------------------------------------------------ |
| || Bir `int[]`{.java} dizisi oluşturup başlatıldıktan sonra, uzunluğunu değiştiremezsiniz. |
| || |
| || `a`{.java}, 10 uzunluğunda bir `char[]`{.java} türünde bir dizi ise, `a[0.0]`{.java}, ilk öğesini veren geçerli bir ifadedir. |
| || |
| || `new`{.java} anahtar kelimesini kullanmadan bir `String[]`{.java} dizisi oluşturup başlatabilirsiniz. |
| || |
| || `a[]`{.java} ve `b[]`{.java} iki farklı türde ve uzunlukta diziler ise, karşılık gelen dizi öğeleri eşitse `(a == b)`{.java} ifadesi `true`{.java} olarak değerlendirilir, aksi halde `false`{.java}. |
| || |
| || Bir `int[]`{.java} dizisinin öğeleri bilgisayarın belleğinde (yani, ardışık bellek konumlarında) saklanır. |
| || |
| || `a[][]`{.java} türünde ve `double[][]`{.java} türünde bir iki boyutlu dizi oluşturup başlatarak, (`a[0].length != a[1].length`{.java}) ifadesini sağlayabilirsiniz. |

\pagebreak

# Soru 7 - Fonksiyonlar, diziler ve değer ile geçirme - 5 puan

Aşağıdaki iki işlevi düşünün, bir tamsayı dizisindeki değerleri negatif yapmayı amaçlayan:

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

`main`{.java} içinde bir tamsayı dizisi `a[]`{.java} tanımlanıp ve `[1, 2, 3]`{.java} içerecek şekilde başlatıldığını varsayalım. Aşağıdaki ifadeleri yürüttükten sonra `a[]`{.java} tarafından referans edilen dizideki içerikler ne olur? Her parçayı bağımsız olarak cevaplayın.

Soldaki ifade için, sağdaki açıklamayla en iyi eşleşen harfi yazın.

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

# Soru 8 - Türlerin, değişkenlerin ve ifadelerin özellikleri - 5 puan

Aşağıdakiler Java'daki türlerin, değişkenlerin ve ifadelerin özelliklerinden hangileridir?

Her ifadeyi doğru veya yanlış olarak işaretleyerek tabloyu doldurun.

| true | false | İfade |
| --- | --- | ------------------------------------------------ |
| || Her değişkenin (örneğin `int`{.java}, `double`{.java} veya `String`{.java}) derleme zamanında bilinen bir türü vardır. |
| || |
| || İki `double`{.java} işlemcisine (`+`{.java}, `-`{.java}, `*`{.java}, `/`{.java}) uygulandığında, her zaman bir `double`{.java} türündeki bir değer üretir (ve asla çalışma zamanı istisnası oluuşturmaz). |
| || |
| || Eğer bir `int`{.java} türünde bir yerel değişkeni ifade içerisinde kullanmaya çalışırsanız ve değişkene henüz bir değer atamamışsanız, Java 0 değerini yerine koyar. |
| || |
| || Bir değişken, bir `for`{.java} döngüsünün gövdesinde bildirilir ve başlatılırsa, bu değişkene döngü dışında erişilemez. |
| || |
| || Tüm büyük harflerle bir değişken adını adlandırırsanız ve ona bir değer atarsanız, daha sonra değerini değiştirmeye çalışmak derleme zamanı hatası ile sonuçlanır. |
