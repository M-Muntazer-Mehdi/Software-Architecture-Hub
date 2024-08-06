<table align="center">
  <tr>
    <td align="center">
    <img src="https://i.ibb.co/Wz79RST/1-M22-DR3-WPqb-WXWid-YIq2-Gw-A.png" border="0" width="700" height="200">
    </td>
  </tr>
</table>

# Software-Architecture-Hub

This folder contains comprehensive resources, code examples, and notes related to software construction and development. It covers a wide range of topics including software architectural patterns, design patterns, SOLID principles, unit testing, and Java-specific concepts.

## Table of Contents

1. [Software Architectural Patterns](#1-software-architectural-patterns)
   - [MVC (Model-View-Controller)](#mvc-model-view-controller)
2. [Layered Architecture](#2-layered-architecture)
3. [Design Patterns](#3-design-patterns)
   - [Singleton Pattern](#singleton-pattern)
   - [Facade Pattern](#facade-pattern)
   - [Observer Pattern](#observer-pattern)
4. [SOLID Principles](#4-solid-principles)
   - [Dependency Inversion Principle](#dependency-inversion-principle)
   - [Interface Segregation Principle](#interface-segregation-principle)
5. [Unit Testing with JUnit5](#5-unit-testing-with-junit5)
6. [Java-Specific Concepts](#6-java-specific-concepts)
   - [Inheritance](#inheritance)
   - [Polymorphism](#polymorphism)
   - [Interfaces](#interfaces)
   - [Exception Handling](#exception-handling)
   - [Events and Event Handlers](#events-and-event-handlers)
   - [AWT](#awt)
   - [Swing](#swing)
7. [Java Application](#7-java-application)
   - [MyCalculator](#mycalculator)
8. [Prerequisites](#8-prerequisites)
9. [How to Run the Project](#9-how-to-run-the-project)
10. [Contribution Guidelines](#10-contribution-guidelines)


## 1. Software Architectural Patterns

- #### MVC (Model-View-Controller)
    **File:** [MVC Pattern](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/MVC/MvcLogin)
  
    **Description:** The MVC pattern separates an application into three main components: Model, View, and Controller. The Model represents the data and business logic, the View displays the data, and the Controller handles the input and updates the Model.
    
    ##### Detailed Explanation
    - **Model:** Manages the data and business logic of the application. It updates the View whenever the data changes.
    - **View:** Represents the UI components and displays the data. It gets updates from the Model.
    - **Controller:** Acts as an intermediary between Model and View. It processes user input and updates the Model.

<table align="center">
  <tr>
    <td align="center">
    <img src="https://i.ibb.co/0yYfJbb/1.png" border="0" width="200" height="200">
    </td>
  </tr>
</table>

## 2. Layered Architecture

- #### Three-Layer Architecture
    **File:** [Three-Layer](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/ThreeLayerArchitecture)
  
   **Description:** The three-layer architecture separates an application into three distinct layers: Presentation Layer, Business Logic Layer, and Data Access Layer. This separation of concerns helps in managing code complexity, enhancing maintainability, and promoting reusability.
    
    ##### Detailed Explanation
    - **Presentation Layer:** Manages the user interface and user interactions.
    - **Business Logic Layer:** Contains the core functionality and business rules of the application.
    - **Data Access Layer:** Manages data retrieval, storage, and database interactions.

<table align="center">
  <tr>
    <td align="center">
    <img src="https://i.ibb.co/qCZLF9V/7.png" border="0" width="300" height="200">
    </td>
  </tr>
</table>

## 3. Design Patterns

- #### Singleton Pattern
    **File:** [Singleton](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Singleton)
  
   **Description:** The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.
    
    ##### Detailed Explanation
    - **Intent:** To restrict the instantiation of a class to a single object.
    - **When to Use:** When exactly one instance of a class is needed to coordinate actions across the system.


- #### Facade Pattern
    **File:** [Facade](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Fasade)
  
    **Description:** The Facade Pattern provides a simplified interface to a complex subsystem.
    
    ##### Detailed Explanation
    - **Intent:** To provide a unified interface to a set of interfaces in a subsystem. The Facade defines a higher-level interface that makes the subsystem easier to use.
    - **When to Use:** When you need to simplify the interaction with a complex subsystem.

- #### Observer Pattern
    **Description:** The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    
    ##### Detailed Explanation
    - **Intent:** To establish a subscription mechanism to allow multiple objects to listen to and react to events or state changes in another object.
    - **When to Use:** When changes to one object need to be propagated to a list of dependent objects

## 4. SOLID Principles

- #### Dependency Inversion Principle
    **File:** [Dependency-Inversion](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/DependencyInversionPrinciple)
  
    **Description:** The Dependency Inversion Principle states that high-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces or abstract classes). This principle promotes decoupling, flexibility, and easier maintenance in software systems.
    
    ##### Files Explained:
    - **Book.java:** `Book` is a concrete implementation of the Product interface. It provides methods to see reviews and read a sample of the book.
    - **DVD.java:** `DVD` is another concrete implementation of the Product interface. It provides methods to see reviews and watch a sample of the DVD.
    - **Product.java:** : `Product` is the abstraction (interface) that defines the contract for all products (`Book`, `DVD`). It declares methods to see reviews and get a sample, ensuring that all concrete products adhere to these behaviors.
    - **Shelf.java:** `Shelf` represents a higher-level module that interacts with products (`Book`, `DVD`) through the Product interface. It has methods to add a product to the shelf (`addBook`) and customize the shelf (`customizeShelf`). It does not depend on specific implementations (`Book`, `DVD`) but rather on the Product interface, adhering to the Dependency Inversion Principle.

- #### Interface Segregation Principle'
    **File:** [Interface Segregation](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/InterfaceSegregationPrinciple)
  
    **Description:** The Interface Segregation Principle states that clients should not be forced to depend on interfaces they do not use. Let's explain this principle using the provided files:
    
    ##### Files Explained:
    - **Bank.java:** `Bank` interface extends Payment and specifies methods related to banking operations (`Withdraw`, `balance`). It adheres to ISP by defining methods relevant to banking, which is the specific functionality of a bank.
    - **BankAccount.java:** `BankAccount` implements Bank interface, providing implementations for banking operations (`Withdraw`, `balance`) and the general payment method Accountinfo. It adheres to ISP by only implementing methods relevant to banking operations and general payment information.
    Application of ISP:
    - **Payment.java:** `Payment` interface defines a method Accountinfo. It does not include methods related to banking operations (`Withdraw`, `balance`) or loan operations (`loan`, `loanSettlement`). This adheres to ISP by focusing only on methods relevant to general payment information.
    - **Loan.java:** `Loan` interface extends Payment and specifies methods related to loan operations (`loan`, `loanSettlement`). It adheres to ISP by defining methods relevant to loans, which is the specific functionality of a loan.
    - **LoanAccount.java:** `LoanAccount` implements Loan interface, providing implementations for loan-related methods (`loan`, `loanSettlement`) and the general payment method Accountinfo. It adheres to ISP by only implementing methods relevant to loans and general payment information.

## 5. Unit Testing with JUnit5
  **Description:** JUnit5 is a widely used framework for writing and executing unit tests in Java applications. It provides a robust and flexible environment for ensuring the reliability and correctness of your code through automated testing.

<table align="center">
  <tr>
    <td align="center">
      <img src="https://i.ibb.co/PDSLrPz/2.png" border="0" width="300" height="200">
    </td>
  </tr>
</table>



## 6. Java-Specific Concepts

- #### Inheritance
    **File:** [Inheritance](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Inheritance)
  
    **Description:** Inheritance is a fundamental concept in object-oriented programming (OOP) where a class (subclass or derived class) inherits attributes and behaviors (methods and fields) from another class (superclass or base class). Java supports several types of inheritance, each serving different purposes:
    
    ##### Files Explained:
    - **Single Inheritance** Single inheritance occurs when a subclass extends only one superclass. In Java, a class can extend another class using the extends keyword.
    - **Hierarchical Inheritance** Hierarchical inheritance involves multiple subclasses extending the same superclass. Each subclass inherits attributes and behaviors from the common superclass.
    - **Multilevel Inheritance** Multilevel inheritance occurs when one subclass extends another subclass, forming a chain of inheritance.

- #### Polymorphism
    **File:** [Polymorphism](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Polymorphism)
  
    **Description:** Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. There are two main types of polymorphism in Java: static (compile-time) polymorphism and dynamic (runtime) polymorphism.
    
    ##### Files Explained:
    - **Static Polymorphism:** Static polymorphism is achieved through method overloading and method overriding at compile time.
    - **Dynamic Polymorphism:** Dynamic polymorphism is achieved through method overriding and object references at runtime.

- #### Interfaces
    **File:** [Interface](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Interfaces)
  
    **Description:** In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It represents a contract for classes that implement it, specifying what methods a class must implement without defining how they are implemented.
    
    ##### Files Explained:
    - **Interface Default Method** A default method in an interface is declared with the default keyword and provides a method body.
    - **Interface Hybrid Inheritance** An interface can extend multiple other interfaces using the extends keyword.
    - **Interface Polymorphism** It allows objects of different classes to be treated as objects of a common interface type, enabling flexibility in method invocation and code reuse.

- #### Exception Handling
    **File:** [Exception-Handling](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/ExceptionHandling)
  
    **Description:** Exception handling in Java allows developers to manage runtime errors and abnormal conditions that may occur during program execution. It helps ensure that programs gracefully handle unexpected situations, preventing crashes and enabling robust error recovery strategies.

- #### Events and Event Handlers
    **File:** [Event-Handling](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/EventHandling)
  
    **Description:** Event-driven programming in Java allows developers to respond to user actions, system events, and other occurrences asynchronously. It revolves around the concept of events, which are generated by various sources such as user interactions (like button clicks), system notifications, or timers.

- #### AWT
    **File:** [AWT](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/AWT)
  
    **Description:** AWT (Abstract Window Toolkit) is a set of classes and APIs in Java that provides the foundation for building graphical user interfaces (GUIs) for Java applications. It is part of the Java Foundation Classes (JFC) and was the original GUI toolkit for Java before Swing was introduced.

- #### Swing
    **File:** [Swing](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Swing)
  
    **Description:** Swing is a set of GUI (Graphical User Interface) components for Java applications that provides a rich set of easy-to-use and customizable graphical components. It is part of the Java Foundation Classes (JFC) and was developed to replace the earlier Abstract Window Toolkit (AWT) for building graphical user interfaces in Java. 

## 7. Java Application
- #### MyCalculator
    **File:** [Calculator](https://github.com/M-Muntazer-Mehdi/Software-Architecture-Hub/tree/main/Concept%20File/src/Testing)
    
    **Description** MyCalculator is a simple calculator application developed in Java using the Swing GUI toolkit. It provides basic arithmetic operations and memory functions.
    
    ##### Features
    - **Arithmetic Operations:** Supports addition, subtraction, multiplication, division, percentage, square root, and reciprocal operations.
    - **Memory Functions:** Includes memory clear (MC), memory recall (MR), memory store (MS), and memory add (M+) functionalities.
    - **Special Functions:** Backspace (Backspc), Clear (C), and Clear Entry (CE) for resetting calculations and handling input.
    - **GUI Interface:** Utilizes Java Swing components for creating a graphical user interface with buttons and display labels.

<table align="center">
  <tr>
    <td align="center">
      <img src="https://i.ibb.co/XpkGV0Y/3.png" border="0" width="300" height="300">
    </td>
  </tr>
</table>

## 8. Prerequisites

- Java Development Kit (JDK)
- Eclipse IDE

## 9. How to Run the Project

1. **Clone the Repository**
   `git clone <repository_url>`

2. **Open Eclipse and Import Project**
   - Open Eclipse.
   - Go to `File` > `Open Project From File System`.
   - Select `Existing Projects into Workspace` under `General`.
   - Browse to the project directory and import.

3. **Run the Application**
   - In Eclipse, navigate to `src/presentationlayer`.
   - Right-click on the `Welcome` file and select `Run As` > `Java Application`.

4. **Use the Application**
   - After importing the CSV files, you can start using the dictionary application.
   - View, search, add, and update dictionary entries as needed.


## 10. Contribution Guidelines

- Fork the repository.
- Create a new branch (`git checkout -b feature-branch`).
- Make your changes.
- Commit your changes (`git commit -am 'Add new feature'`).
- Push to the branch (`git push origin feature-branch`).
- Create a new Pull Request.

