package org.example.controller.providers;

import org.example.controller.interfaces.IInfoProvider;
import org.example.model.Account;
import org.example.model.interfaces.IDataSaver;

import java.util.List;

public class BalanceByAccountProvider implements IInfoProvider<Double, Integer> {

    private IDataSaver dataSaver;

    public BalanceByAccountProvider(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    @Override
    public Double get(Integer accountId) {
        return dataSaver.getBalanceByAccountId(accountId);
    }
}
