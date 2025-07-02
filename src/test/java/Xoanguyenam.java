import java.util.Scanner;

public class Xoanguyenam {
    public static boolean isNguyenAm(char kyTu){
        kyTu = Character.toLowerCase(kyTu);//chuyển về chữ thường để kiểm tra
        return kyTu =='a'||kyTu =='e'||kyTu =='i'||kyTu =='o'||kyTu =='u';
    }
    public static String chuoikhongconguyenam (String input){
        String output ="";
        for(int i=0; i< input.length();i++){
            char kyTu =input.charAt(i);
            System.out.println("chuỗi ký tự"+kyTu);
            if(!isNguyenAm(kyTu))  {
                output+= kyTu;
            }
        }
        return output;

    }
    public static void  main ( String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("nhập chuỗi cần xữ lý");
        String input = scanner.nextLine();
        String output=chuoikhongconguyenam(input);
        System.out.println("chuỗi sau khi xữ lý :"+output);

    }
}
