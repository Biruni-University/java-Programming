% Arrays

* In java, array is a collection of similar type of elements.
* Array is a fixed size. Once we create an array, we can not change the size of the array.
* The array come in handy when we need to store a list of values, like numbers, or names, etc.

This is how we declare an array in java:

```java
int[] arr;
```

And this is how we initialize an array:

```java
int[] arr = new int[5];
```

We can assign values to the array at the time of initialization:

```java
int[] arr = {1, 2, 3, 4, 5};
```

Or we want to initialize array with different values, we can do it like this:

```java
int[] arr = new int[] {1, 2, 3, 4, 5};
```

To cheange the value of an array, we can simply change the value at the index:

```java
int[] arr = {1, 2, 3, 4, 5};
arr[0] = 10;
```

\pagebreak

1. What is the output of the following code?

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
e) error

_answer_: c

---

2. What is the output of the following code?

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
e) error

_answer_: a

---

3. What is the output of the following code?

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
e) error

_answer_: e

---

4. What is the output of the following code?

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
e) error

_answer_: e - error duo to negative index

---

5. how can i initialize an array of size 5 with values 1, 2, 3, 4, 5? (multiple correct answers)

a) `int[] arr = {1, 2, 3, 4, 5};`{.java}
b) `int[] arr = new int[5] {1, 2, 3, 4, 5};`{.java}
c) `int[] arr = new int[] {1, 2, 3, 4, 5};`{.java}
d) `int[] arr = new int[5] = {1, 2, 3, 4, 5};`{.java}
e) `int[] arr = new int[5]; arr = {1, 2, 3, 4, 5};`{.java}

_answer_: a, c

---

6. What is the output of the following code?

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
e) error

_answer_: b

---

7. What is the output of the following code?

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
e) error

_answer_: c

---

8. What is the output of the following code?

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
d) compile error
e) runtime error

_answer_: d

---

9. What is the output of the following code?

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
e) error

_answer_: c

---


10. the following program prints the elements of an array. what should be in the blank?

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

_answer_: b

---

11. The following function is supposed to print the length of an array.
What should be in the blanks? (two blanks)

```java
public class punchcard {
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

_answer_: e

---

12. The following function is supposed to reverse the elements of an integer array. What should be replaced with question marks?

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

_answer_: a, b

---

13. The following code block implements the bubble sort algorithm. What is the correct way to print the sorted array?
Fill in the blank.

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

_answer_: a
