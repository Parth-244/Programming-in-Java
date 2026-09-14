import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<BorrowRecord> records = new ArrayList<>();

    // Add a new book
    void addBook(String bookId, String bookName, String author) {

        if (bookId.isEmpty() || bookName.isEmpty() || author.isEmpty()) {
            System.out.println("Book details cannot be empty.");
            return;
        }

        for (Book book : books) {
            if (book.bookId.equals(bookId)) {
                System.out.println("Book ID already exists.");
                return;
            }
        }

        Book book = new Book(bookId, bookName, author);
        books.add(book);

        System.out.println("Book added successfully.");
    }

    // View all books
    void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n===== ALL BOOKS =====");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Add a new student
    void addStudent(String studentId, String studentName) {

        if (studentId.isEmpty() || studentName.isEmpty()) {
            System.out.println("Student details cannot be empty.");
            return;
        }

        for (Student student : students) {
            if (student.studentId.equals(studentId)) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        Student student = new Student(studentId, studentName);
        students.add(student);

        System.out.println("Student added successfully.");
    }

    // View all students
    void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        System.out.println("\n===== ALL STUDENTS =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Issue a book
    void issueBook(String bookId, String studentId) {

        Book selectedBook = null;
        Student selectedStudent = null;

        for (Book book : books) {
            if (book.bookId.equals(bookId)) {
                selectedBook = book;
                break;
            }
        }

        for (Student student : students) {
            if (student.studentId.equals(studentId)) {
                selectedStudent = student;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Book not found.");
            return;
        }

        if (selectedStudent == null) {
            System.out.println("Student not found.");
            return;
        }

        if (!selectedBook.available) {
            System.out.println("Book is already issued.");
            return;
        }

        selectedBook.available = false;

        BorrowRecord record = new BorrowRecord(bookId, studentId);
        records.add(record);

        System.out.println("Book issued successfully.");
        System.out.println("Issue Date: " + record.issueDate);
        System.out.println("Return within 14 days to avoid a fine.");
    }

    // Return a book and calculate fine
    void returnBook(String bookId) {

        Book selectedBook = null;
        BorrowRecord selectedRecord = null;

        for (Book book : books) {
            if (book.bookId.equals(bookId)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Book not found.");
            return;
        }

        if (selectedBook.available) {
            System.out.println("This book is not currently issued.");
            return;
        }

        for (BorrowRecord record : records) {
            if (record.bookId.equals(bookId) && record.returnDate == null) {
                selectedRecord = record;
                break;
            }
        }

        if (selectedRecord == null) {
            System.out.println("Borrow record not found.");
            return;
        }

        selectedRecord.returnDate = java.time.LocalDate.now();

        long daysKept = java.time.temporal.ChronoUnit.DAYS.between(
                selectedRecord.issueDate,
                selectedRecord.returnDate
        );

        long lateDays = daysKept - 14;

        if (lateDays < 0) {
            lateDays = 0;
        }

        long fine = lateDays * 10;

        selectedBook.available = true;

        System.out.println("\n===== BOOK RETURN =====");
        System.out.println("Book ID: " + bookId);
        System.out.println("Issue Date: " + selectedRecord.issueDate);
        System.out.println("Return Date: " + selectedRecord.returnDate);
        System.out.println("Days Kept: " + daysKept);
        System.out.println("Late Days: " + lateDays);
        System.out.println("Fine: Rs. " + fine);
        System.out.println("Book returned successfully.");
    }

    // Search for a book
    void searchBook(String bookId) {

        if (bookId.isEmpty()) {
            System.out.println("Book ID cannot be empty.");
            return;
        }

        for (Book book : books) {

            if (book.bookId.equals(bookId)) {

                System.out.println("\n===== BOOK FOUND =====");
                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // View complete borrowing history
    void viewBookHistory() {

        if (records.isEmpty()) {
            System.out.println("No book history available.");
            return;
        }

        System.out.println("\n===== BOOK HISTORY =====");

        for (BorrowRecord record : records) {

            System.out.println("Book ID: " + record.bookId);
            System.out.println("Student ID: " + record.studentId);
            System.out.println("Issue Date: " + record.issueDate);

            if (record.returnDate == null) {

                System.out.println("Return Date: Not Returned");
                System.out.println("Status: Currently Issued");

            } else {

                long daysKept = java.time.temporal.ChronoUnit.DAYS.between(
                        record.issueDate,
                        record.returnDate
                );

                long lateDays = daysKept - 14;

                if (lateDays < 0) {
                    lateDays = 0;
                }

                long fine = lateDays * 10;

                System.out.println("Return Date: " + record.returnDate);
                System.out.println("Days Kept: " + daysKept);
                System.out.println("Late Days: " + lateDays);
                System.out.println("Fine: Rs. " + fine);
                System.out.println("Status: Returned");
            }

            System.out.println("----------------------------");
        }
    }
}