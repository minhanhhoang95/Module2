package Week1;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        float width ;
        float heigth ;
        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner
        System.out.println("Enter width: ");
        width=scanner.nextFloat();//Nhập chiều rộng
        System.out.println("Enter heigth: ");
        heigth=scanner.nextFloat();//Nhập chiều dài
        float area = width*heigth ;
        System.out.println("area : "+area);

    }
}
