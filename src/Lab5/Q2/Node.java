package Lab5.Q2;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(E item) {
        element = item;
        next = null;
    }
}