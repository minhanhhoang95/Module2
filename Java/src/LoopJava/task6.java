package LoopJava;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Numbers : ");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 0; i < number; i++) {

            if (isPrimeNumber(i)) {
                if (count < 20) {
                    System.out.print(i + " ");
                    count += 1;
                }
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
