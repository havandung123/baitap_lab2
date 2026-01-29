package lab31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== LAB 3.1 MENU =====");
            System.out.println("1. bai1");
            System.out.println("2. bai2");
            System.out.println("3. bai3");
            System.out.println("4. bai4");
            System.out.println("5. bai5");
            System.out.println("6. bai6");
            System.out.println("7. bai7");
            System.out.println("8. bai8");
            System.out.println("0. Exit");
            System.out.print("Chọn bài: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    bai1 s = new bai1();
                    s.input();
                    s.display();
                    break;

                case 2:
                    bai2 r = new bai2();
                    r.input();
                    r.display();
                    System.out.println("Area: " + r.getArea());
                    System.out.println("Perimeter: " + r.getPerimeter());
                    break;

                case 3:
                    bai3 e = new bai3();
                    e.input();
                    e.display();
                    break;

                case 4:
                    bai4 c = new bai4();
                    c.input();
                    System.out.println("Area: " + c.getArea());
                    System.out.println("Perimeter: " + c.getPerimeter());
                    System.out.println("Big circle: " + c.isBigCircle());
                    break;

                case 5:
                    bai5 b = new bai5("123456", "Dung", 5000000);
                    b.deposit(2000000);
                    b.withdraw(1000000);
                    b.display();
                    break;

                case 6:
                    bai6 p = new bai6();
                    p.input();
                    p.discount(10);
                    p.display();
                    System.out.println("Total: " + p.getTotalPrice());
                    break;

                case 7:
                    bai7 car = new bai7("Toyota", "Vios");
                    car.accelerate(120);
                    car.brake(30);
                    car.displayStatus();
                    System.out.println("Over speed: " + car.isOverSpeed());
                    break;

                case 8:
                    bai8 book = new bai8();
                    book.input();
                    book.display();
                    System.out.println("Expensive: " + book.isExpensive());
                    System.out.println("Old book: " + book.isOldBook());
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 0);
    }
}
