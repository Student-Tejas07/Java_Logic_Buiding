package org.example.day1;
import java.util.Scanner;
// Question 5
//Swap Two Numbers (NO 3rd Variable)
//Task:
//Input two numbers
//Swap them without using a third variable
//Print before & after swap
//Focus: logic building

public class swap_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("ENter Number 2: ");
        int b = sc.nextInt();

        System.out.println("Before Swap a= " + a + " & b= " + b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swap a= " + a + " & b= " + b);
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println("After Swap a= " + a + " & b= " + b);

    }
}
