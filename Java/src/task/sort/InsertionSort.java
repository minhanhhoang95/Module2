package task.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {5, 4, 2, 9, 12, 12, 1};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; i++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {5, 4, 2, 9, 12, 12, 1};
//        for (int i = 0; i < arr.length; i++) {
//            int j = i;
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j = j - 1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        int[] arr = {5, 4, 2, 9, 12, 12, 1};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));


//               for(;;)
//        int[] arr = {5, 4, 2, 9, 12, 12, 1};
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
//                if (arr[j - 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
