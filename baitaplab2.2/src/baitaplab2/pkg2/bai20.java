/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab2.pkg2;

import java.util.Random;
import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rd.nextInt(100) + 1;
        int maxTry = 7;

        for (int i = 1; i <= maxTry; i++) {
            System.out.print("Lan " + i + ": ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Ban doan dung!");
                return;
            } else if (guess < number) {
                System.out.println("So lon hon");
            } else {
                System.out.println("So nho hon");
            }
        }

        System.out.println("Ban thua! So dung la: " + number);
    }
}
