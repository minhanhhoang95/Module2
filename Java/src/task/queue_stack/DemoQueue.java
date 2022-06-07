package task.queue_stack;

import java.util.ArrayDeque;

import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> point = new ArrayDeque<>();
        //offer () thêm phần tử vào phía cuối
        point.offer(1);
        point.offer(2);
        point.offer(3);
        point.offer(4);
        System.out.println("Point :" +point);
        // lấy về phần tử đầu tiên , trả về null nếu rỗng(không thay đổi độ dài mãng)
        System.out.println(point.peek());
        System.out.println("Point : "+point);
        point.poll();
        System.out.println(point);
    }
}
