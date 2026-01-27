/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab2.pkg3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int namSinh = sc.nextInt();

        int namHienTai = 2025;
        int tuoi = namHienTai - namSinh;

        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);

        if (tuoi >= 18) {
            System.out.println("Du tuoi lao dong");
        } else {
            System.out.println("Chua du tuoi lao dong");
        }
    }
}
