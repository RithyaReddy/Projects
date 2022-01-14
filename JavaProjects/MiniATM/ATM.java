package com.company;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to Automated Teller Machine");
            System.out.println("Input an option from the following choices");
            System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter money to withdraw :");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }else
                        System.out.println("Insufficient balance");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money is successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
