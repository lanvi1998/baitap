public class longgestPalindromotic {// Hàm mở rộng từ tâm (center)
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right); // sau khi vượt quá giới hạn
    }

    // Hàm chính tìm chuỗi đối xứng dài nhất
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Trường hợp chuỗi có độ dài lẻ
            String odd = expandAroundCenter(s, i, i);

            // Trường hợp chuỗi có độ dài chẵn
            String even = expandAroundCenter(s, i, i + 1);

            // Lấy cái dài hơn giữa odd và even
            String max = odd.length() > even.length() ? odd : even;

            // Cập nhật nếu tìm được chuỗi đối xứng dài hơn
            if (max.length() > longest.length()) {
                longest = max;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = longestPalindrome(input);
        System.out.println("✅ Chuỗi con đối xứng dài nhất là: " + result);

        scanner.close();
    }

}


