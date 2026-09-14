import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice = 0;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. View Students");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Search Book");
            System.out.println("8. View Book History");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            if (!sc.hasNextInt()) {

                System.out.println("Invalid input. Please enter a number from 1 to 9.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine().trim();

                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine().trim();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine().trim();

                    library.addBook(bookId, bookName, author);
                    break;

                case 2:

                    library.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    String studentId = sc.nextLine().trim();

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine().trim();

                    library.addStudent(studentId, studentName);
                    break;

                case 4:

                    library.viewStudents();
                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    String issueBookId = sc.nextLine().trim();

                    System.out.print("Enter Student ID: ");
                    String issueStudentId = sc.nextLine().trim();

                    library.issueBook(issueBookId, issueStudentId);
                    break;

                case 6:

                    System.out.print("Enter Book ID: ");
                    String returnBookId = sc.nextLine().trim();

                    library.returnBook(returnBookId);
                    break;

                case 7:

                    System.out.print("Enter Book ID to search: ");
                    String searchBookId = sc.nextLine().trim();

                    library.searchBook(searchBookId);
                    break;

                case 8:

                    library.viewBookHistory();
                    break;

                case 9:

                    System.out.println(
                            "Thank you for using the Library Management System."
                    );
                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 9."
                    );
            }

        } while (choice != 9);

        sc.close();
    }
}