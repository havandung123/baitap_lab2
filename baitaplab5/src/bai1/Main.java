/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
/**
 *
 * @author GSADS
 */
// ===== LỚP CHA =====
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

// ===== LỚP CON =====
class Student extends Person {
    String studentId;

    @Override
    void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Mã sinh viên: " + studentId);
    }
}

// ===== MAIN =====
public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Dũng";
        s.age = 20;
        s.studentId = "SV001";

        s.displayInfo();
    }
}

