package Lab2.Q2;

public class CompareMax {

    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }
}
