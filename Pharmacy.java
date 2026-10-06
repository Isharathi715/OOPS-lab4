public class Pharmacy {
    public static void main(String[] args) {
        PharmacyInfo p1 = new PharmacyInfo("City Pharmacy", "Roorkee");
        PharmacyInfo p2 = new PharmacyInfo("Health Plus", "Haridwar");
        p1.display();
        p2.display();
        PharmacyInfo.displayCount();
    }
}
class PharmacyInfo {
    private static String pharmacyName = "MediCare Pharmacy";
    private static int count = 0;
    private String location;
    PharmacyInfo(String name, String location) {
        pharmacyName = name;
        this.location = location;
        count++;
    }
    void display() {
        System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
    }
    static void displayCount() {
        System.out.println("Objects created: " + count);
    }
}
