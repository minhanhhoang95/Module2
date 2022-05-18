package ArrayJava;

import java.util.Locale;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hoang Anh Minh".toLowerCase();
        System.out.println("Nhập chữ cần tìm : ");
        String input = sc.nextLine().toLowerCase();
        char ch = input.charAt(0);
        int count=0 ;
        if(input.length()!=1){
            System.out.println("số này quá dài : ");
            return;
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
//                System.out.println(i);
                count++;
            }
        }
        System.out.println("xuat hien " + count + " lan ");
    }
}
