import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

    public class Demtutrongchuoi{
    public static  int wordCount(@NotNull String input){
        String[] word = input.trim().split("\\s+");
        return word.length;
    }
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("nhập chuỗi cần đếm:");
    String input =scanner.nextLine();

    int wordCount = wordCount(input);
    System.out.println("Số từ trong chuỗi :"+wordCount);

    }
}
