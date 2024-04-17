package Lab5.Q2;

import java.util.Scanner;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> studentList = new MyLinkedList<>();
        Scanner input = new Scanner(System.in);

        // Admin staff shall be able to interact with the program.
        // The admin staff should enter a list of student’s names.
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        while (true) {
            String student = input.nextLine();
            if (student.equals("n"))
                break;
            studentList.add(student);
        }

        // Display the list of the entered student’s names.
        System.out.println("\nYou have entered the following students' name : ");
        studentList.printList();

        // Calculate the number of students in the list.
        System.out.println("\nThe number of students entered is : " + studentList.getSize());

        // Rename existing student’s name in the list with the new one specified by the admin staff.
        String changeStudent;
        System.out.println("\nAll the names entered are correct? Enter 'r' ro rename the student name, 'n' to proceed.");
        while (true) {
            changeStudent = input.nextLine();
            if (changeStudent.equals("r") || changeStudent.equals("n"))
                break;
            System.out.println("Wrong input, please try again.");
        }

        if (changeStudent.equals("r")) {
            System.out.println("Enter the existing student name that u want to rename : ");
            String oldName = input.nextLine();
            System.out.println("\nEnter the new name : ");
            String newName = input.nextLine();

            if (studentList.contains(oldName)) {
                studentList.replace(oldName, newName);
                System.out.println("\nThe new student list is : ");
                studentList.printList();
            } else
                System.out.println("\nThe student you entered is not in your current student list.");
        }

        // Delete a student name as specified by the admin staff.
        String choiceRemoveStudent;
        System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        while (true) {
            choiceRemoveStudent = input.nextLine();
            if (choiceRemoveStudent.equals("y") || choiceRemoveStudent.equals("n"))
                break;
            System.out.println("Wrong input, please try again.");
        }

        if (choiceRemoveStudent.equals("y")) {
            System.out.println("\nEnter a student name to remove : ");
            String removeStudent = input.nextLine();
            System.out.println();

            if (studentList.contains(removeStudent)) {
                studentList.removeElement(removeStudent);
            } else {
                System.out.println("Item you want to remove is not in the existing order list.");
            }

            System.out.println("The number of updated student is :" + studentList.getSize());
            System.out.println("The updated students list is :");
            studentList.printList();
        }
        System.out.println("\nAll student data captured complete. Thank you!");
        input.close();
    }
}
