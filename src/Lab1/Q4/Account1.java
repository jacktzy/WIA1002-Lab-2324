package Lab1.Q4;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private int id;

    private double balance;

    private static double annualInterestRate;

    private Date dateCreated;

    private String name;

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account1() {
        this.dateCreated = new Date();
    }

    public Account1(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public Account1(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.dateCreated = new Date();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return (this.balance * this.getMonthlyInterestRate()) / 100;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw"));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account1.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
