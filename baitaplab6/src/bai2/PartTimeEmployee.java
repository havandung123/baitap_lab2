/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author GSADS
 */


public class PartTimeEmployee extends Employee {
    int workingHours;
    double hourlyRate;

    public PartTimeEmployee(String id, String name, int h, double r) {
        super(id, name);
        workingHours = h;
        hourlyRate = r;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}
