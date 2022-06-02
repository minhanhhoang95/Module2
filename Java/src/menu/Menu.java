package menu;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int choice ;
    public void menuAdmin() {
        System.out.println("*************MENU******************");
        System.out.println("                                   ");
        System.out.println("*** 1. Quản lý người dùng       ***");
        System.out.println("*** 2. Quản lý hàng             ***");
        System.out.println("*** 3. Quản lý đơn đặt hàng     ***");
        System.out.println("*** 0. Exit                     ***");
        System.out.println("                                   ");
        System.out.println("***********************************");
        do {
            System.out.println("xin nhập số (1/2/3/0) để chạy : ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    menuAdmin1();
                    break;
                case 2:
                    menuAdmin2();
                    break;
                case 3 :
                    menuAdmin3();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    System.exit(0);
                default:
                    System.out.println("nhập sai :");
                    break;
            }
        }while (choice!=0);
    }

    public void menuAdmin1() {
        System.out.println("*************MENU******************");
        System.out.println("                                   ");
        System.out.println("***      1. Thêm người dùng     ***");
        System.out.println("***      2. Sửa người dùng      ***");
        System.out.println("***      3. Xóa người dùng      ***");
        System.out.println("***      4. Quay lại            ***");
        System.out.println("***      0. Exit                ***");
        System.out.println("                                   ");
        System.out.println("***********************************");
        do {
            System.out.println("xin nhập số (1/2/3/4/0) để chạy : ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm người dùng");;
                    break;
                case 2:
                    System.out.println("Sửa người dùng");
                    break;
                case 3 :
                    System.out.println("Xóa người dùng");;
                    break;
                case 4:
                    menuAdmin();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    System.exit(0);
                default:
                    System.out.println("nhập sai :");
                    break;
            }
        }while (choice!=4);

    }

    public void menuAdmin2() {
        System.out.println("*************MENU******************");
        System.out.println("                                   ");
        System.out.println("***      1. Thêm hàng           ***");
        System.out.println("***      2. Sửa hàng            ***");
        System.out.println("***      3. Xóa hàng            ***");
        System.out.println("***      4. Quay lại            ***");
        System.out.println("***      0. Exit                ***");
        System.out.println("                                   ");
        System.out.println("***********************************");
        do {
            System.out.println("xin nhập số (1/2/3/4/0) để chạy : ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm hàng");;
                    break;
                case 2:
                    System.out.println("Sửa hàng");
                    break;
                case 3 :
                    System.out.println("Xóa hàng");;
                    break;
                case 4:
                    menuAdmin();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    System.exit(0);
                default:
                    System.out.println("nhập sai :");
                    break;
            }
        }while (choice!=4);
    }

    public void menuAdmin3() {
        System.out.println("*************MENU******************");
        System.out.println("                                   ");
        System.out.println("***      1. Thêm đơn hàng       ***");
        System.out.println("***      2. Sửa đơn hàng        ***");
        System.out.println("***      3. Xóa đơn hàng        ***");
        System.out.println("***      4. Quay lại            ***");
        System.out.println("***      0. Exit                ***");
        System.out.println("                                   ");
        System.out.println("***********************************");
        try {
            do {
                System.out.println("xin nhập số (1/2/3/4/0) để chạy : ");

                choice= sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Thêm đơn hàng");;
                        break;
                    case 2:
                        System.out.println("Sửa đơn hàng");
                        break;
                    case 3 :
                        System.out.println("Xóa đơn hàng");;
                        break;
                    case 4:
                        menuAdmin();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        System.exit(0);
                    default:
                        System.out.println("nhập sai :");
                        break;
                }
            }while (choice!=4);
        } catch (Exception e) {
            System.out.println("Sai roài!!!");

        }


    }
}
