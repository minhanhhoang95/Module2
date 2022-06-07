package dsa.tasklinkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addLast(2);
//        myLinkedList.addLast(3);
//        myLinkedList.addLast(5);
//        myLinkedList.addLast(4);
//        myLinkedList.add(3, 4);
     myLinkedList.printlist();

    }
}
