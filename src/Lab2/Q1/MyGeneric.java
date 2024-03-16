package Lab2.Q1;

public class MyGeneric<E> {
    private E e;

    public MyGeneric() {
    }

    public MyGeneric(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        strObj.setE("Lorem Ipsum");
        System.out.println("Value e for strObj: " + strObj.getE());

        MyGeneric<Integer> intObj = new MyGeneric<>();
        intObj.setE(123);
        System.out.println("Value e for intObj: " + intObj.getE());

    }
}
