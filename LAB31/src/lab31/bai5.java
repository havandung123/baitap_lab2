package lab31;

public class bai5 {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor (PHẢI TRÙNG TÊN CLASS)
    public bai5(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Rút tiền (chỉ khi đủ tiền)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Khong du tien de rut!");
        }
    }

    // Kiểm tra số dư
    public double checkBalance() {
        return balance;
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("STK: " + accountNumber
                + " – Chu tai khoan: " + ownerName
                + " – So du: " + balance);
    }
}
