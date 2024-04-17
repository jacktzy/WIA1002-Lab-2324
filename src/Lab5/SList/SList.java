package Lab5.SList;

public class SList<E> {
    protected SNode<E> head, tail;
    int size = 0;

    public SList() {
        head = tail = null;
    }

    /**
     * 3i) Append a new element at the end of the list.
     */
    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    /**
     * 3ii) Eliminate the first element in the list.
     */
    public E removeInitial() {
        if (size == 0) return null;
        else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

    /**
     * 3iii) Search for an element and returns true if this list contains the searched element
     */
    public boolean contains(E o) {
        for (SNode<E> current = head; current != null; current = current.next) {
            if (current.element.equals(o)) return true;
        }
        return false;
    }

    /**
     * 3iv) Empty all elements in the list and return a statement that reports that the list is empty.
     */
    public void clear() {
        size = 0;
        head = tail = null;
    }

    /**
     * 3v) Display all values from the list in a successive order.
     */
    public void display() {
        for (SNode<E> current = head; current != null; current = current.next) {
            System.out.println(current.element);
        }
    }
}
