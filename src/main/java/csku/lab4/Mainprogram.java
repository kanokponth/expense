package csku.lab4;

import java.util.Scanner;

public class Mainprogram {
    public static void main(String[] args) {
        Account account =new Account(0,0);
        Scanner Sc = new Scanner(System.in);
        while (true) {
            System.out.println("Option 1: add income  2: add out come 3: check sum money 4:check income 5:check expense 6:Exit" );
            System.out.println("Option : ");
            int s = Sc.nextInt();
            if(s==1){
                System.out.println("Income: ");
                int income = Sc.nextInt();
                account.addIncome(income);
            }
            if(s==2){
                System.out.println("Outcome: ");
                int outcome = Sc.nextInt();
                account.useMoney(outcome);
            }
            if(s==3){
                System.out.println("Summoney: ");
                System.out.println(account.getReamaining());

            }
            if(s==4){
                System.out.println("All Income: ");
                System.out.println(account.getIncome());

            }
            if(s==5){
                System.out.println("All Expense: ");
                System.out.println(account.getExpense());

            }

            if(s==6){
                break;

            }
            else{


            }


        }

    }

}
