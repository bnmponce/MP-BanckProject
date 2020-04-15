package org.example.controller;

import org.example.controller.interfaces.IAccountOperator;
import org.example.controller.providers.BalanceByAccountProvider;
import org.example.controller.providers.TransactionByAccountProvider;
import org.example.model.Transaction;

import java.util.List;

public class BankAccountController {
    private IAccountOperator withdrawOperator;
    private IAccountOperator depositOperator;
    private BalanceByAccountProvider accountBalance;
    private TransactionByAccountProvider transactions;

    public BankAccountController(IAccountOperator withdrawOperator, IAccountOperator depositOperator, BalanceByAccountProvider accountBalance, TransactionByAccountProvider transactions ) {
        this.withdrawOperator = withdrawOperator;
        this.depositOperator = depositOperator;
        this.accountBalance = accountBalance;
        this.transactions = transactions;
    }

    public boolean withdrawOperation(int accountId, double amount) {
       return this.withdrawOperator.execute(accountId, amount);
    }

    public boolean depositOperator(int accountId, double amount) {
        return this.depositOperator.execute(accountId, amount);
    }

    public double accountBalance(int accountId){
        return this.accountBalance.get(accountId);
    }

    public List<Transaction> accountTransactions(int accountId)
    {
        return this.transactions.get(accountId);
    }

}