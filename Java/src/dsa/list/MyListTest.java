package dsa.list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("elememt 4 : "+ listInteger.get(4));
        System.out.println("elememt 1 : "+ listInteger.get(1));
        System.out.println("elememt 2 : "+ listInteger.get(2));
        System.out.println(listInteger);
//        listInteger.get(6);
//        System.out.println("elememt 6 : "+ listInteger.get(6));

    }
}
