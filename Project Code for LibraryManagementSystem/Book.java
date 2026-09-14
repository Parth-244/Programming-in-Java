public class Book {

    String bookId;
    String bookName;
    String author;
    boolean available;

    Book(String bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.available = true;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (available ? "Available" : "Issued"));
        System.out.println("----------------------------");
    }
}