package Lab6.Q123;

public class Q3 {
    public int reduce(MyStack<Integer> stack) {
        int sum = 0;
        while (!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
