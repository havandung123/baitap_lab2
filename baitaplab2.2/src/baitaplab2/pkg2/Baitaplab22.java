/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaplab2.pkg2;

import java.util.Scanner;

/**
 *
 * @author GSADS
 */
public class Baitaplab22 {

    // Nhap danh sach sinh vien
    public static void nhapSinhVien(String[] ma, String[] ten, double[] diem, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));

            System.out.print("Ma sinh vien: ");
            ma[i] = sc.nextLine();

            System.out.print("Ten sinh vien: ");
            ten[i] = sc.nextLine();

            System.out.print("Diem: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // xoa bo nho dem
        }
    }

    // Tinh diem trung binh
    public static double tinhDiemTrungBinh(double[] diem, int n) {
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += diem[i];
        }
        return tong / n;
    }

    // In sinh vien dat
    public static void inSinhVienDat(String[] ma, String[] ten, double[] diem, int n) {
        System.out.println("Danh sach sinh vien DAT (diem >= 5):");
        for (int i = 0; i < n; i++) {
            if (diem[i] >= 5) {
                System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
            }
        }
    }

    // In sinh vien khong dat
    public static void inSinhVienKhongDat(String[] ma, String[] ten, double[] diem, int n) {
        System.out.println("Danh sach sinh vien KHONG DAT (diem < 5):");
        for (int i = 0; i < n; i++) {
            if (diem[i] < 5) {
                System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien n: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ma = new String[n];
        String[] ten = new String[n];
        double[] diem = new double[n];

        nhapSinhVien(ma, ten, diem, n);

        double dtb = tinhDiemTrungBinh(diem, n);
        System.out.println("Diem trung binh cua lop = " + dtb);

        inSinhVienDat(ma, ten, diem, n);
        inSinhVienKhongDat(ma, ten, diem, n);
    }
}
