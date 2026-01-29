package lab31;

import java.util.Scanner;

public class bai1 {
    private String id;
    private String name;
    private double score;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Score: ");
        score = sc.nextDouble();
    }

    public boolean isPass() {
        return score >= 5;
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
        System.out.println(isPass() ? "PASS" : "FAIL");
    }
}
