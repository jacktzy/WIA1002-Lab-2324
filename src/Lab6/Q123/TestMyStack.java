package Lab6.Q123;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack1 = new MyStack<>();

        // Question b
        // 1) Following the given order, add elements, a b and c in the stack.
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');

        // 2) Print the stack.
        System.out.println(stack1);
        System.out.println("Value c is at location " + stack1.search('c'));

        // 3) Check if element ‘b’ is in the stack.
        System.out.println("Does value b exist in stack1? " + stack1.search('b'));

        // 4) Check if element ‘k’ is in the stack.
        System.out.println("Does value k exist in stack1? " + stack1.search('k') + "\n");

        // Question c
        // 1) Following the given order, add elements, 1 2 and 3 in the stack.
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        // 2) Print the stack.
        System.out.println(stack2);

        // 3) Check if element ‘6’ is in the stack.
        System.out.println("Does value 6 exist in stack2?: " + stack2.search(6));
    }
}
