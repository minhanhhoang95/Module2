package dsa.arraylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6, 7);
//        list.clear();
        list.show();
    }
}
