package com.ironhack.bootcamp.s5.p1.e1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentList implements TransactionList {
    private List<Transaction> transactions;

    public PaymentList() {
        this.transactions = new ArrayList<>();
    }

    @Override
    public Transaction getLastTransaction() {
        return this.transactions.size() == 0 ? null : this.transactions.get(this.transactions.size()-1);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        for (Transaction tx : this.transactions) {
            if (tx.getDate().equals(date)) {
                return tx;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return this.transactions;
    }
}