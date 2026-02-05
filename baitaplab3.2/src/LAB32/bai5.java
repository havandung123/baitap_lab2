package lab32;

public class bai5 {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public bai5(String acc, String owner, double bal) {
        accountNumber = acc;
        ownerName = owner;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Khong du tien!");
    }

    public double checkBalance() {
        return balance;
    }

    public void display() {
        System.out.println("STK: " + accountNumber +
                " - Chu TK: " + ownerName +
                " - So du: " + balance);
    }
}
