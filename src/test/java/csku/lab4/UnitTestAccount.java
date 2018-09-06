package csku.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTestAccount {
    Account account;

    @BeforeEach
    void init(){
        account=new Account(10000.0,500.0);
    }

    @Test
    public void testCurrentIncome(){
        assertEquals(10000,account.getIncome());
    }

    @Test
    public void testCurrentExpense(){
        assertEquals(500,account.getExpense());
    }
    @Test
    public void testAddIncome(){
        account.addIncome(500);
        assertEquals(10000,account.getReamaining());
    }
    @Test
    public  void testUseMoney(){
        account.useMoney(500);
        assertEquals(9000,account.getReamaining());
    }


    @Test
    public void testUseMoneyLessThanBalanceMoney(){
        account.useMoney(3000);
        assertEquals(6500,account.getReamaining());
    }

    @Test
    public void testUseMoneyOverThanBalanceMoney(){
        account.useMoney(10000);

        assertEquals(-500,account.getReamaining());
    }

    @Test
    public void testCheckAllIncome(){
        account.addIncome(500);
        account.addIncome(300);
        account.addIncome(200);
        assertEquals(11000,account.getIncome());

    }
    @Test
    public void testCheckAllexpense(){
        account.useMoney(600);
        account.useMoney(400);
        assertEquals(1500,account.getExpense());

    }

}
