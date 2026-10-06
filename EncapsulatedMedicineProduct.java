public class EncapsulatedMedicineProduct {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Cough Syrup", "CS101", 120.0);
        product.display();
    }
}
class MedicineProduct {
    private String name;
    private String batchNo;
    private double price;
    MedicineProduct(String name, String batchNo, double price) {
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
