package org.bank.model;

public enum Operation {
    DEPOSIT("deposit"),
    WITHDRAWAL("withdrawal"),
    WITHDRAWAL_ALL("withdrawal_all");

    private String operation;

    private Operation(String operation){
        this.operation = operation;
    }

    public String getOperation(){
        return this.operation;
    }
}
