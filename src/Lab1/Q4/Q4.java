package Lab1.Q4;

import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {
        Account1 account = new Account1(1122, 1000, "George");
        Account1.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("-- Account summary --");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Annual interest rate: " + Account1.getAnnualInterestRate());
        System.out.println("Balance: " + account.getBalance());

        ArrayList<Transaction> transactions = account.getTransactions();
        System.out.println("Transaction:");
        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");

        for (Transaction transaction : transactions) {
            System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(), transaction.getType(), transaction.getAmount(), transaction.getBalance());
        }
    }

}
