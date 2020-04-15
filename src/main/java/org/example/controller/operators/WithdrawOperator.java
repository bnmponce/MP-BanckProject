package org.example.controller.operators;

import org.example.controller.interfaces.IAccountOperator;
import org.example.model.Transaction;
import org.example.model.TransactionType;
import org.example.model.interfaces.IDataSaver;
import org.example.model.persistence.DataInMemory;

public class WithdrawOperator implements IAccountOperator {

    private IDataSaver dataSaver;

    public WithdrawOperator(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }
    @Override
    public boolean execute(int id, double amount) {

        if (validateBalance(id, amount)){
            Transaction withdraw = new Transaction(TransactionType.WITHDRAW, amount, id);
            dataSaver.addTransaction(withdraw);
            dataSaver.updateBalanceByAccountId(withdraw);
            return true;
        }else {
            return false;
        }
    }

    private boolean validateBalance(int id, double amount)
    {
        double balanceAmount = dataSaver.getBalanceByAccountId(id);
        return balanceAmount >= amount;
    }
}
