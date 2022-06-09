package task.trycacth;

public class Demo {
    public static void main(String[] args) {
//        try {
//            int data = 5 / 0;
//        }catch (ArithmeticException e ){
//            System.out.println(e);
//        }
//        System.out.println("phép chia cho không ");


//

//        try {
//            int arr[] = new int[5];
//            arr[6] = 4;
//            System.out.println("arr[6 = " + arr[6]);
//
//            int data = 0;
//            int div = 10 / data;
//            System.out.println("Average = " + div);
//
//            String obj = null;
//            System.out.println(obj.length());
//        } catch (NullPointerException ex) {
//            System.out.println(ex);
//        } catch (ArithmeticException ex) {
//            System.out.println(ex);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println(ex);
//        }

//        System.out.println("Finished!");


//        try {
//            int data = 5 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }
//        System.out.println("Finished!");

        int age = 16 ;
        if(age > 18 ){
            System.out.println("được làm công");
        }else {
            throw new NullPointerException("bạn chưa đc 18t ");
        }
        System.out.println(" hoàn thành ");




    }

}
