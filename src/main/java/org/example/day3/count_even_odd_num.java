package org.example.day3;

import java.util.Scanner;
public class count_even_odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                //evenCount =  arr[i];
                evenCount++;
            }

            else{
               // oddCount =  arr[i];
            oddCount++;
            }

        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);

    }
}


