package org.bank.model;

import lombok.Getter;
import lombok.Setter;
import org.bank.contract.AccountContract;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Account implements AccountContract {
    private Integer checkingAccount;
    private List<History> histories;

    public Account(Integer checkingAccount){
        this.checkingAccount = checkingAccount;
        histories = new ArrayList<>();
    }

    @Override
    public void deposit(Integer amountOfMoney) {
        this.checkingAccount += amountOfMoney;

        // déclaration du compte à l'instant t
        AccountStatement accountStatement = new AccountStatement();
        accountStatement.setDate(new Date());
        accountStatement.setAmount(amountOfMoney);
        accountStatement.setBalance(this.checkingAccount);

        // sauvegarde
        History history = new History();
        history.setOperation(Operation.DEPOSIT);
        history.setAccountStatement(accountStatement);

        this.getHistories().add(history);
    }

    @Override
    public void withdrawalSomeSavings(Integer amountOfMoney) {
        this.checkingAccount -= amountOfMoney;

        // déclaration du compte à l'instant t
        AccountStatement accountStatement = new AccountStatement();
        accountStatement.setDate(new Date());
        accountStatement.setAmount(amountOfMoney);
        accountStatement.setBalance(this.checkingAccount);

        // sauvegarde
        History history = new History();
        history.setOperation(Operation.WITHDRAWAL);
        history.setAccountStatement(accountStatement);

        this.getHistories().add(history);
    }

    @Override
    public void withdrawalAllSavings() {
        Integer tmp = this.checkingAccount;
        this.checkingAccount = 0;

        // déclaration du compte à l'instant t
        AccountStatement accountStatement = new AccountStatement();
        accountStatement.setDate(new Date());
        accountStatement.setAmount(tmp);
        accountStatement.setBalance(this.checkingAccount);

        // sauvegarde
        History history = new History();
        history.setOperation(Operation.WITHDRAWAL_ALL);
        history.setAccountStatement(accountStatement);

        this.getHistories().add(history);
    }

    @Override
    public void historyPrint() {
        histories.forEach(history -> {
            System.out.println(history);
        });
    }
}
