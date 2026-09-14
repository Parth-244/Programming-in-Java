public class Student {

    String studentId;
    String studentName;

    Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("----------------------------");
    }
}