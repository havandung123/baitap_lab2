/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author GSADS
 */
public class Employee extends Person {
    private double salary;

    // Constructor đầy đủ
    public Employee(String name, int age, double salary) {
        super(name, age); // gọi constructor lớp cha
        this.salary = salary;
    }

    // Ghi đè phương thức display
    @Override
    public void display() {
        super.display();
        System.out.println("Lương: " + salary);
    }
}
