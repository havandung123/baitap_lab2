/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab3;

import java.util.Scanner;

public class bai1 {
    String id;
    String name;
    double score;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập điểm: ");
        score = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }

    boolean isPass() {
        return score >= 5;
    }

    // ====== HÀM MAIN ======
    public static void main(String[] args) {
        bai1 sv = new bai1();
        sv.input();
        sv.display();

        if (sv.isPass()) {
            System.out.println("Kết quả: ĐẬU");
        } else {
            System.out.println("Kết quả: RỚT");
        }
    }
}


