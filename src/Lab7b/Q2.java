package Lab7b;

import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) {
        // First priority queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("George");
        pq1.add("Jim");
        pq1.add("John");
        pq1.add("Blake");
        pq1.add("Kevin");
        pq1.add("Michael");
        System.out.println("First Priority Queue: " + pq1);

        // Second priority queue
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("George");
        pq2.add("Katie");
        pq2.add("Kevin");
        pq2.add("Michelle");
        pq2.add("Ryan");
        System.out.println("Second Priority Queue: " + pq2);

        // Union
        System.out.println("\nUnion for two priority queues:");
        for (String element : pq1) {
            System.out.print(element + " ");
        }
        for (String element : pq2) {
            if (!pq1.contains(element))
                System.out.print(element + " ");
        }
        System.out.println();

        // Intersection
        System.out.println("\nIntersection for two priority queues:");
        for (String element : pq1) {
            if (pq2.contains(element))
                System.out.print(element + " ");
        }

        // Difference
        System.out.println("\n\nDifference for two priority queues:");
        for (String element : pq1) {
            if (!pq2.contains(element))
                System.out.print(element + " ");
        }
    }
}