/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author GSADS
 */

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer(
                new CPU("Intel i5"),
                new RAM(16)
        );
        c.showInfo();
    }
}

