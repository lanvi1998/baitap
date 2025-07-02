import java.util.Scanner;

public class Chuoidoixung {
    // Hàm kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // So sánh ký tự từ hai đầu
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Không đối xứng
            }
            left++;
            right--;
        }

        return true; // Đối xứng
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        // Gọi hàm kiểm tra
        if (isPalindrome(input)) {
            System.out.println("Chuỗi là đối xứng true.");
        } else {
            System.out.println("Chuỗi không đối xứng false.");
        }

        scanner.close();
    }
}
