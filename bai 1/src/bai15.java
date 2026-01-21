import java.util.Scanner;

public class bai15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // xoa bo nho dem

        String[] ten = new String[n];
        double[] diem = new double[n];

        double tong = 0;
        double max = -1;
        int vtMax = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sinh vien thu " + (i + 1) + ": ");
            ten[i] = sc.nextLine();

            System.out.print("Nhap diem: ");
            diem[i] = sc.nextDouble();
            sc.nextLine();

            tong += diem[i];

            if (diem[i] > max) {
                max = diem[i];
                vtMax = i;
            }
        }

        double diemTB = tong / n;

        System.out.println("Diem trung binh = " + diemTB);
        System.out.println("Sinh vien diem cao nhat: " + ten[vtMax] + " - " + max);

        for (int i = 0; i < n; i++) {
            String xepLoai;
            if (diem[i] >= 8.0) xepLoai = "Gioi";
            else if (diem[i] >= 6.5) xepLoai = "Kha";
            else if (diem[i] >= 5.0) xepLoai = "Trung binh";
            else xepLoai = "Yeu";

            System.out.println(ten[i] + " - " + diem[i] + " - " + xepLoai);
        }
    }
}
