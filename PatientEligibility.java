public class PatientEligibility {
    public static void main(String[] args) {
        Patient patient = new Patient("Riya", 20);
        patient.classify();
    }
}
class Patient {
    private String name;
    private int age;
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void classify() {
        if (age >= 18) System.out.println(name + " is eligible.");
        else System.out.println(name + " is not eligible.");
    }
}
