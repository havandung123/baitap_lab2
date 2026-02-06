/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author GSADS
 */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car("Toyota"));
        list.add(new Motorbike("Honda"));

        for (Vehicle v : list) {
            v.showInfo();
        }
    }
}
