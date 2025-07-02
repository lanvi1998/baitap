import java.util.HashMap;
import java.util.Map;

class minimumwindowaubstring {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0; // số ký tự đạt yêu cầu
        int start = 0, minLen = Integer.MAX_VALUE;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // Khi đủ ký tự thì co cửa sổ
            while (valid == need.size()) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }

                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();

        System.out.print("Nhập chuỗi t: ");
        String t = scanner.nextLine();

        String result = minWindow(s, t);
        System.out.println("✅ Chuỗi con nhỏ nhất chứa tất cả ký tự của t: " + result);

        scanner.close();
    }
}
