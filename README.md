## 📌 Project Overview
The **Geometric Shape Area Calculator** is a Java-based application designed to demonstrate the core tenets of **Object-Oriented Programming (OOP)**, specifically focusing on **Abstraction** and **Polymorphism**. It provides a modular framework to calculate the area of various geometric shapes using a unified interface.

## 🚀 Features
* **Contract-Based Design:** Uses a `Shape` interface to ensure consistency across all shape implementations.
* **Polymorphic Execution:** Demonstrates runtime polymorphism by using interface references to call shape-specific logic.
* **Encapsulation:** Each shape class (Circle, Square) manages its own attributes and mathematical formulas.
* **Extensibility:** New shapes can be added easily without modifying existing core logic.

## 🛠️ Hardware & Software Requirements
* **Hardware:** Computer with 4GB RAM (minimum).
* **Software:** * Java Development Kit (JDK 8 or higher).
    * IDE (VS Code, Eclipse, or Edit Plus).

## 🧩 How It Works
1.  **Interface Definition:** A `Shape` interface is created with a `calculateArea()` method.
2.  **Implementation:** Classes like `Circle` and `Square` implement this interface.
3.  **Calculation:** Specific mathematical formulas ($\pi r^2$ for circles and $s^2$ for squares) are applied within each class.
4.  **Driver Logic:** The `Main` class creates objects and triggers the area calculation via polymorphism.

## ⚠️ Challenges Faced & Solutions
| Challenge | How I Overcame It |
| :--- | :--- |
| **Understanding Abstraction** | I initially struggled with why we need an interface. I overcame this by realizing that it allows the `Main` class to remain "shape-agnostic," making the code cleaner. |
| **Precision Issues** | Using hardcoded values for Pi resulted in inaccurate areas. I switched to using `Math.PI` for professional-grade precision. |
| **Polymorphic Referencing** | Setting up a `Shape` type to hold a `Circle` object was confusing. I practiced creating references to understand how the JVM chooses the method at runtime. |

## 🎓 What I Learned
* **Clean Design Principles:** I learned the "Open-Closed Principle"—keeping code open for extension but closed for modification.
* **Interface Implementation:** Mastering the `implements` keyword and method overriding.
* **Modular Thinking:** Breaking down a problem into separate classes rather than writing one long script.
* **Problem Solving:** Translating mathematical formulas into executable code attributes.

## 🔮 Future Enhancements
* Adding a Graphical User Interface (GUI) using JavaFX.
* Integrating a database to store and search calculation history.
* Expanding the library to include 3D shapes like Spheres and Cubes.

---
Developed as a part of an OOP Design & Implementation Project.
