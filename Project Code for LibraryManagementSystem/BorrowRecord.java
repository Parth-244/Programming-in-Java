import java.time.LocalDate;

public class BorrowRecord {

    String bookId;
    String studentId;
    LocalDate issueDate;
    LocalDate returnDate;

    BorrowRecord(String bookId, String studentId) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }
}