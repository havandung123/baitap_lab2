/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab2.pkg3;

import java.util.Scanner;

public class Bai5 {
    static Scanner sc = new Scanner(System.in);

    static void nhapMang(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap diem[" + i + "]: ");
            arr[i] = sc.nextDouble();
        }
    }

    static void xuatMang(double[] arr) {
        System.out.print("Danh sach diem: ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static double tinhDiemTrungBinh(double[] arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong / arr.length;
    }

    static String xepLoai(double dtb) {
        if (dtb >= 8.0) return "Gioi";
        else if (dtb >= 6.5) return "Kha";
        else if (dtb >= 5.0) return "Trung binh";
        else return "Yeu";
    }

    public static void main(String[] args) {
        System.out.print("Nhap so mon hoc: ");
        int n = sc.nextInt();

        double[] diem = new double[n];

        nhapMang(diem);
        xuatMang(diem);

        double dtb = tinhDiemTrungBinh(diem);
        System.out.println("Diem trung binh = " + dtb);
        System.out.println("Xep loai = " + xepLoai(dtb));
    }
}
