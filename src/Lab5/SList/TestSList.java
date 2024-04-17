package Lab5.SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        // 1) Append the following values individually: “Linked list, is, easy.”
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");

        // 2) Display these values.
        list.display();

        // 3) Remove the word ‘Linked list’ and display the removed value.
        System.out.println("The removed word is " + list.removeInitial());

        // 4) Check if ‘difficult’ is in the list.
        System.out.println("Does the list contain the word 'difficult'? " + list.contains("difficult"));

        // 5) Clear the list.
        list.clear();
    }
}
