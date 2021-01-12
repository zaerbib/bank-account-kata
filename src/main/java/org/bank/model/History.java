package org.bank.model;

import lombok.Data;

import java.util.Objects;

@Data
public class History {
    private Operation operation;
    private AccountStatement accountStatement;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof History)) return false;
        History history = (History) o;
        return operation == history.operation &&
                accountStatement.equals(history.accountStatement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, accountStatement);
    }

    public String toString(){
        return "operation : "+operation.getOperation()+", account statement : ["+accountStatement.toString()+"]";
    }
}
