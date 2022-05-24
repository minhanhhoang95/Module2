package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 9, 12, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = 2;
        int left = 0;
        int rigth = arr.length - 1;
        int mid = (left + rigth) / 2;
        while (left <= rigth) {
            if (arr[mid] < x) {
                left = mid + 1;
            } else if (arr[mid] == x) {
                System.out.println("số cần tìm nằm ở vị trí : " + mid);
                break;
            } else {
                rigth = mid - 1;
            }
            mid = (left + rigth) / 2;
        }
        if (left > rigth) {
            System.out.println("không được tìm thấy !!!");
        }
    }
}
