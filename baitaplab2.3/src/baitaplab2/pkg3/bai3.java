/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab2.pkg3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n (n > 0): ");
            n = sc.nextInt();
        } while (n <= 0);

        int tong = 0;
        long giaiThua = 1;
        int demChan = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
            giaiThua *= i;
            if (i % 2 == 0) {
                demChan++;
            }
        }

        System.out.println("Tong tu 1 den n = " + tong);
        System.out.println("Giai thua cua n = " + giaiThua);
        System.out.println("So luong so chan = " + demChan);
    }
}

