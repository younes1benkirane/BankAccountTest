package org.sgcib.itec.fcc.business;

public class Account {

    private final String id;
    private double balance;

    public Account(String id) {
        this.id = id;
    }

    public Account(String id, double balance) {
        this(id);
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
