import java.util.Scanner;

public class Twosum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // chỉ số từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // không tìm thấy
    }

    public static boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // phát hiện giảm
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng 1 dòng
        System.out.print("Nhập mảng (các số cách nhau bằng dấu cách): ");
        String[] input = scanner.nextLine().trim().split("\\s+");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // In ra để kiểm tra
        System.out.print("Mảng đã nhập: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Kiểm tra tăng dần
        if (!isSortedAscending(numbers)) {
            System.out.println("❌ Lỗi: Mảng phải được sắp xếp tăng dần!");
            scanner.close();
            return;
        }

        // Nhập target
        System.out.print("Nhập target: ");
        int target = scanner.nextInt();

        // In ra target để kiểm tra
        System.out.println("Target đã nhập: " + target);

        // Gọi hàm tìm
        int[] result = twoSum(numbers, target);

        // In kết quả
        if (result[0] == -1) {
            System.out.println("❌ Không tìm thấy hai số có tổng bằng target.");
        } else {
            System.out.println("✅ Vị trí hai số có tổng bằng target: [" + result[0] + ", " + result[1] + "]");
        }

        scanner.close();
    }
}
