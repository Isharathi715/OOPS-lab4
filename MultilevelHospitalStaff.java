public class MultilevelHospitalStaff {
    public static void main(String[] args) {
        Manager manager = new Manager("Karan", 35, 5001);
        manager.display();
    }
}
class Person {
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}
class Employee extends Person {
    protected int employeeId;
    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}
class Manager extends Employee {
    Manager(String name, int age, int employeeId) { super(name, age, employeeId); }
    void display() {
        System.out.println(name + " | Age: " + age + " | Employee ID: " + employeeId);
    }
}
