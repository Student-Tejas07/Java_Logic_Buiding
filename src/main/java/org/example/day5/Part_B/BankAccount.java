package org.example.day5.Part_B;
//accountNumber
//holderName
//balance
//Constructor to initialize

//Methods:
//deposit(amount)
//withdraw(amount)
//displayBalance()
import java.lang.reflect.Constructor;
import java.util.Scanner;
public class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber =  accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


//    static void deposit(double balance) {
//            balance = balance + amount;
//    }
    static void display(double balance) {
        balance += balance;
        System.out.println(balance);
    }
//    static void withdraw(double balance) {
//        balance = balance + amount;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter holder name: ");
        String holderName = sc.next();
        System.out.println("Enter balance: ");
        double balance = sc.nextDouble();
        //1000;
        BankAccount ba = new BankAccount(accountNumber, holderName, balance);
        ba.display(balance);

    }
}
