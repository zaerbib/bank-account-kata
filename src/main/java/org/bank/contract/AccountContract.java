package org.bank.contract;

public interface AccountContract {
    void deposit(Integer amountOfMoney);
    void withdrawalSomeSavings(Integer amountOfMoney);
    void withdrawalAllSavings();
    void historyPrint();
}
