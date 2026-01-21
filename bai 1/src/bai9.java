import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong: ");
        int n = sc.nextInt();

        int dem = 0;
        int temp = n;

        while (temp > 0) {
            dem++;
            temp /= 10;
        }

        System.out.println("So chu so cua " + n + " la: " + dem);
    }
}
