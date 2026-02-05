/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */
class ClassRoom {
    private String name;
    private String specialization;

    ClassRoom(String n, String s) {
        name = n;
        specialization = s;
    }

    public String getName() { return name; }
}

public class ClassRoom {
    private String className;
    private ClassRoom teacher;

    ClassRoom() {}

    ClassRoom(String c, ClassRoom t) {
        className = c;
        teacher = t;
    }

    void display() {
        System.out.println(className + " - " + teacher.getName());
    }

    public static void main(String[] args) {
        ClassRoom t = new ClassRoom("Dung", "Java");
        ClassRoom c = new ClassRoom("OOP", t);
        c.display();
    }
}

