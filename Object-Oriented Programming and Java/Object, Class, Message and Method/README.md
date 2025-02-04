```markdown
# 1. Distinguish the Terms "Object" and "Class"


An **object** is described by its **properties (attributes)** and **methods (behaviors)**.
A **class** is the **blueprint, template, or structure** that defines objects. It acts as a **fingerprint** that determines how objects are created and behave.

---

# 2. Buying Flowers from a Florist: Objects and Messages

### **Objects & Messages Exchanged**

- **Customer** → `browseFlower()`, `selectFlower(flowerType, flowerPrice)`, `placeOrder()`
- **Flower** → `getPrice()`, `getName()`
- **Florist** → `getName()`, `getId()`, `checkAvailability(flowerName, quantity)`, `confirmOrder(orderDetails)`, `processPayment(order, paymentMethod)`
- **FlowerShop** → `getBranch()`, `updateStock(flowerType, amount)`

---

# 3. Rectangle Class: Structure of Three Instances

```java
class Rectangle {
    // Attributes
    double length;
    double width;

    // Methods
    double getLength() { return length; }
    double getWidth()  { return width; }
    void draw() { ... }
}
```

### **First Instance**
```java
Rectangle rect1 = new Rectangle();
rect1.length = 10;
rect1.width = 10;
```

### **Second Instance**
```java
Rectangle rect2 = new Rectangle();
rect2.length = 9;
rect2.width = 13;
```

### **Third Instance**
```java
Rectangle rect3 = new Rectangle();
rect3.length = 41;
rect3.width = 19;
```

---

# 4. Implementing Class and Method Concepts in Non-OOP Languages
### **C (Using Structs & Functions)**
```c
struct Car {
    char type[20];
    char model[20];
    char color[20];
    char plate[10];
    int startingLocation;
};

void start(struct Car* car) { /* start logic */ }
void moveForward(struct Car* car) { /* move forward logic */ }
void moveBackward(struct Car* car) { /* move backward logic */ }
void stop(struct Car* car) { /* stop logic */ }
void off(struct Car* car) { /* off logic */ }
```

### **Pascal (Using Records & Procedures)**
```pascal
type Car = record
    typeCar: string;
    model: string;
    color: string;
    plate: string;
    startingLocation: integer;
end;

procedure Start(var c: Car);
begin
    // Start logic
end;
```

---

# 5. Class Definition for Cars

```java
class Car {
    // Attributes
    int startingLocation = 0;
    String type;
    String model;
    String color;
    String plate;

    // Methods
    void start() {}
    void moveForward() {}
    void moveBackward() {}
    void stop() {}
    void off() {}
}
```

---

# 6. Distinguishing Between a Client and a Server
- **Server:** Processes requests and sends responses.
- **Client:** Sends requests and receives responses.

---

# 7. Client-Server Communication
A client communicates with a server by sending a **request** to the server. The **request** is a call on a **message** of the server.
```

