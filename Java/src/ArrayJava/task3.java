package ArrayJava;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max in array " + max );

    }
}
