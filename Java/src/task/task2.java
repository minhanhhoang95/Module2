package task;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        boolean isRetry;
        do {

            int expectedAnswer = input.nextInt();
            isRetry = number1 + number2 != expectedAnswer;
            if (isRetry) {
                System.out.print("Wrong answer");
            }
        }
        while (isRetry);

        System.out.println("You got it!");

    }
}
