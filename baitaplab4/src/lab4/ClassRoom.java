/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */

class Teacher {
    private String name;
    private String specialization;

    Teacher(String n, String s) {
        name = n;
        specialization = s;
    }

    public String getName() {
        return name;
    }
}

public class ClassRoom {
    private String className;
    private Teacher teacher;

    ClassRoom() {}

    ClassRoom(String c, Teacher t) {
        className = c;
        teacher = t;
    }

    void display() {
        System.out.println(className + " - " + teacher.getName());
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Dung", "Java");
        ClassRoom c = new ClassRoom("OOP", t);
        c.display();
    }
}
