public class PharmacyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
class MedicineStock {
    String name;
    int quantity;
    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
class Inventory {
    private MedicineStock[] stock = {
        new MedicineStock("Paracetamol", 50),
        new MedicineStock("Amoxicillin", 30),
        new MedicineStock("Vitamin C", 40)
    };
    void displayInventory() {
        for (MedicineStock item : stock) {
            System.out.println(item.name + " - Quantity: " + item.quantity);
        }
    }
}
