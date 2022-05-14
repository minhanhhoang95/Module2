package ArrayJava;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr [][] = new int[x][y];
        System.out.println("Enter two number random");
        int rd1 = sc.nextInt();
        int rd2 = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int random = (int) Math.floor((Math.random() * rd2 - rd1 + 1) + rd1);
                arr[i][j] = random;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("GTLN " + max);
    }
}
