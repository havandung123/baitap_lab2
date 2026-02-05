/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */
class Employee {
    String id, name;
}

public class Department {
    String deptName;
    Employee employee;

    void display() {
        System.out.println(deptName + " - " + employee.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = "E01";
        e.name = "Dung";

        Department d = new Department();
        d.deptName = "IT";
        d.employee = e;

        d.display();
    }
}

