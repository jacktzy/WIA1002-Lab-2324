package LabTest1.Set1;

public class EmployeeTesla<ID> extends Employee<ID> {

    public EmployeeTesla() {
        super();
    }

    public EmployeeTesla(String name) {
        super(name);
    }

    public EmployeeTesla(String name, int taxNo) {
        super(name, taxNo);
    }

    public EmployeeTesla(String name, int taxNo, ID id) {
        super(name, taxNo, id);
    }

    @Override
    public void introduce() {
        System.out.println("Employee Tesla starts working...");
        System.out.println("My name is " + this.name + ", my tax no is " + this.taxNo + ", and my employee id is " + this.id + ".");
        System.out.println("--- I am an Employee object ---\n");
    }
}
