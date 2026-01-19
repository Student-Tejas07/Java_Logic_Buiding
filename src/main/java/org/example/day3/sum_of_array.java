package org.example.day3;
import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
         for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
         System.out.println(sum);
         double avg = sum/n;
         System.out.println(avg);

    }
}
