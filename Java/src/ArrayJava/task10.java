package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
//        System.out.print(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min in array " + min);
    }
}
