package Lab6.Q123;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
    ArrayList<E> list = new ArrayList<E>();

    // No 1
    public void push(E o) {
        list.add(o);
    }

    // No 2
    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    // No 3
    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return list.get(getSize() - 1);
    }

    // No 4
    public int getSize() {
        return list.size();
    }

    // No 5
    public Boolean isEmpty() {
        return list.isEmpty();
    }

    // No 6
    @Override
    public String toString() {
        return "stack" + list.toString();
    }

    // No 7
    // to return true if found, false if not found
    public boolean search(E o) {
        return list.contains(o);
    }

    // to return int value, 1 if found, 0 if not found
    /*
    public int search(E o) {
        if(list.contains(o))
            return 1;
        else
            return 0;
    }
    */

    // returns -1 if not found, otherwise returns location number for the found element
    /*
    public int search(E o) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(o))
                return i;
        }
        return index;
    }
    */
}
