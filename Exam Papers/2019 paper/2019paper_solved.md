# 2019 paper solved

## 1

### **i. a)**

The code will result into compilation error, as break statements can only be used within loops or switch statements in java.

Output
```
error: break outside switch or loop
            break;
            ^
```

### **b)**

The output of the given code will be the result of the arithmetic addition of the ASCII values of the characters 'j', 'a', 'v', and 'a'. In Java, characters are represented as numeric ASCII values.

Here's the breakdown:

'j' has an ASCII value of 106<br/>
'a' has an ASCII value of 97<br/>
'v' has an ASCII value of 118<br/>
'a' has an ASCII value of 97<br/>
So, the expression 'j' + 'a' + 'v' + 'a' is equivalent to 106 + 97 + 118 + 97, which results in 418.

Output
```
418
```

### **ii. a)**

The output of the given code will be "Not Equal."

In Java, when we use the `new` keyword to create a String object, it creates a new object in the heap memory, even if the content of the strings is the same. The `==` operator checks if the two references point to the exact same object in memory.

In this case, `s1` and `s2` refer to two different String objects with similar content, but they are distinct objects. Therefore, the condition `s1 == s2` evaluates to `false`, and the "Not Equal" message will be printed. To compare the content of the strings, we should use the `equals` method:

```java
if (s1.equals(s2))
    System.out.println("Equal");
else
    System.out.println("Not Equal");
```

This will compare the content of the strings and print "Equal" if they have the same content.

### **b)**

The given code will simply terminate without any visible output, as the code inside the class is commented out.

### **iii.***

Differences between `final`, `finally`, and `finalize` in Java:

1. **`final`**

   - `final` is a keyword in Java that can be applied to variables, methods, and classes.
   - When applied to a variable, it means the variable's value cannot be changed (it becomes a constant).
   - When applied to a method, it means the method cannot be overridden by subclasses.
   - When applied to a class, it means the class cannot be extended (no subclass can be created).

   Example
   ```java
   public class Example {
       final int x = 10;

       final void display() {
           System.out.println("This is a final method.");
       }
   }
   ```

2. **`finally`**

   - `finally` is a block used in exception handling to ensure that a block of code is always executed, whether an exception is thrown or not.
   - It is typically used in conjunction with `try` and `catch` blocks.
   - Code within the `finally` block will execute regardless of whether an exception occurred in the `try` block or not.

   Example
   ```java
   public class FinallyExample {
       public static void main(String[] args) {
           try {
               // Some code that may throw an exception
               int result = 10 / 0;
           } catch (ArithmeticException e) {
               System.out.println("Caught an exception!");
           } finally {
               System.out.println("This will always be executed.");
           }
       }
   }
   ```
   Output
   ```
   Caught an exception!
   This will always be executed.
   ```

3. **`finalize`**

   - `finalize` is a method in the `Object` class in Java.
   - It is called by the garbage collector before reclaiming the memory occupied by the object.
   - It can be overridden in a class to provide specific cleanup or resource release operations before an object is garbage collected.
   - However, it's generally not recommended to rely on `finalize` for resource cleanup, and other mechanisms like `try-with-resources` or `AutoCloseable` interfaces are preferred.

   Example
   ```java
   public class FinalizeExample {
       public static void main(String[] args) {
           MyClass obj = new MyClass();
           obj = null; // Making the object eligible for garbage collection
           System.gc(); // Suggesting garbage collector to run
       }
   }

   class MyClass {
       @Override
       protected void finalize() throws Throwable {
           System.out.println("Finalize method called.");
       }
   }
   ```
   Output
   ```
   Finalize method called.
   ```

Usage of `finalize` is not recommended for regular resource cleanup, and it's better to use other mechanisms like `try-with-resources` for handling resources in a more predictable and timely manner.

### **iv.**

In Java, a non-static nested class, also known as an inner class, is a class defined within another class. Unlike static nested classes, non-static nested classes have access to the instance variables and methods of the outer class. They are often used when a class is closely related to another class and should not be used outside of that class.

Here's an example of a non-static nested class:

```java
public class OuterClass {
    private int outerVariable;

    // Non-static nested class (inner class)
    public class InnerClass {
        public void display() {
            System.out.println("InnerClass: " + outerVariable);
        }
    }
}
```

In this example, `InnerClass` is a non-static nested class because it is not declared as `static`. It can access the `outerVariable` of the `OuterClass`.

An anonymous inner class in Java is a special type of local inner class that is defined and instantiated at the same time. Anonymous inner classes are often used when we need to implement an interface or extend a class for a short period and do not want to explicitly create a separate class for it.

Here's an example of an anonymous inner class:

```java
public interface Greeting {
    void greet();
}

public class GreetingExample {
    public static void main(String[] args) {
        // Anonymous inner class implementing the Greeting interface
        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };

        anonymousGreeting.greet();
    }
}
```

In this example, an anonymous inner class is created to implement the `Greeting` interface. The class is instantiated and its `greet` method is implemented simultaneously. This is a concise way to create a one-time-use class without explicitly defining a separate class.

### **v.**

In Java, if we want to create a new thread by extending the `Thread` class and overriding the `start()` method, we should ensure that we call the `start()` method of the parent class (`Thread` class) within our overridden `start()` method. Here's an example:

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        // custom thread logic goes here
        System.out.println("Thread is running");
    }

    @Override
    public synchronized void start() {
        System.out.println("Thread is starting");
        super.start(); // This calls the start() method of the Thread class
    }

    public static void main(String[] args) {
        // Create an instance of wer custom thread class
        MyThread myThread = new MyThread();

        // Start the thread using the start() method we've overridden
        myThread.start();
    }
}
```

In this example, the `start()` method of `MyThread` calls the `start()` method of the parent class using `super.start()`. This ensures that the thread is properly set up, and the `run()` method is executed in a new thread when we call `start()`.

### **vi.**

In Java, if an exception occurs in the try block, the statements after the point of the exception are not executed. In other words, if an exception occurs in statement2, statement3 will not be executed.

Here's a brief explanation:

- The code in the try block is executed sequentially.
- If an exception occurs during the execution of any statement in the try block, the control immediately transfers to the appropriate catch block.
- Once the control has transferred to the catch block, the remaining statements in the try block are skipped, and the program does not return to execute them.

### **vii.**

Yes, we can oveload the `run()` method used in multithreading. Here is an example :

```java
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This is the run method without parameters.");
    }

    public void run(int value) {
        System.out.println("This is the run method with a parameter: " + value);
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        // Calling the run() method without parameters
        myRunnable.run();

        // Calling the run() method with a parameter
        myRunnable.run(42);
    }
}
```
Output
```
This is the run method without parameters.
This is the run method with a parameter: 42
```

In this example, the `MyRunnable` class overloads the `run()` method with two versions — one without parameters and one with an **int** parameter.

When it comes to multithreading, if we call the `run()` method directly (instead of using `start()` to create a new thread), it will execute in the current thread, just like any other method call

### **for 2 marks**

1. **Overloading `run()` method:**
   - Yes, we can overload the `run()` method in multithreading by defining multiple methods with the same name but different parameter lists within the same class.

2. **Calling `run()` method directly:**
   - If we call the `run()` method directly, it behaves like a regular method call and does not create a new thread. The method will be executed in the context of the current thread.

### **ix.**

In Java, an event source object is an instance of a class that triggers events, typically by interacting with it, such as clicking a button. An event object, on the other hand, is an instance of a class that encapsulates information about a specific event. The relationship between an event source object and an event object is established through event listeners, where the source triggers an event, and the listener processes it using the associated event object.

### **x.**

In Java, we can create a server socket using the `ServerSocket` class from the `java.net` package. Here's a simple example:

```java
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        int portNumber = 12345; // Choose a port number

        try {
            // Create a ServerSocket on the specified port
            ServerSocket serverSocket = new ServerSocket(portNumber);

            System.out.println("Server is listening on port " + portNumber);

            while (true) {
                // Accept client connections
                Socket clientSocket = serverSocket.accept();

                // Handle the client connection (in a new thread, if desired)
                // Example: new Thread(new ClientHandler(clientSocket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Explanation:

1. **Creating a Server Socket:**
   - The `ServerSocket` class is used to create a server socket. We provide it with a port number to listen on. In the example, `ServerSocket serverSocket = new ServerSocket(portNumber);` creates a server socket that listens on the specified port.

2. **Port Numbers:**
   - Port numbers range from 0 to 65535. Ports from 0 to 1023 are well-known ports and are reserved for system services. Ports from 1024 to 49151 are registered ports, and ports from 49152 to 65535 are dynamic or private ports. When choosing a port for your application, it's common to use a number in the dynamic or private range.

3. **Port Already in Use:**
   - If the requested port number is already in use by another process, attempting to create a `ServerSocket` on that port will throw a `java.net.BindException`. In this case, we would need to choose a different port for our server.

4. **Multiple Clients:**
   - Yes, a single server socket can accept connections from multiple clients. The `accept()` method of `ServerSocket` returns a new `Socket` object for each incoming client connection. We can then handle each client connection in a separate thread or in an asynchronous manner.

```java
while (true) {
    // Accept client connections
    Socket clientSocket = serverSocket.accept();

    // Handle each client connection in a new thread
    new Thread(new ClientHandler(clientSocket)).start();
}
```

In the example, `ClientHandler` is a class that implements the logic for handling a specific client connection. Each client connection gets its own thread for concurrent processing.

### **for 2 marks**

1. **Creating a Server Socket:**
   - To create a server socket in Java, use the `ServerSocket` class from the `java.net` package. Instantiate it with a specified port number, e.g., `ServerSocket serverSocket = new ServerSocket(portNumber);`.

2. **Port Numbers:**
   - Port numbers in Java range from 0 to 65535. Commonly, dynamic or private ports (49152 to 65535) are used for applications. Well-known ports (0 to 1023) are reserved for system services, and ports from 1024 to 49151 are registered ports.

3. **Port Already in Use:**
   - If a requested port number is already in use, attempting to create a server socket on that port will result in a `java.net.BindException`. To resolve this, choose a different port for your server.

4. **Multiple Clients:**
   - Yes, a single server socket can connect to multiple clients. The `accept()` method of `ServerSocket` returns a new `Socket` for each incoming connection. Each client connection can be handled in a separate thread or asynchronously for concurrent processing.

<br/>

## **2.**

### **i.**

**Inheritance** is a fundamental concept in object-oriented programming (OOP) that allows a class (subclass or derived class) to inherit properties and behaviors (fields and methods) from another class (superclass or base class). This promotes code reusability and establishes a relationship between classes, forming an "is-a" relationship.

There are several types of inheritance:

1. **Single Inheritance:**
   - In single inheritance, a class inherits from only one superclass. Java supports single inheritance for classes but allows multiple inheritance for interfaces.

   ```java
   // Example of Single Inheritance in Java
   class Animal {
       void eat() {
           System.out.println("Eating...");
       }
   }

   class Dog extends Animal {
       void bark() {
           System.out.println("Barking...");
       }
   }
   ```

2. **Multiple Inheritance (through Interfaces):**
   - While Java does not support multiple inheritance for classes, it allows a class to implement multiple interfaces. This achieves a form of multiple inheritance by inheriting method signatures from multiple sources.

   ```java
   // Example of Multiple Inheritance through Interfaces in Java
   interface Walks {
       void walk();
   }

   interface Swims {
       void swim();
   }

   class Amphibian implements Walks, Swims {
       public void walk() {
           System.out.println("Walking on land...");
       }

       public void swim() {
           System.out.println("Swimming in water...");
       }
   }
   ```

3. **Multilevel Inheritance:**
   - In multilevel inheritance, a class extends another class, and then another class extends the second class. This forms a chain of inheritance.

   ```java
   // Example of Multilevel Inheritance in Java
   class Vehicle {
       void start() {
           System.out.println("Vehicle started...");
       }
   }

   class Car extends Vehicle {
       void drive() {
           System.out.println("Car is being driven...");
       }
   }

   class SportsCar extends Car {
       void boost() {
           System.out.println("Sports car boosting...");
       }
   }
   ```

4. **Hierarchical Inheritance:**
   - In hierarchical inheritance, multiple classes inherit from a common superclass. Each subclass shares the properties and behaviors of the common superclass.

   ```java
   // Example of Hierarchical Inheritance in Java
   class Shape {
       void draw() {
           System.out.println("Drawing a shape...");
       }
   }

   class Circle extends Shape {
       void drawCircle() {
           System.out.println("Drawing a circle...");
       }
   }

   class Rectangle extends Shape {
       void drawRectangle() {
           System.out.println("Drawing a rectangle...");
       }
   }
   ```

5. **Hybrid Inheritance:**
   - Hybrid inheritance is a combination of two or more types of inheritance. It can include any combination of single, multiple, multilevel, or hierarchical inheritance.

   ```java
   // Example of Hybrid Inheritance in Java
   class A {
       void methodA() {
           System.out.println("Method A");
       }
   }

   interface B {
       void methodB();
   }

   class C extends A implements B {
       void methodC() {
           System.out.println("Method C");
       }

       @Override
       public void methodB() {
           System.out.println("Method B");
       }
   }
   ```

These examples illustrate different types of inheritance in Java, demonstrating how classes and interfaces can be structured to promote code reuse and abstraction.


### **ii.**

