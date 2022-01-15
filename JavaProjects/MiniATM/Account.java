package com.company;
public class Account {
    private int balance = 100000;

//    public static boolean getBalance() {
//    }

    public int getBalance(){
        return balance;
    }
    public void withdraw (int amount){
        balance = balance - amount;
    }
}