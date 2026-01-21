import java.util.Scanner;

public class bai13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String daoNguoc = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            daoNguoc += s.charAt(i);
        }

        System.out.println("Chuoi dao nguoc: " + daoNguoc);
    }
}
