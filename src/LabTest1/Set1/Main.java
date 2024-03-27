package LabTest1.Set1;

/**
 * Lab Test 1
 * 21/3/2024
 * Thursday 12pm - 1pm
 */

public class Main {
    public static void main(String[] args) {
        Employee<Integer> employee1 = new EmployeeTesla<>();
        employee1.introduce();

        Employee<String> employee2 = new EmployeeTesla<>("Alisa");
        employee2.introduce();

        Employee<Double> employee3 = new EmployeeTesla<>("Adam", 6541);
        employee3.introduce();

        Employee<Long> employee4 = new EmployeeTesla<>("Ali", 3941, 12345L);
        employee4.introduce();
    }
}
