/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author GSADS
 */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Rectangle(4, 5));
        list.add(new Rectangle(3, 6));
        list.add(new Circle(3));

        for (Shape s : list) {
            s.display();
        }
    }
}
