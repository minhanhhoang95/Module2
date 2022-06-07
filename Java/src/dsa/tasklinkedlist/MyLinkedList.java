package dsa.tasklinkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    private boolean flag;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList(){
        Object data = new Object();
        head=new Node(data);
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public boolean remove(Object data) {
        if (contains(data)) {
            remove(indexOf(data ));
            return true;
        }
        return false;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }


    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object e) {
        int index = 0;
        if (e == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (e.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public MyLinkedList clone() {
        Node temp = head;
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i=0;i<numNodes;i++){
            myLinkedList.addLast(temp.data);
            temp=temp.next;
        }
        return myLinkedList;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
