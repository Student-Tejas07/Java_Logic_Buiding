package org.example.day4;
import java.util.Scanner;
public class print1_n {

    static void printnums(int n){

        if (n==0){
            return;
        }
        printnums(n-1); //this is recursion

        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a Number: ");
        int n=sc.nextInt();

        printnums(n); //learn basics

    }
}
