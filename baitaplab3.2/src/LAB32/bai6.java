package lab32;

import java.util.Scanner;

public class bai6 {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {
        price = price * (1 - percent / 100);
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name +
                " - Price: " + price + " - Quantity: " + quantity);
    }
}
