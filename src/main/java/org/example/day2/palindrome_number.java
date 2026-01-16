package org.example.day2;
import java.util.Scanner;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //stroe original num
        // rev it
        // comapre both if same -> palindrome

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original_num = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (original_num == rev){
            System.out.print("It is a Palindrome Number " + original_num);
        }
        else {
            System.out.print("It is not a Palindrome Number " + original_num);
        }
    }
}

