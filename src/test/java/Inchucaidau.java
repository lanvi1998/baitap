import java.util.Scanner;

public class Inchucaidau {
    public static String getinchucaidau(String input) {
        String[] words = input.trim().split("\\s+");
        if (input.trim().isEmpty()) {
            return "";
        }
        String result = "";

    for(String word :words){


        result += word.charAt(0);
    }
    return result.toUpperCase();
}
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi cần tách:");
        String input = scanner.nextLine();
        String result = getinchucaidau(input);
        System.out.println("kết quả :" +result);

    }
    }

