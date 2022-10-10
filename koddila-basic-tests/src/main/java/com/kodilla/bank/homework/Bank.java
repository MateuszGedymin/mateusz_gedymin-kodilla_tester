package com.kodilla.bank.homework;

public class Bank {



    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(1000);
        cashMachine1.withdraw(350);
        System.out.println("Tablica CashMachine1: " + cashMachine1.size());

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.deposit(578);
        cashMachine2.withdraw(200);
        System.out.println("Tablica CashMachine2: " + cashMachine2.size());

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.deposit(231);
        cashMachine3.withdraw(200);
        System.out.println("Tablica CashMachine3: " + cashMachine3.size());

        System.out.println("całkowity bilans ze wszystkich bankomatów: " + (cashMachine1.saldo() + cashMachine2.saldo() + cashMachine3.saldo()));
        System.out.println("liczbę transakcji związanych z wypłatą: " + (cashMachine1.getWithdrawCount() + cashMachine2.getWithdrawCount() + cashMachine3.getWithdrawCount()));
        System.out.println("liczbę transakcji związaną z wpłatą pieniędzy: "  + (cashMachine1.getDepositCount() + cashMachine2.getDepositCount() + cashMachine3.getDepositCount()));


        System.out.println("średnia kwota wypłat " + ((cashMachine1.makingNegArr() + cashMachine2.makingNegArr() + cashMachine3.makingNegArr()) / (cashMachine1.getWithdrawCount() + cashMachine2.getWithdrawCount() + cashMachine3.getWithdrawCount())));
        System.out.println("średnia kwota wpłat " + ((cashMachine1.makingPositiveArr() + cashMachine2.makingPositiveArr() + cashMachine3.makingPositiveArr()) / (cashMachine1.getWithdrawCount() + cashMachine2.getWithdrawCount() + cashMachine3.getWithdrawCount())));
    }




}
