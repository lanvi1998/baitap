package org.example;

import java.util.Scanner;

public class caudieukien {
    public static void main(String[] args) {
        int x = 2;
        if (9 > 2) {
            System.out.println("điều kiện đúng");
        }
        if (2 > 9) {
            System.out.println("điều kiện sai");
        }


        int day = 4;
        if (day == 4 || day == 8) {
            System.out.println("hôm nay đi học");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tuổi");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("đủ tuôir đi học");
        } else {
            System.out.println("chưa đủ tuôir đi học");
        }
        //toán tử ba ngôi -> điều kiện ? thực hiện logic 1 : thực hiện logic 2
        String result = (age > 18) ? "bạn đủ tuổi học đại học" : "bạm chưa đủ tuổi";
        System.out.println(result);
        //if(điều kiện 1 ) {thực hiện logic 1} else(điều kiện 2){thực hiện logic 2} elae{logic3}
        int c = 10;
        if (c == 10) {
            System.out.println("số 10");
        } else if (c == 11) {
            System.out.println("số 11");
        } else if (c == 12) {
            System.out.println("số 12");
        } else {
            System.out.println("vui lòng nhập lại số");
        }
        System.out.println("nhập điểm toán");
        float toan =scanner.nextInt() ;
        System.out.println("nhập điểm lý");
        float ly =scanner.nextInt() ;
        System.out.println("nhập điểm hoá");
        float hoa =scanner.nextInt() ;
        float dtb=(toan+ly+hoa)/3;
        if (0 < dtb && dtb <= 5) {
            System.out.println("hs yếu");
        }else if(5.1<=dtb&&dtb<=6){
            System.out.println("hs trung bình");
        }else if(6<=dtb&&dtb<=7){
            System.out.println("hs trung khá");
        }else if(7.1<=dtb&&dtb<=8){
            System.out.println("hs trung giỏi");
        }else if(8.1<=dtb&&dtb<=10){
            System.out.println("hs xuất sắc");
            System.out.println("vui lòng nhập lại điểm");
        }
      System.out.println("nhập tên khách hàng");
        String name =scanner.nextLine();
        System.out.println("nhập số kw:");
        int kw = scanner.nextInt();
        int tiendien=0;
        if(0<kw && kw<=50){
            tiendien= kw*500;}
            else if (kw>50 &&kw <=100) {
                tiendien = kw * 500 + (kw - 50) * 650;
            }
             else if (kw>100&&kw<=200) {
                tiendien = 50 * 500 + 50 * 650 + (kw - 100) * 850;
            }
            else if (kw>200&&kw<=350) {
                tiendien = 50 * 500 + 50 * 650 + 100 * 850 + (kw - 200) * 1100;
            } else if   (kw>300) {
             tiendien=50*500+50*650+100+850+150*1100+(kw-350) *1300;}
            else{
                            System.out.println("bui lòng nhập lại");
                        }
            System.out.println("khách hàng"+name+"số tiền phải đóng là"+tiendien);


                    }
                }