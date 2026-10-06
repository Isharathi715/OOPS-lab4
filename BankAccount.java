public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account(5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.display();
    }
}
class Account {
    private double balance;
    Account(double balance) { this.balance = balance; }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
    void display() { System.out.println("Balance: " + balance); }
}
