package csku.lab4;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefAccount {
    Account account;
    @Before
    public void init(){
        account=new Account(0,0);
    }

    @Given("a user has (.*) for income")
    public void a_user_has_for_income(double income){
        account.addIncome(income); }

    @When("I add income amount (.*)")
    public void i_add_income_amount(double income){

        account.addIncome(income);
    }

    @When("I use a money amount (.*)")
    public void i_use_a_money_amount(double expense){

        account.useMoney(expense);
    }

    @When("I want to check my balance income that is (.*)")
    public void i_want_to_check_my_balance_income_that_is(double remaining){ assertEquals(remaining,account.getReamaining());
    }


    @Then("I have income amount (.*)")
    public void i_have_income_amount(double income){
        assertEquals(income,account.getIncome());
    }

    @Then("my expense is (.*)")
    public void my_expense_is(double expense){
        assertEquals(expense,account.getExpense());
    }

    @Then("system shows my balance income amount (.*)")
    public void system_shows_my_balance_income_amount(double remainingIncome){
        assertEquals(remainingIncome,account.getReamaining());
    }
    @Then("system shows my balance expense amount (.*)")
    public void system_shows_my_balance_expense_amount(double remainingIncome){
        assertEquals(remainingIncome,account.getReamaining());
    }
    @Then("system shows my income amount (.*)")
    public void system_shows_my_income_amount(double income){ assertEquals(income,account.getIncome());
    }


    @Then("system shows my expense amount (.*)")
    public void system_shows_my_expense_amount(double expense){ assertEquals(expense,account.getExpense());
    }


}
