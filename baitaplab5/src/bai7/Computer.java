/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author GSADS
 */

public class Computer {
    private CPU cpu;
    private RAM ram;

    public Computer(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void showInfo() {
        System.out.println("CPU: " + cpu.model);
        System.out.println("RAM: " + ram.size + "GB");
    }
}
