package Lab7b;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        // Sort the priority queue in reversing order.
        // Collections.reverseOrder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // use Comparator interface
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                if (a < b) return 1;
//                if (a > b) return -1;
//                return 0;
//            }
//        });

        // use lambda expression
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
//            if (a < b) return 1;
//            if (a > b) return -1;
//            return 0;
//        });

        // Insert integers into a priority queue
        int[] arr = {4, 8, 1, 2, 9, 6, 3, 7};
        for (int num : arr) {
            pq.add(num);
        }

        // toString() - Display all the elements inside this priority queue.
        System.out.println(pq.toString());

        // poll() – retrieve and remove the first element in this priority queue.
        System.out.println("First element (and remove): " + pq.poll());

        // add() – add new element 5 into the priority queue
        pq.add(5);

        // toArray() – convert the priority queue into an array and display.
        Object[] array = pq.toArray();
        for (Object o : array) {
            System.out.println(o);
        }

        // peek() – retrieve the first element in the priority queue.
        System.out.println("First element (and NOT remove): " + pq.peek());

        // contains() – check if the priority queue consists of element “1”.
        System.out.println("Element 1 is inside the PQ: " + pq.contains(1));

        // size() – get the current size of the priority queue.
        System.out.println("Size of the PQ: " + pq.size());

        // isEmpty() – display while removing the elements in the queue until it is empty.
        while (!pq.isEmpty()) {
            System.out.println("Current element to be removed: " + pq.poll());
            System.out.println("Remaining element(s): " + pq.toString());
        }
    }
}
