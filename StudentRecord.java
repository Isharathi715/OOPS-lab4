public class StudentRecord {
    public static void main(String[] args) {
        Student student = new Student("Aarav", 101);
        student.display();
    }
}
class Student {
    private String name;
    private int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
