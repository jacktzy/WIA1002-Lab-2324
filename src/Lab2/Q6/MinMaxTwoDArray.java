package Lab2.Q6;

public class MinMaxTwoDArray {
    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        
        System.out.println("Minimum: " + min(numbers));
        System.out.println("Maximum: " + max(numbers));
    }

    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (min.compareTo(list[i][j]) > 0) {
                    min = list[i][j];
                }
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (max.compareTo(list[i][j]) < 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
