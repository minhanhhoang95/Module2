package ArrayJava;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[7];
        N[0]= 1;
        N[1]= 3;
        N[2]= 9;
        N[3]= 7;
        N[4]= 4;
        N[5]= 2;
        N[6]= 5;
        int n  ;
        int size =N.length-1;
        System.out.println("Trước khi xóa : ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
        System.out.println();
        System.out.println("Nhập phần từ cần xóa : ");
        int X = sc.nextInt();
        n = deleteElement(N, size , X);
        System.out.println("Sau khi xóa : ");
        for (int i = 0; i < n; i++) {
            System.out.print(N[i] + " ");
        }

    }
    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int deleteElement(int[] arr, int n, int key){
        int position = searchElement(arr, key);
        if (position == -1) {
            System.out.println("Không tìm thấy : ");
        }
        for (int i = position; i < n; i++) {
          arr[i]= arr[i+1];
        }
        return n ;
    }

}
