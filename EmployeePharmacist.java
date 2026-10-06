public class EmployeePharmacist {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Amit", 101, "LIC1001");
        pharmacist.display();
    }
}
class Employee {
    protected String name;
    protected int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, int id, String licenseNo) {
        super(name, id);
        this.licenseNo = licenseNo;
    }
    void display() {
        System.out.println(name + " | " + id + " | License: " + licenseNo);
    }
}
