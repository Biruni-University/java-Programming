% Diziler

* Java'da dizi, benzer türdeki öğelerin bir koleksiyonudur.
* Dizi sabit boyuta sahiptir. Bir dizi oluşturduktan sonra dizinin boyutunu değiştiremeyiz.
* Dizi, sayılar, isimler vb. gibi bir liste değerini depolamamız gerektiğinde işe yarar.

Java'da bir dizi nasıl tanımlanır:

```java
int[] arr;
```

Ve bir diziyi nasıl başlatırız:

```java
int[] arr = new int[5];
```

Diziyi başlatma sırasında değerler atayabiliriz:

```java
int[] arr = {1, 2, 3, 4, 5};
```

Veya diziyi farklı değerlerle başlatmak istiyorsak, şu şekilde yapabiliriz:

```java
int[] arr = new int[] {1, 2, 3, 4, 5};
```

Bir dizinin değerini değiştirmek için sadece indeksteki değeri değiştirebiliriz:

```java
int[] arr = {1, 2, 3, 4, 5};
arr[0] = 10;
```

\pagebreak

1. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[3]);
	}
}
```

a) 0
b) 3
c) 4
d) Null
e) hata

_cevap_: c

---

2. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[3]);
	}
}
```

a) 0
b) 3
c) 5
d) Null
e) hata

_cevap_: a

---

3. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[5]);
	}
}
```

a) 0
b) 1
c) 5
d) Null
e) hata

_cevap_: e

---

4. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3};
		System.out.println(arr[-1]);
	}
}
```

a) 0
b) 1
c) 3
d) Null
e) hata - negatif indeks nedeniyle hata

_cevap_: e

---

5. Boyutu 5 olan ve değerleri 1, 2, 3, 4, 5 olan bir dizi nasıl başlatırım? (Birden fazla doğru cevap)

a) `int[] arr = {1, 2, 3, 4, 5};`{.java}
b) `int[] arr = new int[5] {1, 2, 3, 4, 5};`{.java}
c) `int[] arr = new int[] {1, 2, 3, 4, 5};`{.java}
d) `int[] arr = new int[5] = {1, 2, 3, 4, 5};`{.java}
e) `int[] arr = new int[5]; arr = {1, 2, 3, 4, 5};`{.java}

_cevap_: a, c

---

6. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args){
		int[] arr = new int[10];
		arr[4] = 5;
		int[] arr2 = arr;
		arr2[4] = 3;
		System.out.println(arr[4]);
	}
}
```

a) 0
b) 3
c) 5
d) Null
e) hata

_cevap_: b

---

7. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args){
		int[] arr = new int[10];
		System.out.println(arr.length);
	}
}
```

a) 0
b) 1
c) 10
d) Null
e) hata

_cevap_: c

---

8. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args){
		int[] arr = new int[10];
		arr.length = 5;
		System.out.println(arr.length);
	}
}
```

a) 5
b) 10
c) Null
d) derleme hatası
e) çalışma zamanı hatası

_cevap_: d

---

9. Aşağıdaki kodun çıktısı nedir?

```java
public class punchcard {
	public static void main(String[] args){
		int[] arr = new int[] {0, 1, 2, 3, 4};
		System.out.println(arr.length);
	}
}
```

a) 1
b) 4
c) 5
d) 6
e) hata

_cevap_: c

---

10. Aşağıdaki program bir dizinin elemanlarını yazdırır. Boşluğa ne yazmalı?

```java
public class punchcard {
	public static void main(String[] args){
		int[] arr = new int[] {1, 2, 3, 4, 5};
		for(int i = 0; i < ____________; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
```

a) len(arr)
b) arr.length
c) arr.length()
d) arr.length(i)
e) length.arr

_cevap_: b

---

11. Aşağıdaki fonksiyon, bir dizinin tüm elemanlarının toplamını yazdırmak amacıyla tasarlanmıştır. Boşluklara ne yazmalı? (İki boşluk)

**sum --> length**

```java

```java
public class punchcard

 {
	public static void main(String[] args){
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i = 0; i < ____________; i++){
			sum += arr[i];
		}
		System.out.println(___);
	}
}
```

a) `sum`{.java}
b) `i`{.java}
c) `length`{.java}
d) `arr`{.java}
e) `arr.length`{.java}

_cevap_: e

---

12. Aşağıdaki fonksiyon, bir tam sayı dizisinin elemanlarını tersine çevirmeyi amaçlamaktadır. Soru işaretleriyle ne değiştirilmelidir?

```java
public class punchcard {
	public static void reverse(int[] arr) {
		int temp;
		int len = arr.length;
		for(int i=0; i< len/2 ; i++) {
			temp = arr[i];
			arr[i] = _______________________;
			_______________________ = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```

a) `arr[arr.length - i - 1]`{.java}
b) `arr[len - 1 - i]`{.java}
c) `tmp`{.java} AND `arr[i]`{.java}
d) `arr[len/2]`{.java}
e) `arr[len - i] - 1`{.java}

_cevap_: a, b

---

13. Aşağıdaki kod bloğu kabarcık sıralama algoritmasını uygular. Sıralı diziyi doğru bir şekilde yazdırmak için doğru yol nedir?
Boşluğu doldurun.

```java
public class punchcard {
	public static void bubbleSort(int[] arr) {
		int temp;
		for(int j=0; j<arr.length-2; j++)
			for(int i=0; i<arr.length-1-j; i++)
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
	}
	public static void main(String[] args) {
		int[] arr = {5, 1, 4, 2, 8};
		bubbleSort(arr);
		_________________________________________________________
	}
}
```

a) `for(int i=0; i<arr.length; i++) System.out.print(arr[i]);`{.java}
b) `System.out.print(arr);`{.java}
c) `System.out.print(arr[]);`{.java}
d) `System.out.print(arr[i]);`{.java}
e) `for(int i=0; i<arr.length; i++) System.out.print(i);`{.java}

_cevap_: a
