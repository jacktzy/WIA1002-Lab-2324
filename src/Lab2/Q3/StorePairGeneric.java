package Lab2.Q3;

public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>> {
    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    // b) Override the Object equals() method in the StorePair class
    // to compare the first values of two objects for equality.
    @Override
    public boolean equals(Object o) {
        StorePairGeneric<E> other = (StorePairGeneric<E>) o;
        return this.first.equals(other.first);
    }

    // c) Have the StorePair class implement the Comparable interface.
    // Override the compareTo()method to compare the first values of two objects.
    @Override
    public int compareTo(StorePairGeneric<E> o) {
        return this.first.compareTo(o.first);
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    public static void main(String[] args) {
        // d) Create a test program that creates three objects of the StorePair generic class
        // called a, b and c. Set the first and second values of a, b, c as (6,4), (2,2), (6,3).
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        // e) Invoke the compareTo()and equals() methods that compares the
        // three objects created in (d) in the test program.
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(a.compareTo(b)); // a > b, it returns 1
        System.out.println(a.compareTo(c)); // a == c, it returns 0
        System.out.println(b.compareTo(c)); // b < c, it returns -1
        System.out.println(a.equals(b)); // return false
        System.out.println(a.equals(c)); // return true
        System.out.println(b.equals(c)); // return false
    }
}
