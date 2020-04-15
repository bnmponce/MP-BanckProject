package org.example.controller.providers;

import org.example.controller.interfaces.IInfoProvider;
import org.example.model.Account;
import org.example.model.Transaction;
import org.example.model.interfaces.IDataSaver;

import java.util.List;

public class TransactionByAccountProvider implements IInfoProvider<List<Transaction>, Integer> {

    private IDataSaver dataSaver;

    public TransactionByAccountProvider(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    @Override
    public List<Transaction> get(Integer accountId) {
        return dataSaver.getTransactionsByAccountId(accountId);
    }
}