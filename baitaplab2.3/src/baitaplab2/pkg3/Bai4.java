/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab2.pkg3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int tong = 0;
        int max = a[0];
        int demAm = 0;

        System.out.print("Mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            tong += a[i];
            if (a[i] > max) max = a[i];
            if (a[i] < 0) demAm++;
        }

        System.out.println("\nTong = " + tong);
        System.out.println("So lon nhat = " + max);
        System.out.println("So luong so am = " + demAm);
    }
}

