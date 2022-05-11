package Week1;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter a year : ");
        year = scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("%d is a leap year :"+ year);
                }else {
                    System.out.println("%d is Not a leap year :"+year);
                }
            }else {
                System.out.println("%d is a leap year :"+ year);
            }
        }else {
            System.out.println("%d is Not a leap year :"+year);
        }
    }
}
