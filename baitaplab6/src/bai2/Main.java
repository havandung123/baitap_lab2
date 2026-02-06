/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author GSADS
 */


public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("NV01", "An", 15000000);
        Employee e2 = new PartTimeEmployee("NV02", "Bình", 80, 50000);

        e1.showInfo();
        e2.showInfo();
    }
}

