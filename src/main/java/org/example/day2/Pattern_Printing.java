package org.example.day2;
import  java.util.Scanner;
public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print("* ");
               // System.out.print(j + " ");  // for printing number -> j
               // System.out.print(i + " ");  // for printing SAME number -> i
            }
            System.out.println();
        }
                    //INVERTED STAR PATTERN
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}
