Absolutely! Here's the updated `README.md` with the **Factory Design Pattern** included in the architecture and design sections:

---

# 🍕 Customizable Pizza Ordering System

A Java-based, extensible pizza ordering system using **Decorator**, **Strategy**, and **Factory** design patterns. This system supports customizable crust types, multiple vegetarian and non-vegetarian toppings, and dynamic pricing based on pizza size.

---

## 🧱 Architecture Overview

This system is modular, scalable, and adheres to SOLID principles:

* **Base Pizza Types**: Crust variants like `ThickCrust`.
* **Toppings**: Add-ons like `Mushrooms`, `Cheese`, `Chicken`, etc., implemented using the **Decorator Pattern**.
* **Pricing**: Calculated dynamically using **Strategy Pattern**.
* **Size-Based Strategy Creation**: Handled via the **Factory Pattern**.
* **Validation**: Custom exception `InvalidPizzaSizeException` ensures only valid pizza sizes are processed.

---

## 📦 Package Structure

```
model/
├── pizza/
│   ├── Pizza.java                         # Abstract base class for all pizzas and toppings
│   ├── PizzaSize.java                     # Enum for SMALL, MEDIUM, LARGE sizes
│   ├── price/
│   │   ├── PriceStrategy.java             # Strategy interface for pricing
│   │   ├── impl/
│   │   │   ├── SmallPriceStrategy.java    # Pricing logic for small pizzas
│   │   │   ├── MediumPriceStrategy.java   # Pricing logic for medium pizzas
│   │   │   ├── LargePriceStrategy.java    # Pricing logic for large pizzas
│   │   └── PriceStrategyFactory.java      # Factory for creating strategy objects based on size
│   ├── impl/
│   │   ├── ThickCrust.java                # Concrete pizza base with thick crust
│   │   └── toppings/
│   │       ├── veg/
│   │       │   ├── Mushrooms.java         # Veg topping
│   │       │   ├── Cheese.java            # Veg topping
│   │       │   └── Jalapenos.java         # Veg topping
│   │       └── nonveg/
│   │           ├── Chicken.java           # Non-veg topping
│   │           ├── Pepperoni.java         # Non-veg topping
│   │           └── Bacon.java             # Non-veg topping
├── exception/
│   └── InvalidPizzaSizeException.java     # Custom exception for invalid pizza sizes
```

---

## 🧩 Design Patterns Used

### ✅ Decorator Pattern

Used to dynamically add toppings to a pizza while preserving the base interface. Each topping wraps the previous pizza object.

```java
Pizza pizza = new Mushrooms(new Cheese(new ThickCrust(...)));
```

### ✅ Strategy Pattern

Allows dynamic pricing behavior based on the pizza size by encapsulating price logic inside individual strategy classes.

```java
PriceStrategy strategy = new MediumPriceStrategy();
```

### ✅ Factory Pattern

Encapsulates object creation logic for selecting the appropriate price strategy based on the given pizza size.

```java
PriceStrategy strategy = PriceStrategyFactory.getStrategy(PizzaSize.SMALL);
```

This simplifies object creation and adheres to the **Open/Closed Principle**, making it easy to add more size strategies without modifying existing code.

---

## 🚀 How It Works

1. **Create Base Pizza**

   ```java
   Pizza pizza = new ThickCrust(PriceStrategyFactory.getStrategy(PizzaSize.LARGE));
   ```

2. **Add Toppings Dynamically**

   ```java
   pizza = new Cheese(pizza);
   pizza = new Chicken(pizza);
   pizza = new Jalapenos(pizza);
   ```

3. **Get Final Details**

   ```java
   System.out.println("Order: " + pizza.getDescription());
   System.out.println("Total: $" + pizza.getPrice());
   ```

---

## 💰 Pricing Logic

| Topping/Base                | Small (×1.0) | Medium (×1.2) | Large (×1.5) |
| --------------------------- | ------------ | ------------- | ------------ |
| Thick Crust                 | \$10         | \$12          | \$15         |
| Mushrooms                   | \$3          | \$3.6         | \$4.5        |
| Cheese                      | \$4          | \$4.8         | \$6          |
| Jalapenos                   | \$2          | \$2.4         | \$3          |
| Chicken / Bacon / Pepperoni | \$4          | \$4.8         | \$6          |

---

## ❌ Error Handling

Invalid size inputs (e.g., `XL`, `EXTRA_LARGE`) are rejected:

```java
throw new InvalidPizzaSizeException("Invalid Pizza Size: XL");
```

Handled via the `PriceStrategyFactory`.

---

## 🧪 Sample Output

```text
Order: Thick Crust , Mushrooms , Cheese , Chicken
Total: $24.0
```

---

## 📌 How to Extend

* **New Topping**:
  Create a new class extending `Pizza` and override `getPrice()` and `getDescription()`.

* **New Crust**:
  Add a new class like `ThinCrust`, implementing base price logic.

* **New Size/Price Strategy**:
  Implement `PriceStrategy`, add it to the factory.

---

## 🛠️ Requirements

* Java 8+
* No external dependencies

---

## 👨‍💻 Author

Developed by **Vamsi Makke**

---

