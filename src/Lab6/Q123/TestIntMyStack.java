package Lab6.Q123;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner input = new Scanner(System.in);

        // a) Prompt user to enter an integer value.
        System.out.print("Please enter an integer: ");
        int value = input.nextInt();

        // b) Push the values 1 through the user entered value onto the stack.
        for (int i = 1; i <= value; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        // c) Print the size of the stack.
        System.out.println("The size of the stack is " + stack.getSize());

        // d) Display the contents of the stack by repeatedly calling pop() until the stack is empty.
        System.out.print("Popping the stack: ");
        while (!stack.isEmpty()) {
            int intValue = stack.pop();
            System.out.print(intValue + " ");
        }
        System.out.print("\n");
    }
}
