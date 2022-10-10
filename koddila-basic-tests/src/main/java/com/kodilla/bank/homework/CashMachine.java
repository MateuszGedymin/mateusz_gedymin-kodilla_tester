package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int[] arr;
    private int size;
    private int depositCount, withdrawCount;



    public CashMachine() {
        this.arr = new int[10];
        this.size = 0;
    }


    public void deposit(int deposit) {
        if (deposit < 0)
            System.out.println("Number have to be greater than 0.");
        else {
            this.arr[this.size] = deposit;
            size++;
            depositCount++;
        }
    }

    public void withdraw(int withdraw) {
        this.arr[this.size] = -withdraw;
        size++;
        withdrawCount++;
    }

    public int saldo() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        return total;
    }

    public int makingPositiveArr() {
        int dep = 0;
        int[] posArr;
        posArr = new int[size];
        for (int i : arr) {
            if (i > 0) {
                posArr[dep] = i;
                dep++;
            }

        }
        return posArr[0];
    }

    public int makingNegArr() {
        int dep = 0;
        int[] negArr;
        negArr = new int[size];
        for (int i : arr) {
            if (i < 0) {
                negArr[dep] = i;
                dep++;
            }

        }
        return negArr[0];
    }


        public int size() {
            return size;
        }


        public int getDepositCount() {
            return depositCount;
        }

        public int getWithdrawCount() {
            return withdrawCount;
        }

    @Override
    public String toString() {
        return "CashMachine{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", depositCount=" + depositCount +
                ", withdrawCount=" + withdrawCount +
                '}';
    }
}







