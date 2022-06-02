package task.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> point = new ArrayList<>();
        //mãng rỗng
        System.out.println(point.isEmpty());
        //thêm phần tử vào mãng add ()
        point.add(10);
        point.add(9);
        point.add(8);
        point.add(5);
        point.add(6);
        //mãng đã có phần tử
        System.out.println(point.isEmpty());
        System.out.println("Các phần tử : " + point);
        //lấy giá trị từ mãng get ()
        for (int i = 0 ; i < point.size(); i++) {
            System.out.println(point.get(i));
        }
        //xóa phần tử ở vị trí : ?
        point.remove(1);//xóa số 9
        System.out.println("sau khi xóa : " + point);




    }
}
