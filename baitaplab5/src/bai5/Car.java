/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author GSADS
 */
public class Car extends Vehicle {
    private int speed;

    public Car(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Hãng: " + brand);
        System.out.println("Tốc độ: " + speed + " km/h");
    }
}
