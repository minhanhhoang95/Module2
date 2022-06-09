package collectionframwork.treebinary;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
