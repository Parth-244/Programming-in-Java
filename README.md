# Smart Library Management System

## Project Description

Smart Library Management System is a simple Java based console application developed to manage basic library activities. The system allows the user to add and view books and students, issue and return books, search for books and view borrowing history.

The project was created as an individual Java programming project to apply Object Oriented Programming concepts in a practical way.

## Features

1. Add new books
2. View all books
3. Search for a book using Book ID
4. Add students
5. View registered students
6. Issue books to students
7. Return books
8. Calculate late return fines automatically
9. View book borrowing history
10. Validate user input
11. Handle common errors
12. Check book availability

## Technologies Used

Java

Object Oriented Programming

ArrayList

Scanner

LocalDate

Visual Studio Code

Git and GitHub

## Project Structure

```text
LibraryManagementSystem/
│
├── Main.java
├── Library.java
├── Book.java
├── Student.java
├── BorrowRecord.java
├── README.md
└── statement.md
```

## Java Classes

### Main.java

This is the starting point of the application. It contains the main menu and takes input from the user.

### Library.java

This class handles the main library operations such as adding books and students, issuing books, returning books, searching for books and viewing borrowing history.

### Book.java

This class stores information about a book such as Book ID, book name, author and availability status.

### Student.java

This class stores student information such as Student ID and student name.

### BorrowRecord.java

This class stores information about a book issue such as Book ID, Student ID, issue date and return date.

## Requirements

Java JDK must be installed on the computer.

A Java compatible code editor such as Visual Studio Code can be used to open and run the project.

A terminal such as Command Prompt or PowerShell is required to compile and run the program.

## How to Run

Open the project folder in Visual Studio Code.

Open the terminal inside the project folder.

Compile the Java files using:

```bash
javac *.java
```

After successful compilation run the program using:

```bash
java Main
```

## How to Use

When the program starts the following menu is displayed:

```text
===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. View Books
3. Add Student
4. View Students
5. Issue Book
6. Return Book
7. Search Book
8. View Book History
9. Exit
```

The application can be demonstrated in the following order.

First select Add Book and enter the required book details.

Then select Add Student and enter the student details.

Select Issue Book and enter the Book ID and Student ID.

The book status changes from Available to Issued.

Select Search Book to check the current status of the book.

Select View Book History to see the borrowing information.

Select Return Book to return the book.

The system calculates the number of days the book was kept and calculates the fine if the book was returned after the allowed period.

View Book History again to check the updated borrowing record.

Select Exit to close the application.

## Fine Calculation

A book can be kept for 14 days without a fine.

If the book is returned after 14 days the fine is calculated at ₹10 for each late day.

```text
Fine = Late Days × ₹10
```

## Validation and Error Handling

The application checks for common user errors.

Duplicate Book IDs are not allowed.

Duplicate Student IDs are not allowed.

Book and student details cannot be empty.

The program checks whether a book exists before issuing or returning it.

The program checks whether a student exists before issuing a book.

A book that is already issued cannot be issued again.

A book that is not currently issued cannot be returned.

Invalid menu input is also handled.

## Data Storage

The application currently uses in memory storage with Java ArrayList.

The books, students and borrowing records are available while the program is running. The data is reset when the application is restarted.

## Java Concepts Used

The project demonstrates the following Java concepts:

Classes and Objects

Constructors

Methods

Conditional statements

Loops

ArrayList

Scanner

Input validation

Date and time handling using LocalDate

Object Oriented Programming

Modular program structure

## Future Improvements

The project can be improved in the future by adding permanent data storage, a login system, book categories, student borrowing limits and a graphical user interface.

## Project Type

Individual Academic Project for Vityarthi.

## Author

Developed as an individual project for the Programming in Java course.
