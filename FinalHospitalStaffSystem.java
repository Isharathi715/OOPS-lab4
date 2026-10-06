public class FinalHospitalStaffSystem {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
class HospitalSystem {
    private Staff[] staff = {
        new Staff("Dr. Meera", "Doctor"),
        new Staff("Rohan", "Pharmacist")
    };
    void run() {
        for (Staff s : staff) s.display();
    }
}
class Staff {
    private String name, role;
    Staff(String name, String role) { this.name = name; this.role = role; }
    void display() { System.out.println(name + " - " + role); }
}
