/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author GSADS
 */


public class Circle extends Shape {
    double radius;

    public Circle(double r) {
        super("Hình tròn");
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
