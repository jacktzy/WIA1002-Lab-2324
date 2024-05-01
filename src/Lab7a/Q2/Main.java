package Lab7a.Q2;

import Lab7a.Q1.MyQueue;

public class Main {
    public static boolean isPalindrome(String s) {

        MyQueue<Character> queue = new MyQueue<>();

        // Enqueue first half
        for (int i = 0; i < (s.length() + 1) / 2; i++) queue.enqueue(s.charAt(i));

        // Check second half
        for (int i = s.length() - 1; i >= (s.length() + 1) / 2; i--) {
            if (queue.dequeue() != s.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "racecar";
        String s2 = "raceecar";
        String s3 = "o";
        String s4 = "ol";

        System.out.println(Main.isPalindrome(s1));
        System.out.println(Main.isPalindrome(s2));
        System.out.println(Main.isPalindrome(s3));
        System.out.println(Main.isPalindrome(s4));
    }
}
