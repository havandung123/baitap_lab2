/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author GSADS
 */


public class Rectangle extends Shape {
    double width, height;

    public Rectangle(double w, double h) {
        super("Hình chữ nhật");
        width = w;
        height = h;
    }

    @Override
    public double area() {
        return width * height;
    }
}

