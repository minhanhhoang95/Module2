package task.queue_stack;

import java.util.ArrayDeque;

public class DemoStack {
    public static void main(String[] args) {
       ArrayDeque<Integer> point = new ArrayDeque<>();
//        hàm push() thêm phần tử đầu tiên
        point.push(4);
        point.push(3);
        point.push(2);
        point.push(1);
        point.addFirst(0);
        System.out.println("Point : "+point);
        //hàm pop() xóa phần tử cuối cùng(lấy ra phần tử thay đổi độ dài )
        System.out.println(point.pop());// lấy  và xóa  phần tử 0 ra khỏi mãng
        //removefirst();
        System.out.println(("Point after remove : "+point));


    }
}
