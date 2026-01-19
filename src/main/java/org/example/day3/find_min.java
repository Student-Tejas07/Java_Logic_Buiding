package org.example.day3;
import java.util.Scanner;
public class find_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of Array: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int Min = Integer.MAX_VALUE;
        for(int i = 0 ; i<n; i++){
            if (arr[i] < Min){
                Min = arr[i];
            }
        }
        System.out.println("The minimum element is: " + Min);
    }
}
