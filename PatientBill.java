public class PatientBill {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.setConsultationFee(500);
        bill.setMedicineFee(750);
        bill.setRoomFee(1000);
        bill.displayTotal();
    }
}
class Bill {
    private double consultationFee, medicineFee, roomFee;
    void setConsultationFee(double fee) { consultationFee = fee; }
    void setMedicineFee(double fee) { medicineFee = fee; }
    void setRoomFee(double fee) { roomFee = fee; }
    void displayTotal() {
        System.out.println("Total Bill: " + (consultationFee + medicineFee + roomFee));
    }
}
