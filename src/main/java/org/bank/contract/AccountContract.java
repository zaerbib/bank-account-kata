package org.bank.contract;

public interface AccountContract {
    void deposit(Integer amountOfMoney);
    void withdrawal(Integer amountOfMoney);
    void historyPrint();
}
