package Lab2.Q5;

public class FindMax {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"red", "green", "blue"};
        Circle[] circleArr = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println("Maximum in Integer Array: " + max(intArr));
        System.out.println("Maximum in String Array: " + max(strArr));
        System.out.println("Maximum in Circle Array: " + max(circleArr));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;
    }

    static class Circle implements Comparable<Circle> {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle c) {
            if (this.radius < c.radius)
                return -1;
            else if (this.radius > c.radius)
                return 1;
            else
                return 0;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }
    }
}
