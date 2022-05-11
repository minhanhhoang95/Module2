package Week1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number convert : ");
        int number = sc.nextInt();
        if (number >= 0 && number < 10)
            switch (number) {
                case 1:
                    System.out.println(" one ");
                    break;
                case 2:
                    System.out.println(" two ");
                    break;
                case 4:
                    System.out.println(" four ");
                    break;
                case 5:
                    System.out.println(" five ");
                    break;
                case 6:
                    System.out.println(" six ");
                    break;
                case 7:
                    System.out.println(" seven ");
                    break;
                case 8:
                    System.out.println(" eight ");
                    break;
                case 9:
                    System.out.println(" nine ");
                    break;
            }
        else {
            if (number >= 10 && number < 20) {
                switch (number) {
                    case 11:
                        System.out.println("Elevent");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("Thirteen");
                        break;
                    case 14:
                        System.out.println("have the number 4" + " read as: fourteen");
                        break;
                    case 15:
                        System.out.println("have the number 5" + "read as: Fiveteen");
                        break;
                    case 16:
                        System.out.println("have the number 6" + "read as: Sixteen");
                        break;
                    case 17:
                        System.out.println("have the number 7" + "read as: Seventeen");
                        break;
                    case 18:
                        System.out.println("have the number 8" + "read as: Eighteen");
                        break;
                    case 19:
                        System.out.println("have the number 9" + "read as: Nineteen");
                        break;
                }
            } else {
                if (number >= 20 && number < 100) {
                    int dozens = number / 10;
                    switch (dozens) {
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("fourty");
                            break;
                        case 5:
                            System.out.print("fivety");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;
                        // unit hàng đơn vị
                    }
                    int unit = number % 10;
                    switch (unit) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    System.out.println("Number convert: " + dozens + unit);
                } else if (number >= 100 && number < 1000) {
                    int hundreds = number / 100;
                    switch (hundreds) {
                        case 1:
                            System.out.println("One hundred");
                            break;
                        case 2:
                            System.out.println("Two hundred");
                            break;
                        case 3:
                            System.out.println("Three hundred");
                            break;
                        case 4:
                            System.out.println("Four hundred");
                            break;
                        case 5:
                            System.out.println("Five hundred");
                            break;
                        case 6:
                            System.out.println("Six hundred");
                            break;
                        case 7:
                            System.out.println("Seven hundred");
                            break;
                        case 8:
                            System.out.println("Eight hundred");
                            break;
                        case 9:
                            System.out.println("Nine hundred");
                            break;
                    }
                    int dozens = (number % 100) / 10;
                    switch (dozens) {
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("fourty");
                            break;
                        case 5:
                            System.out.print("fivety");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;
                    }
                    int unit = number % 10;
                    switch (unit) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    System.out.print("Number convert: " + hundreds + dozens + unit);
                }

            }
        }
    }
}
