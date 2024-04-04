package Lab4;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> cList = new MyLinkedList<>();

        // 5a) Append the following : a, b, c, d, e
        cList.add('a');
        cList.add('b');
        cList.add('c');
        cList.add('d');
        cList.add('e');

        // 5b) Print all the elements in the list.
        cList.print();

        // 5c) Reverse all the elements in the list.
        System.out.println("The reversed list is :");
        cList.reverse();

        // 5d) Retrieve the number of elements in the list
        System.out.println("\nThe number of elements in the list is : " + cList.getSize());

        // 5e) Retrieve the first and last value.
        System.out.println("\nThe first value in the list is : " + cList.getFirst());
        System.out.println("The last value in the list is : " + cList.getLast());

        // 5f) Delete the third value.
        System.out.println("\nThe removed value in the list is : " + cList.remove(2));
        System.out.println("The content of the list : ");
        cList.print();

        // 5g) Retrieve the index location for the second and third value.
        System.out.println("\nThe index value for item 'b'(second item) of the list is : " + cList.indexOf('b'));
        System.out.println("\nThe index value for item 'd'(third item) of the list is : " + cList.indexOf('d'));

        // 5h) Checks if the list has the value ‘c’.
        System.out.println("\nDoes the list contain item 'c' : " + cList.contains('c'));

        // 5i) Replace the items individually with the following: j,a,v,a.
        cList.set(0, 'j');
        cList.set(1, 'a');
        cList.set(2, 'v');
        cList.set(3, 'a');
        cList.print();
    }
}
