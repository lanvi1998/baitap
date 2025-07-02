package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 18;
        double salary = 1500.15;
        String name1 = "vi";
        boolean islogin = true;
        Scanner scanner = new Scanner(System.in);


            System.out.print("xin vu lòng nhập thông tin sinh viên");
            System.out.print("nhập tên sinh viên");
            String ten = scanner.nextLine();
            System.out.print("nhập lớp");
            String lop = scanner.nextLine();
                    System.out.println("xin chào"+ten+lop);
    }
}