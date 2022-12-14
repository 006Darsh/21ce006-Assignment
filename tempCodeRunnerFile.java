// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-According to question no 1, the Account class was defined to model a bank account. An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit and withdraw funds. Create two subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings account cannot be overdrawn
package Darsh2_4;
import java.util.Scanner;

import Darsh2_2.*;
public class Darsh2_4main {
    public static void main(String[] args) {
        Account account = new Account(111, 200,"06-11-2003");
        System.out.println("simple account");//creates a simple account
        System.out.println(account);//calls the account classes to string overide
        System.out.println("--------------------------------------------------------------------------------------");
        CheckingAccount checkingAccount = new CheckingAccount(112, 250,"05-11-2003");
        System.out.println("Checking account");//creates a checking account
        System.out.println(account);//calls the account classes to string overide
        System.out.println("Enter ammount for withdrawing in checking account  :");
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);//call the checking account to string override 
        System.out.println(account);
        SavingsAccount savingsAccount = new SavingsAccount(113, 10000,"04-11-2003");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Saving account");//creates a checking account
        System.out.println(account);//calls the account classes to string overide
        System.out.println("Enter ammount for withdrawing in saving account  :");
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        
        System.out.println(savingsAccount);//call the checking account to string override
        System.out.println(account);
    }
}
