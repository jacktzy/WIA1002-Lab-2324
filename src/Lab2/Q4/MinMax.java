package Lab2.Q4;

public class MinMax {
    public static <E extends Comparable<E>> String minmax(E[] array) {
        E min = array[0];
        E max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }

        return "Min = " + min + " Max = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
        String intStr = minmax(intArr);
        System.out.println(intStr);

        String[] strArr = {"red", "blue", "orange", "tan"};
        String strStr = minmax(strArr);
        System.out.println(strStr);
    }
}
