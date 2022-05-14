package ArrayJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 20; // Suc chua cua mang
        int[] array = new int[size];
        array[0] = 1;
        array[1] = -1;
        array[2] = 6;
        array[3] = 5;
        array[4] = 3;
        System.out.println("Mảng ban đầu :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Nhap phan tu can chen vao mang: ");
        int element = scanner.nextInt();

        System.out.println("Nhap vi tri can chen vao mang: ");
        int index = scanner.nextInt();

        if (index <= -1 && index >= array.length - 1) {

            System.out.println("Khong ton tai vi tri nay");
        }
        else {
            for (int i = index; i < array.length - 1; i++) {
                array[i + 1] = array[i];
            }
            array[index] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
