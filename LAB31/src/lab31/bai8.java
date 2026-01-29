package lab31;

import java.util.Scanner;

public class bai8 {
    private String title;
    private String author;
    private double price;
    private int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        title = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Year: ");
        year = sc.nextInt();
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }

    public void display() {
        System.out.println("Title: " + title +
                " – Author: " + author +
                " – Price: " + price +
                " – Year: " + year);
    }
}
