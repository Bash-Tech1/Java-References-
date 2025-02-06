````markdown
# Object-Oriented Programming: Polymorphism & Method Handling

## 1. Discuss the two facilities required in programming languages for supporting polymorphism.

### **Method Overloading** (**Static Binding / Compile-time Polymorphism**)

- Allows multiple methods with the **same name** but **different parameter lists** (varying in number, type, or order of parameters).
- The method call is **resolved at compile time**.
- **Example:**

```java
class MathOperations {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; } // Overloaded method
}
```
````

### **Method Overriding** (**Dynamic Binding / Runtime Polymorphism**)

- Allows a **subclass** to provide a **new implementation** for a method **already defined** in its **superclass**.
- The method call is **determined at runtime** based on the object type.
- **Example:**

```java
class Parent {
    void show() { System.out.println("Parent"); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("Child"); }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, but Child object
        obj.show(); // Calls Child's overridden method (runtime decision)
    }
}
```

## 2. How does polymorphism contribute to software maintainability?

Polymorphism improves software maintainability by **allowing methods with the same name to perform different behaviors efficiently**. This reduces code duplication and makes it **easier to extend and modify** the program **without affecting existing functionality**.

## 3. Contrast between “method redefinition” and “operation overloading.”

### **Method Overriding**

- A subclass replaces a method inherited from its superclass while keeping the same method signature.
- Used for **runtime polymorphism**.
- **Example:**

```java
class Animal {
    void makeSound() { System.out.println("Animal makes a sound"); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Dog barks"); }
}
```

### **Method Overloading**

- Allows multiple methods with the **same name** but **different parameter lists** in the same class.
- Used for **compile-time polymorphism**.
- **Example:**

```java
class Example {
    void show(int x) { System.out.println("Integer: " + x); }
    void show(String x) { System.out.println("String: " + x); }
}
```

```

```
