% Quiz 2: Metotlar

# Soru 1: Pass-by-Value Metodu

Aşağıdaki Java kodunu düşünün:

```java
public class PunchCard {
    public static void modifyValue(int x) {
        x = x * 2;
    }
    public static void main(String[] args) {
        int num = 5;
        modifyValue(num);
        System.out.println(num);
    }
}
```

`modifyValue` metodu çağrıldıktan sonra `num` değişkeninin değeri ne olacaktır?

a) Null
b) 0
c) 5
d) 10
e) Kod derleme hatası verecektir.

_cevap_: c

---

# Soru 6: Stringlerle Metot Aşırı Yükleme

Aşağıdaki Java kodunu düşünün:

```java
public class StringOverloadExample {
    public static void displayMessage(String message) {
        System.out.println("Message: " + message);
    }
    public static void displayMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }
    public static void main(String[] args) {
        displayMessage("Hello");
        displayMessage("Java", 3);
    }
}
```

İkinci metodu, mesajı birden fazla kez yazdıran şekilde çağırabilmek için boşluğu doldurun.

a) `displayMessage("Java", 3);`{.java}
b) `displayMessage("Java");`{.java}
c) `displayMessage.second("Java");`{.java}
d) `displayMessage(String "Java",int 3);`{.java}
e) İkinci metodu çağırmak mümkün değildir. Java, aynı isme sahip birden çok metodu desteklemez.

_cevap_: a
