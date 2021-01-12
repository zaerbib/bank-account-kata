package org.bank;

import org.bank.model.Account;

/**
 * Hello world!
 *
 */
public class BankAccountKata
{
    public static void main( String[] args )
    {
        System.out.println( "Bank Account Kata !" );

        // Account with some money
        Account account = new Account(1000);

        // us 1
        account.deposit(100);

        // us 2
        account.withdrawal(300);

        // us 2.1
        account.withdrawal(800);

        //us 3
        System.out.println("Printing histories : ");
        account.historyPrint();
    }
}
