package Lab7a.Q1;

public class MyQueueTest {
    public static void main(String[] args) {
        // a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        String[] readyfruit = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(readyfruit);

        // b. Then add new items in the following order: Apple, Orange, Grapes, Cherry.
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        // c. Display the queue.
        System.out.println("Current items: " + fruitQ);

        // d. Show the top item.
        System.out.println("peek (front item): " + fruitQ.peek());

        // e. Get the queue size.
        System.out.println("Queue size: " + fruitQ.getSize());

        // f. Delete Durian.
        fruitQ.dequeue();

        // g. Get item in index position of 2
        System.out.println("Item at index 2 is: " + fruitQ.getElement(2));

        // h. Check whether the queue consists of Cherry
        System.out.println("List contains 'Cherry':" + fruitQ.contains("Cherry"));

        // i. Check whether the queue consists of Durian
        System.out.println("List contains 'Durian':" + fruitQ.contains("Durian"));

        // j. Display the queue using the isEmpty() condition.
        while (!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }
    }
}
