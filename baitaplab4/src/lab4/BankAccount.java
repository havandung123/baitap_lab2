/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        ownerName = name;
        balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public void displayInfo() {
        System.out.println(accountNumber + " - " + ownerName + " - " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123", "Dung", 1000);
        acc.displayInfo();
        acc.deposit(500);
        acc.displayInfo();
        acc.withdraw(300);
        acc.displayInfo();
    }
}

