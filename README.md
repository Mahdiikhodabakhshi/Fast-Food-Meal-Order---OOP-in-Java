# 🍔 Fast-Food Meal Order - OOP in Java

## 📌 Overview
This Java project is a **fast-food meal ordering system** that demonstrates key **Object-Oriented Programming (OOP) principles**. Users can create meal orders consisting of **a burger, a drink, and a side item**, with options for adding extra toppings, choosing drink sizes, and printing itemized bills.

## 🎯 Features
- Create a **default meal** (regular burger, small coke, fries).
- Create a **custom meal** with a selected burger, drink, and side item.
- Add **extra toppings** to burgers (up to 3 for regular, up to 5 for deluxe).
- Choose **different drink sizes** (small, medium, large) with varying prices.
- Create a **deluxe meal** with a fixed price, including all toppings at no extra cost.
- Print an **itemized bill** with individual prices and total cost.

## 🏗️ OOP Concepts Used
This project reinforces the following **OOP principles**:

### 1️⃣ **Encapsulation**
- The properties of `Item`, `Burger`, `Drink`, and `SideItem` are **private**.
- Public methods allow controlled access.

### 2️⃣ **Abstraction**
- The `MealOrder` class **hides** implementation details.
- Users interact with high-level methods instead of internal logic.

### 3️⃣ **Inheritance**
- `Burger`, `Drink`, and `SideItem` **inherit** from `Item`.
- `DeluxeBurger` **extends** `Burger` with additional features.

### 4️⃣ **Polymorphism**
- `getAdjustedPrice()` and `printItem()` behave **differently** based on the runtime object type.

