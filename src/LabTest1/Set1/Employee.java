package LabTest1.Set1;

public abstract class Employee<ID> {
    protected String name = "John Doe";
    protected int taxNo = 9999;
    protected ID id = (ID) "1111";

    public Employee() {
        System.out.println("Constructor 1 running ...");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Constructor 2 running ...");
    }

    public Employee(String name, int taxNo) {
        this.name = name;
        this.taxNo = taxNo;
        System.out.println("Constructor 3 running ...");
    }

    public Employee(String name, int taxNo, ID id) {
        this.name = name;
        this.taxNo = taxNo;
        this.id = id;
        System.out.println("Constructor 4 running ...");
    }

    public abstract void introduce();
}
