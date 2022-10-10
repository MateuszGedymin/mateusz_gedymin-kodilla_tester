package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldAddNothing () {
        CashMachine cashMachine1 = new CashMachine();

        cashMachine1.deposit(-100);
        assertEquals(0, cashMachine1.saldo());
    }
}
