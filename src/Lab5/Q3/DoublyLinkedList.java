/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.Q3;

import java.util.*;

/**
 * @author Hairul
 */

public class DoublyLinkedList<E> {

    public class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Node(E element) {
            this(element, null, null);
        }
    }


    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E element) {
        Node<E> tmp = new Node(element, head, null);
        if (head != null)
            head.prev = tmp;
        head = tmp;
        if (tail == null)
            tail = tmp;
        size++;
        System.out.println("adding: " + element);
    }

    public void addLast(E element) {
        Node<E> tmp = new Node(element, null, tail);
        if (tail != null)
            tail.next = tmp;
        tail = tmp;
        if (head == null)
            head = tmp;
        size++;
        System.out.println("adding: " + element);
    }

    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(element);
        else if (index == size)
            addLast(element);
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++)
                temp = temp.next;
            Node<E> insert = new Node(element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        }
    }

    public void iterateForward() {
        System.out.println("\niterating forward..");
        Node<E> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.element);
            System.out.print(" ");
            tmp = tmp.next;
        }
    }

    public void iterateBackward() {
        System.out.println("\niterating backward..");
        Node<E> tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.element);
            System.out.print(" ");
            tmp = tmp.prev;
        }
    }

    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node<E> tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }


    public E removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node<E> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }

    public E remove(int index) {
        E element = null;
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            element = removeFirst();
        else if (index == size - 1)
            element = removeLast();
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++)
                temp = temp.next;
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return element;
    }

    public void clear() {
        int initial = size;
        Node<E> temp = head;
        while (head != null) {
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.println("successfully clear " + initial + " node(s)");
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

        // 1) Add first node with value of 1
        doublyLinkedList.addFirst(1);

        // 2) Add last node with value of 10 and 100
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(100);

        // 3) Add node with value of 2 at position index of 2
        doublyLinkedList.add(2, 2);

        // 4) Remove node at position index of 3
        doublyLinkedList.remove(3);

        // 5) Traverse Forward
        doublyLinkedList.iterateForward();

        // 6) Traverse Backward
        doublyLinkedList.iterateBackward();

        // 7) Print current size of linked list
        System.out.println("\nsize of current Doubly Linked List: " + doublyLinkedList.size());

        // 8) Clear all nodes in the linked list
        doublyLinkedList.clear();

        // 9) Print again current size of linked list
        System.out.println("\nsize of current Doubly Linked List: " + doublyLinkedList.size());

    }
}
