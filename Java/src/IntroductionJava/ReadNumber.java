package IntroductionJava;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number convert : ");
        int number = sc.nextInt();
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        String result = null;
        if (number < 0 && number > 999) {
            System.out.println("Out of range.");
        }
        if (number >= 0 && number < 10) {
            result = _0_to_9_(number);
            System.out.println(result);
            return;
        }
        if (number >= 10 && number < 20) {
            result = _10_to_19_(third);
            System.out.println(result);
            return;
        }
        if (number >= 20 && number < 100) {
            if (third != 0) {
                result = _20_to_99_(second) + " " + _0_to_9_(third);
                System.out.println(result);
            } else {
                result = _20_to_99_(second);
                System.out.println(result);
            }

            return;
        }
        if (number >= 100 && number < 1000) {
            if (third == 0) {
                if (second == 0) {
                    result = _100_to_999_(first);
                    System.out.println(result);
                }
                if (second < 2 && second > 0) {
                    result = _100_to_999_(first) + " and " + _10_to_19_(third);
                    System.out.println(result);
                } else if (second >= 2) {
                    result = _100_to_999_(first) + " and " + _20_to_99_(second);
                    System.out.println(result);
                }
            } else if (second == 0) {
                result = _100_to_999_(first) + " and " + _0_to_9_(third);
                System.out.println(result);
                return;
            } else if (second < 2) {
                result = _100_to_999_(first) + " and " + _10_to_19_(third);
                System.out.println(result);
            } else {
                result = _100_to_999_(first) + " and " + _20_to_99_(second) + " and " + _0_to_9_(third);
                System.out.println(result);
            }
            return;
        }
    }


    public static String _0_to_9_(int number) {
        String donvir = null;
        switch (number) {
            case 0:
                donvir = "Zero";
                break;
            case 1:
                donvir = "one";
                break;
            case 2:
                donvir = "two";
                break;
            case 3:
                donvir = "three";
                break;
            case 4:
                donvir = "four";
                break;
            case 5:
                donvir = "five";
                break;
            case 6:
                donvir = "six";
                break;
            case 7:
                donvir = "seven";
                break;
            case 8:
                donvir = "eight";
                break;
            case 9:
                donvir = "Nine";
                break;
        }
        return donvir;
    }

    public static String _10_to_19_(int number) {
        String special = null;
        switch (number) {
            case 0:
                special = "Ten";
                break;
            case 1:
                special = "eleven";
                break;
            case 2:
                special = "twelve";
                break;
            case 3:
                special = "Thirteen";
                break;
            case 4:
                special = "fourteen";
                break;
            case 5:
                special = "fiveteen";
                break;
            case 6:
                special = "sixteen";
                break;
            case 7:
                special = "seventeen";
                break;
            case 8:
                special = "eighteen";
                break;
            case 9:
                special = "nineteen";
                break;
        }
        return special;
    }

    public static String _20_to_99_(int number) {
        String second = null;
        switch (number) {
            case 2:
                second = "twenty";
                break;
            case 3:
                second = "thirty";
                break;
            case 4:
                second = "fourty";
                break;
            case 5:
                second = "fivety";
                break;
            case 6:
                second = "sixty";
                break;
            case 7:
                second = "seventy";
                break;
            case 8:
                second = "eighty";
                break;
            case 9:
                second = "ninety";
                break;
        }
        return second;
    }

    public static String _100_to_999_(int number) {
        String first = null;
        switch (number) {
            case 1:
                first = "One hundred";
                break;
            case 2:
                first = "Two hundred";
                break;
            case 3:
                first = "Three hundred";
                break;
            case 4:
                first = "Four hundred";
                break;
            case 5:
                first = "Five hundred";
                break;
            case 6:
                first = "Six hundred";
                break;
            case 7:
                first = "Seven hundred";
                break;
            case 8:
                first = "Eight hundred";
                break;
            case 9:
                first = "Nine hundred";
                break;
        }
        return first;
    }
}

