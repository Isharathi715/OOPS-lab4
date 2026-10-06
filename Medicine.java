public class Medicine {
    public static void main(String[] args) {
        MedicineInfo medicine = new MedicineInfo("Paracetamol", "P1001", 25.50);
        medicine.display();
    }
}
class MedicineInfo {
    private String name;
    private String batchNo;
    private double price;
    MedicineInfo(String name, String batchNo, double price) {
        this.name = name;
        this.batchNo = batchNo;
        this.price = price;
    }
    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}
