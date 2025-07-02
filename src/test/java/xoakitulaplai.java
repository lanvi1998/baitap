import java.util.HashSet;
import java.util.Scanner;

public class xoakitulaplai {
    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String output = removeDuplicates(input);
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + output);

        scanner.close();
    }
}

