import java.util.Scanner;
import java.util.InputMismatchException;

public class Kha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi nhap vao mot so nguyen duong: ");

        try {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Loi: So nhap vao khong hop le (phai lon hon 0).");
            } else {
                if (kiemTraNguyenTo(n)) {
                    System.out.println(n + " la so nguyen to.");
                } else {
                    System.out.println(n + " khong phai la so nguyen to.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Loi: Gia tri nhap vao khong phai la so nguyen (chu, ky tu la, so thuc...).");
        } finally {
            scanner.close();
        }
    }

    public static boolean kiemTraNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}