package csku.lab4;

public class Account {
    private double income;//รายได้เริ่มต้น
    private double reamaining;//รายได้ที่เหลือ
    private double expense;//ค่าใช้จ่าย

    public Account(double income, double expense) {
        this.income = income;
        this.reamaining=income-expense;
        this.expense = expense;
    }

    public void addIncome(double income){

        reamaining+=income;
        this.income+=income;
    }

    public void useMoney(double expense){

        reamaining-=expense;
        this.expense+=expense;


    }

    public double getIncome() {
        return income;
    }

    public double getReamaining() {
        return reamaining;
    }

    public double getExpense() {
        return expense;
    }


}
