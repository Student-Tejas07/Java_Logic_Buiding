package org.example.day1;
//Q6 Largest of Two Numbers
//Take two integers
//Print the greater number
//If equal, print "Both are equal"
//Focus: comparison logic

import java.util.Scanner;
public class largest_of_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println( a + " is greater than " + b);
        } else if (b>a) {
            System.out.println( b + " is greater than " + a);
        }
        else{
            System.out.println( "Both are equal");
        }
    }
}
