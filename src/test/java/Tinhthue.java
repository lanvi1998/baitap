import java.util.Scanner;

public class Tinhthue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thu nhập hàng năm (đơn vị: đồng)
        System.out.print("Nhập thu nhập hàng năm (đơn vị: đồng): ");
        double thuNhap = scanner.nextDouble();

        double thueSuat = 0;

        // Xác định mức thuế suất
        if (thuNhap <= 5_000_000) {
            thueSuat = 0.05;
        } else if (thuNhap <= 10_000_000) {
            thueSuat = 0.10;
        } else if (thuNhap <= 18_000_000) {
            thueSuat = 0.15;
        } else if (thuNhap <= 32_000_000) {
            thueSuat = 0.20;
        } else if (thuNhap <= 52_000_000) {
            thueSuat = 0.25;
        } else if (thuNhap <= 80_000_000) {
            thueSuat = 0.30;
        } else {
            thueSuat = 0.35;
        }

        // Tính thuế phải trả
        double thue = thuNhap * thueSuat;

        // Xuất kết quả
        System.out.printf("Thuế phải trả là: %.0f đồng (thuế suất %.0f%%)\n", thue, thueSuat * 100);
    }
}