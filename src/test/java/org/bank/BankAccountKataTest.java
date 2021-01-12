package org.bank;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.bank.model.Account;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BankAccountKataTest{

    private Account account;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Before
    public void setUp(){
        account = new Account(1000);
    }

    @Test
    public void testDeposit(){
        account.deposit(100);
        account.deposit(100);

        assertThat(account.getCheckingAccount(), equalTo(1200));
    }

    @Test
    public void testWithDrawal(){
        account.withdrawal(100);
        account.withdrawal(100);

        assertThat(account.getCheckingAccount(), equalTo(800));
    }
}
