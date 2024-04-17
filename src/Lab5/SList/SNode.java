package Lab5.SList;

public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode() {
        element = null;
        next = null;
    }

    public SNode(E item) {
        element = item;
        next = null;
    }
}
