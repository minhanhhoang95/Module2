package task;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int i ;
//        System.out.println("Enter the n : ");
//        n=sc.nextInt();
        do {
            System.out.println("Enter the n : ");
            n=sc.nextInt();
        }while (n==-1);
        if(n>-100)
        {
            for(i=n;i>=-100;i--){
                System.out.println(i);
            }
        }else {
            for(i=n;i<=-100;i++){
                System.out.println(i);
            }
        }
        return ;
    }
}
