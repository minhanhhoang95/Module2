package IntroductionJava;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập usd :");
        usd = sc.nextDouble();
        double quydoi=usd*23000;
        System.out.println("giá trị VND : " + quydoi);
    }
}
