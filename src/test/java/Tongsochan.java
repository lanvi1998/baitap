import java.util.Scanner;

public class Tongsochan {
    public static int tongchan(int n){
        int tong = 0 ;
    for( int i=0 ; i<=n ;i+=2){
        tong += i;
    }
    return tong;
}

public static void main (String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập số n:");
    int n = scanner.nextInt();
     int result =tongchan (n);
     System.out.println("tổng chẳn"+result);

}
}