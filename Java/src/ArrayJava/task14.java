package ArrayJava;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int count = 0;
        // check size
        do {
            size = sc.nextInt();
            if (size > 3) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 3);
        // input arrs
        int arr[] = new int[size];
        int i = 0;
        while (i < arr.length) {



            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int show = countElement(arr, count);
        System.out.println("Number of student who passed : " + show);
    }
    public static int countElement(int arr[],int count) {
        count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}
