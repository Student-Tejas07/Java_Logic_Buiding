package org.example.day5.Part_A;
import java.util.Scanner;
public class Rectangle {

    void area(int length , int width){
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
//P = 2(l + w)
    void perimeter(int length , int width){
        int P = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + P);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

//        System.out.print("Enter Length: ");
//        int length = sc.nextInt();
//        System.out.print("Enter Width: ");
//        int width = sc.nextInt();
//
//       r.area(length, width);
//       r.perimeter(length, width);

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        int width = sc.nextInt();

        System.out.println("1 - Area of Rectangle! ");
        System.out.println("2 - Perimeter of Rectangle! ");
        System.out.println("3 - both ");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();


       switch(choice) {
           case 1:
               r.area(length, width);
               break;

           case 2:
               r.perimeter(length, width);
               break;

           case 3:
               r.area(length, width);
               r.perimeter(length, width);
               break;
           default:
               System.out.println("Invalid choice");
       }
    }
}
