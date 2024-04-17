package Lab5.Q2;

/**
 * @author hairul
 */
public class MyLinkedList<E> {
    Node<E> head, tail;
    int size = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] objects) {
        for (E object : objects) {
            add(object);
        }
    }

    /**
     * i) Add an element into the list
     */
    public void add(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    /**
     * ii) Remove the element by searching the specified position in this list of the given value.
     * If there are repeated elements, only the first element will be removed
     * Does not return anything.
     */
    public void removeElement(E e) {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                remove(i);
                break;
            }
            current = current.next;
        }
    }

    public E removeFirst() {
        if (size == 0)
            return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null)
                tail = null;
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    /**
     * iii) Display all items in the list.
     */
    public void printList() {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            System.out.print(current.element);
            if (i == size - 1)
                System.out.print(". ");
            else
                System.out.print(", ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * iv) Returns size of the list
     */
    public int getSize() {
        return size;
    }


    /**
     * v) Check if the element of the given value is in the list.
     */
    public boolean contains(E e) {
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(e))
                return true;
        }
        return false;
    }

    /**
     * vi) Replace a specified item with a new item.
     */
    public void replace(E e, E newE) {
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(e))
                current.element = newE;
        }
    }
}

