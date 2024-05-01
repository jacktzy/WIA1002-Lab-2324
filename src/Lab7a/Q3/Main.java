package Lab7a.Q3;

import Lab7a.Q1.MyQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SharesQueue shareQueue = new SharesQueue();
        SharesQueue priceQueue = new SharesQueue();

        int capitalGainLoss = 0, numShares = 0, sellAmount = 0;

        do {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String[] query = scanner.nextLine().split(" ");
            numShares = Integer.parseInt(query[1]);
            sellAmount = Integer.parseInt(query[4].replace("$", ""));

            if (query[0].equalsIgnoreCase("Buy")) {
                System.out.println("Buying now ...");
                shareQueue.enqueue(numShares);
                priceQueue.enqueue(sellAmount);
            } else if (query[0].equalsIgnoreCase("Sell")) {
                System.out.println("Selling the shares now ...");

                while (numShares > 0) {
                    if (shareQueue.isEmpty() || priceQueue.isEmpty()) {
                        System.out.println("No shares to sell!");
                        break;
                    }
                    if (shareQueue.peek() > numShares) {
                        capitalGainLoss += numShares * (sellAmount - priceQueue.peek());
                        shareQueue.deductFirst(numShares);
                        numShares = 0;
                    } else {
                        capitalGainLoss += shareQueue.peek() * (sellAmount - priceQueue.dequeue());
                        numShares -= shareQueue.dequeue();
                    }
                    System.out.printf("Total Capital Gain / Loss: %s\n", capitalGainLoss);
                }
            }
            System.out.printf("Queue for Share: %s\n", shareQueue);
            System.out.printf("Queue for Price: %s\n", priceQueue);
        } while (!shareQueue.isEmpty() && !priceQueue.isEmpty());

        System.out.printf("Final Capital Gain / Loss: %s\n", capitalGainLoss);
        scanner.close();
    }
}
