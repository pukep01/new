package ru.itpark.domain;

public class Account {
    private int id;
    private long balance;

    public Account(int id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
