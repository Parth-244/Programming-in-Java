# Smart Library Management System

## Problem Statement

Managing books and student borrowing manually can become difficult when the number of books and students increases. It can be challenging to keep track of available books, issued books, return dates and borrowing records.

The Smart Library Management System provides a simple Java based solution for managing these basic library activities. The system allows users to add books and students, issue and return books, search for books and view borrowing history. It also calculates late return fines automatically.

## Scope of the Project

The project focuses on the basic operations of a library management system.

The system includes:

1. Adding and viewing books
2. Searching for books using Book ID
3. Adding and viewing students
4. Issuing books to registered students
5. Returning issued books
6. Calculating late return fines
7. Maintaining borrowing history
8. Checking book availability
9. Validating user input and handling common errors

The project is implemented as a console based Java application. It uses in memory storage through Java ArrayList. The data is available only while the program is running and is reset when the application is restarted.

## Target Users

The main target users of this project are:

1. **Library Staff**
   The system can help library staff manage books, students, book issues and returns.

2. **Students**
   Students can be registered in the system and their book borrowing information can be maintained.

3. **Academic Users**
   The project can be used as an example of applying Java and Object Oriented Programming concepts to a practical problem.

## High Level Features

### Book Management

The system allows users to add new books, view all books and search for a book using its Book ID. It also shows whether a book is currently available or issued.

### Student Management

The system allows users to add students and view registered student information. Duplicate Student IDs are not allowed.

### Book Issue

The system allows a registered student to issue an available book. It checks whether the book and student exist before completing the issue.

### Book Return

The system allows an issued book to be returned. It records the return date and calculates the number of days the book was kept.

### Automatic Fine Calculation

A book can be kept for 14 days without a fine. If it is returned after 14 days, the system calculates a fine of ₹10 for each late day.

### Book History

The system maintains borrowing records containing the Book ID, Student ID, issue date, return date and fine information.

### Input Validation

The system checks for empty details, duplicate IDs, invalid menu input and incorrect book or student information.

### Book Availability

The system automatically changes the status of a book between Available and Issued based on borrowing activity.
