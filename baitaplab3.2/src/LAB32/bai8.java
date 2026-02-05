package lab32;

import java.util.Scanner;

public class bai8 {
    private String title;
    private String author;
    private double price;
    private int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println("Title: " + title +
                " - Author: " + author +
                " - Price: " + price +
                " - Year: " + year);
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }
}
