package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private String ownerId;
    private List<Transaction> transactions;
    private double accountBalance;

    public Account(int id, String ownerId, double accountBalance) {
        this.id = id;
        this.ownerId = ownerId;
        transactions = new ArrayList<>();
        this.accountBalance = accountBalance;
    }

    public int getId() {
        return id;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public String getOwnerId() {
        return ownerId;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void updateAccountBalance (Transaction transaction){
        if (transaction.getType() == TransactionType.DEPOSIT)
        {
            accountBalance = accountBalance + transaction.getAmount();
        }else{
            accountBalance = accountBalance - transaction.getAmount();
        }

    }
    public List<Transaction> getTransactions(){
        return transactions;
    }
}
