package ArrayJava;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int[5];
        int [] arr2 = new int[4];
        System.out.println("nhập mảng 1 :");
        for (int i=0;i< arr1.length;i++){
            System.out.println("phần tử " + (i+1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("nhập mảng 2 :");
        for (int i=0;i< arr2.length;i++){
            System.out.println("phần tử " + (i+1) + " : ");
            arr2[i] = sc.nextInt();
        }
        int i = arr1.length+ arr2.length;
        int[]arr=new int[i];
        int count = 0;
        for (int j = 0; j < arr1.length; j++) {
            arr[j] = arr1[j];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr[count++] = arr2[j];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
