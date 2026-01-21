/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GSADS
 */
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();

        int tong = a + b;

        System.out.println("Tong hai so la: " + tong);
    }
}
