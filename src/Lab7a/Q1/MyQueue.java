package Lab7a.Q1;

import java.util.LinkedList;

public class MyQueue<E> {
    protected LinkedList<E> list = new LinkedList<E>();

    public MyQueue(E[] e) {
        for (E value : e) {
            enqueue(value);
        }
    }

    public MyQueue() {
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E getElement(int i) {
        return (E) list.get(i);
    }

    public E peek() {
        return list.peek();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}