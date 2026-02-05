/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */
public class Book {
    String id, title;
    double price;

    public Book() {
        price = 0;
    }

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println(id + " - " + title + " - " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("B01", "Java", 150);

        b1.display();
        b2.display();
    }
}

