package lab32;

import java.util.Scanner;

public class bai3 {
    private String id;
    private String name;
    private double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap luong: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
    }

    public double calculateTax() {
        if (salary > 10000000)
            return salary * 0.1;
        return 0;
    }
}
