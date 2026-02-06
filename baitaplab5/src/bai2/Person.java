/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author GSADS
 */
public class Person {
    protected String name;
    protected int age;

    // Constructor có tham số
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

