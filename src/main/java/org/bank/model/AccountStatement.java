package org.bank.model;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
public class AccountStatement {
    private Date date;
    private Integer amount;
    private Integer balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountStatement)) return false;
        AccountStatement that = (AccountStatement) o;
        return date.equals(that.date) &&
                amount.equals(that.amount) &&
                balance.equals(that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, balance);
    }

    public String toString(){
        return "date : "+date.toString()+", amount : "+amount+", balance : "+balance;
    }
}
