package Lab7b;

import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // Insert integers into a priority queue
        int[] arr = {4, 8, 1, 2, 9, 6, 3, 7};
        for (int num : arr) {
            q.add(num);
        }

        // toString() - Display all the elements inside this priority queue.
        System.out.println(q.toString());

        // poll() – retrieve and remove the first element in this priority queue.
        System.out.println("First element (and remove): " + q.poll());

        // toArray() – convert the priority queue into an array and display.
        Object[] array = q.toArray();
        for (Object o : array) {
            System.out.println(o);
        }

        // peek() – retrieve the first element in the priority queue.
        System.out.println("First element (and NOT remove): " + q.peek());

        // contains() – check if the priority queue consists of element “1”.
        System.out.println("Element 1 is inside the PQ: " + q.contains(1));

        // size() – get the current size of the priority queue.
        System.out.println("Size of the PQ: " + q.size());

        // isEmpty() – display while removing the elements in the queue until it is empty.
        while (!q.isEmpty()) {
            System.out.println("Current element to be removed: " + q.poll());
            System.out.println("Remaining element(s): " + q.toString());
        }
    }
}
