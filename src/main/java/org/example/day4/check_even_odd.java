package org.example.day4;
import java.util.Scanner;
public class check_even_odd {

        static boolean isEven(int a){
            if (a%2==0){
                return true;
            } else {
                return false;
            }c
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        boolean result= isEven(a);

        if (result){
            System.out.println("Number is even");
        }
        else {
            System.out.println(" Number is odd");
        }

    }
}
