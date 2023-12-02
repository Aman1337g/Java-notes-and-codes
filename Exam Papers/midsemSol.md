# Mid Semester Examination September 2023

## **1. A)**

### **i.**

### **Pass by Value**

- In pass by value, the actual value of the variable is passed to the function or method.
- Changes made to the parameter inside the function do not affect the original variable outside the function.
  
Example in Java:

```java
public class PassByValueExample {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("original num: " + num);
        modifyValue(num);
        System.out.println("modified num: " + num);
    }

    static void modifyValue(int value) {
        value = 20;
    }
}
```

Output
```
original num: 10
modified num: 10
```

In this example, the `modifyValue` method receives a copy of the value of `num`. Changes made to `value` inside the method do not affect the original variable `num`.

### **Pass by Reference**

- In pass by reference, the memory address (reference) of the variable is passed to the function or method.
- Changes made to the parameter inside the function affect the original variable outside the function.

Example (Note: Java is pass-by-value, but this example illustrates the concept):

```java
public class PassByReferenceExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Original array: " + Arrays.toString(array));
        modifyArray(array);
        System.out.println("Modified array: " + Arrays.toString(array));
    }

    static void modifyArray(int[] arr) {
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }
}
```

Output
```
Original array: [1, 2, 3]
Modified array: [10, 20, 30]
```

In this example, the `modifyArray` method receives a copy of the reference to the array. Changes made to the elements of the array inside the method affect the original array outside the method.

### **ii.**

Method overloading is a feature in object-oriented programming languages that allows a class to have multiple methods with the same name but different parameters. The compiler or runtime system determines which method to invoke based on the number, types, and order of the method's parameters. This allows developers to define multiple methods with the same name that perform similar tasks but may have different input parameters or return types.

**Ambiguous overloading** occurs when the compiler cannot determine the best method to call because the available methods are too similar. Here's an example in Java:
```java
public class Test {

    // Method with (int, double) parameter
    public static void display(int x, double y) {
        System.out.println("Method with int parameter: " + x);
    }

    // Method with (double, int) parameter
    public static void display(double x, int y) {
        System.out.println("Method with double parameter: " + x);
    }

    public static void main(String[] args) {
        // This will cause a compilation error due to ambiguous overloading
        display(10, 20);
    }
}
```
Output
```
Test.java:15: error: reference to display is ambiguous
        display(10, 20);
        ^
  both method display(int,double) in Test and method display(double,int) in Test match
1 error
```

### **iii.** 

In [heap](https://www.geeksforgeeks.org/what-is-a-memory-heap/) memory, array is created.

### **iv.**

![Reference Pointer Image](/images/reference_pointer.png)

If there are two arrays list1 and list2 of same type and following code is written list2=list1, then a garbage value will be pointing now to the list previously pointed by list2.

### **v.**

Output
```
2 
2 4 
2 4 8 
2 4 8 16 
2 4 8 16 32 
2 4 8 16 32 64 
```

### **B)**

Code
```java
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read ten integers
        int[] numbers = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Invoke the method to eliminate duplicates
        int[] result = eliminateDuplicates(numbers);

        // Display the result
        System.out.println("Array with duplicates eliminated:");
        for (int value : result) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    // Method to eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        int[] uniqueArray = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (list[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArray[count] = list[i];
                count++;
            }
        }

        // Create a new array with the exact size needed
        int[] result = new int[count];
        System.arraycopy(uniqueArray, 0, result, 0, count);

        return result;
    }
}
```
Output
```
Enter ten integers:
1 1 2 3 4 2 7 8 7 8
Array with duplicates eliminated:
1 2 3 4 7 8
```

<br/>

## **2.**

### **A)** 

### Code
```java
import java.util.Scanner;

class Test {

	public static void palindrome(int[] a) {

		System.out.print("Palindrome numbers in the array : ");
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int rev = 0;
			while (temp != 0) {
				int rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (rev == a[i]) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter array of size 10 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		palindrome(arr);
		sc.close();
	}

}
```
Output
```
Enter array of size 10 : 1 2 2222 2304 99 56 65 2772 45 55
Palindrome numbers in the array : 1 2 2222 99 2772 55
```

### **B)**

### Method 1 : Using while loop

Code
```java
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		long n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextLong();
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else
			System.out.println(n + " is not a perfect number.");
		sc.close();
	}
}
```
Output
```
Enter the number: 28
28 is a perfect number.
```
<br/>

### Method 2 : Using Method

Code
```java
import java.util.Scanner;

public class Test {

	public static long isPerfect(long num) {
		long sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}

	public static void main(String args[]) {
		long n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextLong();
		long sum = isPerfect(n);
		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else
			System.out.println(n + " is not a perfect number.");
		sc.close();
	}
}
```
Output
```
Enter the number: 28
28 is a perfect number.
```
<br/>

### Method 3 : Using Recursion

Code
```java
import java.util.Scanner;

public class Test {
	static long sum = 0;

	long isPerfect(long num, int i) {
		if (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
			isPerfect(num, i);
		}
		return sum;
	}

	public static void main(String args[]) {
		long number, s;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = sc.nextLong();
		Test pne = new Test();
		s = pne.isPerfect(number, i);
		if (s == number)
			System.out.println(number + " is a perfect number");
		else
			System.out.println(number + " is not a perfect number");

		sc.close();
	}
}
```
Output
```
Enter the number: 28
28 is a perfect number.
```

### **C)** 

![jdk_jvm_jre.png](/images/jvm_jdk_jre.png)


JDK (Java Development Kit) is used for Java application development and includes the Java Compiler, debugger, and API libraries. JVM (Java Virtual Machine) executes Java bytecode, providing a platform-independent runtime environment. JRE (Java Runtime Environment) is a subset of the JDK, containing the JVM and essential libraries for running Java applications.


### **D)**

An object is an instance of a class in OOP, representing a real-world entity with attributes and methods.

A class is a blueprint in OOP, defining the properties (attributes) and behaviors (methods) that its objects will have.

**Features of OOP**

1. **Encapsulation:** Bundling data and methods into a single unit (class) for information hiding.

2. **Inheritance:** Allows a class to inherit properties and behaviors from another class, promoting code reusability.

3. **Polymorphism:** Enables objects of different classes to be treated as objects of a common base class, supporting multiple forms.

4. **Abstraction:** Simplifies complex systems by modeling classes based on essential properties and behaviors.

5. **Modularity:** Breaks down a program into smaller, manageable parts (modules or classes) for organization and maintenance.

These features collectively enhance code structure, reusability, and maintainability in software development.

<br/>

## **3**

### A)

In Java, variables play a crucial role in storing and manipulating data within a program. They act as named storage locations in the computer's memory, allowing the program to store and retrieve values during its execution. Variables are declared with a specific data type, which defines the kind of data the variable can hold.

Here's a breakdown of the key aspects related to variables in Java:

1. **Declaration and Assignment**

   - **Declaration:** Before using a variable, we need to declare it. This involves specifying the variable's name and its data type. For example:
     ```java
     int myNumber; // Declaration of an integer variable
     double myDouble; // Declaration of a double-precision floating-point variable
     ```

   - **Assignment:** After declaring a variable, we can assign a value to it. This associates a particular piece of data with the variable. For example:
     ```java
     myNumber = 42; // Assignment of the value 42 to the integer variable
     myDouble = 3.14; // Assignment of the value 3.14 to the double variable
     ```

   - **Combined Declaration and Assignment:**
     ```java
     int myNumber = 42; // Combined declaration and assignment
     ```

2. **Data Types**

   - Java supports various data types such as int, double, char, boolean, etc. Each data type has its own range and rules for storing data. For example:
     ```java
     int age = 25;
     double salary = 50000.50;
     char grade = 'A';
     boolean isStudent = true;
     ```

3. **Variable Scope**

   - The scope of a variable defines where in the program it can be accessed. Java has different scopes, including:

     - **Local Scope:** Variables declared within a method or block have local scope and are only accessible within that block.
     ```java
     void myMethod() {
         int localVar = 10; // Local variable
         // localVar is only accessible within this method
     }
     ```

     - **Instance Scope:** Variables declared within a class but outside any method have instance scope and are accessible to all methods of the class.
     ```java
     public class MyClass {
         int instanceVar = 20; // Instance variable
         // instanceVar is accessible to all methods in this class
     }
     ```

     - **Class (Static) Scope:** Variables declared with the `static` keyword have class scope and are shared among all instances of a class.
     ```java
     public class MyClass {
         static int classVar = 30; // Class variable
         // classVar is shared among all instances of MyClass
     }
     ```

   - Proper variable scoping is essential for maintaining code clarity, preventing naming conflicts, and managing the lifetime of variables.

In summary, variables in Java are fundamental for storing and managing data during program execution. The declaration, assignment, data types, and variable scope all contribute to the structure and behavior of a Java program. Understanding these concepts is crucial for writing efficient and maintainable code.

### **B)**

Code
```java
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		sc.close();
	}
}
```
Output
```
javac Sum.java
java Sum 1 2 
1 + 2 = 3
```

### **C)**

Code
```java
public class Rectangle {
	public static void main(String[] args) {

		float LENGTH = 5.0f;
		float WIDTH = 7.0f;
		float area = LENGTH * WIDTH;
		float perimeter = 2 * (LENGTH + WIDTH);

		System.out.println("Area of Rectangle is: " + area + " sq. units.");
		System.out.println("Perimeter of Rectangle is: " + perimeter + " units.");
	}
}
```
Output
```
Area of Rectangle is: 35.0 sq. units.
Perimeter of Rectangle is: 24.0 units.
```

### **D)**

Type conversion, also known as type casting, is the process of converting one data type into another. In Java, there are two types of type conversion: implicit (automatic) and explicit (manual).

1. **Implicit Type Conversion (Widening)**

   - This occurs automatically when a smaller data type is promoted to a larger data type.
   - For example, converting an `int` to a `double` or a `float` to a `double`.

   ```java
   int numInt = 10;
   double numDouble = numInt; // Implicit conversion
   ```

2. **Explicit Type Conversion (Narrowing)**

   - This involves manual conversion and is necessary when a larger data type is assigned to a smaller data type.
   - It may result in data loss as the larger type may not be accurately represented by the smaller type.

   ```java
   double numDouble = 10.5;
   int numInt = (int) numDouble; // Explicit conversion
   ```
Type conversion is essential for handling different data types and ensuring compatibility between them. It allows us to perform operations, assign values, and pass arguments between variables of different types.

Java is considered a strongly typed language because it enforces strict type checking at compile time. Once a variable is declared with a certain data type, it cannot be used as if it were another type without explicit type conversion. This helps in catching type-related errors early in the development process.

**Example: Reading Character Data through Console Input**

To read character data from the console in Java, we can use the `Scanner` class. Here's an example:

```java
import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        System.out.println("You entered: " + inputChar);

        scanner.close();
    }
}
```
Output
```
Enter a character: aman kumar gupta
You entered: a
```