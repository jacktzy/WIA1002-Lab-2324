package Lab4;

public class MyLinkedList<E> {
    Node<E> head, tail;
    int size = 0;

    public MyLinkedList() {
    }

    public void add(E e) {
        add(size, e);
    }

//    3a. public void addFirst(E e)

    /**
     * Add an element to the beginning of the list
     */
    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

//    3b. public void addLast(E e)

    /**
     * Add an element to the end of the list
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

//    3c. public void add(int index, E e)

    /**
     * Add a new element at the specified index in this list
     * The index of the head element is 0
     */
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


//    3d. public E removeFirst()

    /**
     * Remove the head node and
     * return the object that is contained in the removed node.
     */
    public E removeFirst() {
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

//    3e. public E removeLast()

    /**
     * Remove the last node and
     * return the object that is contained in the removed node.
     */
    public E removeLast() {
        if (size == 0) return null;
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


//    3f. public E remove(int index)

    /**
     * Remove the element at the specified position in this list.
     * Return the element that was removed from the list.
     */
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
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

//    Number 4

    /**
     * Return true if list contains the element e
     */
    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(i)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Return element at the specified index
     */
    public E get(int index) {
        if (index < 0 || index > size - 1) return null;
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    /**
     * Return the value of the first item
     */
    public E getFirst() {
        if (size == 0) return null;
        else return head.element;
    }

    /**
     * Return the value of the last item
     */
    public E getLast() {
        if (size == 0) return null;
        else return tail.element;
    }

    /**
     * Return the index of the head matching element in
     * this list. Return -1 of no match
     */
    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * Return the index of the last matching element in this
     * list. Return -1 of no match
     */
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
    }

    /**
     * Replace the element at the specified position in this
     * list with the specified element
     */
    public E set(int index, E e) {
        if (index < 0 || index > size - 1) return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E temp = current.element;
        current.element = e;
        return temp;
    }

    /**
     * Clear the list
     */
    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * Print all the elements in the list
     */
    public void print() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Print all elements in reverse order
     */
    public void reverse() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    // Question 2

    /**
     * Returns the value of the middle element of a linked list.
     */
    public E getMiddleValue() {
        Node<E> current = head;
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current.element;
    }
}
