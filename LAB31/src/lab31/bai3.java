package lab31;

import java.util.Scanner;

public class bai3 {
    private String id;
    private String name;
    private double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    public double calculateTax() {
        return salary > 10000000 ? salary * 0.1 : 0;
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}
