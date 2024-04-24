package Lab6;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input any string: ");
        String input = s.nextLine();

        if (isPalindrome(input)) System.out.println(input + " is a palindrome");
        else System.out.println(input + " is not a palindrome");

    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < (s.length() + 1) / 2; i++) {
            stack.push(s.charAt(i));
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            if (stack.pop() != s.charAt(i)) return false;
        }

        return true;
    }
}
