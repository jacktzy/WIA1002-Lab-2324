package Lab7a.Q3;

import Lab7a.Q1.MyQueue;

public class SharesQueue extends MyQueue<Integer> {
    public void deductFirst(int e) {
        super.list.set(0, super.peek() - e);
    }
}
