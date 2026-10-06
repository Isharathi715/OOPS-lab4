public class HierarchicalHospitalStaff {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Neha", "Cardiology");
        Pharmacist pharmacist = new Pharmacist("Raj", "Pharmacy");
        doctor.display();
        pharmacist.display();
    }
}
class Employee {
    protected String name;
    protected String department;
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
class Doctor extends Employee {
    Doctor(String name, String department) { super(name, department); }
    void display() { System.out.println("Doctor: " + name + " | " + department); }
}
class Pharmacist extends Employee {
    Pharmacist(String name, String department) { super(name, department); }
    void display() { System.out.println("Pharmacist: " + name + " | " + department); }
}
