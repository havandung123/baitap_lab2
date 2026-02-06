/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author GSADS
 */


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java OOP");
        Book b2 = new Book("C++ cơ bản");

        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();
    }
}

